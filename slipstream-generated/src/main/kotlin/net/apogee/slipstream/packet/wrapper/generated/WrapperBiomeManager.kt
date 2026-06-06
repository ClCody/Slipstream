package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBiomeManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.BiomeManager") }
        private val lookup = MethodHandles.lookup()

        val getBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val withDifferentSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDifferentSource", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeManager"), Class.forName("net.minecraft.world.level.biome.BiomeManager\$NoiseBiomeSource")))
        }
        val getNoiseBiomeAtPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiomeAtPosition", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getNoiseBiomeAtQuartHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiomeAtQuart", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    fun getBiome(arg0: WrapperBlockPos): WrapperHolder {
        return WrapperHolder(getBiomeHandle.invoke(handle, arg0.handle))
    }

    fun withDifferentSource(arg0: WrapperNoiseBiomeSource): WrapperBiomeManager {
        return WrapperBiomeManager(withDifferentSourceHandle.invoke(handle, arg0.handle))
    }

    fun getNoiseBiomeAtPosition(arg0: WrapperBlockPos): WrapperHolder {
        return WrapperHolder(getNoiseBiomeAtPositionHandle.invoke(handle, arg0.handle))
    }

    fun getNoiseBiomeAtQuart(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getNoiseBiomeAtQuartHandle.invoke(handle, arg0, arg1, arg2))
    }

}
