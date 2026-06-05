package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperVec3(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.Vec3") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Direction\$Axis")))
        }
        val lengthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "length", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val reverseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reverse", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val scaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scale", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!))
        }
        val addHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "add", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val xHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "x", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val dotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dot", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val withHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "with", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.Direction\$Axis"), Double::class.javaPrimitiveType!!))
        }
        val zHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "z", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val yHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "y", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val multiplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "multiply", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val normalizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "normalize", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val subtractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "subtract", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val relativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relative", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.Direction"), Double::class.javaPrimitiveType!!))
        }
        val distanceToSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceToSqr", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val lengthSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lengthSqr", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val distanceToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceTo", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val zRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "zRot", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val vectorToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "vectorTo", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val toVector3fHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toVector3f", MethodType.methodType(Class.forName("org.joml.Vector3f")))
        }
        val alignHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "align", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("java.util.EnumSet")))
        }
        val horizontalDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "horizontalDistance", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val horizontalDistanceSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "horizontalDistanceSqr", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val yRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "yRot", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val xRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "xRot", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val crossHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cross", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val closerThanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "closerThan", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Position"), Double::class.javaPrimitiveType!!))
        }
        val lerpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerp", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!))
        }
        val offsetRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offsetRandom", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.util.RandomSource"), Float::class.javaPrimitiveType!!))
        }
    }

    fun get(arg0: Any): Double {
        return getHandle.invoke(handle, arg0) as Double
    }

    val length: Double
        get() = lengthHandle.invoke(handle) as Double

    val reverse: WrapperVec3
        get() = WrapperVec3(reverseHandle.invoke(handle))

    fun scale(arg0: Double): WrapperVec3 {
        return WrapperVec3(scaleHandle.invoke(handle, arg0))
    }

    fun add(arg0: Double, arg1: Double, arg2: Double): WrapperVec3 {
        return WrapperVec3(addHandle.invoke(handle, arg0, arg1, arg2))
    }

    val x: Double
        get() = xHandle.invoke(handle) as Double

    fun dot(arg0: WrapperVec3): Double {
        return dotHandle.invoke(handle, arg0.handle) as Double
    }

    fun with(arg0: Any, arg1: Double): WrapperVec3 {
        return WrapperVec3(withHandle.invoke(handle, arg0, arg1))
    }

    val z: Double
        get() = zHandle.invoke(handle) as Double

    val y: Double
        get() = yHandle.invoke(handle) as Double

    fun multiply(arg0: WrapperVec3): WrapperVec3 {
        return WrapperVec3(multiplyHandle.invoke(handle, arg0.handle))
    }

    val normalize: WrapperVec3
        get() = WrapperVec3(normalizeHandle.invoke(handle))

    fun subtract(arg0: Double, arg1: Double, arg2: Double): WrapperVec3 {
        return WrapperVec3(subtractHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun relative(arg0: Any, arg1: Double): WrapperVec3 {
        return WrapperVec3(relativeHandle.invoke(handle, arg0, arg1))
    }

    fun distanceToSqr(arg0: WrapperVec3): Double {
        return distanceToSqrHandle.invoke(handle, arg0.handle) as Double
    }

    val lengthSqr: Double
        get() = lengthSqrHandle.invoke(handle) as Double

    fun distanceTo(arg0: WrapperVec3): Double {
        return distanceToHandle.invoke(handle, arg0.handle) as Double
    }

    fun zRot(arg0: Float): WrapperVec3 {
        return WrapperVec3(zRotHandle.invoke(handle, arg0))
    }

    fun vectorTo(arg0: WrapperVec3): WrapperVec3 {
        return WrapperVec3(vectorToHandle.invoke(handle, arg0.handle))
    }

    val toVector3f: Any
        get() = toVector3fHandle.invoke(handle) as Any

    fun align(arg0: Any): WrapperVec3 {
        return WrapperVec3(alignHandle.invoke(handle, arg0))
    }

    val horizontalDistance: Double
        get() = horizontalDistanceHandle.invoke(handle) as Double

    val horizontalDistanceSqr: Double
        get() = horizontalDistanceSqrHandle.invoke(handle) as Double

    fun yRot(arg0: Float): WrapperVec3 {
        return WrapperVec3(yRotHandle.invoke(handle, arg0))
    }

    fun xRot(arg0: Float): WrapperVec3 {
        return WrapperVec3(xRotHandle.invoke(handle, arg0))
    }

    fun cross(arg0: WrapperVec3): WrapperVec3 {
        return WrapperVec3(crossHandle.invoke(handle, arg0.handle))
    }

    fun closerThan(arg0: WrapperPosition, arg1: Double): Boolean {
        return closerThanHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun lerp(arg0: WrapperVec3, arg1: Double): WrapperVec3 {
        return WrapperVec3(lerpHandle.invoke(handle, arg0.handle, arg1))
    }

    fun offsetRandom(arg0: WrapperRandomSource, arg1: Float): WrapperVec3 {
        return WrapperVec3(offsetRandomHandle.invoke(handle, arg0.handle, arg1))
    }

}
