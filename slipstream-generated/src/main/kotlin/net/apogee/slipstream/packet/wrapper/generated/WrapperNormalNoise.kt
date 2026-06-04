package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNormalNoise(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.synth.NormalNoise") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val parametersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "parameters", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.synth.NormalNoise\$NoiseParameters")))
        }
        val maxValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxValue", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    fun getValue(arg0: Double, arg1: Double, arg2: Double): Double {
        return getValueHandle.invoke(handle, arg0, arg1, arg2) as Double
    }

    val parameters: WrapperNoiseParameters
        get() = WrapperNoiseParameters(parametersHandle.invoke(handle))

    val maxValue: Double
        get() = maxValueHandle.invoke(handle) as Double

}
