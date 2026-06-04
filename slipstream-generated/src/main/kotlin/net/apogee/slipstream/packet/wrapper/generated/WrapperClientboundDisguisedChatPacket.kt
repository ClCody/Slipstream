package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundDisguisedChatPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundDisguisedChatPacket") }
        private val lookup = MethodHandles.lookup()

        val messageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "message", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val chatTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chatType", MethodType.methodType(Class.forName("net.minecraft.network.chat.ChatType\$Bound")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.network.chat.ChatType\$Bound")))
        }
    }

    val message: WrapperComponent
        get() = WrapperComponent(messageHandle.invoke(handle))

    val chatType: WrapperBound
        get() = WrapperBound(chatTypeHandle.invoke(handle))

    fun copy(message: WrapperComponent = this.message, chatType: WrapperBound = this.chatType): WrapperClientboundDisguisedChatPacket {
        return WrapperClientboundDisguisedChatPacket(constructorHandle.invoke(message.handle, chatType.handle))
    }

}
