package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStreamDecoder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.codec.StreamDecoder") }
        private val lookup = MethodHandles.lookup()

        val decodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "decode", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("java.lang.Object")))
        }
    }

    fun decode(arg0: Any): Any {
        return decodeHandle.invoke(handle, arg0) as Any
    }

}
