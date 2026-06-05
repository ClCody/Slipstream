package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityAttachments(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.EntityAttachments") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.EntityAttachment"), Int::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val scaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scale", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityAttachments"), Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val getClampedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClamped", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.EntityAttachment"), Int::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val getNullableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNullable", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.EntityAttachment"), Int::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
    }

    fun get(arg0: Any, arg1: Int, arg2: Float): WrapperVec3 {
        return WrapperVec3(getHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun scale(arg0: Float, arg1: Float, arg2: Float): WrapperEntityAttachments {
        return WrapperEntityAttachments(scaleHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getClamped(arg0: Any, arg1: Int, arg2: Float): WrapperVec3 {
        return WrapperVec3(getClampedHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getNullable(arg0: Any, arg1: Int, arg2: Float): WrapperVec3 {
        return WrapperVec3(getNullableHandle.invoke(handle, arg0, arg1, arg2))
    }

}
