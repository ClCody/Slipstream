package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlayerChatMessage(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.PlayerChatMessage") }
        private val lookup = MethodHandles.lookup()

        val linkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "link", MethodType.methodType(Class.forName("net.minecraft.network.chat.SignedMessageLink")))
        }
        val signatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "signature", MethodType.methodType(Class.forName("net.minecraft.network.chat.MessageSignature")))
        }
        val signedBodyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "signedBody", MethodType.methodType(Class.forName("net.minecraft.network.chat.SignedMessageBody")))
        }
        val unsignedContentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unsignedContent", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val filterMaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filterMask", MethodType.methodType(Class.forName("net.minecraft.network.chat.FilterMask")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.SignedMessageLink"), Class.forName("net.minecraft.network.chat.MessageSignature"), Class.forName("net.minecraft.network.chat.SignedMessageBody"), Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.network.chat.FilterMask")))
        }
    }

    val link: WrapperSignedMessageLink
        get() = WrapperSignedMessageLink(linkHandle.invoke(handle))

    val signature: WrapperMessageSignature
        get() = WrapperMessageSignature(signatureHandle.invoke(handle))

    val signedBody: WrapperSignedMessageBody
        get() = WrapperSignedMessageBody(signedBodyHandle.invoke(handle))

    val unsignedContent: WrapperComponent
        get() = WrapperComponent(unsignedContentHandle.invoke(handle))

    val filterMask: WrapperFilterMask
        get() = WrapperFilterMask(filterMaskHandle.invoke(handle))

    fun copy(link: WrapperSignedMessageLink = this.link, signature: WrapperMessageSignature = this.signature, signedBody: WrapperSignedMessageBody = this.signedBody, unsignedContent: WrapperComponent = this.unsignedContent, filterMask: WrapperFilterMask = this.filterMask): WrapperPlayerChatMessage {
        return WrapperPlayerChatMessage(constructorHandle.invoke(link.handle, signature.handle, signedBody.handle, unsignedContent.handle, filterMask.handle))
    }

}
