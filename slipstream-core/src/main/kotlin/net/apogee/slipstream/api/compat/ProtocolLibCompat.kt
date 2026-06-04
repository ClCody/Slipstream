package net.apogee.slipstream.api.compat

import net.apogee.slipstream.packet.PacketContainer
import net.apogee.slipstream.packet.asContainer
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.logging.Logger

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
abstract class PacketAdapter(vararg val types: PacketType) {
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
            
            private fun isInterested(packet: Any): Boolean {
                if (adapter.types.isEmpty()) return true
                val clazz = packet.javaClass
                for (type in adapter.types) {
                    if (type.packetClass.isAssignableFrom(clazz)) return true
                }
                return false
            }

            override fun onPacketIn(player: Player, packet: Any): Boolean {
                if (!isInterested(packet)) return true
                
                return try {
                    val event = PacketEvent(player, packet.asContainer())
                    adapter.onPacketReceiving(event)
                    !event.isCancelled
                } catch (e: Exception) {
                    Bukkit.getLogger().severe("[Slipstream] Error in PacketAdapter (Inbound): ${e.message}")
                    e.printStackTrace()
                    true // Пропускаем пакет при ошибке, чтобы не ломать игру
                }
            }

            override fun onPacketOut(player: Player, packet: Any): Boolean {
                if (!isInterested(packet)) return true

                return try {
                    val event = PacketEvent(player, packet.asContainer())
                    adapter.onPacketSending(event)
                    !event.isCancelled
                } catch (e: Exception) {
                    Bukkit.getLogger().severe("[Slipstream] Error in PacketAdapter (Outbound): ${e.message}")
                    e.printStackTrace()
                    true
                }
            }
        })
    }
}
