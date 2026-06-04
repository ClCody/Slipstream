package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ServerboundPlayerDiggingPacket.
 */
@JvmInline
value class WrapperPlayerDiggingPacket(val handle: Any) {
    
    val action: Enum<*>
        get() = handle.modifier().readObject(0) as Enum<*>
}

fun Any.isPlayerDiggingPacket(): Boolean = PacketMappers.serverboundPlayerActionPacketClass.isInstance(this)

fun Any.asPlayerDiggingPacket(): WrapperPlayerDiggingPacket = WrapperPlayerDiggingPacket(this)
