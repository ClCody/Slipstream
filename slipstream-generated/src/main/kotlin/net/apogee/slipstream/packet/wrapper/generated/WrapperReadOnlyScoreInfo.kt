package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperReadOnlyScoreInfo(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.ReadOnlyScoreInfo") }
        private val lookup = MethodHandles.lookup()

        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isLockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLocked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val numberFormatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "numberFormat", MethodType.methodType(Class.forName("net.minecraft.network.chat.numbers.NumberFormat")))
        }
        val formatValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "formatValue", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Class.forName("net.minecraft.network.chat.numbers.NumberFormat")))
        }
    }

    val value: Int
        get() = valueHandle.invoke(handle) as Int

    val locked: Boolean
        get() = isLockedHandle.invoke(handle) as Boolean

    val numberFormat: WrapperNumberFormat
        get() = WrapperNumberFormat(numberFormatHandle.invoke(handle))

    fun formatValue(arg0: WrapperNumberFormat): WrapperMutableComponent {
        return WrapperMutableComponent(formatValueHandle.invoke(handle, arg0.handle))
    }

}
