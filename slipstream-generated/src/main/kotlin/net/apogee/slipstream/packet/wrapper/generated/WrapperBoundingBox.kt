package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBoundingBox(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox") }
        private val lookup = MethodHandles.lookup()

        val getLengthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLength", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i")))
        }
        val moveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "move", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val movedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moved", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val minZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val minXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val minYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maxYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenter", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val intersectingChunksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "intersectingChunks", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val encapsulateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "encapsulate", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val intersectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "intersects", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getZSpanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZSpan", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val inflatedByHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "inflatedBy", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.BoundingBox"), Int::class.javaPrimitiveType!!))
        }
        val getXSpanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXSpan", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getYSpanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYSpan", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isInsideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInside", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val minXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("minX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val minYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("minY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val minZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("minZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val length: WrapperVec3i
        get() = WrapperVec3i(getLengthHandle.invoke(handle))

    fun move(arg0: WrapperVec3i): WrapperBoundingBox {
        return WrapperBoundingBox(moveHandle.invoke(handle, arg0.handle))
    }

    fun moved(arg0: Int, arg1: Int, arg2: Int): WrapperBoundingBox {
        return WrapperBoundingBox(movedHandle.invoke(handle, arg0, arg1, arg2))
    }

    val minZ: Int
        get() = minZHandle.invoke(handle) as Int

    val maxX: Int
        get() = maxXHandle.invoke(handle) as Int

    val minX: Int
        get() = minXHandle.invoke(handle) as Int

    val minY: Int
        get() = minYHandle.invoke(handle) as Int

    val maxZ: Int
        get() = maxZHandle.invoke(handle) as Int

    val maxY: Int
        get() = maxYHandle.invoke(handle) as Int

    val center: WrapperBlockPos
        get() = WrapperBlockPos(getCenterHandle.invoke(handle))

    val intersectingChunks: Any
        get() = intersectingChunksHandle.invoke(handle) as Any

    fun encapsulate(arg0: WrapperBlockPos): WrapperBoundingBox {
        return WrapperBoundingBox(encapsulateHandle.invoke(handle, arg0.handle))
    }

    fun intersects(arg0: Int, arg1: Int, arg2: Int, arg3: Int): Boolean {
        return intersectsHandle.invoke(handle, arg0, arg1, arg2, arg3) as Boolean
    }

    val zSpan: Int
        get() = getZSpanHandle.invoke(handle) as Int

    fun inflatedBy(arg0: Int): WrapperBoundingBox {
        return WrapperBoundingBox(inflatedByHandle.invoke(handle, arg0))
    }

    val xSpan: Int
        get() = getXSpanHandle.invoke(handle) as Int

    val ySpan: Int
        get() = getYSpanHandle.invoke(handle) as Int

    fun isInside(arg0: Int, arg1: Int, arg2: Int): Boolean {
        return isInsideHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun setMinX(value: Int) {
        minXSetterHandle.invoke(handle, value)
    }

    fun setMinY(value: Int) {
        minYSetterHandle.invoke(handle, value)
    }

    fun setMinZ(value: Int) {
        minZSetterHandle.invoke(handle, value)
    }

    fun setMaxX(value: Int) {
        maxXSetterHandle.invoke(handle, value)
    }

    fun setMaxY(value: Int) {
        maxYSetterHandle.invoke(handle, value)
    }

    fun setMaxZ(value: Int) {
        maxZSetterHandle.invoke(handle, value)
    }

}
