package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEndDragonFight(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.dimension.end.EndDragonFight") }
        private val lookup = MethodHandles.lookup()

        val saveDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveData", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.end.EndDragonFight\$Data")))
        }
        val tryRespawnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryRespawn", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSpikeCrystalsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpikeCrystals", MethodType.methodType(Class.forName("java.util.List")))
        }
        val findExitPortalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findExitPortal", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.pattern.BlockPattern\$BlockPatternMatch")))
        }
        val getCrystalsAliveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCrystalsAlive", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val respawnDragonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "respawnDragon", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.List")))
        }
        val getDragonUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDragonUUID", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val spawnNewGatewayIfPossibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spawnNewGatewayIfPossible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasPreviouslyKilledDragonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPreviouslyKilledDragon", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val ticksSinceDragonSeenSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticksSinceDragonSeen")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val crystalsAliveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("crystalsAlive")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ticksSinceCrystalsScannedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticksSinceCrystalsScanned")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ticksSinceLastPlayerScanSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticksSinceLastPlayerScan")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dragonKilledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dragonKilled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val previouslyKilledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("previouslyKilled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val skipArenaLoadedCheckSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("skipArenaLoadedCheck")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dragonUUIDSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dragonUUID")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val needsStateScanningSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("needsStateScanning")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val portalLocationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("portalLocation")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnStageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnStage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnCrystalsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnCrystals")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val saveData: WrapperData
        get() = WrapperData(saveDataHandle.invoke(handle))

    val tryRespawn: Boolean
        get() = tryRespawnHandle.invoke(handle) as Boolean

    val spikeCrystals: Any
        get() = getSpikeCrystalsHandle.invoke(handle) as Any

    val findExitPortal: WrapperBlockPatternMatch
        get() = WrapperBlockPatternMatch(findExitPortalHandle.invoke(handle))

    val crystalsAlive: Int
        get() = getCrystalsAliveHandle.invoke(handle) as Int

    fun respawnDragon(arg0: Any): Boolean {
        return respawnDragonHandle.invoke(handle, arg0) as Boolean
    }

    val dragonUUID: Any
        get() = getDragonUUIDHandle.invoke(handle) as Any

    val spawnNewGatewayIfPossible: Boolean
        get() = spawnNewGatewayIfPossibleHandle.invoke(handle) as Boolean

    val previouslyKilledDragon: Boolean
        get() = hasPreviouslyKilledDragonHandle.invoke(handle) as Boolean

    fun setTicksSinceDragonSeen(value: Int) {
        ticksSinceDragonSeenSetterHandle.invoke(handle, value)
    }

    fun setCrystalsAlive(value: Int) {
        crystalsAliveSetterHandle.invoke(handle, value)
    }

    fun setTicksSinceCrystalsScanned(value: Int) {
        ticksSinceCrystalsScannedSetterHandle.invoke(handle, value)
    }

    fun setTicksSinceLastPlayerScan(value: Int) {
        ticksSinceLastPlayerScanSetterHandle.invoke(handle, value)
    }

    fun setDragonKilled(value: Boolean) {
        dragonKilledSetterHandle.invoke(handle, value)
    }

    fun setPreviouslyKilled(value: Boolean) {
        previouslyKilledSetterHandle.invoke(handle, value)
    }

    fun setSkipArenaLoadedCheck(value: Boolean) {
        skipArenaLoadedCheckSetterHandle.invoke(handle, value)
    }

    fun setDragonUUID(value: Any) {
        dragonUUIDSetterHandle.invoke(handle, value)
    }

    fun setNeedsStateScanning(value: Boolean) {
        needsStateScanningSetterHandle.invoke(handle, value)
    }

    fun setPortalLocation(value: WrapperBlockPos) {
        portalLocationSetterHandle.invoke(handle, value.handle)
    }

    fun setRespawnStage(value: Any) {
        respawnStageSetterHandle.invoke(handle, value)
    }

    fun setRespawnTime(value: Int) {
        respawnTimeSetterHandle.invoke(handle, value)
    }

    fun setRespawnCrystals(value: Any) {
        respawnCrystalsSetterHandle.invoke(handle, value)
    }

}
