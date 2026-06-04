package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier
import java.util.UUID

/**
 * Zero-Allocation обертка для ClientboundBossEventPacket.
 */
@JvmInline
value class WrapperBossEventPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val id: UUID get() = modifier.readObject(0) as UUID
}
fun Any.isBossEventPacket(): Boolean = PacketMappers.clientboundBossEventPacketClass.isInstance(this)
fun Any.asBossEventPacket(): WrapperBossEventPacket = WrapperBossEventPacket(this)
