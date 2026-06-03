package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundSetEntityDataPacket (Metadata).
 */
@JvmInline
value class WrapperSetEntityDataPacket(val handle: Any) {
    
    val modifier: PacketModifier
        get() = handle.modifier()

    val entityId: Int
        get() = modifier.readInt(0)
}

fun Any.isSetEntityDataPacket(): Boolean = PacketMappers.clientboundSetEntityDataPacketClass.isInstance(this)

fun Any.asSetEntityDataPacket(): WrapperSetEntityDataPacket = WrapperSetEntityDataPacket(this)
