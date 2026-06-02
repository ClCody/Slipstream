package net.apogee.slipstream.network

import io.netty.channel.ChannelDuplexHandler
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelPromise
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.launch
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
    private val outboundQueue = ArrayDeque<Pair<Any, ChannelPromise>>()

    // Очередь одноразовых слушателей (awaitPacket) без COWAL! O(1) добавление и удаление.
    private val inboundAwaiters = ArrayDeque<(Any) -> Boolean>()

    private var isInboundSuspended = false
    private var isOutboundSuspended = false

    override fun handlerAdded(ctx: ChannelHandlerContext) {
        this.ctx = ctx
        super.handlerAdded(ctx)
    }

    /**
     * Безопасное добавление awaiter-а через Netty EventLoop
     */
    fun addAwaiter(awaiter: (Any) -> Boolean) {
        val eventLoop = ctx?.executor()
        if (eventLoop != null && !eventLoop.inEventLoop()) {
            eventLoop.execute { inboundAwaiters.addLast(awaiter) }
        } else {
            inboundAwaiters.addLast(awaiter)
        }
    }

    fun removeAwaiter(awaiter: (Any) -> Boolean) {
        val eventLoop = ctx?.executor()
        if (eventLoop != null && !eventLoop.inEventLoop()) {
            eventLoop.execute { inboundAwaiters.remove(awaiter) }
        } else {
            inboundAwaiters.remove(awaiter)
        }
    }

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        // 1. Awaiters (consume-model: if awaiter claims the packet, it stops here)
        if (inboundAwaiters.isNotEmpty()) {
            val iterator = inboundAwaiters.iterator()
            var consumed = false
            while (iterator.hasNext()) {
                val awaiter = iterator.next()
                if (awaiter(msg)) {
                    iterator.remove()
                    consumed = true
                }
            }
            if (consumed) return
        }

        // 2. Suspend buffering
        if (isInboundSuspended) {
            inboundQueue.addLast(msg)
            return
        }

        // 3. Синхронный роутинг
        if (!manager.handleInboundSync(player, msg)) return

        // 4. Асинхронный роутинг
        if (manager.hasSuspendInbound()) {
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
            outboundQueue.addLast(msg to promise)
            return
        }

        if (!manager.handleOutboundSync(player, msg)) {
            promise.cancel(false)
            return
        }

        if (manager.hasSuspendOutbound()) {
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
                            currentPromise.cancel(false)
                        }
                        val next = outboundQueue.pollFirst() ?: break
                        currentMsg = next.first
                        currentPromise = next.second
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