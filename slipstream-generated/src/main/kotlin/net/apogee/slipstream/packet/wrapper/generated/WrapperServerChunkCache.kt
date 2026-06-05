package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerChunkCache(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ServerChunkCache") }
        private val lookup = MethodHandles.lookup()

        val pollTaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pollTask", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val isChunkLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isChunkLoaded", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getLightEngineHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightEngine", MethodType.methodType(Class.forName("net.minecraft.server.level.ThreadedLevelLightEngine")))
        }
        val gatherStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gatherStats", MethodType.methodType(String::class.java))
        }
        val getChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus"), Boolean::class.javaPrimitiveType!!))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getFullChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getFullChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkAtIfLoadedImmediatelyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkAtIfLoadedImmediately", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isPositionTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPositionTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getLoadedChunksCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLoadedChunksCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getChunkForLightingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkForLighting", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LightChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getTickingGeneratedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickingGenerated", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val runDistanceManagerUpdatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "runDistanceManagerUpdates", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getChunkFutureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkFuture", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus"), Boolean::class.javaPrimitiveType!!))
        }
        val getChunkDebugDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkDebugData", MethodType.methodType(String::class.java, Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val getChunkAtImmediatelyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkAtImmediately", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkAtIfCachedImmediatelyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkAtIfCachedImmediately", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getPendingTasksCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPendingTasksCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getGeneratorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGenerator", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkGenerator")))
        }
        val randomStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "randomState", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val getDataStorageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDataStorage", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.DimensionDataStorage")))
        }
        val getGeneratorStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGeneratorState", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkGeneratorStructureState")))
        }
        val chunkScannerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunkScanner", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.storage.ChunkScanAccess")))
        }
        val getChunkNowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkNow", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getPoiManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPoiManager", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager")))
        }
        val getLastSpawnStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastSpawnState", MethodType.methodType(Class.forName("net.minecraft.world.level.NaturalSpawner\$SpawnState")))
        }
        val lastInhabitedUpdateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastInhabitedUpdate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawnEnemiesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawnEnemies")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawnFriendliesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawnFriendlies")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSpawnStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSpawnState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkFutureAwaitCounterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkFutureAwaitCounter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val iterationCopySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("iterationCopy")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val pollTask: Boolean
        get() = pollTaskHandle.invoke(handle) as Boolean

    val level: WrapperLevel
        get() = WrapperLevel(getLevelHandle.invoke(handle))

    fun isChunkLoaded(arg0: Int, arg1: Int): Boolean {
        return isChunkLoadedHandle.invoke(handle, arg0, arg1) as Boolean
    }

    val lightEngine: WrapperThreadedLevelLightEngine
        get() = WrapperThreadedLevelLightEngine(getLightEngineHandle.invoke(handle))

    val gatherStats: String
        get() = gatherStatsHandle.invoke(handle) as String

    fun getChunk(arg0: Int, arg1: Int, arg2: WrapperChunkStatus, arg3: Boolean): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkHandle.invoke(handle, arg0, arg1, arg2.handle, arg3))
    }

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun `moonrise$getFullChunkIfLoaded`(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(`moonrise$getFullChunkIfLoadedHandle`.invoke(handle, arg0, arg1))
    }

    fun getChunkAtIfLoadedImmediately(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkAtIfLoadedImmediatelyHandle.invoke(handle, arg0, arg1))
    }

    fun isPositionTicking(arg0: WrapperEntity): Boolean {
        return isPositionTickingHandle.invoke(handle, arg0.handle) as Boolean
    }

    val loadedChunksCount: Int
        get() = getLoadedChunksCountHandle.invoke(handle) as Int

    fun getChunkForLighting(arg0: Int, arg1: Int): WrapperLightChunk {
        return WrapperLightChunk(getChunkForLightingHandle.invoke(handle, arg0, arg1))
    }

    val tickingGenerated: Int
        get() = getTickingGeneratedHandle.invoke(handle) as Int

    val runDistanceManagerUpdates: Boolean
        get() = runDistanceManagerUpdatesHandle.invoke(handle) as Boolean

    fun getChunkFuture(arg0: Int, arg1: Int, arg2: WrapperChunkStatus, arg3: Boolean): Any {
        return getChunkFutureHandle.invoke(handle, arg0, arg1, arg2.handle, arg3) as Any
    }

    fun getChunkDebugData(arg0: WrapperChunkPos): String {
        return getChunkDebugDataHandle.invoke(handle, arg0.handle) as String
    }

    fun getChunkAtImmediately(arg0: Int, arg1: Int): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkAtImmediatelyHandle.invoke(handle, arg0, arg1))
    }

    fun getChunkAtIfCachedImmediately(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkAtIfCachedImmediatelyHandle.invoke(handle, arg0, arg1))
    }

    val pendingTasksCount: Int
        get() = getPendingTasksCountHandle.invoke(handle) as Int

    val generator: WrapperChunkGenerator
        get() = WrapperChunkGenerator(getGeneratorHandle.invoke(handle))

    val randomState: WrapperRandomState
        get() = WrapperRandomState(randomStateHandle.invoke(handle))

    val dataStorage: WrapperDimensionDataStorage
        get() = WrapperDimensionDataStorage(getDataStorageHandle.invoke(handle))

    val generatorState: WrapperChunkGeneratorStructureState
        get() = WrapperChunkGeneratorStructureState(getGeneratorStateHandle.invoke(handle))

    val chunkScanner: WrapperChunkScanAccess
        get() = WrapperChunkScanAccess(chunkScannerHandle.invoke(handle))

    fun getChunkNow(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkNowHandle.invoke(handle, arg0, arg1))
    }

    val poiManager: WrapperPoiManager
        get() = WrapperPoiManager(getPoiManagerHandle.invoke(handle))

    val lastSpawnState: WrapperSpawnState
        get() = WrapperSpawnState(getLastSpawnStateHandle.invoke(handle))

    fun setLastInhabitedUpdate(value: Long) {
        lastInhabitedUpdateSetterHandle.invoke(handle, value)
    }

    fun setSpawnEnemies(value: Boolean) {
        spawnEnemiesSetterHandle.invoke(handle, value)
    }

    fun setSpawnFriendlies(value: Boolean) {
        spawnFriendliesSetterHandle.invoke(handle, value)
    }

    fun setLastSpawnState(value: WrapperSpawnState) {
        lastSpawnStateSetterHandle.invoke(handle, value.handle)
    }

    fun setChunkFutureAwaitCounter(value: Long) {
        chunkFutureAwaitCounterSetterHandle.invoke(handle, value)
    }

    fun setIterationCopy(value: Any) {
        iterationCopySetterHandle.invoke(handle, value)
    }

}
