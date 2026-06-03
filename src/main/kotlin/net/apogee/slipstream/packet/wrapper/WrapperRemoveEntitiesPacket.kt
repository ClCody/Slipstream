package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundRemoveEntitiesPacket.
 */
@JvmInline
value class WrapperRemoveEntitiesPacket(val handle: Any) {
    val modifier: PacketModifier get() = handle.modifier()
    // It has an IntList / int[] of entity IDs
}
fun Any.isRemoveEntitiesPacket(): Boolean = PacketMappers.clientboundRemoveEntitiesPacketClass.isInstance(this)
fun Any.asRemoveEntitiesPacket(): WrapperRemoveEntitiesPacket = WrapperRemoveEntitiesPacket(this)
