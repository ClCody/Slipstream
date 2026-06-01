package net.apogee.slipstream.network

import io.netty.channel.Channel
import net.apogee.slipstream.SlipstreamPlugin
import net.apogee.slipstream.api.SlipstreamManager
import net.minecraft.server.level.ServerPlayer
import org.bukkit.craftbukkit.entity.CraftPlayer
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class Injector(private val plugin: SlipstreamPlugin, private val manager: SlipstreamManager) : Listener {
    private val CHANNEL_HANDLER_NAME = "slipstream_handler"
    private val MINECRAFT_PACKET_HANDLER_NAME = "packet_handler"

    @EventHandler(priority = EventPriority.LOWEST)
    fun onPlayerJoin(event: PlayerJoinEvent) {
        injectPlayer(event.player)
    }

    @EventHandler(priority = EventPriority.MONITOR)
    fun onPlayerQuit(event: PlayerQuitEvent) {
        ejectPlayer(event.player)
    }

    fun injectPlayer(player: Player) {
        try {
            val channel = getChannel(player)
            val pipeline = channel.pipeline()

            // Удаляем старый хэндлер, если он остался (например, после релоада)
            if (pipeline.get(CHANNEL_HANDLER_NAME) != null) {
                pipeline.remove(CHANNEL_HANDLER_NAME)
            }

            val handler = SlipstreamPacketHandler(player, manager)
            
            // Вставляем наш хэндлер прямо перед майнкрафтовским packet_handler
            if (pipeline.get(MINECRAFT_PACKET_HANDLER_NAME) != null) {
                pipeline.addBefore(MINECRAFT_PACKET_HANDLER_NAME, CHANNEL_HANDLER_NAME, handler)
            } else {
                pipeline.addLast(CHANNEL_HANDLER_NAME, handler)
            }
            
            plugin.logger.info("Successfully injected Slipstream handler into pipeline for ${player.name}")
        } catch (e: Exception) {
            plugin.logger.severe("Failed to inject Slipstream handler for ${player.name}")
            e.printStackTrace()
        }
    }

    fun ejectPlayer(player: Player) {
        try {
            val channel = getChannel(player)
            val pipeline = channel.pipeline()
            if (pipeline.get(CHANNEL_HANDLER_NAME) != null) {
                pipeline.remove(CHANNEL_HANDLER_NAME)
            }
            plugin.logger.info("Successfully ejected Slipstream handler for ${player.name}")
        } catch (e: Exception) {
            // Игнорируем ошибки при отключении, если канал уже закрыт
        }
    }

    fun ejectAll() {
        plugin.server.onlinePlayers.forEach { ejectPlayer(it) }
    }

    private fun getChannel(player: Player): Channel {
        // Zero-Reflection: получаем канал напрямую через Paper NMS маппинги
        val craftPlayer = player as CraftPlayer
        val serverPlayer: ServerPlayer = craftPlayer.handle
        return serverPlayer.connection.connection.channel
    }
}