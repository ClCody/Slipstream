package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundContainerSetSlotPacket.
 */
@JvmInline
value class WrapperContainerSetSlotPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val containerId: Int get() = modifier.readInt(0)
    val stateId: Int get() = modifier.readInt(1)
    val slot: Int get() = modifier.readInt(2)
    val item: Any? get() = modifier.readObject(0) // ItemStack
}
fun Any.isContainerSetSlotPacket(): Boolean = PacketMappers.clientboundContainerSetSlotPacketClass.isInstance(this)
fun Any.asContainerSetSlotPacket(): WrapperContainerSetSlotPacket = WrapperContainerSetSlotPacket(this)
