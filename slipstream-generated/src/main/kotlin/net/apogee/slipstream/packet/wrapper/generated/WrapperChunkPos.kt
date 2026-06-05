package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkPos(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ChunkPos") }
        private val lookup = MethodHandles.lookup()

        val distanceSquaredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceSquared", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val getBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getRegionZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRegionZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRegionXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRegionX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMiddleBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMiddleBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRegionLocalXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRegionLocalX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMaxBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMiddleBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMiddleBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMaxBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWorldPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getMinBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRegionLocalZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRegionLocalZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMinBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMiddleBlockPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMiddleBlockPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val getChessboardDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChessboardDistance", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val toLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toLong", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getBlockAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockAt", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    fun distanceSquared(arg0: WrapperChunkPos): Int {
        return distanceSquaredHandle.invoke(handle, arg0.handle) as Int
    }

    fun getBlockZ(arg0: Int): Int {
        return getBlockZHandle.invoke(handle, arg0) as Int
    }

    fun getBlockX(arg0: Int): Int {
        return getBlockXHandle.invoke(handle, arg0) as Int
    }

    val regionZ: Int
        get() = getRegionZHandle.invoke(handle) as Int

    val regionX: Int
        get() = getRegionXHandle.invoke(handle) as Int

    val middleBlockX: Int
        get() = getMiddleBlockXHandle.invoke(handle) as Int

    val regionLocalX: Int
        get() = getRegionLocalXHandle.invoke(handle) as Int

    val maxBlockZ: Int
        get() = getMaxBlockZHandle.invoke(handle) as Int

    val middleBlockZ: Int
        get() = getMiddleBlockZHandle.invoke(handle) as Int

    val maxBlockX: Int
        get() = getMaxBlockXHandle.invoke(handle) as Int

    val worldPosition: WrapperBlockPos
        get() = WrapperBlockPos(getWorldPositionHandle.invoke(handle))

    val minBlockX: Int
        get() = getMinBlockXHandle.invoke(handle) as Int

    val regionLocalZ: Int
        get() = getRegionLocalZHandle.invoke(handle) as Int

    val minBlockZ: Int
        get() = getMinBlockZHandle.invoke(handle) as Int

    fun getMiddleBlockPosition(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(getMiddleBlockPositionHandle.invoke(handle, arg0))
    }

    fun getChessboardDistance(arg0: Int, arg1: Int): Int {
        return getChessboardDistanceHandle.invoke(handle, arg0, arg1) as Int
    }

    val toLong: Long
        get() = toLongHandle.invoke(handle) as Long

    fun getBlockAt(arg0: Int, arg1: Int, arg2: Int): WrapperBlockPos {
        return WrapperBlockPos(getBlockAtHandle.invoke(handle, arg0, arg1, arg2))
    }

}
