package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundRemoveEntitiesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket") }
        private val lookup = MethodHandles.lookup()

        val getEntityIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityIds", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.ints.IntList")))
        }
    }

    val entityIds: Any
        get() = getEntityIdsHandle.invoke(handle) as Any

}

fun Any.isClientboundRemoveEntitiesPacket(): Boolean = WrapperClientboundRemoveEntitiesPacket.packetClass.isInstance(this)
fun Any.asClientboundRemoveEntitiesPacket(): WrapperClientboundRemoveEntitiesPacket = WrapperClientboundRemoveEntitiesPacket(this)
