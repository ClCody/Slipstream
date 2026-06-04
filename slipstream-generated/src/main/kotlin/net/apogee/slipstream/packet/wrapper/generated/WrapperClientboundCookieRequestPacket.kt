package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCookieRequestPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.cookie.ClientboundCookieRequestPacket") }
        private val lookup = MethodHandles.lookup()

        val keyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "key", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val key: WrapperResourceLocation
        get() = WrapperResourceLocation(keyHandle.invoke(handle))

    fun copy(key: WrapperResourceLocation = this.key): WrapperClientboundCookieRequestPacket {
        return WrapperClientboundCookieRequestPacket(constructorHandle.invoke(key.handle))
    }

}
