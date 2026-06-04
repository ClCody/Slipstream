package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundDeleteChatPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundDeleteChatPacket") }
        private val lookup = MethodHandles.lookup()

        val messageSignatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "messageSignature", MethodType.methodType(Class.forName("net.minecraft.network.chat.MessageSignature\$Packed")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.MessageSignature\$Packed")))
        }
    }

    val messageSignature: WrapperPacked
        get() = WrapperPacked(messageSignatureHandle.invoke(handle))

    fun copy(messageSignature: WrapperPacked = this.messageSignature): WrapperClientboundDeleteChatPacket {
        return WrapperClientboundDeleteChatPacket(constructorHandle.invoke(messageSignature.handle))
    }

}
