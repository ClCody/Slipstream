package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevel(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.Level") }
        private val lookup = MethodHandles.lookup()

        val isDebugHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDebug", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLoaded", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val dimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimension", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val `moonrise$getMaxSectionHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getMaxSection", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getMinSectionHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getMinSection", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val findSupportingBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findSupportingBlock", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val `moonrise$getEntityLookupHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getEntityLookup", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.level.entity.EntityLookup")))
        }
        val getBlockStateIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val dimensionTypeRegistrationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimensionTypeRegistration", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val checkEntityCollisionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "checkEntityCollision", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.shapes.CollisionContext"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val loadedAndEntityCanStandOnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "loadedAndEntityCanStandOn", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val isLoadedAndInBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLoadedAndInBounds", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getUncachedNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUncachedNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val gatherChunkSourceStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gatherChunkSourceStats", MethodType.methodType(String::class.java))
        }
        val getSharedSpawnAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSharedSpawnAngle", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getChunkForCollisionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkForCollisions", MethodType.methodType(Class.forName("net.minecraft.world.level.BlockGetter"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getGlobalSoundRangeSquaredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGlobalSoundRangeSquared", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("java.util.function.Function")))
        }
        val getProfilerSupplierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfilerSupplier", MethodType.methodType(Class.forName("java.util.function.Supplier")))
        }
        val dimensionTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimensionType", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.DimensionType")))
        }
        val getGameRulesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameRules", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
        }
        val damageSourcesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "damageSources", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSources")))
        }
        val getFluidStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidState", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val noSaveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "noSave", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val `moonrise$getHardCollidingEntitiesHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getHardCollidingEntities", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.AABB"), Class.forName("java.util.function.Predicate")))
        }
        val collidesWithSuffocatingBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "collidesWithSuffocatingBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val getChunkIfLoadedImmediatelyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkIfLoadedImmediately", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getPlayersForGlobalSoundGameruleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayersForGlobalSoundGamerule", MethodType.methodType(Class.forName("java.util.List")))
        }
        val `moonrise$getFullChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getFullChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getSpecificChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSpecificChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val `moonrise$getAnyChunkIfLoadedHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getAnyChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBlockStateIfLoadedAndInBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateIfLoadedAndInBounds", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val loadedAndEntityCanStandOnFaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "loadedAndEntityCanStandOnFace", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.core.Direction")))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Int::class.javaPrimitiveType!!))
        }
        val getCurrentDifficultyAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCurrentDifficultyAt", MethodType.methodType(Class.forName("net.minecraft.world.DifficultyInstance"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val clipHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clip", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.world.level.ClipContext")))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val clipDirectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clipDirect", MethodType.methodType(Class.forName("net.minecraft.world.phys.HitResult\$Type"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.shapes.CollisionContext")))
        }
        val getTypeKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTypeKey", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val isNightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isNight", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val explodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "explode", MethodType.methodType(Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.entity.Entity"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level\$ExplosionInteraction"), Class.forName("java.util.function.Consumer")))
        }
        val isRainingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRaining", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isDayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDay", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasChunkAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunkAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getChunkAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkAt", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getMapDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMapData", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData"), Class.forName("net.minecraft.world.level.saveddata.maps.MapId")))
        }
        val getNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isUnobstructedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUnobstructed", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getCraftServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCraftServer", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.CraftServer")))
        }
        val getHeightmapPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeightmapPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getEntitiesOfClassHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntitiesOfClass", MethodType.methodType(Class.forName("java.util.List"), Class.forName("java.lang.Class"), Class.forName("net.minecraft.world.phys.AABB"), Class.forName("java.util.function.Predicate")))
        }
        val getWorldBorderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldBorder", MethodType.methodType(Class.forName("net.minecraft.world.level.border.WorldBorder")))
        }
        val getChunkIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val findFreePositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findFreePosition", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getProfilerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfiler", MethodType.methodType(Class.forName("net.minecraft.util.profiling.ProfilerFiller")))
        }
        val getFluidIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val removeBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val getSeaLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeaLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val tickRateManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickRateManager", MethodType.methodType(Class.forName("net.minecraft.world.TickRateManager")))
        }
        val shouldTickBlocksAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldTickBlocksAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val noCollisionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "noCollision", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val setBlockAndUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBlockAndUpdate", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val shouldTickDeathHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldTickDeath", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getLightEngineHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightEngine", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.LevelLightEngine")))
        }
        val getSunAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSunAngle", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val isInWorldBoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWorldBounds", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val isRainingAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRainingAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getFreeMapIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFreeMapId", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapId")))
        }
        val getSharedSpawnPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSharedSpawnPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isFluidAtPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFluidAtPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.function.Predicate")))
        }
        val potionBrewingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "potionBrewing", MethodType.methodType(Class.forName("net.minecraft.world.item.alchemy.PotionBrewing")))
        }
        val getThunderLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getThunderLevel", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val getLevelDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelData", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.LevelData")))
        }
        val isStateAtPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStateAtPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.function.Predicate")))
        }
        val getSkyDarkenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyDarken", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRecipeManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeManager", MethodType.methodType(Class.forName("net.minecraft.world.item.crafting.RecipeManager")))
        }
        val getBlockRandomPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockRandomPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBiomeManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomeManager", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeManager")))
        }
        val nextSubTickCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextSubTickCount", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getRainLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRainLevel", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val mayInteractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayInteract", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.world.scores.Scoreboard")))
        }
        val getWireHandlerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWireHandler", MethodType.methodType(Class.forName("alternate.current.wire.WireHandler")))
        }
        val fillReportDetailsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fillReportDetails", MethodType.methodType(Class.forName("net.minecraft.CrashReportCategory"), Class.forName("net.minecraft.CrashReport")))
        }
        val isThunderingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isThundering", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getChunkEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkEntities", MethodType.methodType(Class.forName("[Lorg.bukkit.entity.Entity;"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorld", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.CraftWorld")))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource")))
        }
        val setBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val destroyBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "destroyBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Int::class.javaPrimitiveType!!))
        }
        val getEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntities", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.level.entity.EntityTypeTest"), Class.forName("net.minecraft.world.phys.AABB"), Class.forName("java.util.function.Predicate")))
        }
        val getBlockEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntity", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntity"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getGameTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getDayTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDayTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val isClientSideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isClientSide", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val paperConfigHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "paperConfig", MethodType.methodType(Class.forName("io.papermc.paper.configuration.WorldConfiguration")))
        }
        val tickingBlockEntitiesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickingBlockEntities")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val skyDarkenSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("skyDarken")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val randValueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("randValue")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val oRainLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("oRainLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val rainLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("rainLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val oThunderLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("oThunderLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val thunderLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("thunderLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val subTickCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("subTickCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pvpModeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pvpMode")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val generatorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("generator")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val preventPoiUpdatedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("preventPoiUpdated")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val captureBlockStatesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("captureBlockStates")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val captureTreeGenerationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("captureTreeGeneration")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isBlockPlaceCancelledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isBlockPlaceCancelled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val capturedBlockStatesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("capturedBlockStates")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val capturedTileEntitiesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("capturedTileEntities")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val captureDropsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("captureDrops")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wakeupInactiveRemainingAnimalsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wakeupInactiveRemainingAnimals")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wakeupInactiveRemainingFlyingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wakeupInactiveRemainingFlying")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wakeupInactiveRemainingMonstersSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wakeupInactiveRemainingMonsters")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wakeupInactiveRemainingVillagersSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wakeupInactiveRemainingVillagers")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val populatingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("populating")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val entityLimiterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("entityLimiter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tileLimiterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tileLimiter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tileTickPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tileTickPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val redstoneUpdateInfosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("redstoneUpdateInfos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val entityLookupSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("entityLookup")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val debug: Boolean
        get() = isDebugHandle.invoke(handle) as Boolean

    fun isLoaded(arg0: WrapperBlockPos): Boolean {
        return isLoadedHandle.invoke(handle, arg0.handle) as Boolean
    }

    val dimension: WrapperResourceKey
        get() = WrapperResourceKey(dimensionHandle.invoke(handle))

    val `moonrise$getMaxSection`: Int
        get() = `moonrise$getMaxSectionHandle`.invoke(handle) as Int

    val `moonrise$getMinSection`: Int
        get() = `moonrise$getMinSectionHandle`.invoke(handle) as Int

    fun findSupportingBlock(arg0: WrapperEntity, arg1: WrapperAABB): Any {
        return findSupportingBlockHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    val `moonrise$getEntityLookup`: Any
        get() = `moonrise$getEntityLookupHandle`.invoke(handle) as Any

    fun getBlockStateIfLoaded(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateIfLoadedHandle.invoke(handle, arg0.handle))
    }

    val dimensionTypeRegistration: WrapperHolder
        get() = WrapperHolder(dimensionTypeRegistrationHandle.invoke(handle))

    fun checkEntityCollision(arg0: WrapperBlockState, arg1: WrapperEntity, arg2: WrapperCollisionContext, arg3: WrapperBlockPos, arg4: Boolean): Boolean {
        return checkEntityCollisionHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4) as Boolean
    }

    fun loadedAndEntityCanStandOn(arg0: WrapperBlockPos, arg1: WrapperEntity): Boolean {
        return loadedAndEntityCanStandOnHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun isLoadedAndInBounds(arg0: WrapperBlockPos): Boolean {
        return isLoadedAndInBoundsHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getUncachedNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getUncachedNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    val gatherChunkSourceStats: String
        get() = gatherChunkSourceStatsHandle.invoke(handle) as String

    val sharedSpawnAngle: Float
        get() = getSharedSpawnAngleHandle.invoke(handle) as Float

    fun getChunkForCollisions(arg0: Int, arg1: Int): WrapperBlockGetter {
        return WrapperBlockGetter(getChunkForCollisionsHandle.invoke(handle, arg0, arg1))
    }

    fun getGlobalSoundRangeSquared(arg0: Any): Double {
        return getGlobalSoundRangeSquaredHandle.invoke(handle, arg0) as Double
    }

    val profilerSupplier: Any
        get() = getProfilerSupplierHandle.invoke(handle) as Any

    val dimensionType: WrapperDimensionType
        get() = WrapperDimensionType(dimensionTypeHandle.invoke(handle))

    val gameRules: WrapperGameRules
        get() = WrapperGameRules(getGameRulesHandle.invoke(handle))

    val damageSources: WrapperDamageSources
        get() = WrapperDamageSources(damageSourcesHandle.invoke(handle))

    fun getFluidState(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidStateHandle.invoke(handle, arg0.handle))
    }

    val noSave: Boolean
        get() = noSaveHandle.invoke(handle) as Boolean

    fun getHeight(arg0: Any, arg1: Int, arg2: Int): Int {
        return getHeightHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    fun `moonrise$getHardCollidingEntities`(arg0: WrapperEntity, arg1: WrapperAABB, arg2: Any): Any {
        return `moonrise$getHardCollidingEntitiesHandle`.invoke(handle, arg0.handle, arg1.handle, arg2) as Any
    }

    fun collidesWithSuffocatingBlock(arg0: WrapperEntity, arg1: WrapperAABB): Boolean {
        return collidesWithSuffocatingBlockHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun getChunkIfLoadedImmediately(arg0: Int, arg1: Int): WrapperChunkAccess {
        return WrapperChunkAccess(getChunkIfLoadedImmediatelyHandle.invoke(handle, arg0, arg1))
    }

    val playersForGlobalSoundGamerule: Any
        get() = getPlayersForGlobalSoundGameruleHandle.invoke(handle) as Any

    fun `moonrise$getFullChunkIfLoaded`(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(`moonrise$getFullChunkIfLoadedHandle`.invoke(handle, arg0, arg1))
    }

    fun `moonrise$getSpecificChunkIfLoaded`(arg0: Int, arg1: Int, arg2: WrapperChunkStatus): WrapperChunkAccess {
        return WrapperChunkAccess(`moonrise$getSpecificChunkIfLoadedHandle`.invoke(handle, arg0, arg1, arg2.handle))
    }

    fun `moonrise$getAnyChunkIfLoaded`(arg0: Int, arg1: Int): WrapperChunkAccess {
        return WrapperChunkAccess(`moonrise$getAnyChunkIfLoadedHandle`.invoke(handle, arg0, arg1))
    }

    fun getBlockStateIfLoadedAndInBounds(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateIfLoadedAndInBoundsHandle.invoke(handle, arg0.handle))
    }

    fun loadedAndEntityCanStandOnFace(arg0: WrapperBlockPos, arg1: WrapperEntity, arg2: Any): Boolean {
        return loadedAndEntityCanStandOnFaceHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Boolean
    }

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    fun getBlockState(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateHandle.invoke(handle, arg0.handle))
    }

    fun getEntity(arg0: Int): WrapperEntity {
        return WrapperEntity(getEntityHandle.invoke(handle, arg0))
    }

    fun getCurrentDifficultyAt(arg0: WrapperBlockPos): WrapperDifficultyInstance {
        return WrapperDifficultyInstance(getCurrentDifficultyAtHandle.invoke(handle, arg0.handle))
    }

    fun clip(arg0: WrapperClipContext): WrapperBlockHitResult {
        return WrapperBlockHitResult(clipHandle.invoke(handle, arg0.handle))
    }

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getChunk(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkHandle.invoke(handle, arg0, arg1))
    }

    fun clipDirect(arg0: WrapperVec3, arg1: WrapperVec3, arg2: WrapperCollisionContext): Any {
        return clipDirectHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Any
    }

    val typeKey: WrapperResourceKey
        get() = WrapperResourceKey(getTypeKeyHandle.invoke(handle))

    val night: Boolean
        get() = isNightHandle.invoke(handle) as Boolean

    fun explode(arg0: WrapperEntity, arg1: Double, arg2: Double, arg3: Double, arg4: Float, arg5: Boolean, arg6: Any, arg7: Any): WrapperExplosion {
        return WrapperExplosion(explodeHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4, arg5, arg6, arg7))
    }

    val raining: Boolean
        get() = isRainingHandle.invoke(handle) as Boolean

    val day: Boolean
        get() = isDayHandle.invoke(handle) as Boolean

    fun hasChunkAt(arg0: WrapperBlockPos): Boolean {
        return hasChunkAtHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getChunkAt(arg0: WrapperBlockPos): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkAtHandle.invoke(handle, arg0.handle))
    }

    fun getMapData(arg0: WrapperMapId): WrapperMapItemSavedData {
        return WrapperMapItemSavedData(getMapDataHandle.invoke(handle, arg0.handle))
    }

    fun getNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun isUnobstructed(arg0: WrapperEntity): Boolean {
        return isUnobstructedHandle.invoke(handle, arg0.handle) as Boolean
    }

    val craftServer: Any
        get() = getCraftServerHandle.invoke(handle) as Any

    fun getHeightmapPos(arg0: Any, arg1: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(getHeightmapPosHandle.invoke(handle, arg0, arg1.handle))
    }

    fun getEntitiesOfClass(arg0: Any, arg1: WrapperAABB, arg2: Any): Any {
        return getEntitiesOfClassHandle.invoke(handle, arg0, arg1.handle, arg2) as Any
    }

    val worldBorder: WrapperWorldBorder
        get() = WrapperWorldBorder(getWorldBorderHandle.invoke(handle))

    fun getChunkIfLoaded(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkIfLoadedHandle.invoke(handle, arg0, arg1))
    }

    fun findFreePosition(arg0: WrapperEntity, arg1: WrapperVoxelShape, arg2: WrapperVec3, arg3: Double, arg4: Double, arg5: Double): Any {
        return findFreePositionHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3, arg4, arg5) as Any
    }

    val profiler: Any
        get() = getProfilerHandle.invoke(handle) as Any

    fun getFluidIfLoaded(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidIfLoadedHandle.invoke(handle, arg0.handle))
    }

    fun removeBlock(arg0: WrapperBlockPos, arg1: Boolean): Boolean {
        return removeBlockHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val seaLevel: Int
        get() = getSeaLevelHandle.invoke(handle) as Int

    val tickRateManager: WrapperTickRateManager
        get() = WrapperTickRateManager(tickRateManagerHandle.invoke(handle))

    fun shouldTickBlocksAt(arg0: WrapperBlockPos): Boolean {
        return shouldTickBlocksAtHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun noCollision(arg0: WrapperEntity, arg1: WrapperAABB): Boolean {
        return noCollisionHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun setBlockAndUpdate(arg0: WrapperBlockPos, arg1: WrapperBlockState): Boolean {
        return setBlockAndUpdateHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun shouldTickDeath(arg0: WrapperEntity): Boolean {
        return shouldTickDeathHandle.invoke(handle, arg0.handle) as Boolean
    }

    val lightEngine: WrapperLevelLightEngine
        get() = WrapperLevelLightEngine(getLightEngineHandle.invoke(handle))

    fun getSunAngle(arg0: Float): Float {
        return getSunAngleHandle.invoke(handle, arg0) as Float
    }

    fun isInWorldBounds(arg0: WrapperBlockPos): Boolean {
        return isInWorldBoundsHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isRainingAt(arg0: WrapperBlockPos): Boolean {
        return isRainingAtHandle.invoke(handle, arg0.handle) as Boolean
    }

    val freeMapId: WrapperMapId
        get() = WrapperMapId(getFreeMapIdHandle.invoke(handle))

    val sharedSpawnPos: WrapperBlockPos
        get() = WrapperBlockPos(getSharedSpawnPosHandle.invoke(handle))

    fun isFluidAtPosition(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return isFluidAtPositionHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val potionBrewing: WrapperPotionBrewing
        get() = WrapperPotionBrewing(potionBrewingHandle.invoke(handle))

    fun getThunderLevel(arg0: Float): Float {
        return getThunderLevelHandle.invoke(handle, arg0) as Float
    }

    val levelData: WrapperLevelData
        get() = WrapperLevelData(getLevelDataHandle.invoke(handle))

    fun isStateAtPosition(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return isStateAtPositionHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val skyDarken: Int
        get() = getSkyDarkenHandle.invoke(handle) as Int

    val recipeManager: WrapperRecipeManager
        get() = WrapperRecipeManager(getRecipeManagerHandle.invoke(handle))

    fun getBlockRandomPos(arg0: Int, arg1: Int, arg2: Int, arg3: Int): WrapperBlockPos {
        return WrapperBlockPos(getBlockRandomPosHandle.invoke(handle, arg0, arg1, arg2, arg3))
    }

    val biomeManager: WrapperBiomeManager
        get() = WrapperBiomeManager(getBiomeManagerHandle.invoke(handle))

    val nextSubTickCount: Long
        get() = nextSubTickCountHandle.invoke(handle) as Long

    fun getRainLevel(arg0: Float): Float {
        return getRainLevelHandle.invoke(handle, arg0) as Float
    }

    fun mayInteract(arg0: WrapperPlayer, arg1: WrapperBlockPos): Boolean {
        return mayInteractHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val scoreboard: WrapperScoreboard
        get() = WrapperScoreboard(getScoreboardHandle.invoke(handle))

    val wireHandler: Any
        get() = getWireHandlerHandle.invoke(handle) as Any

    fun fillReportDetails(arg0: WrapperCrashReport): WrapperCrashReportCategory {
        return WrapperCrashReportCategory(fillReportDetailsHandle.invoke(handle, arg0.handle))
    }

    val thundering: Boolean
        get() = isThunderingHandle.invoke(handle) as Boolean

    fun getChunkEntities(arg0: Int, arg1: Int): Any {
        return getChunkEntitiesHandle.invoke(handle, arg0, arg1) as Any
    }

    val world: Any
        get() = getWorldHandle.invoke(handle) as Any

    val random: WrapperRandomSource
        get() = WrapperRandomSource(getRandomHandle.invoke(handle))

    fun setBlock(arg0: WrapperBlockPos, arg1: WrapperBlockState, arg2: Int, arg3: Int): Boolean {
        return setBlockHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3) as Boolean
    }

    fun destroyBlock(arg0: WrapperBlockPos, arg1: Boolean, arg2: WrapperEntity, arg3: Int): Boolean {
        return destroyBlockHandle.invoke(handle, arg0.handle, arg1, arg2.handle, arg3) as Boolean
    }

    fun getEntities(arg0: WrapperEntityTypeTest, arg1: WrapperAABB, arg2: Any): Any {
        return getEntitiesHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Any
    }

    fun getBlockEntity(arg0: WrapperBlockPos): WrapperBlockEntity {
        return WrapperBlockEntity(getBlockEntityHandle.invoke(handle, arg0.handle))
    }

    val gameTime: Long
        get() = getGameTimeHandle.invoke(handle) as Long

    val dayTime: Long
        get() = getDayTimeHandle.invoke(handle) as Long

    val clientSide: Boolean
        get() = isClientSideHandle.invoke(handle) as Boolean

    val paperConfig: Any
        get() = paperConfigHandle.invoke(handle) as Any

    fun setTickingBlockEntities(value: Boolean) {
        tickingBlockEntitiesSetterHandle.invoke(handle, value)
    }

    fun setSkyDarken(value: Int) {
        skyDarkenSetterHandle.invoke(handle, value)
    }

    fun setRandValue(value: Int) {
        randValueSetterHandle.invoke(handle, value)
    }

    fun setORainLevel(value: Float) {
        oRainLevelSetterHandle.invoke(handle, value)
    }

    fun setRainLevel(value: Float) {
        rainLevelSetterHandle.invoke(handle, value)
    }

    fun setOThunderLevel(value: Float) {
        oThunderLevelSetterHandle.invoke(handle, value)
    }

    fun setThunderLevel(value: Float) {
        thunderLevelSetterHandle.invoke(handle, value)
    }

    fun setSubTickCount(value: Long) {
        subTickCountSetterHandle.invoke(handle, value)
    }

    fun setPvpMode(value: Boolean) {
        pvpModeSetterHandle.invoke(handle, value)
    }

    fun setGenerator(value: Any) {
        generatorSetterHandle.invoke(handle, value)
    }

    fun setPreventPoiUpdated(value: Boolean) {
        preventPoiUpdatedSetterHandle.invoke(handle, value)
    }

    fun setCaptureBlockStates(value: Boolean) {
        captureBlockStatesSetterHandle.invoke(handle, value)
    }

    fun setCaptureTreeGeneration(value: Boolean) {
        captureTreeGenerationSetterHandle.invoke(handle, value)
    }

    fun setIsBlockPlaceCancelled(value: Boolean) {
        isBlockPlaceCancelledSetterHandle.invoke(handle, value)
    }

    fun setCapturedBlockStates(value: Any) {
        capturedBlockStatesSetterHandle.invoke(handle, value)
    }

    fun setCapturedTileEntities(value: Any) {
        capturedTileEntitiesSetterHandle.invoke(handle, value)
    }

    fun setCaptureDrops(value: Any) {
        captureDropsSetterHandle.invoke(handle, value)
    }

    fun setWakeupInactiveRemainingAnimals(value: Int) {
        wakeupInactiveRemainingAnimalsSetterHandle.invoke(handle, value)
    }

    fun setWakeupInactiveRemainingFlying(value: Int) {
        wakeupInactiveRemainingFlyingSetterHandle.invoke(handle, value)
    }

    fun setWakeupInactiveRemainingMonsters(value: Int) {
        wakeupInactiveRemainingMonstersSetterHandle.invoke(handle, value)
    }

    fun setWakeupInactiveRemainingVillagers(value: Int) {
        wakeupInactiveRemainingVillagersSetterHandle.invoke(handle, value)
    }

    fun setPopulating(value: Boolean) {
        populatingSetterHandle.invoke(handle, value)
    }

    fun setEntityLimiter(value: Any) {
        entityLimiterSetterHandle.invoke(handle, value)
    }

    fun setTileLimiter(value: Any) {
        tileLimiterSetterHandle.invoke(handle, value)
    }

    fun setTileTickPosition(value: Int) {
        tileTickPositionSetterHandle.invoke(handle, value)
    }

    fun setRedstoneUpdateInfos(value: Any) {
        redstoneUpdateInfosSetterHandle.invoke(handle, value)
    }

    fun setEntityLookup(value: Any) {
        entityLookupSetterHandle.invoke(handle, value)
    }

}
