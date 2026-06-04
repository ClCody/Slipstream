package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundChatSessionUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChatSessionUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val chatSessionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chatSession", MethodType.methodType(Class.forName("net.minecraft.network.chat.RemoteChatSession\$Data")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.RemoteChatSession\$Data")))
        }
    }

    val chatSession: WrapperData
        get() = WrapperData(chatSessionHandle.invoke(handle))

    fun copy(chatSession: WrapperData = this.chatSession): WrapperServerboundChatSessionUpdatePacket {
        return WrapperServerboundChatSessionUpdatePacket(constructorHandle.invoke(chatSession.handle))
    }

}
