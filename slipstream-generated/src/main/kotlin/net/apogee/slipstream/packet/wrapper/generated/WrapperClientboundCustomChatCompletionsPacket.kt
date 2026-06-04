package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCustomChatCompletionsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket") }
        private val lookup = MethodHandles.lookup()

        val actionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "action", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket\$Action")))
        }
        val entriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entries", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket\$Action"), Class.forName("java.util.List")))
        }
    }

    val action: Any
        get() = actionHandle.invoke(handle) as Any

    val entries: Any
        get() = entriesHandle.invoke(handle) as Any

    fun copy(action: Any = this.action, entries: Any = this.entries): WrapperClientboundCustomChatCompletionsPacket {
        return WrapperClientboundCustomChatCompletionsPacket(constructorHandle.invoke(action, entries))
    }

}
