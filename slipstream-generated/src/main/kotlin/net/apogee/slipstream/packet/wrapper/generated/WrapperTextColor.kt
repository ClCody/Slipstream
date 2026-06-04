package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTextColor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.TextColor") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val serializeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "serialize", MethodType.methodType(String::class.java))
        }
    }

    val value: Int
        get() = getValueHandle.invoke(handle) as Int

    val serialize: String
        get() = serializeHandle.invoke(handle) as String

}
