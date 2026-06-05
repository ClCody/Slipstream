package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWorldGenRegion(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.WorldGenRegion") }
        private val lookup = MethodHandles.lookup()

        val getSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getChunkSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkSource", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkSource")))
        }
        val getWorldBorderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldBorder", MethodType.methodType(Class.forName("net.minecraft.world.level.border.WorldBorder")))
        }
        val getMinBuildHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinBuildHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val removeBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val getSeaLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeaLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getFluidIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getLightEngineHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightEngine", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.LevelLightEngine")))
        }
        val getLevelDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelData", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.LevelData")))
        }
        val isStateAtPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStateAtPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.function.Predicate")))
        }
        val isFluidAtPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFluidAtPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.function.Predicate")))
        }
        val getBiomeManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomeManager", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeManager")))
        }
        val nextSubTickCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextSubTickCount", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getSkyDarkenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyDarken", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRawBrightnessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRawBrightness", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val getBrightnessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBrightness", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LightLayer"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.LevelTickAccess")))
        }
        val getNearestPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNearestPlayer", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.Player"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
        val getFluidTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.LevelTickAccess")))
        }
        val enabledFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enabledFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val isClientSideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isClientSide", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBlockEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntity", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntity"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus"), Boolean::class.javaPrimitiveType!!))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getShadeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShade", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction"), Boolean::class.javaPrimitiveType!!))
        }
        val getChunkIfLoadedImmediatelyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkIfLoadedImmediately", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getCurrentDifficultyAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCurrentDifficultyAt", MethodType.methodType(Class.forName("net.minecraft.world.DifficultyInstance"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getUncachedNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUncachedNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBlockStateIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val dimensionTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimensionType", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.DimensionType")))
        }
        val getEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntities", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.level.entity.EntityTypeTest"), Class.forName("net.minecraft.world.phys.AABB"), Class.forName("java.util.function.Predicate")))
        }
        val addFreshEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addFreshEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("org.bukkit.event.entity.CreatureSpawnEvent\$SpawnReason")))
        }
        val destroyBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "destroyBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Int::class.javaPrimitiveType!!))
        }
        val getFluidStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidState", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val isOldChunkAroundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOldChunkAround", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ChunkPos"), Int::class.javaPrimitiveType!!))
        }
        val playersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "players", MethodType.methodType(Class.forName("java.util.List")))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenter", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val setBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource")))
        }
        val ensureCanWriteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "ensureCanWrite", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val currentlyGeneratingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("currentlyGenerating")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasSetFarWarnedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasSetFarWarned")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val seed: Long
        get() = getSeedHandle.invoke(handle) as Long

    val level: WrapperServerLevel
        get() = WrapperServerLevel(getLevelHandle.invoke(handle))

    val chunkSource: WrapperChunkSource
        get() = WrapperChunkSource(getChunkSourceHandle.invoke(handle))

    val worldBorder: WrapperWorldBorder
        get() = WrapperWorldBorder(getWorldBorderHandle.invoke(handle))

    val minBuildHeight: Int
        get() = getMinBuildHeightHandle.invoke(handle) as Int

    fun removeBlock(arg0: WrapperBlockPos, arg1: Boolean): Boolean {
        return removeBlockHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val seaLevel: Int
        get() = getSeaLevelHandle.invoke(handle) as Int

    fun getFluidIfLoaded(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidIfLoadedHandle.invoke(handle, arg0.handle))
    }

    val lightEngine: WrapperLevelLightEngine
        get() = WrapperLevelLightEngine(getLightEngineHandle.invoke(handle))

    val levelData: WrapperLevelData
        get() = WrapperLevelData(getLevelDataHandle.invoke(handle))

    fun isStateAtPosition(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return isStateAtPositionHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun isFluidAtPosition(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return isFluidAtPositionHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val biomeManager: WrapperBiomeManager
        get() = WrapperBiomeManager(getBiomeManagerHandle.invoke(handle))

    val nextSubTickCount: Long
        get() = nextSubTickCountHandle.invoke(handle) as Long

    val skyDarken: Int
        get() = getSkyDarkenHandle.invoke(handle) as Int

    fun getRawBrightness(arg0: WrapperBlockPos, arg1: Int): Int {
        return getRawBrightnessHandle.invoke(handle, arg0.handle, arg1) as Int
    }

    fun getBrightness(arg0: Any, arg1: WrapperBlockPos): Int {
        return getBrightnessHandle.invoke(handle, arg0, arg1.handle) as Int
    }

    val blockTicks: WrapperLevelTickAccess
        get() = WrapperLevelTickAccess(getBlockTicksHandle.invoke(handle))

    fun getNearestPlayer(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Any): WrapperPlayer {
        return WrapperPlayer(getNearestPlayerHandle.invoke(handle, arg0, arg1, arg2, arg3, arg4))
    }

    val fluidTicks: WrapperLevelTickAccess
        get() = WrapperLevelTickAccess(getFluidTicksHandle.invoke(handle))

    val enabledFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(enabledFeaturesHandle.invoke(handle))

    val clientSide: Boolean
        get() = isClientSideHandle.invoke(handle) as Boolean

    fun getBlockEntity(arg0: WrapperBlockPos): WrapperBlockEntity {
        return WrapperBlockEntity(getBlockEntityHandle.invoke(handle, arg0.handle))
    }

    fun getChunk(arg0: Int, arg1: Int, arg2: WrapperChunkStatus, arg3: Boolean): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkHandle.invoke(handle, arg0, arg1, arg2.handle, arg3))
    }

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getShade(arg0: Any, arg1: Boolean): Float {
        return getShadeHandle.invoke(handle, arg0, arg1) as Float
    }

    fun getChunkIfLoadedImmediately(arg0: Int, arg1: Int): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkIfLoadedImmediatelyHandle.invoke(handle, arg0, arg1))
    }

    fun getCurrentDifficultyAt(arg0: WrapperBlockPos): WrapperDifficultyInstance {
        return WrapperDifficultyInstance(getCurrentDifficultyAtHandle.invoke(handle, arg0.handle))
    }

    fun getUncachedNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getUncachedNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getBlockStateIfLoaded(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateIfLoadedHandle.invoke(handle, arg0.handle))
    }

    fun getBlockState(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateHandle.invoke(handle, arg0.handle))
    }

    val dimensionType: WrapperDimensionType
        get() = WrapperDimensionType(dimensionTypeHandle.invoke(handle))

    fun getEntities(arg0: WrapperEntityTypeTest, arg1: WrapperAABB, arg2: Any): Any {
        return getEntitiesHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Any
    }

    fun addFreshEntity(arg0: WrapperEntity, arg1: Any): Boolean {
        return addFreshEntityHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun destroyBlock(arg0: WrapperBlockPos, arg1: Boolean, arg2: WrapperEntity, arg3: Int): Boolean {
        return destroyBlockHandle.invoke(handle, arg0.handle, arg1, arg2.handle, arg3) as Boolean
    }

    fun getFluidState(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidStateHandle.invoke(handle, arg0.handle))
    }

    fun isOldChunkAround(arg0: WrapperChunkPos, arg1: Int): Boolean {
        return isOldChunkAroundHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val players: Any
        get() = playersHandle.invoke(handle) as Any

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    fun getHeight(arg0: Any, arg1: Int, arg2: Int): Int {
        return getHeightHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    val center: WrapperChunkPos
        get() = WrapperChunkPos(getCenterHandle.invoke(handle))

    fun setBlock(arg0: WrapperBlockPos, arg1: WrapperBlockState, arg2: Int, arg3: Int): Boolean {
        return setBlockHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3) as Boolean
    }

    val random: WrapperRandomSource
        get() = WrapperRandomSource(getRandomHandle.invoke(handle))

    fun ensureCanWrite(arg0: WrapperBlockPos): Boolean {
        return ensureCanWriteHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setCurrentlyGenerating(value: Any) {
        currentlyGeneratingSetterHandle.invoke(handle, value)
    }

    fun setHasSetFarWarned(value: Boolean) {
        hasSetFarWarnedSetterHandle.invoke(handle, value)
    }

}
