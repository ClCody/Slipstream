package net.apogee.slipstream.debug.chronicle

import net.apogee.slipstream.api.PacketListener
import org.bukkit.entity.Player
import java.util.*
import java.util.concurrent.ConcurrentHashMap

object ChronicleService : PacketListener {
    
    private val history = ConcurrentHashMap<UUID, LinkedList<PacketSnapshot>>()
    private val activeDebuggers = Collections.newSetFromMap(ConcurrentHashMap<UUID, Boolean>())
    
    private const val MAX_HISTORY = 100

    fun startDebugging(player: Player) {
        activeDebuggers.add(player.uniqueId)
        history.putIfAbsent(player.uniqueId, LinkedList())
    }

    fun stopDebugging(player: Player) {
        activeDebuggers.remove(player.uniqueId)
        history.remove(player.uniqueId)
    }

    fun isDebugging(player: Player): Boolean = activeDebuggers.contains(player.uniqueId)

    fun getHistory(player: Player): List<PacketSnapshot> {
        val playerHistory = history[player.uniqueId] ?: return emptyList()
        return synchronized(playerHistory) {
            playerHistory.toList() // Создаем неизменяемую копию (snapshot)
        }
    }

    override fun onPacketIn(player: Player, packet: Any): Boolean {
        if (activeDebuggers.contains(player.uniqueId)) {
            capture(player, packet, true)
        }
        return true
    }

    override fun onPacketOut(player: Player, packet: Any): Boolean {
        if (activeDebuggers.contains(player.uniqueId)) {
            capture(player, packet, false)
        }
        return true
    }

    private fun capture(player: Player, packet: Any, isInbound: Boolean) {
        val snapshot = PacketSnapshot.from(packet, isInbound)
        val playerHistory = history.getOrPut(player.uniqueId) { LinkedList() }
        
        synchronized(playerHistory) {
            playerHistory.addFirst(snapshot)
            if (playerHistory.size > MAX_HISTORY) {
                playerHistory.removeLast()
            }
        }
    }
}
