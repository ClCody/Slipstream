package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundTabListPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTabListPacket") }
        private val lookup = MethodHandles.lookup()

        val headerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "header", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val footerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "footer", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val header: WrapperComponent
        get() = WrapperComponent(headerHandle.invoke(handle))

    val footer: WrapperComponent
        get() = WrapperComponent(footerHandle.invoke(handle))

    fun copy(header: WrapperComponent = this.header, footer: WrapperComponent = this.footer): WrapperClientboundTabListPacket {
        return WrapperClientboundTabListPacket(constructorHandle.invoke(header.handle, footer.handle))
    }

}
