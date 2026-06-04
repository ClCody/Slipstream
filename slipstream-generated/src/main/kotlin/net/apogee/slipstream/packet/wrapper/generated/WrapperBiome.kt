package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBiome(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.Biome") }
        private val lookup = MethodHandles.lookup()

        val shouldFreezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldFreeze", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelReader"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val shouldSnowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldSnow", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelReader"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getGenerationSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGenerationSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeGenerationSettings")))
        }
        val getPrecipitationAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPrecipitationAt", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.Biome\$Precipitation"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getTemperatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTemperature", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val shouldMeltFrozenOceanIcebergSlightlyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldMeltFrozenOceanIcebergSlightly", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getAmbientAdditionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientAdditions", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getSkyColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hasPrecipitationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPrecipitation", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWaterColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWaterColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val warmEnoughToRainHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "warmEnoughToRain", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val coldEnoughToSnowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "coldEnoughToSnow", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBackgroundMusicHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBackgroundMusic", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getSpecialEffectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpecialEffects", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeSpecialEffects")))
        }
        val getWaterFogColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWaterFogColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getGrassColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGrassColor", MethodType.methodType(Int::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getFoliageColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFoliageColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAmbientParticleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientParticle", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getAmbientMoodHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientMood", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getAmbientLoopHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientLoop", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getBaseTemperatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseTemperature", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getFogColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFogColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMobSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMobSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.MobSpawnSettings")))
        }
    }

    fun shouldFreeze(arg0: WrapperLevelReader, arg1: WrapperBlockPos, arg2: Boolean): Boolean {
        return shouldFreezeHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Boolean
    }

    fun shouldSnow(arg0: WrapperLevelReader, arg1: WrapperBlockPos): Boolean {
        return shouldSnowHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val generationSettings: WrapperBiomeGenerationSettings
        get() = WrapperBiomeGenerationSettings(getGenerationSettingsHandle.invoke(handle))

    fun getPrecipitationAt(arg0: WrapperBlockPos): Any {
        return getPrecipitationAtHandle.invoke(handle, arg0.handle) as Any
    }

    fun getTemperature(arg0: WrapperBlockPos): Float {
        return getTemperatureHandle.invoke(handle, arg0.handle) as Float
    }

    fun shouldMeltFrozenOceanIcebergSlightly(arg0: WrapperBlockPos): Boolean {
        return shouldMeltFrozenOceanIcebergSlightlyHandle.invoke(handle, arg0.handle) as Boolean
    }

    val ambientAdditions: Any
        get() = getAmbientAdditionsHandle.invoke(handle) as Any

    val skyColor: Int
        get() = getSkyColorHandle.invoke(handle) as Int

    val precipitation: Boolean
        get() = hasPrecipitationHandle.invoke(handle) as Boolean

    val waterColor: Int
        get() = getWaterColorHandle.invoke(handle) as Int

    fun warmEnoughToRain(arg0: WrapperBlockPos): Boolean {
        return warmEnoughToRainHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun coldEnoughToSnow(arg0: WrapperBlockPos): Boolean {
        return coldEnoughToSnowHandle.invoke(handle, arg0.handle) as Boolean
    }

    val backgroundMusic: Any
        get() = getBackgroundMusicHandle.invoke(handle) as Any

    val specialEffects: WrapperBiomeSpecialEffects
        get() = WrapperBiomeSpecialEffects(getSpecialEffectsHandle.invoke(handle))

    val waterFogColor: Int
        get() = getWaterFogColorHandle.invoke(handle) as Int

    fun getGrassColor(arg0: Double, arg1: Double): Int {
        return getGrassColorHandle.invoke(handle, arg0, arg1) as Int
    }

    val foliageColor: Int
        get() = getFoliageColorHandle.invoke(handle) as Int

    val ambientParticle: Any
        get() = getAmbientParticleHandle.invoke(handle) as Any

    val ambientMood: Any
        get() = getAmbientMoodHandle.invoke(handle) as Any

    val ambientLoop: Any
        get() = getAmbientLoopHandle.invoke(handle) as Any

    val baseTemperature: Float
        get() = getBaseTemperatureHandle.invoke(handle) as Float

    val fogColor: Int
        get() = getFogColorHandle.invoke(handle) as Int

    val mobSettings: WrapperMobSpawnSettings
        get() = WrapperMobSpawnSettings(getMobSettingsHandle.invoke(handle))

}
