package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundUpdateAttributesPacket.
 */
@JvmInline
value class WrapperUpdateAttributesPacket(val handle: Any) {
    
    val modifier: PacketModifier
        get() = handle.modifier()

    val entityId: Int
        get() = modifier.readInt(0)
}

fun Any.isUpdateAttributesPacket(): Boolean = PacketMappers.clientboundUpdateAttributesPacketClass.isInstance(this)

fun Any.asUpdateAttributesPacket(): WrapperUpdateAttributesPacket = WrapperUpdateAttributesPacket(this)
