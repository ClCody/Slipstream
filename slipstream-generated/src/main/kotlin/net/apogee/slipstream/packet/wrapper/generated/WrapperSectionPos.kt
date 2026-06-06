package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSectionPos(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.SectionPos") }
        private val lookup = MethodHandles.lookup()

        val offsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offset", MethodType.methodType(Class.forName("net.minecraft.core.SectionPos"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val xHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "x", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val zHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "z", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val yHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "y", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val originHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "origin", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val relativeToBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relativeToBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!, Short::class.javaPrimitiveType!!))
        }
        val relativeToBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relativeToBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!, Short::class.javaPrimitiveType!!))
        }
        val relativeToBlockYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relativeToBlockY", MethodType.methodType(Int::class.javaPrimitiveType!!, Short::class.javaPrimitiveType!!))
        }
        val asLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asLong", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val chunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunk", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val centerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "center", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val minBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val minBlockYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minBlockY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxBlockYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxBlockY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val minBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val relativeToBlockPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relativeToBlockPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Short::class.javaPrimitiveType!!))
        }
        val blocksInsideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blocksInside", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
    }

    fun offset(arg0: Int, arg1: Int, arg2: Int): WrapperSectionPos {
        return WrapperSectionPos(offsetHandle.invoke(handle, arg0, arg1, arg2))
    }

    val x: Int
        get() = xHandle.invoke(handle) as Int

    val z: Int
        get() = zHandle.invoke(handle) as Int

    val y: Int
        get() = yHandle.invoke(handle) as Int

    val origin: WrapperBlockPos
        get() = WrapperBlockPos(originHandle.invoke(handle))

    fun relativeToBlockX(arg0: Short): Int {
        return relativeToBlockXHandle.invoke(handle, arg0) as Int
    }

    fun relativeToBlockZ(arg0: Short): Int {
        return relativeToBlockZHandle.invoke(handle, arg0) as Int
    }

    fun relativeToBlockY(arg0: Short): Int {
        return relativeToBlockYHandle.invoke(handle, arg0) as Int
    }

    val asLong: Long
        get() = asLongHandle.invoke(handle) as Long

    val chunk: WrapperChunkPos
        get() = WrapperChunkPos(chunkHandle.invoke(handle))

    val center: WrapperBlockPos
        get() = WrapperBlockPos(centerHandle.invoke(handle))

    val minBlockX: Int
        get() = minBlockXHandle.invoke(handle) as Int

    val maxBlockX: Int
        get() = maxBlockXHandle.invoke(handle) as Int

    val minBlockY: Int
        get() = minBlockYHandle.invoke(handle) as Int

    val maxBlockY: Int
        get() = maxBlockYHandle.invoke(handle) as Int

    val maxBlockZ: Int
        get() = maxBlockZHandle.invoke(handle) as Int

    val minBlockZ: Int
        get() = minBlockZHandle.invoke(handle) as Int

    fun relativeToBlockPos(arg0: Short): WrapperBlockPos {
        return WrapperBlockPos(relativeToBlockPosHandle.invoke(handle, arg0))
    }

    val blocksInside: Any
        get() = blocksInsideHandle.invoke(handle) as Any

}
