package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundUpdateAdvancementsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateAdvancementsPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val shouldResetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldReset", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProgress", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getAddedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAdded", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getRemovedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemoved", MethodType.methodType(Class.forName("java.util.Set")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val shouldReset: Boolean
        get() = shouldResetHandle.invoke(handle) as Boolean

    val progress: Any
        get() = getProgressHandle.invoke(handle) as Any

    val added: Any
        get() = getAddedHandle.invoke(handle) as Any

    val removed: Any
        get() = getRemovedHandle.invoke(handle) as Any

}
