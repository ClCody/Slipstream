package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClickEvent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.ClickEvent") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(String::class.java))
        }
        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.chat.ClickEvent\$Action")))
        }
    }

    val value: String
        get() = getValueHandle.invoke(handle) as String

    val action: Any
        get() = getActionHandle.invoke(handle) as Any

}
