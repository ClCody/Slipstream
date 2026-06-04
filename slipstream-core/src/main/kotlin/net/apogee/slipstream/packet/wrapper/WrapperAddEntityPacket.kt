package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundAddEntityPacket.
 */
@JvmInline
value class WrapperAddEntityPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val entityId: Int get() = modifier.readInt(0)
    // UUID is object(0)
}
fun Any.isAddEntityPacket(): Boolean = PacketMappers.clientboundAddEntityPacketClass.isInstance(this)
fun Any.asAddEntityPacket(): WrapperAddEntityPacket = WrapperAddEntityPacket(this)
