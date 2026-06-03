package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ServerboundChatPacket (входящий чат от игрока).
 */
@JvmInline
value class WrapperChatPacket(val handle: Any) {
    
    val modifier: PacketModifier
        get() = handle.modifier()

    val message: String
        get() = modifier.readString(0)
}

fun Any.isChatPacket(): Boolean = PacketMappers.serverboundChatPacketClass.isInstance(this)

fun Any.asChatPacket(): WrapperChatPacket = WrapperChatPacket(this)
