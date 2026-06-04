package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNumberFormat(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.numbers.NumberFormat") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.chat.numbers.NumberFormatType")))
        }
        val formatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "format", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperNumberFormatType
        get() = WrapperNumberFormatType(typeHandle.invoke(handle))

    fun format(arg0: Int): WrapperMutableComponent {
        return WrapperMutableComponent(formatHandle.invoke(handle, arg0))
    }

}
