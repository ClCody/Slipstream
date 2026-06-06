package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBiomeSpecialEffects(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.BiomeSpecialEffects") }
        private val lookup = MethodHandles.lookup()

        val getWaterColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWaterColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBackgroundMusicHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBackgroundMusic", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getSkyColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWaterFogColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWaterFogColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getFogColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFogColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAmbientMoodSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientMoodSettings", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getFoliageColorOverrideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFoliageColorOverride", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getGrassColorModifierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGrassColorModifier", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeSpecialEffects\$GrassColorModifier")))
        }
        val getAmbientParticleSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientParticleSettings", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getGrassColorOverrideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGrassColorOverride", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getAmbientLoopSoundEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientLoopSoundEvent", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getAmbientAdditionsSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmbientAdditionsSettings", MethodType.methodType(Class.forName("java.util.Optional")))
        }
    }

    val waterColor: Int
        get() = getWaterColorHandle.invoke(handle) as Int

    val backgroundMusic: Any
        get() = getBackgroundMusicHandle.invoke(handle) as Any

    val skyColor: Int
        get() = getSkyColorHandle.invoke(handle) as Int

    val waterFogColor: Int
        get() = getWaterFogColorHandle.invoke(handle) as Int

    val fogColor: Int
        get() = getFogColorHandle.invoke(handle) as Int

    val ambientMoodSettings: Any
        get() = getAmbientMoodSettingsHandle.invoke(handle) as Any

    val foliageColorOverride: Any
        get() = getFoliageColorOverrideHandle.invoke(handle) as Any

    val grassColorModifier: Any
        get() = getGrassColorModifierHandle.invoke(handle) as Any

    val ambientParticleSettings: Any
        get() = getAmbientParticleSettingsHandle.invoke(handle) as Any

    val grassColorOverride: Any
        get() = getGrassColorOverrideHandle.invoke(handle) as Any

    val ambientLoopSoundEvent: Any
        get() = getAmbientLoopSoundEventHandle.invoke(handle) as Any

    val ambientAdditionsSettings: Any
        get() = getAmbientAdditionsSettingsHandle.invoke(handle) as Any

}
