package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundTeleportEntityPacket.
 */
@JvmInline
value class WrapperTeleportEntityPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val entityId: Int get() = modifier.readInt(0)
    val x: Double get() = modifier.readDouble(0)
    val y: Double get() = modifier.readDouble(1)
    val z: Double get() = modifier.readDouble(2)
}
fun Any.isTeleportEntityPacket(): Boolean = PacketMappers.clientboundTeleportEntityPacketClass.isInstance(this)
fun Any.asTeleportEntityPacket(): WrapperTeleportEntityPacket = WrapperTeleportEntityPacket(this)
