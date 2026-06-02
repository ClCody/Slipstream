package net.apogee.slipstream.network

import io.netty.channel.ChannelDuplexHandler
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelPromise
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.launch
import net.apogee.slipstream.api.AwaitEvent
import net.apogee.slipstream.api.CancelledByPluginException
import net.apogee.slipstream.api.SlipstreamManager
import org.bukkit.entity.Player
import java.util.ArrayDeque

class SlipstreamPacketHandler(
    private val player: Player,
    private val manager: SlipstreamManager
) : ChannelDuplexHandler() {

    @Volatile
    private var ctx: ChannelHandlerContext? = null

    // Очереди пакетов (Zero-Allocation)
    private val inboundQueue = ArrayDeque<Any>()
    private val outboundPacketQueue = ArrayDeque<Any>()
    private val outboundPromiseQueue = ArrayDeque<ChannelPromise>()

    // Очередь одноразовых слушателей (awaitPacket) без COWAL! O(1) добавление и удаление.
    // Hybrid model: each awaiter receives an AwaitEvent; if event.consume() is called,
    // the packet stops propagating through the pipeline.
    private val inboundAwaiters = ArrayDeque<(AwaitEvent) -> Boolean>()

    private var isInboundSuspended = false
    private var isOutboundSuspended = false

    override fun handlerAdded(ctx: ChannelHandlerContext) {
        this.ctx = ctx
        super.handlerAdded(ctx)
    }

    /**
     * Безопасное добавление awaiter-а через Netty EventLoop.
     */
    fun addAwaiter(awaiter: (AwaitEvent) -> Boolean) {
        val eventLoop = ctx?.executor()
        if (eventLoop != null && !eventLoop.inEventLoop()) {
            eventLoop.execute { inboundAwaiters.addLast(awaiter) }
        } else {
            inboundAwaiters.addLast(awaiter)
        }
    }

    fun removeAwaiter(awaiter: (AwaitEvent) -> Boolean) {
        val eventLoop = ctx?.executor()
        if (eventLoop != null && !eventLoop.inEventLoop()) {
            eventLoop.execute { inboundAwaiters.remove(awaiter) }
        } else {
            inboundAwaiters.remove(awaiter)
        }
    }

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        // 1. Awaiters (hybrid observe/consume model)
        //    Each awaiter receives an AwaitEvent. If any calls consume(),
        //    the packet stops propagating through the pipeline.
        if (inboundAwaiters.isNotEmpty()) {
            val event = AwaitEvent(msg)
            val iterator = inboundAwaiters.iterator()
            while (iterator.hasNext()) {
                val awaiter = iterator.next()
                if (awaiter(event)) {
                    iterator.remove()
                }
            }
            if (event.isConsumed) return
        }

        // 2. Suspend buffering (если мы уже в режиме ожидания, всё летит в очередь)
        if (isInboundSuspended) {
            inboundQueue.addLast(msg)
            return
        }

        // 3. Синхронный роутинг
        if (!manager.handleInboundSync(player, msg)) return

        // 4. Асинхронный роутинг (Lazy Suspend)
        if (manager.hasSuspendInbound() && manager.anyInterestedInbound(msg)) {
            isInboundSuspended = true
            val dispatcher = ctx.executor().asCoroutineDispatcher()
            
            manager.pluginScope.launch(dispatcher) {
                var currentMsg = msg
                try {
                    while (true) {
                        if (manager.handleInboundSuspend(player, currentMsg)) {
                            ctx.fireChannelRead(currentMsg)
                        }
                        currentMsg = inboundQueue.pollFirst() ?: break
                    }
                } finally {
                    isInboundSuspended = false
                }
            }
        } else {
            super.channelRead(ctx, msg)
        }
    }

    override fun write(ctx: ChannelHandlerContext, msg: Any, promise: ChannelPromise) {
        if (isOutboundSuspended) {
            outboundPacketQueue.addLast(msg)
            outboundPromiseQueue.addLast(promise)
            return
        }

        if (!manager.handleOutboundSync(player, msg)) {
            promise.setFailure(CancelledByPluginException("Outbound packet rejected by sync listener", "Slipstream"))
            return
        }

        if (manager.hasSuspendOutbound() && manager.anyInterestedOutbound(msg)) {
            isOutboundSuspended = true
            val dispatcher = ctx.executor().asCoroutineDispatcher()
            
            manager.pluginScope.launch(dispatcher) {
                var currentMsg = msg
                var currentPromise = promise
                var didWrite = false
                try {
                    while (true) {
                        if (manager.handleOutboundSuspend(player, currentMsg)) {
                            ctx.write(currentMsg, currentPromise)
                            didWrite = true
                        } else {
                            currentPromise.setFailure(CancelledByPluginException("Outbound packet rejected by suspend listener", "Slipstream"))
                        }
                        currentMsg = outboundPacketQueue.pollFirst() ?: break
                        currentPromise = outboundPromiseQueue.pollFirst()!!
                    }
                } finally {
                    if (didWrite) ctx.flush()
                    isOutboundSuspended = false
                }
            }
        } else {
            super.write(ctx, msg, promise)
        }
    }
}