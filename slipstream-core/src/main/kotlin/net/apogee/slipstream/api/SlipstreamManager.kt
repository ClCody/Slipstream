package net.apogee.slipstream.api

import kotlinx.coroutines.CoroutineScope
import net.apogee.slipstream.network.SlipstreamPacketHandler
import org.bukkit.entity.Player
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArrayList

/**
 * Главная шина событий для пакетов.
 * Использует массивы CopyOnWriteArrayList для O(1) регистрации и O(N) итерации без сортировок.
 */
class SlipstreamManager(val pluginScope: CoroutineScope) {
    
    // Массивы списков по приоритетам для O(1) добавления и отсутствия необходимости сортировок
    private val syncListeners = Array(PacketPriority.values().size) { CopyOnWriteArrayList<PacketListener>() }
    private val inboundSuspendListeners = Array(PacketPriority.values().size) { CopyOnWriteArrayList<SuspendablePacketListener>() }
    private val outboundSuspendListeners = Array(PacketPriority.values().size) { CopyOnWriteArrayList<SuspendablePacketListener>() }
    
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
        syncListeners[priority.ordinal].addIfAbsent(listener)
    }

    fun registerSuspendListener(listener: SuspendablePacketListener, priority: PacketPriority = PacketPriority.NORMAL) {
        inboundSuspendListeners[priority.ordinal].addIfAbsent(listener)
        outboundSuspendListeners[priority.ordinal].addIfAbsent(listener)
    }

    fun unregisterListener(listener: PacketListener) {
        for (list in syncListeners) {
            list.remove(listener)
        }
    }

    fun unregisterSuspendListener(listener: SuspendablePacketListener) {
        for (list in inboundSuspendListeners) {
            list.remove(listener)
        }
        for (list in outboundSuspendListeners) {
            list.remove(listener)
        }
    }

    fun hasSuspendInbound(): Boolean {
        for (list in inboundSuspendListeners) {
            if (list.isNotEmpty()) return true
        }
        return false
    }
    
    fun hasSuspendOutbound(): Boolean {
        for (list in outboundSuspendListeners) {
            if (list.isNotEmpty()) return true
        }
        return false
    }

    fun anyInterestedInbound(packet: Any): Boolean {
        for (list in inboundSuspendListeners) {
            val iterator = list.iterator()
            while (iterator.hasNext()) {
                if (iterator.next().interestsInbound(packet)) return true
            }
        }
        return false
    }

    fun anyInterestedOutbound(packet: Any): Boolean {
        for (list in outboundSuspendListeners) {
            val iterator = list.iterator()
            while (iterator.hasNext()) {
                if (iterator.next().interestsOutbound(packet)) return true
            }
        }
        return false
    }

    fun handleInboundSync(player: Player, packet: Any): Boolean {
        for (list in syncListeners) {
            val iterator = list.iterator()
            while (iterator.hasNext()) {
                if (!iterator.next().onPacketIn(player, packet)) {
                    return false
                }
            }
        }
        return true
    }

    fun handleOutboundSync(player: Player, packet: Any): Boolean {
        for (list in syncListeners) {
            val iterator = list.iterator()
            while (iterator.hasNext()) {
                if (!iterator.next().onPacketOut(player, packet)) {
                    return false
                }
            }
        }
        return true
    }

    suspend fun handleInboundSuspend(player: Player, packet: Any): Boolean {
        for (list in inboundSuspendListeners) {
            val iterator = list.iterator()
            while (iterator.hasNext()) {
                val listener = iterator.next()
                if (listener.interestsInbound(packet)) {
                    if (!listener.onPacketInSuspend(player, packet)) {
                        return false
                    }
                }
            }
        }
        return true
    }

    suspend fun handleOutboundSuspend(player: Player, packet: Any): Boolean {
        for (list in outboundSuspendListeners) {
            val iterator = list.iterator()
            while (iterator.hasNext()) {
                val listener = iterator.next()
                if (listener.interestsOutbound(packet)) {
                    if (!listener.onPacketOutSuspend(player, packet)) {
                        return false
                    }
                }
            }
        }
        return true
    }
}