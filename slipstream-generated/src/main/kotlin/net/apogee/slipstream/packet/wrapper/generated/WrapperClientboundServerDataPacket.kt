package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundServerDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundServerDataPacket") }
        private val lookup = MethodHandles.lookup()

        val motdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "motd", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val iconBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "iconBytes", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component"), Class.forName("java.util.Optional")))
        }
    }

    val motd: WrapperComponent
        get() = WrapperComponent(motdHandle.invoke(handle))

    val iconBytes: Any
        get() = iconBytesHandle.invoke(handle) as Any

    fun copy(motd: WrapperComponent = this.motd, iconBytes: Any = this.iconBytes): WrapperClientboundServerDataPacket {
        return WrapperClientboundServerDataPacket(constructorHandle.invoke(motd.handle, iconBytes))
    }

}
