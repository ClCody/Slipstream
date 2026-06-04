package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCommandSigningContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.commands.CommandSigningContext") }
        private val lookup = MethodHandles.lookup()

        val getArgumentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArgument", MethodType.methodType(Class.forName("net.minecraft.network.chat.PlayerChatMessage"), String::class.java))
        }
    }

    fun getArgument(arg0: String): WrapperPlayerChatMessage {
        return WrapperPlayerChatMessage(getArgumentHandle.invoke(handle, arg0))
    }

}
