package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundStoreCookiePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundStoreCookiePacket") }
        private val lookup = MethodHandles.lookup()

        val keyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "key", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val payloadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "payload", MethodType.methodType(ByteArray::class.java))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceLocation"), ByteArray::class.java))
        }
    }

    val key: WrapperResourceLocation
        get() = WrapperResourceLocation(keyHandle.invoke(handle))

    val payload: ByteArray
        get() = payloadHandle.invoke(handle) as ByteArray

    fun copy(key: WrapperResourceLocation = this.key, payload: ByteArray = this.payload): WrapperClientboundStoreCookiePacket {
        return WrapperClientboundStoreCookiePacket(constructorHandle.invoke(key.handle, payload))
    }

}
