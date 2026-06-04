package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperGenerationContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.Structure\$GenerationContext") }
        private val lookup = MethodHandles.lookup()

        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val chunkGeneratorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunkGenerator", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkGenerator")))
        }
        val biomeSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "biomeSource", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.BiomeSource")))
        }
        val randomStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "randomState", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val structureTemplateManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "structureTemplateManager", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager")))
        }
        val randomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "random", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.WorldgenRandom")))
        }
        val seedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "seed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val chunkPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunkPos", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val heightAccessorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "heightAccessor", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelHeightAccessor")))
        }
        val validBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "validBiome", MethodType.methodType(Class.forName("java.util.function.Predicate")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.RegistryAccess"), Class.forName("net.minecraft.world.level.chunk.ChunkGenerator"), Class.forName("net.minecraft.world.level.biome.BiomeSource"), Class.forName("net.minecraft.world.level.levelgen.RandomState"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager"), Class.forName("net.minecraft.world.level.levelgen.WorldgenRandom"), Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ChunkPos"), Class.forName("net.minecraft.world.level.LevelHeightAccessor"), Class.forName("java.util.function.Predicate")))
        }
    }

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    val chunkGenerator: WrapperChunkGenerator
        get() = WrapperChunkGenerator(chunkGeneratorHandle.invoke(handle))

    val biomeSource: WrapperBiomeSource
        get() = WrapperBiomeSource(biomeSourceHandle.invoke(handle))

    val randomState: WrapperRandomState
        get() = WrapperRandomState(randomStateHandle.invoke(handle))

    val structureTemplateManager: WrapperStructureTemplateManager
        get() = WrapperStructureTemplateManager(structureTemplateManagerHandle.invoke(handle))

    val random: WrapperWorldgenRandom
        get() = WrapperWorldgenRandom(randomHandle.invoke(handle))

    val seed: Long
        get() = seedHandle.invoke(handle) as Long

    val chunkPos: WrapperChunkPos
        get() = WrapperChunkPos(chunkPosHandle.invoke(handle))

    val heightAccessor: WrapperLevelHeightAccessor
        get() = WrapperLevelHeightAccessor(heightAccessorHandle.invoke(handle))

    val validBiome: Any
        get() = validBiomeHandle.invoke(handle) as Any

    fun copy(registryAccess: WrapperRegistryAccess = this.registryAccess, chunkGenerator: WrapperChunkGenerator = this.chunkGenerator, biomeSource: WrapperBiomeSource = this.biomeSource, randomState: WrapperRandomState = this.randomState, structureTemplateManager: WrapperStructureTemplateManager = this.structureTemplateManager, random: WrapperWorldgenRandom = this.random, seed: Long = this.seed, chunkPos: WrapperChunkPos = this.chunkPos, heightAccessor: WrapperLevelHeightAccessor = this.heightAccessor, validBiome: Any = this.validBiome): WrapperGenerationContext {
        return WrapperGenerationContext(constructorHandle.invoke(registryAccess.handle, chunkGenerator.handle, biomeSource.handle, randomState.handle, structureTemplateManager.handle, random.handle, seed, chunkPos.handle, heightAccessor.handle, validBiome))
    }

}
