package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructurePlacement(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.placement.StructurePlacement") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.placement.StructurePlacementType")))
        }
        val getLocatePosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocatePos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val isStructureChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStructureChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.ChunkGeneratorStructureState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val applyAdditionalChunkRestrictionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyAdditionalChunkRestrictions", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!, Class.forName("java.lang.Integer")))
        }
        val applyInteractionsWithOtherStructuresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyInteractionsWithOtherStructures", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.chunk.ChunkGeneratorStructureState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperStructurePlacementType
        get() = WrapperStructurePlacementType(typeHandle.invoke(handle))

    fun getLocatePos(arg0: WrapperChunkPos): WrapperBlockPos {
        return WrapperBlockPos(getLocatePosHandle.invoke(handle, arg0.handle))
    }

    fun isStructureChunk(arg0: WrapperChunkGeneratorStructureState, arg1: Int, arg2: Int): Boolean {
        return isStructureChunkHandle.invoke(handle, arg0.handle, arg1, arg2) as Boolean
    }

    fun applyAdditionalChunkRestrictions(arg0: Int, arg1: Int, arg2: Long, arg3: Any): Boolean {
        return applyAdditionalChunkRestrictionsHandle.invoke(handle, arg0, arg1, arg2, arg3) as Boolean
    }

    fun applyInteractionsWithOtherStructures(arg0: WrapperChunkGeneratorStructureState, arg1: Int, arg2: Int): Boolean {
        return applyInteractionsWithOtherStructuresHandle.invoke(handle, arg0.handle, arg1, arg2) as Boolean
    }

}
