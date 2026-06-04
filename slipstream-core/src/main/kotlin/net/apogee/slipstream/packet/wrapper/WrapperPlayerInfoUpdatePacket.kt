package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier
import java.util.EnumSet

/**
 * Zero-Allocation обертка для ClientboundPlayerInfoUpdatePacket (TabList).
 */
@JvmInline
value class WrapperPlayerInfoUpdatePacket(val handle: Any) {
    
    val modifier: PacketModifier
        get() = handle.modifier()

    val actions: EnumSet<*>
        get() = modifier.readObject(0) as EnumSet<*>
        
    val entries: List<*>
        get() = modifier.readObject(1) as List<*>
}

fun Any.isPlayerInfoUpdatePacket(): Boolean = PacketMappers.clientboundPlayerInfoUpdatePacketClass.isInstance(this)

fun Any.asPlayerInfoUpdatePacket(): WrapperPlayerInfoUpdatePacket = WrapperPlayerInfoUpdatePacket(this)
