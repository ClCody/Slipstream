package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.StructureManager") }
        private val lookup = MethodHandles.lookup()

        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val structureHasPieceAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "structureHasPieceAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart")))
        }
        val hasAnyStructureAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasAnyStructureAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val forWorldGenRegionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forWorldGenRegion", MethodType.methodType(Class.forName("net.minecraft.world.level.StructureManager"), Class.forName("net.minecraft.server.level.WorldGenRegion")))
        }
        val getStructureAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStructureAt", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure")))
        }
        val startsForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "startsForStructure", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.level.ChunkPos"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.world.level.ServerLevelAccessor")))
        }
        val getAllStructuresAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllStructuresAt", MethodType.methodType(Class.forName("java.util.Map"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val checkStructurePresenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "checkStructurePresence", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureCheckResult"), Class.forName("net.minecraft.world.level.ChunkPos"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure"), Class.forName("net.minecraft.world.level.levelgen.structure.placement.StructurePlacement"), Boolean::class.javaPrimitiveType!!))
        }
        val shouldGenerateStructuresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldGenerateStructures", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getStartForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStartForStructure", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart"), Class.forName("net.minecraft.core.SectionPos"), Class.forName("net.minecraft.world.level.levelgen.structure.Structure"), Class.forName("net.minecraft.world.level.chunk.StructureAccess")))
        }
        val getStructureWithPieceAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStructureWithPieceAt", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.StructureStart"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.function.Predicate")))
        }
    }

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    fun structureHasPieceAt(arg0: WrapperBlockPos, arg1: WrapperStructureStart): Boolean {
        return structureHasPieceAtHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun hasAnyStructureAt(arg0: WrapperBlockPos): Boolean {
        return hasAnyStructureAtHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun forWorldGenRegion(arg0: WrapperWorldGenRegion): WrapperStructureManager {
        return WrapperStructureManager(forWorldGenRegionHandle.invoke(handle, arg0.handle))
    }

    fun getStructureAt(arg0: WrapperBlockPos, arg1: WrapperStructure): WrapperStructureStart {
        return WrapperStructureStart(getStructureAtHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun startsForStructure(arg0: WrapperChunkPos, arg1: Any, arg2: WrapperServerLevelAccessor): Any {
        return startsForStructureHandle.invoke(handle, arg0.handle, arg1, arg2.handle) as Any
    }

    fun getAllStructuresAt(arg0: WrapperBlockPos): Any {
        return getAllStructuresAtHandle.invoke(handle, arg0.handle) as Any
    }

    fun checkStructurePresence(arg0: WrapperChunkPos, arg1: WrapperStructure, arg2: WrapperStructurePlacement, arg3: Boolean): Any {
        return checkStructurePresenceHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3) as Any
    }

    val shouldGenerateStructures: Boolean
        get() = shouldGenerateStructuresHandle.invoke(handle) as Boolean

    fun getStartForStructure(arg0: WrapperSectionPos, arg1: WrapperStructure, arg2: WrapperStructureAccess): WrapperStructureStart {
        return WrapperStructureStart(getStartForStructureHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    fun getStructureWithPieceAt(arg0: WrapperBlockPos, arg1: Any): WrapperStructureStart {
        return WrapperStructureStart(getStructureWithPieceAtHandle.invoke(handle, arg0.handle, arg1))
    }

}
