package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBiomeSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.BiomeSource") }
        private val lookup = MethodHandles.lookup()

        val findClosestBiome3dHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findClosestBiome3d", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Pair"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.world.level.biome.Climate\$Sampler"), Class.forName("net.minecraft.world.level.LevelReader")))
        }
        val getNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.biome.Climate\$Sampler")))
        }
        val possibleBiomesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "possibleBiomes", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getBiomesWithinHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomesWithin", MethodType.methodType(Class.forName("java.util.Set"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.biome.Climate\$Sampler")))
        }
        val findBiomeHorizontalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findBiomeHorizontal", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Pair"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.util.RandomSource"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.biome.Climate\$Sampler")))
        }
    }

    fun findClosestBiome3d(arg0: WrapperBlockPos, arg1: Int, arg2: Int, arg3: Int, arg4: Any, arg5: WrapperSampler, arg6: WrapperLevelReader): Any {
        return findClosestBiome3dHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4, arg5.handle, arg6.handle) as Any
    }

    fun getNoiseBiome(arg0: Int, arg1: Int, arg2: Int, arg3: WrapperSampler): WrapperHolder {
        return WrapperHolder(getNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2, arg3.handle))
    }

    val possibleBiomes: Any
        get() = possibleBiomesHandle.invoke(handle) as Any

    fun getBiomesWithin(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: WrapperSampler): Any {
        return getBiomesWithinHandle.invoke(handle, arg0, arg1, arg2, arg3, arg4.handle) as Any
    }

    fun findBiomeHorizontal(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Any, arg6: WrapperRandomSource, arg7: Boolean, arg8: WrapperSampler): Any {
        return findBiomeHorizontalHandle.invoke(handle, arg0, arg1, arg2, arg3, arg4, arg5, arg6.handle, arg7, arg8.handle) as Any
    }

}
