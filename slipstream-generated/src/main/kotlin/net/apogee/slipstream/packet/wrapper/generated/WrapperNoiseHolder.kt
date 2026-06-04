package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNoiseHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$NoiseHolder") }
        private val lookup = MethodHandles.lookup()

        val noiseDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "noiseData", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val noiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "noise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.synth.NormalNoise")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.world.level.levelgen.synth.NormalNoise")))
        }
    }

    val noiseData: WrapperHolder
        get() = WrapperHolder(noiseDataHandle.invoke(handle))

    val noise: WrapperNormalNoise
        get() = WrapperNormalNoise(noiseHandle.invoke(handle))

    fun copy(noiseData: WrapperHolder = this.noiseData, noise: WrapperNormalNoise = this.noise): WrapperNoiseHolder {
        return WrapperNoiseHolder(constructorHandle.invoke(noiseData.handle, noise.handle))
    }

}
