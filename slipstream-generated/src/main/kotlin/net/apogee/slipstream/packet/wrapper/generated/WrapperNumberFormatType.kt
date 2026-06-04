package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNumberFormatType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.numbers.NumberFormatType") }
        private val lookup = MethodHandles.lookup()

        val mapCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mapCodec", MethodType.methodType(Class.forName("com.mojang.serialization.MapCodec")))
        }
        val streamCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "streamCodec", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
    }

    val mapCodec: Any
        get() = mapCodecHandle.invoke(handle) as Any

    val streamCodec: WrapperStreamCodec
        get() = WrapperStreamCodec(streamCodecHandle.invoke(handle))

}
