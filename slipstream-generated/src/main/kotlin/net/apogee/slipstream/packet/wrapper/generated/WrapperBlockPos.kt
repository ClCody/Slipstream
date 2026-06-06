package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockPos(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.BlockPos") }
        private val lookup = MethodHandles.lookup()

        val offsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offset", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val multiplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "multiply", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val rotateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "rotate", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val subtractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "subtract", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val relativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relative", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Direction")))
        }
        val asLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asLong", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val immutableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "immutable", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBottomCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBottomCenter", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val clampLocationWithinHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clampLocationWithin", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val belowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "below", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val westHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "west", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val northHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "north", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val eastHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "east", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val aboveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "above", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val mutableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mutable", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos")))
        }
        val atYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "atY", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val getCenterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCenter", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val crossHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cross", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val southHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "south", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    fun offset(arg0: WrapperVec3i): WrapperBlockPos {
        return WrapperBlockPos(offsetHandle.invoke(handle, arg0.handle))
    }

    fun multiply(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(multiplyHandle.invoke(handle, arg0))
    }

    fun rotate(arg0: Any): WrapperBlockPos {
        return WrapperBlockPos(rotateHandle.invoke(handle, arg0))
    }

    fun subtract(arg0: WrapperVec3i): WrapperBlockPos {
        return WrapperBlockPos(subtractHandle.invoke(handle, arg0.handle))
    }

    fun relative(arg0: Any): WrapperBlockPos {
        return WrapperBlockPos(relativeHandle.invoke(handle, arg0))
    }

    val asLong: Long
        get() = asLongHandle.invoke(handle) as Long

    val immutable: WrapperBlockPos
        get() = WrapperBlockPos(immutableHandle.invoke(handle))

    val bottomCenter: WrapperVec3
        get() = WrapperVec3(getBottomCenterHandle.invoke(handle))

    fun clampLocationWithin(arg0: WrapperVec3): WrapperVec3 {
        return WrapperVec3(clampLocationWithinHandle.invoke(handle, arg0.handle))
    }

    fun below(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(belowHandle.invoke(handle, arg0))
    }

    fun west(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(westHandle.invoke(handle, arg0))
    }

    fun north(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(northHandle.invoke(handle, arg0))
    }

    val east: WrapperBlockPos
        get() = WrapperBlockPos(eastHandle.invoke(handle))

    val above: WrapperBlockPos
        get() = WrapperBlockPos(aboveHandle.invoke(handle))

    val mutable: WrapperMutableBlockPos
        get() = WrapperMutableBlockPos(mutableHandle.invoke(handle))

    fun atY(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(atYHandle.invoke(handle, arg0))
    }

    val center: WrapperVec3
        get() = WrapperVec3(getCenterHandle.invoke(handle))

    fun cross(arg0: WrapperVec3i): WrapperBlockPos {
        return WrapperBlockPos(crossHandle.invoke(handle, arg0.handle))
    }

    val south: WrapperBlockPos
        get() = WrapperBlockPos(southHandle.invoke(handle))

}
