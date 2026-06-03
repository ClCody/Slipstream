package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundSetTitleTextPacket.
 */
@JvmInline
value class WrapperSetTitleTextPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val text: Any? get() = modifier.readObject(0) // Component
}
fun Any.isSetTitleTextPacket(): Boolean = PacketMappers.clientboundSetTitleTextPacketClass.isInstance(this)
fun Any.asSetTitleTextPacket(): WrapperSetTitleTextPacket = WrapperSetTitleTextPacket(this)
