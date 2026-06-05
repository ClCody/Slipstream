package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperIdMap(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.IdMap") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val getIdOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIdOrThrow", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val byIdOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "byIdOrThrow", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!))
        }
        val byIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "byId", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun getId(arg0: Any): Int {
        return getIdHandle.invoke(handle, arg0) as Int
    }

    fun getIdOrThrow(arg0: Any): Int {
        return getIdOrThrowHandle.invoke(handle, arg0) as Int
    }

    fun byIdOrThrow(arg0: Int): Any {
        return byIdOrThrowHandle.invoke(handle, arg0) as Any
    }

    fun byId(arg0: Int): Any {
        return byIdHandle.invoke(handle, arg0) as Any
    }

}
