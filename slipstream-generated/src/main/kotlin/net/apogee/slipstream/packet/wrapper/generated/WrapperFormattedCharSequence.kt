package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFormattedCharSequence(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.FormattedCharSequence") }
        private val lookup = MethodHandles.lookup()

        val acceptHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "accept", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.util.FormattedCharSink")))
        }
    }

    fun accept(arg0: WrapperFormattedCharSink): Boolean {
        return acceptHandle.invoke(handle, arg0.handle) as Boolean
    }

}
