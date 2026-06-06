package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStyledContentConsumer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.FormattedText\$StyledContentConsumer") }
        private val lookup = MethodHandles.lookup()

        val acceptHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "accept", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.network.chat.Style"), String::class.java))
        }
    }

    fun accept(arg0: WrapperStyle, arg1: String): Any {
        return acceptHandle.invoke(handle, arg0.handle, arg1) as Any
    }

}
