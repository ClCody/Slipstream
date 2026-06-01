package net.apogee.slipstream.api

import kotlinx.coroutines.CoroutineScope
import org.bukkit.entity.Player
import java.util.concurrent.CopyOnWriteArrayList

/**
 * Главная шина событий для пакетов.
 * Использует CopyOnWriteArrayList для потокобезопасного и быстрого итерирования 
 * в Netty-потоках без локов.
 */
class SlipstreamManager(val pluginScope: CoroutineScope) {
    private val syncListeners = CopyOnWriteArrayList<PacketListener>()
    private val suspendListeners = CopyOnWriteArrayList<SuspendablePacketListener>()

    fun registerListener(listener: PacketListener) {
        syncListeners.addIfAbsent(listener)
    }

    fun registerSuspendListener(listener: SuspendablePacketListener) {
        suspendListeners.addIfAbsent(listener)
    }

    fun unregisterListener(listener: PacketListener) {
        syncListeners.remove(listener)
    }

    fun unregisterSuspendListener(listener: SuspendablePacketListener) {
        suspendListeners.remove(listener)
    }

    fun hasSuspendInbound(): Boolean = suspendListeners.isNotEmpty()
    fun hasSuspendOutbound(): Boolean = suspendListeners.isNotEmpty()

    fun handleInboundSync(player: Player, packet: Any): Boolean {
        for (listener in syncListeners) {
            if (!listener.onPacketIn(player, packet)) {
                return false
            }
        }
        return true
    }

    fun handleOutboundSync(player: Player, packet: Any): Boolean {
        for (listener in syncListeners) {
            if (!listener.onPacketOut(player, packet)) {
                return false
            }
        }
        return true
    }

    suspend fun handleInboundSuspend(player: Player, packet: Any): Boolean {
        for (listener in suspendListeners) {
            if (!listener.onPacketInSuspend(player, packet)) {
                return false
            }
        }
        return true
    }

    suspend fun handleOutboundSuspend(player: Player, packet: Any): Boolean {
        for (listener in suspendListeners) {
            if (!listener.onPacketOutSuspend(player, packet)) {
                return false
            }
        }
        return true
    }
}
