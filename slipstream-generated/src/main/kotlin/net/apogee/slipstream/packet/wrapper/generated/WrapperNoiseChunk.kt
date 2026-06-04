package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNoiseChunk(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.NoiseChunk") }
        private val lookup = MethodHandles.lookup()

        val blockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val blockYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val blockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val forIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forIndex", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.NoiseChunk"), Int::class.javaPrimitiveType!!))
        }
        val getBlenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlender", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.blending.Blender")))
        }
        val aquiferHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "aquifer", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.Aquifer")))
        }
        val preliminarySurfaceLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "preliminarySurfaceLevel", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val lastBlendingDataPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastBlendingDataPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastBlendingOutputSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastBlendingOutput")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val interpolatingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("interpolating")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fillingCellSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fillingCell")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cellStartBlockXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cellStartBlockX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cellStartBlockYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cellStartBlockY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cellStartBlockZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cellStartBlockZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inCellXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inCellX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inCellYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inCellY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inCellZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inCellZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val interpolationCounterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("interpolationCounter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val arrayInterpolationCounterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("arrayInterpolationCounter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val arrayIndexSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("arrayIndex")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val blockZ: Int
        get() = blockZHandle.invoke(handle) as Int

    val blockY: Int
        get() = blockYHandle.invoke(handle) as Int

    val blockX: Int
        get() = blockXHandle.invoke(handle) as Int

    fun forIndex(arg0: Int): WrapperNoiseChunk {
        return WrapperNoiseChunk(forIndexHandle.invoke(handle, arg0))
    }

    val blender: WrapperBlender
        get() = WrapperBlender(getBlenderHandle.invoke(handle))

    val aquifer: WrapperAquifer
        get() = WrapperAquifer(aquiferHandle.invoke(handle))

    fun preliminarySurfaceLevel(arg0: Int, arg1: Int): Int {
        return preliminarySurfaceLevelHandle.invoke(handle, arg0, arg1) as Int
    }

    fun setLastBlendingDataPos(value: Long) {
        lastBlendingDataPosSetterHandle.invoke(handle, value)
    }

    fun setLastBlendingOutput(value: WrapperBlendingOutput) {
        lastBlendingOutputSetterHandle.invoke(handle, value.handle)
    }

    fun setInterpolating(value: Boolean) {
        interpolatingSetterHandle.invoke(handle, value)
    }

    fun setFillingCell(value: Boolean) {
        fillingCellSetterHandle.invoke(handle, value)
    }

    fun setCellStartBlockX(value: Int) {
        cellStartBlockXSetterHandle.invoke(handle, value)
    }

    fun setCellStartBlockY(value: Int) {
        cellStartBlockYSetterHandle.invoke(handle, value)
    }

    fun setCellStartBlockZ(value: Int) {
        cellStartBlockZSetterHandle.invoke(handle, value)
    }

    fun setInCellX(value: Int) {
        inCellXSetterHandle.invoke(handle, value)
    }

    fun setInCellY(value: Int) {
        inCellYSetterHandle.invoke(handle, value)
    }

    fun setInCellZ(value: Int) {
        inCellZSetterHandle.invoke(handle, value)
    }

    fun setInterpolationCounter(value: Long) {
        interpolationCounterSetterHandle.invoke(handle, value)
    }

    fun setArrayInterpolationCounter(value: Long) {
        arrayInterpolationCounterSetterHandle.invoke(handle, value)
    }

    fun setArrayIndex(value: Int) {
        arrayIndexSetterHandle.invoke(handle, value)
    }

}
