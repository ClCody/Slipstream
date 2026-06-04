package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperVec2(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.Vec2") }
        private val lookup = MethodHandles.lookup()

        val lengthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "length", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val scaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scale", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec2"), Float::class.javaPrimitiveType!!))
        }
        val addHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "add", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec2"), Float::class.javaPrimitiveType!!))
        }
        val dotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dot", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec2")))
        }
        val normalizedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "normalized", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec2")))
        }
        val negatedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "negated", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec2")))
        }
        val lengthSquaredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lengthSquared", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val distanceToSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceToSqr", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec2")))
        }
    }

    val length: Float
        get() = lengthHandle.invoke(handle) as Float

    fun scale(arg0: Float): WrapperVec2 {
        return WrapperVec2(scaleHandle.invoke(handle, arg0))
    }

    fun add(arg0: Float): WrapperVec2 {
        return WrapperVec2(addHandle.invoke(handle, arg0))
    }

    fun dot(arg0: WrapperVec2): Float {
        return dotHandle.invoke(handle, arg0.handle) as Float
    }

    val normalized: WrapperVec2
        get() = WrapperVec2(normalizedHandle.invoke(handle))

    val negated: WrapperVec2
        get() = WrapperVec2(negatedHandle.invoke(handle))

    val lengthSquared: Float
        get() = lengthSquaredHandle.invoke(handle) as Float

    fun distanceToSqr(arg0: WrapperVec2): Float {
        return distanceToSqrHandle.invoke(handle, arg0.handle) as Float
    }

}
