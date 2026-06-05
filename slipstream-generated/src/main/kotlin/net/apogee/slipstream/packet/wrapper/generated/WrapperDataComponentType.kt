package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataComponentType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.DataComponentType") }
        private val lookup = MethodHandles.lookup()

        val isTransientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTransient", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val streamCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "streamCodec", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
        val codecOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codecOrThrow", MethodType.methodType(Class.forName("com.mojang.serialization.Codec")))
        }
        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("com.mojang.serialization.Codec")))
        }
    }

    val transient: Boolean
        get() = isTransientHandle.invoke(handle) as Boolean

    val streamCodec: WrapperStreamCodec
        get() = WrapperStreamCodec(streamCodecHandle.invoke(handle))

    val codecOrThrow: Any
        get() = codecOrThrowHandle.invoke(handle) as Any

    val codec: Any
        get() = codecHandle.invoke(handle) as Any

}
