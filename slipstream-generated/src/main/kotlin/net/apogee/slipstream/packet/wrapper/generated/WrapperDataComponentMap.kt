package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataComponentMap(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.DataComponentMap") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val iteratorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "iterator", MethodType.methodType(Class.forName("java.util.Iterator")))
        }
        val streamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stream", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val filterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filter", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap"), Class.forName("java.util.function.Predicate")))
        }
        val keySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "keySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getOrDefaultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrDefault", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType"), Class.forName("java.lang.Object")))
        }
        val hasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "has", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val getTypedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTyped", MethodType.methodType(Class.forName("net.minecraft.core.component.TypedDataComponent"), Class.forName("net.minecraft.core.component.DataComponentType")))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun get(arg0: WrapperDataComponentType): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val iterator: Any
        get() = iteratorHandle.invoke(handle) as Any

    val stream: Any
        get() = streamHandle.invoke(handle) as Any

    fun filter(arg0: Any): WrapperDataComponentMap {
        return WrapperDataComponentMap(filterHandle.invoke(handle, arg0))
    }

    val keySet: Any
        get() = keySetHandle.invoke(handle) as Any

    fun getOrDefault(arg0: WrapperDataComponentType, arg1: Any): Any {
        return getOrDefaultHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun has(arg0: WrapperDataComponentType): Boolean {
        return hasHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getTyped(arg0: WrapperDataComponentType): WrapperTypedDataComponent {
        return WrapperTypedDataComponent(getTypedHandle.invoke(handle, arg0.handle))
    }

}
