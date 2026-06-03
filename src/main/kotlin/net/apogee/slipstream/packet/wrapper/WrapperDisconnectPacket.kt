package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundDisconnectPacket.
 */
@JvmInline
value class WrapperDisconnectPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val reason: Any? get() = modifier.readObject(0) // Component
}
fun Any.isDisconnectPacket(): Boolean = PacketMappers.clientboundDisconnectPacketClass.isInstance(this)
fun Any.asDisconnectPacket(): WrapperDisconnectPacket = WrapperDisconnectPacket(this)
