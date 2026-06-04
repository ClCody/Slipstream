package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCustomPayloadPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket") }
        private val lookup = MethodHandles.lookup()

        val payloadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "payload", MethodType.methodType(Class.forName("net.minecraft.network.protocol.common.custom.CustomPacketPayload")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.protocol.common.custom.CustomPacketPayload")))
        }
    }

    val payload: WrapperCustomPacketPayload
        get() = WrapperCustomPacketPayload(payloadHandle.invoke(handle))

    fun copy(payload: WrapperCustomPacketPayload = this.payload): WrapperClientboundCustomPayloadPacket {
        return WrapperClientboundCustomPayloadPacket(constructorHandle.invoke(payload.handle))
    }

}
