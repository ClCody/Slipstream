package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ServerboundPlayerCommandPacket.
 */
@JvmInline
value class WrapperPlayerCommandPacket(val handle: Any) {
    
    val action: Enum<*>
        get() = handle.modifier().readObject(0) as Enum<*>
}

fun Any.isPlayerCommandPacket(): Boolean = PacketMappers.serverboundPlayerCommandPacketClass.isInstance(this)

fun Any.asPlayerCommandPacket(): WrapperPlayerCommandPacket = WrapperPlayerCommandPacket(this)
