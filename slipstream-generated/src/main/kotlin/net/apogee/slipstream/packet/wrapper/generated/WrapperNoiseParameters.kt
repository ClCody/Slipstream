package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNoiseParameters(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.synth.NormalNoise\$NoiseParameters") }
        private val lookup = MethodHandles.lookup()

        val firstOctaveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "firstOctave", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val amplitudesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "amplitudes", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.doubles.DoubleList")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("it.unimi.dsi.fastutil.doubles.DoubleList")))
        }
    }

    val firstOctave: Int
        get() = firstOctaveHandle.invoke(handle) as Int

    val amplitudes: Any
        get() = amplitudesHandle.invoke(handle) as Any

    fun copy(firstOctave: Int = this.firstOctave, amplitudes: Any = this.amplitudes): WrapperNoiseParameters {
        return WrapperNoiseParameters(constructorHandle.invoke(firstOctave, amplitudes))
    }

}
