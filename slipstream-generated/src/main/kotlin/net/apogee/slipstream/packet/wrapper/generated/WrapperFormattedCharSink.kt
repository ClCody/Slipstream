package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFormattedCharSink(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.FormattedCharSink") }
        private val lookup = MethodHandles.lookup()

        val acceptHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "accept", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.Style"), Int::class.javaPrimitiveType!!))
        }
    }

    fun accept(arg0: Int, arg1: WrapperStyle, arg2: Int): Boolean {
        return acceptHandle.invoke(handle, arg0, arg1.handle, arg2) as Boolean
    }

}
