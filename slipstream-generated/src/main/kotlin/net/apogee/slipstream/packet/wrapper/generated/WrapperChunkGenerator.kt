package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkGenerator(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.ChunkGenerator") }
        private val lookup = MethodHandles.lookup()

        val getSpawnHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelHeightAccessor")))
        }
        val getBiomeSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomeSource", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeSource")))
        }
        val getFirstOccupiedHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFirstOccupiedHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Class.forName("net.minecraft.world.level.LevelHeightAccessor"), Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val getBiomeGenerationSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomeGenerationSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeGenerationSettings"), Class.forName("net.minecraft.core.Holder")))
        }
        val getSeaLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeaLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val findNearestMapStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findNearestMapStructure", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Pair"), Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.core.HolderSet"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val getMobsAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMobsAt", MethodType.methodType(Class.forName("net.minecraft.util.random.WeightedRandomList"), Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.world.level.StructureManager"), Class.forName("net.minecraft.world.entity.MobCategory"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val createBiomesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createBiomes", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.world.level.levelgen.RandomState"), Class.forName("net.minecraft.world.level.levelgen.blending.Blender"), Class.forName("net.minecraft.world.level.StructureManager"), Class.forName("net.minecraft.world.level.chunk.ChunkAccess")))
        }
        val createStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createState", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkGeneratorStructureState"), Class.forName("net.minecraft.core.HolderLookup"), Class.forName("net.minecraft.world.level.levelgen.RandomState"), Long::class.javaPrimitiveType!!, Class.forName("org.spigotmc.SpigotWorldConfig")))
        }
        val getFirstFreeHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFirstFreeHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Class.forName("net.minecraft.world.level.LevelHeightAccessor"), Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val getBaseColumnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseColumn", MethodType.methodType(Class.forName("net.minecraft.world.level.NoiseColumn"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelHeightAccessor"), Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val getBaseHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseHeight", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.Heightmap\$Types"), Class.forName("net.minecraft.world.level.LevelHeightAccessor"), Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val fillFromNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fillFromNoise", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.world.level.levelgen.blending.Blender"), Class.forName("net.minecraft.world.level.levelgen.RandomState"), Class.forName("net.minecraft.world.level.StructureManager"), Class.forName("net.minecraft.world.level.chunk.ChunkAccess")))
        }
        val getGenDepthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGenDepth", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMinYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTypeNameForDataFixerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTypeNameForDataFixer", MethodType.methodType(Class.forName("java.util.Optional")))
        }
    }

    fun getSpawnHeight(arg0: WrapperLevelHeightAccessor): Int {
        return getSpawnHeightHandle.invoke(handle, arg0.handle) as Int
    }

    val biomeSource: WrapperBiomeSource
        get() = WrapperBiomeSource(getBiomeSourceHandle.invoke(handle))

    fun getFirstOccupiedHeight(arg0: Int, arg1: Int, arg2: Any, arg3: WrapperLevelHeightAccessor, arg4: WrapperRandomState): Int {
        return getFirstOccupiedHeightHandle.invoke(handle, arg0, arg1, arg2, arg3.handle, arg4.handle) as Int
    }

    fun getBiomeGenerationSettings(arg0: WrapperHolder): WrapperBiomeGenerationSettings {
        return WrapperBiomeGenerationSettings(getBiomeGenerationSettingsHandle.invoke(handle, arg0.handle))
    }

    val seaLevel: Int
        get() = getSeaLevelHandle.invoke(handle) as Int

    fun findNearestMapStructure(arg0: WrapperServerLevel, arg1: WrapperHolderSet, arg2: WrapperBlockPos, arg3: Int, arg4: Boolean): Any {
        return findNearestMapStructureHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3, arg4) as Any
    }

    fun getMobsAt(arg0: WrapperHolder, arg1: WrapperStructureManager, arg2: Any, arg3: WrapperBlockPos): WrapperWeightedRandomList {
        return WrapperWeightedRandomList(getMobsAtHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3.handle))
    }

    fun createBiomes(arg0: WrapperRandomState, arg1: WrapperBlender, arg2: WrapperStructureManager, arg3: WrapperChunkAccess): Any {
        return createBiomesHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle) as Any
    }

    fun createState(arg0: WrapperHolderLookup, arg1: WrapperRandomState, arg2: Long, arg3: Any): WrapperChunkGeneratorStructureState {
        return WrapperChunkGeneratorStructureState(createStateHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3))
    }

    fun getFirstFreeHeight(arg0: Int, arg1: Int, arg2: Any, arg3: WrapperLevelHeightAccessor, arg4: WrapperRandomState): Int {
        return getFirstFreeHeightHandle.invoke(handle, arg0, arg1, arg2, arg3.handle, arg4.handle) as Int
    }

    fun getBaseColumn(arg0: Int, arg1: Int, arg2: WrapperLevelHeightAccessor, arg3: WrapperRandomState): WrapperNoiseColumn {
        return WrapperNoiseColumn(getBaseColumnHandle.invoke(handle, arg0, arg1, arg2.handle, arg3.handle))
    }

    fun getBaseHeight(arg0: Int, arg1: Int, arg2: Any, arg3: WrapperLevelHeightAccessor, arg4: WrapperRandomState): Int {
        return getBaseHeightHandle.invoke(handle, arg0, arg1, arg2, arg3.handle, arg4.handle) as Int
    }

    fun fillFromNoise(arg0: WrapperBlender, arg1: WrapperRandomState, arg2: WrapperStructureManager, arg3: WrapperChunkAccess): Any {
        return fillFromNoiseHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle) as Any
    }

    val genDepth: Int
        get() = getGenDepthHandle.invoke(handle) as Int

    val minY: Int
        get() = getMinYHandle.invoke(handle) as Int

    val typeNameForDataFixer: Any
        get() = getTypeNameForDataFixerHandle.invoke(handle) as Any

}
