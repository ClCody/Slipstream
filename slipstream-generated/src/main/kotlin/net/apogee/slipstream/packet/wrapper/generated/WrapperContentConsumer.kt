package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperContentConsumer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.FormattedText\$ContentConsumer") }
        private val lookup = MethodHandles.lookup()

        val acceptHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "accept", MethodType.methodType(Class.forName("java.util.Optional"), String::class.java))
        }
    }

    fun accept(arg0: String): Any {
        return acceptHandle.invoke(handle, arg0) as Any
    }

}
