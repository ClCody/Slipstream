package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChatDecorator(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.ChatDecorator") }
        private val lookup = MethodHandles.lookup()

        val decorateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "decorate", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    fun decorate(arg0: WrapperServerPlayer, arg1: WrapperCommandSourceStack, arg2: WrapperComponent): Any {
        return decorateHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Any
    }

}
