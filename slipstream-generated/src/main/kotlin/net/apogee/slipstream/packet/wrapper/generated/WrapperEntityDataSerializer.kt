package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityDataSerializer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.syncher.EntityDataSerializer") }
        private val lookup = MethodHandles.lookup()

        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("java.lang.Object")))
        }
        val createAccessorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createAccessor", MethodType.methodType(Class.forName("net.minecraft.network.syncher.EntityDataAccessor"), Int::class.javaPrimitiveType!!))
        }
        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
    }

    fun copy(arg0: Any): Any {
        return copyHandle.invoke(handle, arg0) as Any
    }

    fun createAccessor(arg0: Int): WrapperEntityDataAccessor {
        return WrapperEntityDataAccessor(createAccessorHandle.invoke(handle, arg0))
    }

    val codec: WrapperStreamCodec
        get() = WrapperStreamCodec(codecHandle.invoke(handle))

}
