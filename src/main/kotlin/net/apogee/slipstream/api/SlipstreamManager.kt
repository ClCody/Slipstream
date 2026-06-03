package net.apogee.slipstream.api

import kotlinx.coroutines.CoroutineScope
import net.apogee.slipstream.network.SlipstreamPacketHandler
import org.bukkit.entity.Player
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArrayList

/**
 * Главная шина событий для пакетов.
 * Использует CopyOnWriteArrayList для глобальных листенеров.
 */
class SlipstreamManager(val pluginScope: CoroutineScope) {
    
    private data class RegisteredListener<T>(val priority: PacketPriority, val listener: T)

    @Volatile
    private var syncListeners = listOf<RegisteredListener<PacketListener>>()
    
    @Volatile
    private var inboundSuspendListeners = listOf<RegisteredListener<SuspendablePacketListener>>()
    
    @Volatile
    private var outboundSuspendListeners = listOf<RegisteredListener<SuspendablePacketListener>>()
    
    // Реестр хэндлеров игроков для O(1) awaitPacket магии
    private val handlers = ConcurrentHashMap<UUID, SlipstreamPacketHandler>()

    fun registerHandler(player: Player, handler: SlipstreamPacketHandler) {
        handlers[player.uniqueId] = handler
    }

    fun unregisterHandler(player: Player) {
        handlers.remove(player.uniqueId)
    }

    fun getHandler(player: Player): SlipstreamPacketHandler? = handlers[player.uniqueId]

    fun registerListener(listener: PacketListener, priority: PacketPriority = PacketPriority.NORMAL) {
        synchronized(this) {
            val newList = syncListeners.toMutableList()
            newList.add(RegisteredListener(priority, listener))
            newList.sortBy { it.priority }
            syncListeners = newList
        }
    }

    fun registerSuspendListener(listener: SuspendablePacketListener, priority: PacketPriority = PacketPriority.NORMAL) {
        synchronized(this) {
            val newInbound = inboundSuspendListeners.toMutableList()
            newInbound.add(RegisteredListener(priority, listener))
            newInbound.sortBy { it.priority }
            inboundSuspendListeners = newInbound

            val newOutbound = outboundSuspendListeners.toMutableList()
            newOutbound.add(RegisteredListener(priority, listener))
            newOutbound.sortBy { it.priority }
            outboundSuspendListeners = newOutbound
        }
    }

    fun unregisterListener(listener: PacketListener) {
        synchronized(this) {
            syncListeners = syncListeners.filter { it.listener != listener }
        }
    }

    fun unregisterSuspendListener(listener: SuspendablePacketListener) {
        synchronized(this) {
            inboundSuspendListeners = inboundSuspendListeners.filter { it.listener != listener }
            outboundSuspendListeners = outboundSuspendListeners.filter { it.listener != listener }
        }
    }

    fun hasSuspendInbound(): Boolean = inboundSuspendListeners.isNotEmpty()
    fun hasSuspendOutbound(): Boolean = outboundSuspendListeners.isNotEmpty()

    fun anyInterestedInbound(packet: Any): Boolean {
        val current = inboundSuspendListeners
        for (i in current.indices) {
            if (current[i].listener.interestsInbound(packet)) return true
        }
        return false
    }

    fun anyInterestedOutbound(packet: Any): Boolean {
        val current = outboundSuspendListeners
        for (i in current.indices) {
            if (current[i].listener.interestsOutbound(packet)) return true
        }
        return false
    }

    fun handleInboundSync(player: Player, packet: Any): Boolean {
        val current = syncListeners
        for (i in current.indices) {
            if (!current[i].listener.onPacketIn(player, packet)) {
                return false
            }
        }
        return true
    }

    fun handleOutboundSync(player: Player, packet: Any): Boolean {
        val current = syncListeners
        for (i in current.indices) {
            if (!current[i].listener.onPacketOut(player, packet)) {
                return false
            }
        }
        return true
    }

    suspend fun handleInboundSuspend(player: Player, packet: Any): Boolean {
        val current = inboundSuspendListeners
        for (i in current.indices) {
            val listener = current[i].listener
            if (listener.interestsInbound(packet)) {
                if (!listener.onPacketInSuspend(player, packet)) {
                    return false
                }
            }
        }
        return true
    }

    suspend fun handleOutboundSuspend(player: Player, packet: Any): Boolean {
        val current = outboundSuspendListeners
        for (i in current.indices) {
            val listener = current[i].listener
            if (listener.interestsOutbound(packet)) {
                if (!listener.onPacketOutSuspend(player, packet)) {
                    return false
                }
            }
        }
        return true
    }
}
