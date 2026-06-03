package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ServerboundPongPacket.
 */
@JvmInline
value class WrapperPongPacket(val handle: Any) {
    
    val id: Int
        get() = handle.modifier().readInt(0)
}

fun Any.isPongPacket(): Boolean = PacketMappers.serverboundPongPacketClass.isInstance(this)

fun Any.asPongPacket(): WrapperPongPacket = WrapperPongPacket(this)
