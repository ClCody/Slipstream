package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCodecOperation(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.codec.StreamCodec\$CodecOperation") }
        private val lookup = MethodHandles.lookup()

        val applyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "apply", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec"), Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
    }

    fun apply(arg0: WrapperStreamCodec): WrapperStreamCodec {
        return WrapperStreamCodec(applyHandle.invoke(handle, arg0.handle))
    }

}
