package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier
import java.util.UUID

/**
 * Zero-Allocation обертка для ClientboundResourcePackPushPacket.
 */
@JvmInline
value class WrapperResourcePackPushPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    val id: UUID get() = modifier.readObject(0) as UUID
    val url: String get() = modifier.readString(0)
    val hash: String get() = modifier.readString(1)
    val required: Boolean get() = modifier.readBoolean(0)
}
fun Any.isResourcePackPushPacket(): Boolean = PacketMappers.clientboundResourcePackPushPacketClass.isInstance(this)
fun Any.asResourcePackPushPacket(): WrapperResourcePackPushPacket = WrapperResourcePackPushPacket(this)
