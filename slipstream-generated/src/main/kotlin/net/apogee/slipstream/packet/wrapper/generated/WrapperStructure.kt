package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructure(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.Structure") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureType")))
        }
        val stepHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "step", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.GenerationStep\$Decoration")))
        }
        val generateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "generate", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart"), Class.forName("net.minecraft.core.RegistryAccess"), Class.forName("net.minecraft.world.level.chunk.ChunkGenerator"), Class.forName("net.minecraft.world.level.biome.BiomeSource"), Class.forName("net.minecraft.world.level.levelgen.RandomState"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager"), Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ChunkPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelHeightAccessor"), Class.forName("java.util.function.Predicate")))
        }
        val terrainAdaptationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "terrainAdaptation", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.TerrainAdjustment")))
        }
        val adjustBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "adjustBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox")))
        }
        val spawnOverridesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spawnOverrides", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val findValidGenerationPointHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findValidGenerationPoint", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure\$GenerationContext")))
        }
        val biomesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "biomes", MethodType.methodType(Class.forName("net.minecraft.core.HolderSet")))
        }
    }

    val type: WrapperStructureType
        get() = WrapperStructureType(typeHandle.invoke(handle))

    val step: Any
        get() = stepHandle.invoke(handle) as Any

    fun generate(arg0: WrapperRegistryAccess, arg1: WrapperChunkGenerator, arg2: WrapperBiomeSource, arg3: WrapperRandomState, arg4: WrapperStructureTemplateManager, arg5: Long, arg6: WrapperChunkPos, arg7: Int, arg8: WrapperLevelHeightAccessor, arg9: Any): WrapperStructureStart {
        return WrapperStructureStart(generateHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle, arg5, arg6.handle, arg7, arg8.handle, arg9))
    }

    val terrainAdaptation: Any
        get() = terrainAdaptationHandle.invoke(handle) as Any

    fun adjustBoundingBox(arg0: WrapperBoundingBox): WrapperBoundingBox {
        return WrapperBoundingBox(adjustBoundingBoxHandle.invoke(handle, arg0.handle))
    }

    val spawnOverrides: Any
        get() = spawnOverridesHandle.invoke(handle) as Any

    fun findValidGenerationPoint(arg0: WrapperGenerationContext): Any {
        return findValidGenerationPointHandle.invoke(handle, arg0.handle) as Any
    }

    val biomes: WrapperHolderSet
        get() = WrapperHolderSet(biomesHandle.invoke(handle))

}
