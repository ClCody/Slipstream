package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRaider(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.raid.Raider") }
        private val lookup = MethodHandles.lookup()

        val getWaveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWave", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val removeWhenFarAwayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeWhenFarAway", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val requiresCustomPersistenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requiresCustomPersistence", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTicksOutsideRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicksOutsideRaid", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isCaptainHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCaptain", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasRaid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canJoinRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canJoinRaid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasActiveRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasActiveRaid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCurrentRaidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCurrentRaid", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raid")))
        }
        val isCelebratingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCelebrating", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCelebrateSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCelebrateSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val canJoinPatrolHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canJoinPatrol", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val finalizeSpawnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "finalizeSpawn", MethodType.methodType(Class.forName("net.minecraft.world.entity.SpawnGroupData"), Class.forName("net.minecraft.world.level.ServerLevelAccessor"), Class.forName("net.minecraft.world.DifficultyInstance"), Class.forName("net.minecraft.world.entity.MobSpawnType"), Class.forName("net.minecraft.world.entity.SpawnGroupData")))
        }
        val raidSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("raid")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val waveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wave")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val canJoinRaidSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("canJoinRaid")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ticksOutsideRaidSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticksOutsideRaid")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val wave: Int
        get() = getWaveHandle.invoke(handle) as Int

    fun removeWhenFarAway(arg0: Double): Boolean {
        return removeWhenFarAwayHandle.invoke(handle, arg0) as Boolean
    }

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val requiresCustomPersistence: Boolean
        get() = requiresCustomPersistenceHandle.invoke(handle) as Boolean

    val ticksOutsideRaid: Int
        get() = getTicksOutsideRaidHandle.invoke(handle) as Int

    val captain: Boolean
        get() = isCaptainHandle.invoke(handle) as Boolean

    val raid: Boolean
        get() = hasRaidHandle.invoke(handle) as Boolean

    val canJoinRaid: Boolean
        get() = canJoinRaidHandle.invoke(handle) as Boolean

    val activeRaid: Boolean
        get() = hasActiveRaidHandle.invoke(handle) as Boolean

    val currentRaid: WrapperRaid
        get() = WrapperRaid(getCurrentRaidHandle.invoke(handle))

    val celebrating: Boolean
        get() = isCelebratingHandle.invoke(handle) as Boolean

    val celebrateSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getCelebrateSoundHandle.invoke(handle))

    val canJoinPatrol: Boolean
        get() = canJoinPatrolHandle.invoke(handle) as Boolean

    fun finalizeSpawn(arg0: WrapperServerLevelAccessor, arg1: WrapperDifficultyInstance, arg2: Any, arg3: Any): Any {
        return finalizeSpawnHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3) as Any
    }

    fun setRaid(value: WrapperRaid) {
        raidSetterHandle.invoke(handle, value.handle)
    }

    fun setWave(value: Int) {
        waveSetterHandle.invoke(handle, value)
    }

    fun setCanJoinRaid(value: Boolean) {
        canJoinRaidSetterHandle.invoke(handle, value)
    }

    fun setTicksOutsideRaid(value: Int) {
        ticksOutsideRaidSetterHandle.invoke(handle, value)
    }

}
