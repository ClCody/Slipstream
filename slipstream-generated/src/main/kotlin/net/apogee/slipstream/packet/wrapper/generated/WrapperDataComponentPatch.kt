package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataComponentPatch(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.DataComponentPatch") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val splitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "split", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentPatch\$SplitResult")))
        }
        val entrySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entrySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val forgetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forget", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentPatch"), Class.forName("java.util.function.Predicate")))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun get(arg0: WrapperDataComponentType): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val split: WrapperSplitResult
        get() = WrapperSplitResult(splitHandle.invoke(handle))

    val entrySet: Any
        get() = entrySetHandle.invoke(handle) as Any

    fun forget(arg0: Any): WrapperDataComponentPatch {
        return WrapperDataComponentPatch(forgetHandle.invoke(handle, arg0))
    }

}
