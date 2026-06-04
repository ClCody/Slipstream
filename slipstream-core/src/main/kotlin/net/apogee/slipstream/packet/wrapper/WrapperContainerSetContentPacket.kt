package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundContainerSetContentPacket.
 */
@JvmInline
value class WrapperContainerSetContentPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val containerId: Int get() = modifier.readInt(0)
    val stateId: Int get() = modifier.readInt(1)
}
fun Any.isContainerSetContentPacket(): Boolean = PacketMappers.clientboundContainerSetContentPacketClass.isInstance(this)
fun Any.asContainerSetContentPacket(): WrapperContainerSetContentPacket = WrapperContainerSetContentPacket(this)
