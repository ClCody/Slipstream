package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundServerLinksPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundServerLinksPacket") }
        private val lookup = MethodHandles.lookup()

        val linksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "links", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List")))
        }
    }

    val links: Any
        get() = linksHandle.invoke(handle) as Any

    fun copy(links: Any = this.links): WrapperClientboundServerLinksPacket {
        return WrapperClientboundServerLinksPacket(constructorHandle.invoke(links))
    }

}
