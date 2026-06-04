package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundUpdateAdvancementsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateAdvancementsPacket") }
        private val lookup = MethodHandles.lookup()

        val getProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProgress", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getRemovedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemoved", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getAddedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAdded", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val progress: Any
        get() = getProgressHandle.invoke(handle) as Any

    val removed: Any
        get() = getRemovedHandle.invoke(handle) as Any

    val added: Any
        get() = getAddedHandle.invoke(handle) as Any

}

fun Any.isClientboundUpdateAdvancementsPacket(): Boolean = WrapperClientboundUpdateAdvancementsPacket.packetClass.isInstance(this)
fun Any.asClientboundUpdateAdvancementsPacket(): WrapperClientboundUpdateAdvancementsPacket = WrapperClientboundUpdateAdvancementsPacket(this)
