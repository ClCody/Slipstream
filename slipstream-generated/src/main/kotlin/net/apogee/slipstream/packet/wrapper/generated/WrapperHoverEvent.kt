package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHoverEvent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.HoverEvent") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.network.chat.HoverEvent\$Action")))
        }
        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.chat.HoverEvent\$Action")))
        }
    }

    fun getValue(arg0: WrapperAction): Any {
        return getValueHandle.invoke(handle, arg0.handle) as Any
    }

    val action: WrapperAction
        get() = WrapperAction(getActionHandle.invoke(handle))

}
