package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRaid(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.raid.Raid") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val isStartedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStarted", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isActiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isActive", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val getCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenter", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getRaidOmenLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRaidOmenLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val absorbRaidOmenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "absorbRaidOmen", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val isInProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInProgress", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEnchantOddsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEnchantOdds", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getAllRaidersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllRaiders", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getTotalHealthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTotalHealth", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isBetweenWavesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBetweenWaves", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGroupsSpawnedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGroupsSpawned", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getNumGroupsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNumGroups", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.Difficulty")))
        }
        val hasFirstWaveSpawnedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasFirstWaveSpawned", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getHealthOfLivingRaidersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHealthOfLivingRaiders", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getMaxRaidOmenLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxRaidOmenLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTotalRaidersAliveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTotalRaidersAlive", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isOverHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOver", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isVictoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVictory", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isLossHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLoss", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLeaderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLeader", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raider"), Int::class.javaPrimitiveType!!))
        }
        val getRaidersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRaiders", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val addWaveMobHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addWaveMob", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.raid.Raider"), Boolean::class.javaPrimitiveType!!))
        }
        val isStoppedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStopped", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val ticksActiveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticksActive")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val centerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("center")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val startedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("started")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val totalHealthSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("totalHealth")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val raidOmenLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("raidOmenLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val activeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("active")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val groupsSpawnedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("groupsSpawned")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val postRaidTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("postRaidTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val raidCooldownTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("raidCooldownTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val statusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("status")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val celebrationTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("celebrationTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val waveSpawnPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("waveSpawnPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    fun save(arg0: WrapperCompoundTag): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle))
    }

    val started: Boolean
        get() = isStartedHandle.invoke(handle) as Boolean

    val active: Boolean
        get() = isActiveHandle.invoke(handle) as Boolean

    val level: WrapperLevel
        get() = WrapperLevel(getLevelHandle.invoke(handle))

    val center: WrapperBlockPos
        get() = WrapperBlockPos(getCenterHandle.invoke(handle))

    val raidOmenLevel: Int
        get() = getRaidOmenLevelHandle.invoke(handle) as Int

    fun absorbRaidOmen(arg0: WrapperServerPlayer): Boolean {
        return absorbRaidOmenHandle.invoke(handle, arg0.handle) as Boolean
    }

    val inProgress: Boolean
        get() = isInProgressHandle.invoke(handle) as Boolean

    val enchantOdds: Float
        get() = getEnchantOddsHandle.invoke(handle) as Float

    val allRaiders: Any
        get() = getAllRaidersHandle.invoke(handle) as Any

    val totalHealth: Float
        get() = getTotalHealthHandle.invoke(handle) as Float

    val betweenWaves: Boolean
        get() = isBetweenWavesHandle.invoke(handle) as Boolean

    val groupsSpawned: Int
        get() = getGroupsSpawnedHandle.invoke(handle) as Int

    fun getNumGroups(arg0: Any): Int {
        return getNumGroupsHandle.invoke(handle, arg0) as Int
    }

    val firstWaveSpawned: Boolean
        get() = hasFirstWaveSpawnedHandle.invoke(handle) as Boolean

    val healthOfLivingRaiders: Float
        get() = getHealthOfLivingRaidersHandle.invoke(handle) as Float

    val maxRaidOmenLevel: Int
        get() = getMaxRaidOmenLevelHandle.invoke(handle) as Int

    val totalRaidersAlive: Int
        get() = getTotalRaidersAliveHandle.invoke(handle) as Int

    val over: Boolean
        get() = isOverHandle.invoke(handle) as Boolean

    val victory: Boolean
        get() = isVictoryHandle.invoke(handle) as Boolean

    val loss: Boolean
        get() = isLossHandle.invoke(handle) as Boolean

    fun getLeader(arg0: Int): WrapperRaider {
        return WrapperRaider(getLeaderHandle.invoke(handle, arg0))
    }

    val raiders: Any
        get() = getRaidersHandle.invoke(handle) as Any

    fun addWaveMob(arg0: Int, arg1: WrapperRaider, arg2: Boolean): Boolean {
        return addWaveMobHandle.invoke(handle, arg0, arg1.handle, arg2) as Boolean
    }

    val stopped: Boolean
        get() = isStoppedHandle.invoke(handle) as Boolean

    fun setTicksActive(value: Long) {
        ticksActiveSetterHandle.invoke(handle, value)
    }

    fun setCenter(value: WrapperBlockPos) {
        centerSetterHandle.invoke(handle, value.handle)
    }

    fun setStarted(value: Boolean) {
        startedSetterHandle.invoke(handle, value)
    }

    fun setTotalHealth(value: Float) {
        totalHealthSetterHandle.invoke(handle, value)
    }

    fun setRaidOmenLevel(value: Int) {
        raidOmenLevelSetterHandle.invoke(handle, value)
    }

    fun setActive(value: Boolean) {
        activeSetterHandle.invoke(handle, value)
    }

    fun setGroupsSpawned(value: Int) {
        groupsSpawnedSetterHandle.invoke(handle, value)
    }

    fun setPostRaidTicks(value: Int) {
        postRaidTicksSetterHandle.invoke(handle, value)
    }

    fun setRaidCooldownTicks(value: Int) {
        raidCooldownTicksSetterHandle.invoke(handle, value)
    }

    fun setStatus(value: Any) {
        statusSetterHandle.invoke(handle, value)
    }

    fun setCelebrationTicks(value: Int) {
        celebrationTicksSetterHandle.invoke(handle, value)
    }

    fun setWaveSpawnPos(value: Any) {
        waveSpawnPosSetterHandle.invoke(handle, value)
    }

}
