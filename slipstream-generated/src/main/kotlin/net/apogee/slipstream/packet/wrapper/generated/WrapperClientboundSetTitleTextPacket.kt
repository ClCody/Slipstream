package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetTitleTextPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket") }
        private val lookup = MethodHandles.lookup()

        val textHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "text", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val text: WrapperComponent
        get() = WrapperComponent(textHandle.invoke(handle))

    fun copy(text: WrapperComponent = this.text): WrapperClientboundSetTitleTextPacket {
        return WrapperClientboundSetTitleTextPacket(constructorHandle.invoke(text.handle))
    }

}
