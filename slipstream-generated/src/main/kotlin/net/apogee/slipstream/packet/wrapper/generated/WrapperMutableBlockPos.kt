package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMutableBlockPos(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos") }
        private val lookup = MethodHandles.lookup()

        val clampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clamp", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Class.forName("net.minecraft.core.Direction\$Axis"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val offsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offset", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "set", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val multiplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "multiply", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val rotateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "rotate", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val moveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "move", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Class.forName("net.minecraft.core.Vec3i")))
        }
        val relativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "relative", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Direction"), Int::class.javaPrimitiveType!!))
        }
        val setWithOffsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setWithOffset", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Class.forName("net.minecraft.core.Vec3i"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val immutableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "immutable", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val setXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setX", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Int::class.javaPrimitiveType!!))
        }
        val setZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setZ", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Int::class.javaPrimitiveType!!))
        }
        val setYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setY", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos\$MutableBlockPos"), Int::class.javaPrimitiveType!!))
        }
    }

    fun clamp(arg0: Any, arg1: Int, arg2: Int): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(clampHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun offset(arg0: Int, arg1: Int, arg2: Int): WrapperBlockPos {
        return WrapperBlockPos(offsetHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun set(arg0: Double, arg1: Double, arg2: Double): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(setHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun multiply(arg0: Int): WrapperBlockPos {
        return WrapperBlockPos(multiplyHandle.invoke(handle, arg0))
    }

    fun rotate(arg0: Any): WrapperBlockPos {
        return WrapperBlockPos(rotateHandle.invoke(handle, arg0))
    }

    fun move(arg0: WrapperVec3i): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(moveHandle.invoke(handle, arg0.handle))
    }

    fun relative(arg0: Any, arg1: Int): WrapperBlockPos {
        return WrapperBlockPos(relativeHandle.invoke(handle, arg0, arg1))
    }

    fun setWithOffset(arg0: WrapperVec3i, arg1: Int, arg2: Int, arg3: Int): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(setWithOffsetHandle.invoke(handle, arg0.handle, arg1, arg2, arg3))
    }

    val immutable: WrapperBlockPos
        get() = WrapperBlockPos(immutableHandle.invoke(handle))

    fun setX(arg0: Int): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(setXHandle.invoke(handle, arg0))
    }

    fun setZ(arg0: Int): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(setZHandle.invoke(handle, arg0))
    }

    fun setY(arg0: Int): WrapperMutableBlockPos {
        return WrapperMutableBlockPos(setYHandle.invoke(handle, arg0))
    }

}
