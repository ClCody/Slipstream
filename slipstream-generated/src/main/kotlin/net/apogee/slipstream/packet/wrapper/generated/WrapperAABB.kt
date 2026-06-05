package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAABB(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.AABB") }
        private val lookup = MethodHandles.lookup()

        val minHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "min", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis")))
        }
        val maxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "max", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis")))
        }
        val inflateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "inflate", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val moveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "move", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val distanceToSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceToSqr", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val expandTowardsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "expandTowards", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getBottomCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBottomCenter", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val deflateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "deflate", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val minmaxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minmax", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val setMinYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMinY", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val getMinPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getMaxPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val intersectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "intersects", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.AABB")))
        }
        val setMaxYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMaxY", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val hasNaNHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasNaN", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val contractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contract", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getXsizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXsize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getZsizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZsize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val setMaxZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMaxZ", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val setMinZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMinZ", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val setMinXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMinX", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val setMaxXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setMaxX", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!))
        }
        val intersectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "intersect", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val clipHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clip", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenter", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getYsizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYsize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    fun min(arg0: Any): Double {
        return minHandle.invoke(handle, arg0) as Double
    }

    fun max(arg0: Any): Double {
        return maxHandle.invoke(handle, arg0) as Double
    }

    fun inflate(arg0: Double, arg1: Double, arg2: Double): WrapperAABB {
        return WrapperAABB(inflateHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun contains(arg0: WrapperVec3): Boolean {
        return containsHandle.invoke(handle, arg0.handle) as Boolean
    }

    val size: Double
        get() = getSizeHandle.invoke(handle) as Double

    fun move(arg0: WrapperVec3): WrapperAABB {
        return WrapperAABB(moveHandle.invoke(handle, arg0.handle))
    }

    fun distanceToSqr(arg0: WrapperVec3): Double {
        return distanceToSqrHandle.invoke(handle, arg0.handle) as Double
    }

    fun expandTowards(arg0: WrapperVec3): WrapperAABB {
        return WrapperAABB(expandTowardsHandle.invoke(handle, arg0.handle))
    }

    val bottomCenter: WrapperVec3
        get() = WrapperVec3(getBottomCenterHandle.invoke(handle))

    fun deflate(arg0: Double): WrapperAABB {
        return WrapperAABB(deflateHandle.invoke(handle, arg0))
    }

    fun minmax(arg0: WrapperAABB): WrapperAABB {
        return WrapperAABB(minmaxHandle.invoke(handle, arg0.handle))
    }

    fun setMinY(arg0: Double): WrapperAABB {
        return WrapperAABB(setMinYHandle.invoke(handle, arg0))
    }

    val minPosition: WrapperVec3
        get() = WrapperVec3(getMinPositionHandle.invoke(handle))

    val maxPosition: WrapperVec3
        get() = WrapperVec3(getMaxPositionHandle.invoke(handle))

    fun intersects(arg0: WrapperAABB): Boolean {
        return intersectsHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setMaxY(arg0: Double): WrapperAABB {
        return WrapperAABB(setMaxYHandle.invoke(handle, arg0))
    }

    val naN: Boolean
        get() = hasNaNHandle.invoke(handle) as Boolean

    fun contract(arg0: Double, arg1: Double, arg2: Double): WrapperAABB {
        return WrapperAABB(contractHandle.invoke(handle, arg0, arg1, arg2))
    }

    val xsize: Double
        get() = getXsizeHandle.invoke(handle) as Double

    val zsize: Double
        get() = getZsizeHandle.invoke(handle) as Double

    fun setMaxZ(arg0: Double): WrapperAABB {
        return WrapperAABB(setMaxZHandle.invoke(handle, arg0))
    }

    fun setMinZ(arg0: Double): WrapperAABB {
        return WrapperAABB(setMinZHandle.invoke(handle, arg0))
    }

    fun setMinX(arg0: Double): WrapperAABB {
        return WrapperAABB(setMinXHandle.invoke(handle, arg0))
    }

    fun setMaxX(arg0: Double): WrapperAABB {
        return WrapperAABB(setMaxXHandle.invoke(handle, arg0))
    }

    fun intersect(arg0: WrapperAABB): WrapperAABB {
        return WrapperAABB(intersectHandle.invoke(handle, arg0.handle))
    }

    fun clip(arg0: WrapperVec3, arg1: WrapperVec3): Any {
        return clipHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    val center: WrapperVec3
        get() = WrapperVec3(getCenterHandle.invoke(handle))

    val ysize: Double
        get() = getYsizeHandle.invoke(handle) as Double

}
