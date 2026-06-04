package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundLevelEventPacket.
 */
@JvmInline
value class WrapperLevelEventPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val type: Int get() = modifier.readInt(0)
    val data: Int get() = modifier.readInt(1)
}
fun Any.isLevelEventPacket(): Boolean = PacketMappers.clientboundLevelEventPacketClass.isInstance(this)
fun Any.asLevelEventPacket(): WrapperLevelEventPacket = WrapperLevelEventPacket(this)
