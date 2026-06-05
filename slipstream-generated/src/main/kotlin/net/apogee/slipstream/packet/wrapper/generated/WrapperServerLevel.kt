package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerLevel(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ServerLevel") }
        private val lookup = MethodHandles.lookup()

        val getSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getChunkIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkSource", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerChunkCache")))
        }
        val tickRateManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickRateManager", MethodType.methodType(Class.forName("net.minecraft.world.TickRateManager")))
        }
        val shouldTickBlocksAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldTickBlocksAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.server.ServerScoreboard")))
        }
        val fillReportDetailsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fillReportDetails", MethodType.methodType(Class.forName("net.minecraft.CrashReportCategory"), Class.forName("net.minecraft.CrashReport")))
        }
        val mayInteractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayInteract", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getFreeMapIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFreeMapId", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapId")))
        }
        val getRecipeManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeManager", MethodType.methodType(Class.forName("net.minecraft.world.item.crafting.RecipeManager")))
        }
        val potionBrewingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "potionBrewing", MethodType.methodType(Class.forName("net.minecraft.world.item.alchemy.PotionBrewing")))
        }
        val getBlockTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.LevelTicks")))
        }
        val getPlayerByUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerByUUID", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("java.util.UUID")))
        }
        val getWireHandlerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWireHandler", MethodType.methodType(Class.forName("alternate.current.wire.WireHandler")))
        }
        val getFluidTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.LevelTicks")))
        }
        val enabledFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enabledFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val getEntityOrPartHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityOrPart", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Int::class.javaPrimitiveType!!))
        }
        val getTypeKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTypeKey", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val explodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "explode", MethodType.methodType(Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.level.ExplosionDamageCalculator"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level\$ExplosionInteraction"), Class.forName("net.minecraft.core.particles.ParticleOptions"), Class.forName("net.minecraft.core.particles.ParticleOptions"), Class.forName("net.minecraft.core.Holder"), Class.forName("java.util.function.Consumer")))
        }
        val getMapDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMapData", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData"), Class.forName("net.minecraft.world.level.saveddata.maps.MapId")))
        }
        val getShadeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShade", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction"), Boolean::class.javaPrimitiveType!!))
        }
        val isFlatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlat", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRaidsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRaids", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raids")))
        }
        val getRaidAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRaidAt", MethodType.methodType(Class.forName("net.minecraft.world.entity.raid.Raid"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val isRaidedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRaided", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val isVillageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVillage", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getDragonsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDragons", MethodType.methodType(Class.forName("java.util.List")))
        }
        val `moonrise$getFullChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getFullChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getAnyChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getAnyChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getSpecificChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSpecificChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val sendParticlesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sendParticles", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.core.particles.ParticleOptions"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val canSleepThroughNightsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSleepThroughNights", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val findLightningTargetAroundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findLightningTargetAround", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val getStructureManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStructureManager", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager")))
        }
        val `moonrise$getNearbyPlayersHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getNearbyPlayers", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.common.misc.NearbyPlayers")))
        }
        val `moonrise$getTickingChunksHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getTickingChunks", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.common.list.ReferenceList")))
        }
        val getLagCompensationTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLagCompensationTick", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val `moonrise$getLoadedChunksHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getLoadedChunks", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.common.list.ReferenceList")))
        }
        val areChunksLoadedForMoveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "areChunksLoadedForMove", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.AABB")))
        }
        val gatherChunkSourceStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gatherChunkSourceStats", MethodType.methodType(String::class.java))
        }
        val getGlobalPlayerByUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGlobalPlayerByUUID", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("java.util.UUID")))
        }
        val `moonrise$syncLoadNonFullHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$syncLoadNonFull", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val getUncachedNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUncachedNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntities", MethodType.methodType(Class.forName("net.minecraft.world.level.entity.LevelEntityGetter")))
        }
        val addFreshEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addFreshEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val `moonrise$getViewDistanceHolderHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getViewDistanceHolder", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.player.RegionizedPlayerChunkLoader\$ViewDistanceHolder")))
        }
        val `moonrise$getLastMidTickFailureHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getLastMidTickFailure", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val `moonrise$getPoiChunkDataControllerHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getPoiChunkDataController", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.io.RegionFileIOThread\$ChunkDataController")))
        }
        val `moonrise$getPlayerChunkLoaderHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getPlayerChunkLoader", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.player.RegionizedPlayerChunkLoader")))
        }
        val `moonrise$getRegionChunkShiftHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getRegionChunkShift", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getChunkDataControllerHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getChunkDataController", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.io.RegionFileIOThread\$ChunkDataController")))
        }
        val `moonrise$getChunkTaskSchedulerHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getChunkTaskScheduler", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.scheduling.ChunkTaskScheduler")))
        }
        val tryAddFreshEntityWithPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryAddFreshEntityWithPassengers", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("org.bukkit.event.entity.CreatureSpawnEvent\$SpawnReason")))
        }
        val `moonrise$getEntityTickingChunksHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getEntityTickingChunks", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.common.list.ReferenceList")))
        }
        val `moonrise$getEntityChunkDataControllerHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getEntityChunkDataController", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.io.RegionFileIOThread\$ChunkDataController")))
        }
        val playersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "players", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("java.util.UUID")))
        }
        val getPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayers", MethodType.methodType(Class.forName("java.util.List"), Class.forName("java.util.function.Predicate")))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val noSaveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "noSave", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val findNearestMapStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findNearestMapStructure", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.tags.TagKey"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val isNaturalSpawningAllowedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isNaturalSpawningAllowed", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val isPositionEntityTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPositionEntityTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val addWithUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addWithUUID", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getDataStorageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDataStorage", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.DimensionDataStorage")))
        }
        val structureManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "structureManager", MethodType.methodType(Class.forName("net.minecraft.world.level.StructureManager")))
        }
        val getForcedChunksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getForcedChunks", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.longs.LongSet")))
        }
        val isHandlingTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHandlingTick", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val findLightningRodHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findLightningRod", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val strikeLightningHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "strikeLightning", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("org.bukkit.event.weather.LightningStrikeEvent\$Cause")))
        }
        val getPoiManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPoiManager", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager")))
        }
        val getRandomPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomPlayer", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val sectionsToVillageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sectionsToVillage", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.SectionPos")))
        }
        val getLogicalHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLogicalHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isCloseToVillageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCloseToVillage", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val getAllEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllEntities", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getDragonFightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDragonFight", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.end.EndDragonFight")))
        }
        val getPortalForcerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPortalForcer", MethodType.methodType(Class.forName("net.minecraft.world.level.portal.PortalForcer")))
        }
        val setChunkForcedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setChunkForced", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val findClosestBiome3dHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findClosestBiome3d", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Pair"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getWatchdogStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWatchdogStats", MethodType.methodType(String::class.java))
        }
        val getRandomSequencesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomSequences", MethodType.methodType(Class.forName("net.minecraft.world.RandomSequences")))
        }
        val areEntitiesLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "areEntitiesLoaded", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!))
        }
        val getRandomSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomSequence", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getPathTypeCacheHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPathTypeCache", MethodType.methodType(Class.forName("net.minecraft.world.level.pathfinder.PathTypeCache")))
        }
        val lastSpawnChunkRadiusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSpawnChunkRadius")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val noSaveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("noSave")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val emptyTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("emptyTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isUpdatingNavigationsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isUpdatingNavigations")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val handlingTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("handlingTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dragonFightSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dragonFight")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasPhysicsEventSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasPhysicsEvent")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasEntityMoveEventSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasEntityMoveEvent")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val markedClosingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("markedClosing")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastMidTickFailureSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastMidTickFailure")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickedBlocksOrFluidsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickedBlocksOrFluids")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lagCompensationTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lagCompensationTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val seed: Long
        get() = getSeedHandle.invoke(handle) as Long

    val level: WrapperServerLevel
        get() = WrapperServerLevel(getLevelHandle.invoke(handle))

    fun getChunkIfLoaded(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkIfLoadedHandle.invoke(handle, arg0, arg1))
    }

    val chunkSource: WrapperServerChunkCache
        get() = WrapperServerChunkCache(getChunkSourceHandle.invoke(handle))

    val tickRateManager: WrapperTickRateManager
        get() = WrapperTickRateManager(tickRateManagerHandle.invoke(handle))

    fun shouldTickBlocksAt(arg0: Long): Boolean {
        return shouldTickBlocksAtHandle.invoke(handle, arg0) as Boolean
    }

    val scoreboard: WrapperServerScoreboard
        get() = WrapperServerScoreboard(getScoreboardHandle.invoke(handle))

    fun fillReportDetails(arg0: WrapperCrashReport): WrapperCrashReportCategory {
        return WrapperCrashReportCategory(fillReportDetailsHandle.invoke(handle, arg0.handle))
    }

    fun mayInteract(arg0: WrapperPlayer, arg1: WrapperBlockPos): Boolean {
        return mayInteractHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val freeMapId: WrapperMapId
        get() = WrapperMapId(getFreeMapIdHandle.invoke(handle))

    val recipeManager: WrapperRecipeManager
        get() = WrapperRecipeManager(getRecipeManagerHandle.invoke(handle))

    val potionBrewing: WrapperPotionBrewing
        get() = WrapperPotionBrewing(potionBrewingHandle.invoke(handle))

    val blockTicks: WrapperLevelTicks
        get() = WrapperLevelTicks(getBlockTicksHandle.invoke(handle))

    fun getPlayerByUUID(arg0: Any): WrapperPlayer {
        return WrapperPlayer(getPlayerByUUIDHandle.invoke(handle, arg0))
    }

    val wireHandler: Any
        get() = getWireHandlerHandle.invoke(handle) as Any

    val fluidTicks: WrapperLevelTicks
        get() = WrapperLevelTicks(getFluidTicksHandle.invoke(handle))

    val enabledFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(enabledFeaturesHandle.invoke(handle))

    fun getEntityOrPart(arg0: Int): WrapperEntity {
        return WrapperEntity(getEntityOrPartHandle.invoke(handle, arg0))
    }

    val typeKey: WrapperResourceKey
        get() = WrapperResourceKey(getTypeKeyHandle.invoke(handle))

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun explode(arg0: WrapperEntity, arg1: WrapperDamageSource, arg2: WrapperExplosionDamageCalculator, arg3: Double, arg4: Double, arg5: Double, arg6: Float, arg7: Boolean, arg8: Any, arg9: WrapperParticleOptions, arg10: WrapperParticleOptions, arg11: WrapperHolder, arg12: Any): WrapperExplosion {
        return WrapperExplosion(explodeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3, arg4, arg5, arg6, arg7, arg8, arg9.handle, arg10.handle, arg11.handle, arg12))
    }

    fun getMapData(arg0: WrapperMapId): WrapperMapItemSavedData {
        return WrapperMapItemSavedData(getMapDataHandle.invoke(handle, arg0.handle))
    }

    fun getShade(arg0: Any, arg1: Boolean): Float {
        return getShadeHandle.invoke(handle, arg0, arg1) as Float
    }

    val flat: Boolean
        get() = isFlatHandle.invoke(handle) as Boolean

    val raids: WrapperRaids
        get() = WrapperRaids(getRaidsHandle.invoke(handle))

    fun getRaidAt(arg0: WrapperBlockPos): WrapperRaid {
        return WrapperRaid(getRaidAtHandle.invoke(handle, arg0.handle))
    }

    fun isRaided(arg0: WrapperBlockPos): Boolean {
        return isRaidedHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isVillage(arg0: WrapperBlockPos): Boolean {
        return isVillageHandle.invoke(handle, arg0.handle) as Boolean
    }

    val dragons: Any
        get() = getDragonsHandle.invoke(handle) as Any

    fun `moonrise$getFullChunkIfLoaded`(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(`moonrise$getFullChunkIfLoadedHandle`.invoke(handle, arg0, arg1))
    }

    fun `moonrise$getAnyChunkIfLoaded`(arg0: Int, arg1: Int): WrapperChunkAccess {
        return WrapperChunkAccess(`moonrise$getAnyChunkIfLoadedHandle`.invoke(handle, arg0, arg1))
    }

    fun `moonrise$getSpecificChunkIfLoaded`(arg0: Int, arg1: Int, arg2: WrapperChunkStatus): WrapperChunkAccess {
        return WrapperChunkAccess(`moonrise$getSpecificChunkIfLoadedHandle`.invoke(handle, arg0, arg1, arg2.handle))
    }

    fun sendParticles(arg0: WrapperServerPlayer, arg1: WrapperParticleOptions, arg2: Double, arg3: Double, arg4: Double, arg5: Int, arg6: Double, arg7: Double, arg8: Double, arg9: Double, arg10: Boolean): Int {
        return sendParticlesHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as Int
    }

    val canSleepThroughNights: Boolean
        get() = canSleepThroughNightsHandle.invoke(handle) as Boolean

    fun findLightningTargetAround(arg0: WrapperBlockPos, arg1: Boolean): WrapperBlockPos {
        return WrapperBlockPos(findLightningTargetAroundHandle.invoke(handle, arg0.handle, arg1))
    }

    val getStructureManager: WrapperStructureTemplateManager
        get() = WrapperStructureTemplateManager(getStructureManagerHandle.invoke(handle))

    val `moonrise$getNearbyPlayers`: Any
        get() = `moonrise$getNearbyPlayersHandle`.invoke(handle) as Any

    val `moonrise$getTickingChunks`: Any
        get() = `moonrise$getTickingChunksHandle`.invoke(handle) as Any

    val lagCompensationTick: Long
        get() = getLagCompensationTickHandle.invoke(handle) as Long

    val `moonrise$getLoadedChunks`: Any
        get() = `moonrise$getLoadedChunksHandle`.invoke(handle) as Any

    fun areChunksLoadedForMove(arg0: WrapperAABB): Boolean {
        return areChunksLoadedForMoveHandle.invoke(handle, arg0.handle) as Boolean
    }

    val gatherChunkSourceStats: String
        get() = gatherChunkSourceStatsHandle.invoke(handle) as String

    fun getGlobalPlayerByUUID(arg0: Any): WrapperPlayer {
        return WrapperPlayer(getGlobalPlayerByUUIDHandle.invoke(handle, arg0))
    }

    fun `moonrise$syncLoadNonFull`(arg0: Int, arg1: Int, arg2: WrapperChunkStatus): WrapperChunkAccess {
        return WrapperChunkAccess(`moonrise$syncLoadNonFullHandle`.invoke(handle, arg0, arg1, arg2.handle))
    }

    fun getUncachedNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getUncachedNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    val entities: WrapperLevelEntityGetter
        get() = WrapperLevelEntityGetter(getEntitiesHandle.invoke(handle))

    fun addFreshEntity(arg0: WrapperEntity): Boolean {
        return addFreshEntityHandle.invoke(handle, arg0.handle) as Boolean
    }

    val `moonrise$getViewDistanceHolder`: Any
        get() = `moonrise$getViewDistanceHolderHandle`.invoke(handle) as Any

    val `moonrise$getLastMidTickFailure`: Long
        get() = `moonrise$getLastMidTickFailureHandle`.invoke(handle) as Long

    val `moonrise$getPoiChunkDataController`: Any
        get() = `moonrise$getPoiChunkDataControllerHandle`.invoke(handle) as Any

    val `moonrise$getPlayerChunkLoader`: Any
        get() = `moonrise$getPlayerChunkLoaderHandle`.invoke(handle) as Any

    val `moonrise$getRegionChunkShift`: Int
        get() = `moonrise$getRegionChunkShiftHandle`.invoke(handle) as Int

    val `moonrise$getChunkDataController`: Any
        get() = `moonrise$getChunkDataControllerHandle`.invoke(handle) as Any

    val `moonrise$getChunkTaskScheduler`: Any
        get() = `moonrise$getChunkTaskSchedulerHandle`.invoke(handle) as Any

    fun tryAddFreshEntityWithPassengers(arg0: WrapperEntity, arg1: Any): Boolean {
        return tryAddFreshEntityWithPassengersHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val `moonrise$getEntityTickingChunks`: Any
        get() = `moonrise$getEntityTickingChunksHandle`.invoke(handle) as Any

    val `moonrise$getEntityChunkDataController`: Any
        get() = `moonrise$getEntityChunkDataControllerHandle`.invoke(handle) as Any

    val players: Any
        get() = playersHandle.invoke(handle) as Any

    fun getEntity(arg0: Any): WrapperEntity {
        return WrapperEntity(getEntityHandle.invoke(handle, arg0))
    }

    fun getPlayers(arg0: Any): Any {
        return getPlayersHandle.invoke(handle, arg0) as Any
    }

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    val noSave: Boolean
        get() = noSaveHandle.invoke(handle) as Boolean

    fun findNearestMapStructure(arg0: WrapperTagKey, arg1: WrapperBlockPos, arg2: Int, arg3: Boolean): WrapperBlockPos {
        return WrapperBlockPos(findNearestMapStructureHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3))
    }

    fun isNaturalSpawningAllowed(arg0: WrapperChunkPos): Boolean {
        return isNaturalSpawningAllowedHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isPositionEntityTicking(arg0: WrapperBlockPos): Boolean {
        return isPositionEntityTickingHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun addWithUUID(arg0: WrapperEntity): Boolean {
        return addWithUUIDHandle.invoke(handle, arg0.handle) as Boolean
    }

    val dataStorage: WrapperDimensionDataStorage
        get() = WrapperDimensionDataStorage(getDataStorageHandle.invoke(handle))

    val structureManager: WrapperStructureManager
        get() = WrapperStructureManager(structureManagerHandle.invoke(handle))

    val forcedChunks: Any
        get() = getForcedChunksHandle.invoke(handle) as Any

    val handlingTick: Boolean
        get() = isHandlingTickHandle.invoke(handle) as Boolean

    fun findLightningRod(arg0: WrapperBlockPos): Any {
        return findLightningRodHandle.invoke(handle, arg0.handle) as Any
    }

    fun strikeLightning(arg0: WrapperEntity, arg1: Any): Boolean {
        return strikeLightningHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val poiManager: WrapperPoiManager
        get() = WrapperPoiManager(getPoiManagerHandle.invoke(handle))

    val randomPlayer: WrapperServerPlayer
        get() = WrapperServerPlayer(getRandomPlayerHandle.invoke(handle))

    fun sectionsToVillage(arg0: WrapperSectionPos): Int {
        return sectionsToVillageHandle.invoke(handle, arg0.handle) as Int
    }

    val logicalHeight: Int
        get() = getLogicalHeightHandle.invoke(handle) as Int

    fun isCloseToVillage(arg0: WrapperBlockPos, arg1: Int): Boolean {
        return isCloseToVillageHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val allEntities: Any
        get() = getAllEntitiesHandle.invoke(handle) as Any

    val dragonFight: WrapperEndDragonFight
        get() = WrapperEndDragonFight(getDragonFightHandle.invoke(handle))

    val portalForcer: WrapperPortalForcer
        get() = WrapperPortalForcer(getPortalForcerHandle.invoke(handle))

    fun setChunkForced(arg0: Int, arg1: Int, arg2: Boolean): Boolean {
        return setChunkForcedHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun findClosestBiome3d(arg0: Any, arg1: WrapperBlockPos, arg2: Int, arg3: Int, arg4: Int): Any {
        return findClosestBiome3dHandle.invoke(handle, arg0, arg1.handle, arg2, arg3, arg4) as Any
    }

    val watchdogStats: String
        get() = getWatchdogStatsHandle.invoke(handle) as String

    val randomSequences: WrapperRandomSequences
        get() = WrapperRandomSequences(getRandomSequencesHandle.invoke(handle))

    fun areEntitiesLoaded(arg0: Long): Boolean {
        return areEntitiesLoadedHandle.invoke(handle, arg0) as Boolean
    }

    fun getRandomSequence(arg0: WrapperResourceLocation): WrapperRandomSource {
        return WrapperRandomSource(getRandomSequenceHandle.invoke(handle, arg0.handle))
    }

    val pathTypeCache: WrapperPathTypeCache
        get() = WrapperPathTypeCache(getPathTypeCacheHandle.invoke(handle))

    fun setLastSpawnChunkRadius(value: Int) {
        lastSpawnChunkRadiusSetterHandle.invoke(handle, value)
    }

    fun setNoSave(value: Boolean) {
        noSaveSetterHandle.invoke(handle, value)
    }

    fun setEmptyTime(value: Int) {
        emptyTimeSetterHandle.invoke(handle, value)
    }

    fun setIsUpdatingNavigations(value: Boolean) {
        isUpdatingNavigationsSetterHandle.invoke(handle, value)
    }

    fun setHandlingTick(value: Boolean) {
        handlingTickSetterHandle.invoke(handle, value)
    }

    fun setDragonFight(value: WrapperEndDragonFight) {
        dragonFightSetterHandle.invoke(handle, value.handle)
    }

    fun setHasPhysicsEvent(value: Boolean) {
        hasPhysicsEventSetterHandle.invoke(handle, value)
    }

    fun setHasEntityMoveEvent(value: Boolean) {
        hasEntityMoveEventSetterHandle.invoke(handle, value)
    }

    fun setMarkedClosing(value: Boolean) {
        markedClosingSetterHandle.invoke(handle, value)
    }

    fun setLastMidTickFailure(value: Long) {
        lastMidTickFailureSetterHandle.invoke(handle, value)
    }

    fun setTickedBlocksOrFluids(value: Long) {
        tickedBlocksOrFluidsSetterHandle.invoke(handle, value)
    }

    fun setLagCompensationTick(value: Long) {
        lagCompensationTickSetterHandle.invoke(handle, value)
    }

}
