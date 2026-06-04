package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkTrackingView(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ChunkTrackingView") }
        private val lookup = MethodHandles.lookup()

        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val isInViewDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInViewDistance", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    fun contains(arg0: Int, arg1: Int, arg2: Boolean): Boolean {
        return containsHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun isInViewDistance(arg0: Int, arg1: Int): Boolean {
        return isInViewDistanceHandle.invoke(handle, arg0, arg1) as Boolean
    }

}
