package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCustomQueryPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundCustomQueryPacket") }
        private val lookup = MethodHandles.lookup()

        val transactionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "transactionId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val payloadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "payload", MethodType.methodType(Class.forName("net.minecraft.network.protocol.login.custom.CustomQueryPayload")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.protocol.login.custom.CustomQueryPayload")))
        }
    }

    val transactionId: Int
        get() = transactionIdHandle.invoke(handle) as Int

    val payload: WrapperCustomQueryPayload
        get() = WrapperCustomQueryPayload(payloadHandle.invoke(handle))

    fun copy(transactionId: Int = this.transactionId, payload: WrapperCustomQueryPayload = this.payload): WrapperClientboundCustomQueryPacket {
        return WrapperClientboundCustomQueryPacket(constructorHandle.invoke(transactionId, payload.handle))
    }

}
