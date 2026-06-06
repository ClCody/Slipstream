package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperVec3i(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.Vec3i") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis")))
        }
        val compareToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compareTo", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Vec3i")))
        }
        val offsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offset", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val toShortStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toShortString", MethodType.methodType(String::class.java))
        }
        val multiplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "multiply", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Int::class.javaPrimitiveType!!))
        }
        val subtractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "subtract", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val relativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relative", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Class.forName("net.minecraft.core.Direction")))
        }
        val isInsideBuildHeightAndWorldBoundsHorizontalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInsideBuildHeightAndWorldBoundsHorizontal", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelHeightAccessor")))
        }
        val distToLowCornerSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distToLowCornerSqr", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val closerToCenterThanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "closerToCenterThan", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Position"), Double::class.javaPrimitiveType!!))
        }
        val distManhattanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distManhattan", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Vec3i")))
        }
        val distToCenterSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distToCenterSqr", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Position")))
        }
        val belowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "below", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i")))
        }
        val westHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "west", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i")))
        }
        val northHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "north", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i")))
        }
        val eastHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "east", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Int::class.javaPrimitiveType!!))
        }
        val aboveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "above", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Int::class.javaPrimitiveType!!))
        }
        val crossHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cross", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val southHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "south", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i"), Int::class.javaPrimitiveType!!))
        }
        val distSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distSqr", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Vec3i")))
        }
        val closerThanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "closerThan", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Vec3i"), Double::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val xSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("x")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("y")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val zSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("z")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: Any): Int {
        return getHandle.invoke(handle, arg0) as Int
    }

    fun compareTo(arg0: WrapperVec3i): Int {
        return compareToHandle.invoke(handle, arg0.handle) as Int
    }

    fun offset(arg0: WrapperVec3i): WrapperVec3i {
        return WrapperVec3i(offsetHandle.invoke(handle, arg0.handle))
    }

    val toShortString: String
        get() = toShortStringHandle.invoke(handle) as String

    fun multiply(arg0: Int): WrapperVec3i {
        return WrapperVec3i(multiplyHandle.invoke(handle, arg0))
    }

    fun subtract(arg0: WrapperVec3i): WrapperVec3i {
        return WrapperVec3i(subtractHandle.invoke(handle, arg0.handle))
    }

    fun relative(arg0: Any): WrapperVec3i {
        return WrapperVec3i(relativeHandle.invoke(handle, arg0))
    }

    fun isInsideBuildHeightAndWorldBoundsHorizontal(arg0: WrapperLevelHeightAccessor): Boolean {
        return isInsideBuildHeightAndWorldBoundsHorizontalHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun distToLowCornerSqr(arg0: Double, arg1: Double, arg2: Double): Double {
        return distToLowCornerSqrHandle.invoke(handle, arg0, arg1, arg2) as Double
    }

    fun closerToCenterThan(arg0: WrapperPosition, arg1: Double): Boolean {
        return closerToCenterThanHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun distManhattan(arg0: WrapperVec3i): Int {
        return distManhattanHandle.invoke(handle, arg0.handle) as Int
    }

    fun distToCenterSqr(arg0: WrapperPosition): Double {
        return distToCenterSqrHandle.invoke(handle, arg0.handle) as Double
    }

    val below: WrapperVec3i
        get() = WrapperVec3i(belowHandle.invoke(handle))

    val west: WrapperVec3i
        get() = WrapperVec3i(westHandle.invoke(handle))

    val north: WrapperVec3i
        get() = WrapperVec3i(northHandle.invoke(handle))

    fun east(arg0: Int): WrapperVec3i {
        return WrapperVec3i(eastHandle.invoke(handle, arg0))
    }

    fun above(arg0: Int): WrapperVec3i {
        return WrapperVec3i(aboveHandle.invoke(handle, arg0))
    }

    fun cross(arg0: WrapperVec3i): WrapperVec3i {
        return WrapperVec3i(crossHandle.invoke(handle, arg0.handle))
    }

    fun south(arg0: Int): WrapperVec3i {
        return WrapperVec3i(southHandle.invoke(handle, arg0))
    }

    fun distSqr(arg0: WrapperVec3i): Double {
        return distSqrHandle.invoke(handle, arg0.handle) as Double
    }

    fun closerThan(arg0: WrapperVec3i, arg1: Double): Boolean {
        return closerThanHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val x: Int
        get() = getXHandle.invoke(handle) as Int

    val z: Int
        get() = getZHandle.invoke(handle) as Int

    val y: Int
        get() = getYHandle.invoke(handle) as Int

    fun setX(value: Int) {
        xSetterHandle.invoke(handle, value)
    }

    fun setY(value: Int) {
        ySetterHandle.invoke(handle, value)
    }

    fun setZ(value: Int) {
        zSetterHandle.invoke(handle, value)
    }

}
