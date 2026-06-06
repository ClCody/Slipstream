package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkGeneratorStructureState(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.ChunkGeneratorStructureState") }
        private val lookup = MethodHandles.lookup()

        val randomStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "randomState", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
        val possibleStructureSetsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "possibleStructureSets", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getLevelSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val hasStructureChunkInRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasStructureChunkInRange", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getRingPositionsForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRingPositionsFor", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.level.levelgen.structure.placement.ConcentricRingsStructurePlacement")))
        }
        val getPlacementsForStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlacementsForStructure", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.core.Holder")))
        }
        val hasGeneratedPositionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasGeneratedPositions")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val randomState: WrapperRandomState
        get() = WrapperRandomState(randomStateHandle.invoke(handle))

    val possibleStructureSets: Any
        get() = possibleStructureSetsHandle.invoke(handle) as Any

    val levelSeed: Long
        get() = getLevelSeedHandle.invoke(handle) as Long

    fun hasStructureChunkInRange(arg0: WrapperHolder, arg1: Int, arg2: Int, arg3: Int): Boolean {
        return hasStructureChunkInRangeHandle.invoke(handle, arg0.handle, arg1, arg2, arg3) as Boolean
    }

    fun getRingPositionsFor(arg0: WrapperConcentricRingsStructurePlacement): Any {
        return getRingPositionsForHandle.invoke(handle, arg0.handle) as Any
    }

    fun getPlacementsForStructure(arg0: WrapperHolder): Any {
        return getPlacementsForStructureHandle.invoke(handle, arg0.handle) as Any
    }

    fun setHasGeneratedPositions(value: Boolean) {
        hasGeneratedPositionsSetterHandle.invoke(handle, value)
    }

}
