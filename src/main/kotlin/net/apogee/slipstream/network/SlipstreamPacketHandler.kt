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

    // Очереди пакетов (создаются один раз при входе игрока -> Zero-Allocation)
    private val inboundQueue = ArrayDeque<Any>()
    private val outboundQueue = ArrayDeque<Pair<Any, ChannelPromise>>()

    private var isInboundSuspended = false
    private var isOutboundSuspended = false

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        // Если корутина уже обрабатывает предыдущий пакет, добавляем текущий в очередь
        if (isInboundSuspended) {
            inboundQueue.addLast(msg)
            return
        }

        // Синхронный хот-пат
        if (!manager.handleInboundSync(player, msg)) return

        // Асинхронный пат
        if (manager.hasSuspendInbound()) {
            isInboundSuspended = true
            
            // Магия: используем Netty EventLoop как диспетчер корутин.
            // Это гарантирует отсутствие гонок данных (race conditions) и локов!
            val dispatcher = ctx.executor().asCoroutineDispatcher()
            
            manager.pluginScope.launch(dispatcher) {
                var currentMsg = msg
                try {
                    while (true) {
                        if (manager.handleInboundSuspend(player, currentMsg)) {
                            ctx.fireChannelRead(currentMsg)
                        }
                        // Извлекаем следующий пакет из очереди или прерываем цикл
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

        if (!manager.handleOutboundSync(player, msg)) return

        if (manager.hasSuspendOutbound()) {
            isOutboundSuspended = true
            val dispatcher = ctx.executor().asCoroutineDispatcher()
            
            manager.pluginScope.launch(dispatcher) {
                var currentMsg = msg
                var currentPromise = promise
                try {
                    while (true) {
                        if (manager.handleOutboundSuspend(player, currentMsg)) {
                            ctx.write(currentMsg, currentPromise)
                        }
                        
                        val next = outboundQueue.pollFirst() ?: break
                        currentMsg = next.first
                        currentPromise = next.second
                    }
                    ctx.flush()
                } finally {
                    isOutboundSuspended = false
                }
            }
        } else {
            super.write(ctx, msg, promise)
        }
    }
}