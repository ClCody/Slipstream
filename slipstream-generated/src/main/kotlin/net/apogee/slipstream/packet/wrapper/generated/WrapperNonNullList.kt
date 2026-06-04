package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNonNullList(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.NonNullList") }
        private val lookup = MethodHandles.lookup()

        val removeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "remove", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!))
        }
        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!))
        }
        val setHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "set", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
    }

    fun remove(arg0: Int): Any {
        return removeHandle.invoke(handle, arg0) as Any
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun get(arg0: Int): Any {
        return getHandle.invoke(handle, arg0) as Any
    }

    fun set(arg0: Int, arg1: Any): Any {
        return setHandle.invoke(handle, arg0, arg1) as Any
    }

}
