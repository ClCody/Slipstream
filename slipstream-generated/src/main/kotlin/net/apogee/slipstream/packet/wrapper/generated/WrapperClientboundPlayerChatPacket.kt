package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPlayerChatPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerChatPacket") }
        private val lookup = MethodHandles.lookup()

        val senderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sender", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val indexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "index", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val signatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "signature", MethodType.methodType(Class.forName("net.minecraft.network.chat.MessageSignature")))
        }
        val bodyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "body", MethodType.methodType(Class.forName("net.minecraft.network.chat.SignedMessageBody\$Packed")))
        }
        val unsignedContentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unsignedContent", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val filterMaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filterMask", MethodType.methodType(Class.forName("net.minecraft.network.chat.FilterMask")))
        }
        val chatTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chatType", MethodType.methodType(Class.forName("net.minecraft.network.chat.ChatType\$Bound")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.UUID"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.MessageSignature"), Class.forName("net.minecraft.network.chat.SignedMessageBody\$Packed"), Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.network.chat.FilterMask"), Class.forName("net.minecraft.network.chat.ChatType\$Bound")))
        }
    }

    val sender: Any
        get() = senderHandle.invoke(handle) as Any

    val index: Int
        get() = indexHandle.invoke(handle) as Int

    val signature: WrapperMessageSignature
        get() = WrapperMessageSignature(signatureHandle.invoke(handle))

    val body: WrapperPacked
        get() = WrapperPacked(bodyHandle.invoke(handle))

    val unsignedContent: WrapperComponent
        get() = WrapperComponent(unsignedContentHandle.invoke(handle))

    val filterMask: WrapperFilterMask
        get() = WrapperFilterMask(filterMaskHandle.invoke(handle))

    val chatType: WrapperBound
        get() = WrapperBound(chatTypeHandle.invoke(handle))

    fun copy(sender: Any = this.sender, index: Int = this.index, signature: WrapperMessageSignature = this.signature, body: WrapperPacked = this.body, unsignedContent: WrapperComponent = this.unsignedContent, filterMask: WrapperFilterMask = this.filterMask, chatType: WrapperBound = this.chatType): WrapperClientboundPlayerChatPacket {
        return WrapperClientboundPlayerChatPacket(constructorHandle.invoke(sender, index, signature.handle, body.handle, unsignedContent.handle, filterMask.handle, chatType.handle))
    }

}
