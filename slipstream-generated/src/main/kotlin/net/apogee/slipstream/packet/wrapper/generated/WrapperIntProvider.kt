package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperIntProvider(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.valueproviders.IntProvider") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.util.valueproviders.IntProviderType")))
        }
        val sampleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sample", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.util.RandomSource")))
        }
        val getMinValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMaxValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperIntProviderType
        get() = WrapperIntProviderType(getTypeHandle.invoke(handle))

    fun sample(arg0: WrapperRandomSource): Int {
        return sampleHandle.invoke(handle, arg0.handle) as Int
    }

    val minValue: Int
        get() = getMinValueHandle.invoke(handle) as Int

    val maxValue: Int
        get() = getMaxValueHandle.invoke(handle) as Int

}
