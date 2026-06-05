package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFilterMask(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.FilterMask") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val applyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "apply", MethodType.methodType(String::class.java, String::class.java))
        }
        val isFullyFilteredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFullyFiltered", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val applyWithFormattingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyWithFormatting", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component"), String::class.java))
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun apply(arg0: String): String {
        return applyHandle.invoke(handle, arg0) as String
    }

    val fullyFiltered: Boolean
        get() = isFullyFilteredHandle.invoke(handle) as Boolean

    fun applyWithFormatting(arg0: String): WrapperComponent {
        return WrapperComponent(applyWithFormattingHandle.invoke(handle, arg0))
    }

}
