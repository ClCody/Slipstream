package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.ChunkAccess") }
        private val lookup = MethodHandles.lookup()

        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getSectionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSections", MethodType.methodType(Class.forName("[Lnet.minecraft.world.level.chunk.LevelChunkSection;")))
        }
        val getNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getHeightmapsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeightmaps", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val setBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Boolean::class.javaPrimitiveType!!))
        }
        val getMinBuildHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinBuildHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getFluidTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.TickContainerAccess")))
        }
        val getBlockTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.TickContainerAccess")))
        }
        val getInhabitedTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInhabitedTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getAllStartsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllStarts", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSection", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunkSection"), Int::class.javaPrimitiveType!!))
        }
        val isUnsavedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUnsaved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAllReferencesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllReferences", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val hasPrimedHeightmapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPrimedHeightmap", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types")))
        }
        val isLightCorrectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLightCorrect", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isYSpaceEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isYSpaceEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getUpgradeDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUpgradeData", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.UpgradeData")))
        }
        val carverBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "carverBiome", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeGenerationSettings"), Class.forName("java.util.function.Supplier")))
        }
        val isUpgradingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUpgrading", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSkyLightSourcesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyLightSources", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.ChunkSkyLightSources")))
        }
        val isSectionEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSectionEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getPostProcessingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPostProcessing", MethodType.methodType(Class.forName("[Lit.unimi.dsi.fastutil.shorts.ShortList;")))
        }
        val getBlockEntityNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntityNbt", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlendingDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlendingData", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.blending.BlendingData")))
        }
        val getPersistedStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPersistedStatus", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val getBlockEntitiesPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntitiesPos", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getBlockEntityNbtForSavingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntityNbtForSaving", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getTicksForSerializationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicksForSerialization", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess\$TicksToSave")))
        }
        val isOldNoiseGenerationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOldNoiseGeneration", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getOrCreateNoiseChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreateNoiseChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.NoiseChunk"), Class.forName("java.util.function.Function")))
        }
        val getHighestSectionPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHighestSectionPosition", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val `starlight$getBlockNibblesHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starlight\$getBlockNibbles", MethodType.methodType(Class.forName("[Lca.spottedleaf.moonrise.patches.starlight.light.SWMRNibbleArray;")))
        }
        val getStartForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStartForStructure", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure")))
        }
        val getHighestGeneratedStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHighestGeneratedStatus", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val getBelowZeroRetrogenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBelowZeroRetrogen", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.BelowZeroRetrogen")))
        }
        val getListenerRegistryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getListenerRegistry", MethodType.methodType(Class.forName("net.minecraft.world.level.gameevent.GameEventListenerRegistry"), Int::class.javaPrimitiveType!!))
        }
        val `starlight$getSkyNibblesHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starlight\$getSkyNibbles", MethodType.methodType(Class.forName("[Lca.spottedleaf.moonrise.patches.starlight.light.SWMRNibbleArray;")))
        }
        val getReferencesForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getReferencesForStructure", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.longs.LongSet"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure")))
        }
        val hasAnyStructureReferencesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasAnyStructureReferences", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `starlight$getSkyEmptinessMapHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starlight\$getSkyEmptinessMap", MethodType.methodType(Class.forName("[Z")))
        }
        val getOrCreateHeightmapUnprimedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreateHeightmapUnprimed", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.Heightmap"), Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types")))
        }
        val `starlight$getBlockEmptinessMapHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starlight\$getBlockEmptinessMap", MethodType.methodType(Class.forName("[Z")))
        }
        val getHeightAccessorForGenerationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeightAccessorForGeneration", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelHeightAccessor")))
        }
        val getHighestFilledSectionIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHighestFilledSectionIndex", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val unsavedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("unsaved")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isLightCorrectSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isLightCorrect")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inhabitedTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inhabitedTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val carverBiomeSettingsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("carverBiomeSettings")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val noiseChunkSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("noiseChunk")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blendingDataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blendingData")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val persistentDataContainerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("persistentDataContainer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blockNibblesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blockNibbles")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val skyNibblesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("skyNibbles")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val skyEmptinessMapSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("skyEmptinessMap")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blockEmptinessMapSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blockEmptinessMap")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getBlockState(arg0: Int, arg1: Int, arg2: Int): WrapperBlockState {
        return WrapperBlockState(getBlockStateHandle.invoke(handle, arg0, arg1, arg2))
    }

    val sections: Any
        get() = getSectionsHandle.invoke(handle) as Any

    fun getNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    val heightmaps: Any
        get() = getHeightmapsHandle.invoke(handle) as Any

    val pos: WrapperChunkPos
        get() = WrapperChunkPos(getPosHandle.invoke(handle))

    fun setBlockState(arg0: WrapperBlockPos, arg1: WrapperBlockState, arg2: Boolean): WrapperBlockState {
        return WrapperBlockState(setBlockStateHandle.invoke(handle, arg0.handle, arg1.handle, arg2))
    }

    val minBuildHeight: Int
        get() = getMinBuildHeightHandle.invoke(handle) as Int

    val fluidTicks: Any
        get() = getFluidTicksHandle.invoke(handle) as Any

    val blockTicks: Any
        get() = getBlockTicksHandle.invoke(handle) as Any

    val inhabitedTime: Long
        get() = getInhabitedTimeHandle.invoke(handle) as Long

    val allStarts: Any
        get() = getAllStartsHandle.invoke(handle) as Any

    fun getSection(arg0: Int): WrapperLevelChunkSection {
        return WrapperLevelChunkSection(getSectionHandle.invoke(handle, arg0))
    }

    val unsaved: Boolean
        get() = isUnsavedHandle.invoke(handle) as Boolean

    val allReferences: Any
        get() = getAllReferencesHandle.invoke(handle) as Any

    fun hasPrimedHeightmap(arg0: Any): Boolean {
        return hasPrimedHeightmapHandle.invoke(handle, arg0) as Boolean
    }

    val lightCorrect: Boolean
        get() = isLightCorrectHandle.invoke(handle) as Boolean

    fun isYSpaceEmpty(arg0: Int, arg1: Int): Boolean {
        return isYSpaceEmptyHandle.invoke(handle, arg0, arg1) as Boolean
    }

    val upgradeData: WrapperUpgradeData
        get() = WrapperUpgradeData(getUpgradeDataHandle.invoke(handle))

    fun carverBiome(arg0: Any): WrapperBiomeGenerationSettings {
        return WrapperBiomeGenerationSettings(carverBiomeHandle.invoke(handle, arg0))
    }

    val upgrading: Boolean
        get() = isUpgradingHandle.invoke(handle) as Boolean

    val skyLightSources: WrapperChunkSkyLightSources
        get() = WrapperChunkSkyLightSources(getSkyLightSourcesHandle.invoke(handle))

    fun isSectionEmpty(arg0: Int): Boolean {
        return isSectionEmptyHandle.invoke(handle, arg0) as Boolean
    }

    val postProcessing: Any
        get() = getPostProcessingHandle.invoke(handle) as Any

    fun getBlockEntityNbt(arg0: WrapperBlockPos): WrapperCompoundTag {
        return WrapperCompoundTag(getBlockEntityNbtHandle.invoke(handle, arg0.handle))
    }

    val blendingData: WrapperBlendingData
        get() = WrapperBlendingData(getBlendingDataHandle.invoke(handle))

    val persistedStatus: WrapperChunkStatus
        get() = WrapperChunkStatus(getPersistedStatusHandle.invoke(handle))

    val blockEntitiesPos: Any
        get() = getBlockEntitiesPosHandle.invoke(handle) as Any

    fun getBlockEntityNbtForSaving(arg0: WrapperBlockPos, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(getBlockEntityNbtForSavingHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val ticksForSerialization: WrapperTicksToSave
        get() = WrapperTicksToSave(getTicksForSerializationHandle.invoke(handle))

    val oldNoiseGeneration: Boolean
        get() = isOldNoiseGenerationHandle.invoke(handle) as Boolean

    fun getOrCreateNoiseChunk(arg0: Any): WrapperNoiseChunk {
        return WrapperNoiseChunk(getOrCreateNoiseChunkHandle.invoke(handle, arg0))
    }

    val highestSectionPosition: Int
        get() = getHighestSectionPositionHandle.invoke(handle) as Int

    val `starlight$getBlockNibbles`: Any
        get() = `starlight$getBlockNibblesHandle`.invoke(handle) as Any

    fun getStartForStructure(arg0: WrapperStructure): WrapperStructureStart {
        return WrapperStructureStart(getStartForStructureHandle.invoke(handle, arg0.handle))
    }

    val highestGeneratedStatus: WrapperChunkStatus
        get() = WrapperChunkStatus(getHighestGeneratedStatusHandle.invoke(handle))

    val belowZeroRetrogen: WrapperBelowZeroRetrogen
        get() = WrapperBelowZeroRetrogen(getBelowZeroRetrogenHandle.invoke(handle))

    fun getListenerRegistry(arg0: Int): WrapperGameEventListenerRegistry {
        return WrapperGameEventListenerRegistry(getListenerRegistryHandle.invoke(handle, arg0))
    }

    val `starlight$getSkyNibbles`: Any
        get() = `starlight$getSkyNibblesHandle`.invoke(handle) as Any

    fun getReferencesForStructure(arg0: WrapperStructure): Any {
        return getReferencesForStructureHandle.invoke(handle, arg0.handle) as Any
    }

    val anyStructureReferences: Boolean
        get() = hasAnyStructureReferencesHandle.invoke(handle) as Boolean

    val `starlight$getSkyEmptinessMap`: Any
        get() = `starlight$getSkyEmptinessMapHandle`.invoke(handle) as Any

    fun getOrCreateHeightmapUnprimed(arg0: Any): WrapperHeightmap {
        return WrapperHeightmap(getOrCreateHeightmapUnprimedHandle.invoke(handle, arg0))
    }

    val `starlight$getBlockEmptinessMap`: Any
        get() = `starlight$getBlockEmptinessMapHandle`.invoke(handle) as Any

    val heightAccessorForGeneration: WrapperLevelHeightAccessor
        get() = WrapperLevelHeightAccessor(getHeightAccessorForGenerationHandle.invoke(handle))

    val highestFilledSectionIndex: Int
        get() = getHighestFilledSectionIndexHandle.invoke(handle) as Int

    val height: Int
        get() = getHeightHandle.invoke(handle) as Int

    fun setUnsaved(value: Boolean) {
        unsavedSetterHandle.invoke(handle, value)
    }

    fun setIsLightCorrect(value: Boolean) {
        isLightCorrectSetterHandle.invoke(handle, value)
    }

    fun setInhabitedTime(value: Long) {
        inhabitedTimeSetterHandle.invoke(handle, value)
    }

    fun setCarverBiomeSettings(value: WrapperBiomeGenerationSettings) {
        carverBiomeSettingsSetterHandle.invoke(handle, value.handle)
    }

    fun setNoiseChunk(value: WrapperNoiseChunk) {
        noiseChunkSetterHandle.invoke(handle, value.handle)
    }

    fun setBlendingData(value: WrapperBlendingData) {
        blendingDataSetterHandle.invoke(handle, value.handle)
    }

    fun setPersistentDataContainer(value: Any) {
        persistentDataContainerSetterHandle.invoke(handle, value)
    }

    fun setBlockNibbles(value: Any) {
        blockNibblesSetterHandle.invoke(handle, value)
    }

    fun setSkyNibbles(value: Any) {
        skyNibblesSetterHandle.invoke(handle, value)
    }

    fun setSkyEmptinessMap(value: Any) {
        skyEmptinessMapSetterHandle.invoke(handle, value)
    }

    fun setBlockEmptinessMap(value: Any) {
        blockEmptinessMapSetterHandle.invoke(handle, value)
    }

}
