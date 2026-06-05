package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlender(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.blending.Blender") }
        private val lookup = MethodHandles.lookup()

        val blendOffsetAndFactorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blendOffsetAndFactor", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.blending.Blender\$BlendingOutput"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBiomeResolverHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomeResolver", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeResolver"), Class.forName("net.minecraft.world.level.biome.BiomeResolver")))
        }
        val blendDensityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blendDensity", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$FunctionContext"), Double::class.javaPrimitiveType!!))
        }
    }

    fun blendOffsetAndFactor(arg0: Int, arg1: Int): WrapperBlendingOutput {
        return WrapperBlendingOutput(blendOffsetAndFactorHandle.invoke(handle, arg0, arg1))
    }

    fun getBiomeResolver(arg0: WrapperBiomeResolver): WrapperBiomeResolver {
        return WrapperBiomeResolver(getBiomeResolverHandle.invoke(handle, arg0.handle))
    }

    fun blendDensity(arg0: WrapperFunctionContext, arg1: Double): Double {
        return blendDensityHandle.invoke(handle, arg0.handle, arg1) as Double
    }

}
