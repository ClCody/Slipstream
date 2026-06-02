package net.apogee.slipstream.api.compat

import net.apogee.slipstream.packet.PacketContainer
import net.apogee.slipstream.packet.asContainer
import org.bukkit.entity.Player

/**
 * Имитация PacketEvent из ProtocolLib.
 */
class PacketEvent(
    val player: Player,
    val packet: PacketContainer
) {
    var isCancelled: Boolean = false

    fun getPacketContainer(): PacketContainer = packet
}

/**
 * Имитация PacketAdapter из ProtocolLib.
 */
abstract class PacketAdapter {
    open fun onPacketReceiving(event: PacketEvent) {}
    open fun onPacketSending(event: PacketEvent) {}
}

/**
 * Имитация ProtocolManager из ProtocolLib.
 * Позволяет регистрировать адаптеры в привычном стиле.
 */
class ProtocolManager(private val manager: net.apogee.slipstream.api.SlipstreamManager) {

    fun addPacketListener(adapter: PacketAdapter) {
        manager.registerListener(object : net.apogee.slipstream.api.PacketListener {
            override fun onPacketIn(player: Player, packet: Any): Boolean {
                val event = PacketEvent(player, packet.asContainer())
                adapter.onPacketReceiving(event)
                return !event.isCancelled
            }

            override fun onPacketOut(player: Player, packet: Any): Boolean {
                val event = PacketEvent(player, packet.asContainer())
                adapter.onPacketSending(event)
                return !event.isCancelled
            }
        })
    }
}
