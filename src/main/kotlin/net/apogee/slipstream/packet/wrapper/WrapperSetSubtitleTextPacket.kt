package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundSetSubtitleTextPacket.
 */
@JvmInline
value class WrapperSetSubtitleTextPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val text: Any? get() = modifier.readObject(0) // Component
}
fun Any.isSetSubtitleTextPacket(): Boolean = PacketMappers.clientboundSetSubtitleTextPacketClass.isInstance(this)
fun Any.asSetSubtitleTextPacket(): WrapperSetSubtitleTextPacket = WrapperSetSubtitleTextPacket(this)
