package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelReader(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.LevelReader") }
        private val lookup = MethodHandles.lookup()

        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val getHeightmapPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeightmapPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkForCollisionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkForCollisions", MethodType.methodType(Class.forName("net.minecraft.world.level.BlockGetter"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getUncachedNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUncachedNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getMaxLocalRawBrightnessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxLocalRawBrightness", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val canSeeSkyFromBelowWaterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSeeSkyFromBelowWater", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockStatesIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStatesIfLoaded", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val `moonrise$syncLoadNonFullHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$syncLoadNonFull", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val isClientSideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isClientSide", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val enabledFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enabledFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val dimensionTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimensionType", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.DimensionType")))
        }
        val getSeaLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeaLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMinBuildHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinBuildHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBiomeManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomeManager", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeManager")))
        }
        val getSkyDarkenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyDarken", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBlockTintHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockTint", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.ColorResolver")))
        }
        val containsAnyLiquidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "containsAnyLiquid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.AABB")))
        }
        val isEmptyBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmptyBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val hasChunksAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunksAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val holderLookupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holderLookup", MethodType.methodType(Class.forName("net.minecraft.core.HolderLookup"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val hasChunkAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunkAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isWaterAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isWaterAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getPathfindingCostFromLightLevelsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPathfindingCostFromLightLevels", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getChunkIfLoadedImmediatelyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkIfLoadedImmediately", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getLightLevelDependentMagicValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightLevelDependentMagicValue", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    fun getHeightmapPos(arg0: Any, arg1: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(getHeightmapPosHandle.invoke(handle, arg0, arg1.handle))
    }

    fun getNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getChunkForCollisions(arg0: Int, arg1: Int): WrapperBlockGetter {
        return WrapperBlockGetter(getChunkForCollisionsHandle.invoke(handle, arg0, arg1))
    }

    fun getUncachedNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getUncachedNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getMaxLocalRawBrightness(arg0: WrapperBlockPos): Int {
        return getMaxLocalRawBrightnessHandle.invoke(handle, arg0.handle) as Int
    }

    fun canSeeSkyFromBelowWater(arg0: WrapperBlockPos): Boolean {
        return canSeeSkyFromBelowWaterHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getBlockStatesIfLoaded(arg0: WrapperAABB): Any {
        return getBlockStatesIfLoadedHandle.invoke(handle, arg0.handle) as Any
    }

    fun `moonrise$syncLoadNonFull`(arg0: Int, arg1: Int, arg2: WrapperChunkStatus): WrapperChunkAccess {
        return WrapperChunkAccess(`moonrise$syncLoadNonFullHandle`.invoke(handle, arg0, arg1, arg2.handle))
    }

    val clientSide: Boolean
        get() = isClientSideHandle.invoke(handle) as Boolean

    val enabledFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(enabledFeaturesHandle.invoke(handle))

    val dimensionType: WrapperDimensionType
        get() = WrapperDimensionType(dimensionTypeHandle.invoke(handle))

    val seaLevel: Int
        get() = getSeaLevelHandle.invoke(handle) as Int

    val minBuildHeight: Int
        get() = getMinBuildHeightHandle.invoke(handle) as Int

    val biomeManager: WrapperBiomeManager
        get() = WrapperBiomeManager(getBiomeManagerHandle.invoke(handle))

    val skyDarken: Int
        get() = getSkyDarkenHandle.invoke(handle) as Int

    fun getBlockTint(arg0: WrapperBlockPos, arg1: WrapperColorResolver): Int {
        return getBlockTintHandle.invoke(handle, arg0.handle, arg1.handle) as Int
    }

    fun containsAnyLiquid(arg0: WrapperAABB): Boolean {
        return containsAnyLiquidHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isEmptyBlock(arg0: WrapperBlockPos): Boolean {
        return isEmptyBlockHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun hasChunksAt(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int): Boolean {
        return hasChunksAtHandle.invoke(handle, arg0, arg1, arg2, arg3, arg4, arg5) as Boolean
    }

    fun holderLookup(arg0: WrapperResourceKey): WrapperHolderLookup {
        return WrapperHolderLookup(holderLookupHandle.invoke(handle, arg0.handle))
    }

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getChunk(arg0: Int, arg1: Int): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkHandle.invoke(handle, arg0, arg1))
    }

    fun getBiome(arg0: WrapperBlockPos): WrapperHolder {
        return WrapperHolder(getBiomeHandle.invoke(handle, arg0.handle))
    }

    fun hasChunkAt(arg0: Int, arg1: Int): Boolean {
        return hasChunkAtHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun isWaterAt(arg0: WrapperBlockPos): Boolean {
        return isWaterAtHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getPathfindingCostFromLightLevels(arg0: WrapperBlockPos): Float {
        return getPathfindingCostFromLightLevelsHandle.invoke(handle, arg0.handle) as Float
    }

    fun getChunkIfLoadedImmediately(arg0: WrapperBlockPos): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkIfLoadedImmediatelyHandle.invoke(handle, arg0.handle))
    }

    fun getLightLevelDependentMagicValue(arg0: WrapperBlockPos): Float {
        return getLightLevelDependentMagicValueHandle.invoke(handle, arg0.handle) as Float
    }

    fun getHeight(arg0: Any, arg1: Int, arg2: Int): Int {
        return getHeightHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

}
