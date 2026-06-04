package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundSetTitlesAnimationPacket.
 */
@JvmInline
value class WrapperSetTitlesAnimationPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val fadeIn: Int get() = modifier.readInt(0)
    val stay: Int get() = modifier.readInt(1)
    val fadeOut: Int get() = modifier.readInt(2)
}
fun Any.isSetTitlesAnimationPacket(): Boolean = PacketMappers.clientboundSetTitlesAnimationPacketClass.isInstance(this)
fun Any.asSetTitlesAnimationPacket(): WrapperSetTitlesAnimationPacket = WrapperSetTitlesAnimationPacket(this)
