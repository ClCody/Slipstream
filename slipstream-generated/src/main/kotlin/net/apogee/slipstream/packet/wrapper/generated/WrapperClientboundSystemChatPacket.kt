package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSystemChatPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSystemChatPacket") }
        private val lookup = MethodHandles.lookup()

        val contentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "content", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val overlayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overlay", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val content: WrapperComponent
        get() = WrapperComponent(contentHandle.invoke(handle))

    val overlay: Boolean
        get() = overlayHandle.invoke(handle) as Boolean

    fun copy(content: WrapperComponent = this.content, overlay: Boolean = this.overlay): WrapperClientboundSystemChatPacket {
        return WrapperClientboundSystemChatPacket(constructorHandle.invoke(content.handle, overlay))
    }

}
