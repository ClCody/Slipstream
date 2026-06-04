package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperVecDeltaCodec(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.VecDeltaCodec") }
        private val lookup = MethodHandles.lookup()

        val decodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "decode", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Long::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!))
        }
        val deltaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "delta", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getBaseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBase", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val encodeXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "encodeX", MethodType.methodType(Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val encodeYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "encodeY", MethodType.methodType(Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val encodeZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "encodeZ", MethodType.methodType(Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val baseSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("base")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun decode(arg0: Long, arg1: Long, arg2: Long): WrapperVec3 {
        return WrapperVec3(decodeHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun delta(arg0: WrapperVec3): WrapperVec3 {
        return WrapperVec3(deltaHandle.invoke(handle, arg0.handle))
    }

    val base: WrapperVec3
        get() = WrapperVec3(getBaseHandle.invoke(handle))

    fun encodeX(arg0: WrapperVec3): Long {
        return encodeXHandle.invoke(handle, arg0.handle) as Long
    }

    fun encodeY(arg0: WrapperVec3): Long {
        return encodeYHandle.invoke(handle, arg0.handle) as Long
    }

    fun encodeZ(arg0: WrapperVec3): Long {
        return encodeZHandle.invoke(handle, arg0.handle) as Long
    }

    fun setBase(value: WrapperVec3) {
        baseSetterHandle.invoke(handle, value.handle)
    }

}
