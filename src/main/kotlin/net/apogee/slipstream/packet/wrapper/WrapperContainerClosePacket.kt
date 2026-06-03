package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundContainerClosePacket.
 */
@JvmInline
value class WrapperContainerClosePacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val containerId: Int get() = modifier.readInt(0)
}
fun Any.isContainerClosePacket(): Boolean = PacketMappers.clientboundContainerClosePacketClass.isInstance(this)
fun Any.asContainerClosePacket(): WrapperContainerClosePacket = WrapperContainerClosePacket(this)
