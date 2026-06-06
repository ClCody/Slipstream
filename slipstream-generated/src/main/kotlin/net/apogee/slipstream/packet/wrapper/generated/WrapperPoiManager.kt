package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPoiManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Long::class.javaPrimitiveType!!))
        }
        val findHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "find", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val releaseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "release", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val existsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "exists", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.function.Predicate")))
        }
        val findAllHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findAll", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val takeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "take", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.BiPredicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.util.RandomSource")))
        }
        val findClosestHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findClosest", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val sectionsToVillageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sectionsToVillage", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.SectionPos")))
        }
        val `moonrise$readHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$read", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val findClosestWithTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findClosestWithType", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val findAllClosestFirstWithTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findAllClosestFirstWithType", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val getInRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInRange", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val findAllWithTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findAllWithType", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("java.util.function.Predicate"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val existsAtPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "existsAtPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val `moonrise$getWorldHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getWorld", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getFreeTicketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFreeTickets", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getInSquareHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInSquare", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val getCountInRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCountInRange", MethodType.methodType(Long::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val getInChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInChunk", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("java.util.function.Predicate"), Class.forName("net.minecraft.world.level.ChunkPos"), Class.forName("net.minecraft.world.entity.ai.village.poi.PoiManager\$Occupancy")))
        }
        val getOrLoadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrLoad", MethodType.methodType(Class.forName("java.util.Optional"), Long::class.javaPrimitiveType!!))
        }
    }

    fun get(arg0: Long): Any {
        return getHandle.invoke(handle, arg0) as Any
    }

    fun find(arg0: Any, arg1: Any, arg2: WrapperBlockPos, arg3: Int, arg4: Any): Any {
        return findHandle.invoke(handle, arg0, arg1, arg2.handle, arg3, arg4) as Any
    }

    fun getType(arg0: WrapperBlockPos): Any {
        return getTypeHandle.invoke(handle, arg0.handle) as Any
    }

    fun release(arg0: WrapperBlockPos): Boolean {
        return releaseHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun exists(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return existsHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun findAll(arg0: Any, arg1: Any, arg2: WrapperBlockPos, arg3: Int, arg4: Any): Any {
        return findAllHandle.invoke(handle, arg0, arg1, arg2.handle, arg3, arg4) as Any
    }

    fun take(arg0: Any, arg1: Any, arg2: WrapperBlockPos, arg3: Int): Any {
        return takeHandle.invoke(handle, arg0, arg1, arg2.handle, arg3) as Any
    }

    fun getRandom(arg0: Any, arg1: Any, arg2: Any, arg3: WrapperBlockPos, arg4: Int, arg5: WrapperRandomSource): Any {
        return getRandomHandle.invoke(handle, arg0, arg1, arg2, arg3.handle, arg4, arg5.handle) as Any
    }

    fun findClosest(arg0: Any, arg1: Any, arg2: WrapperBlockPos, arg3: Int, arg4: Any): Any {
        return findClosestHandle.invoke(handle, arg0, arg1, arg2.handle, arg3, arg4) as Any
    }

    fun sectionsToVillage(arg0: WrapperSectionPos): Int {
        return sectionsToVillageHandle.invoke(handle, arg0.handle) as Int
    }

    fun `moonrise$read`(arg0: Int, arg1: Int): WrapperCompoundTag {
        return WrapperCompoundTag(`moonrise$readHandle`.invoke(handle, arg0, arg1))
    }

    fun findClosestWithType(arg0: Any, arg1: WrapperBlockPos, arg2: Int, arg3: Any): Any {
        return findClosestWithTypeHandle.invoke(handle, arg0, arg1.handle, arg2, arg3) as Any
    }

    fun findAllClosestFirstWithType(arg0: Any, arg1: Any, arg2: WrapperBlockPos, arg3: Int, arg4: Any): Any {
        return findAllClosestFirstWithTypeHandle.invoke(handle, arg0, arg1, arg2.handle, arg3, arg4) as Any
    }

    fun getInRange(arg0: Any, arg1: WrapperBlockPos, arg2: Int, arg3: Any): Any {
        return getInRangeHandle.invoke(handle, arg0, arg1.handle, arg2, arg3) as Any
    }

    fun findAllWithType(arg0: Any, arg1: Any, arg2: WrapperBlockPos, arg3: Int, arg4: Any): Any {
        return findAllWithTypeHandle.invoke(handle, arg0, arg1, arg2.handle, arg3, arg4) as Any
    }

    fun existsAtPosition(arg0: WrapperResourceKey, arg1: WrapperBlockPos): Boolean {
        return existsAtPositionHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val `moonrise$getWorld`: WrapperServerLevel
        get() = WrapperServerLevel(`moonrise$getWorldHandle`.invoke(handle))

    fun getFreeTickets(arg0: WrapperBlockPos): Int {
        return getFreeTicketsHandle.invoke(handle, arg0.handle) as Int
    }

    fun getInSquare(arg0: Any, arg1: WrapperBlockPos, arg2: Int, arg3: Any): Any {
        return getInSquareHandle.invoke(handle, arg0, arg1.handle, arg2, arg3) as Any
    }

    fun getCountInRange(arg0: Any, arg1: WrapperBlockPos, arg2: Int, arg3: Any): Long {
        return getCountInRangeHandle.invoke(handle, arg0, arg1.handle, arg2, arg3) as Long
    }

    fun getInChunk(arg0: Any, arg1: WrapperChunkPos, arg2: Any): Any {
        return getInChunkHandle.invoke(handle, arg0, arg1.handle, arg2) as Any
    }

    fun getOrLoad(arg0: Long): Any {
        return getOrLoadHandle.invoke(handle, arg0) as Any
    }

}
