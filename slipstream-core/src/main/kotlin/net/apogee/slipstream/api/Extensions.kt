package net.apogee.slipstream.api

import net.minecraft.network.protocol.Packet
import org.bukkit.craftbukkit.entity.CraftPlayer
import org.bukkit.entity.Player

/**
 * Отправляет пакет игроку через стандартный NMS connection.
 * Пакет пройдет через весь пайплайн (Netty), поэтому будет отловлен и обработан
 * в `SlipstreamPacketHandler` (сработают все листенеры и awaiters).
 * 
 * Если вы используете враппер, передавайте его свойство `handle`:
 * ```
 * val packet = SlipstreamFactory.createSystemChatPacket()
 * // ... заполняем поля
 * player.sendPacket(packet.handle)
 * ```
 */
fun Player.sendPacket(packet: Any) {
    val craftPlayer = this as CraftPlayer
    craftPlayer.handle.connection.send(packet as Packet<*>)
}

/**
 * Имитирует получение пакета от клиента.
 * Пакет будет закинут прямо в Netty pipeline игрока и прочитан сервером.
 */
fun Player.receiveFakePacket(packet: Any) {
    val craftPlayer = this as CraftPlayer
    craftPlayer.handle.connection.connection.channel.pipeline().fireChannelRead(packet)
}
