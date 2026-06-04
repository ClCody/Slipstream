package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundCustomQueryAnswerPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ServerboundCustomQueryAnswerPacket") }
        private val lookup = MethodHandles.lookup()

        val transactionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "transactionId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val payloadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "payload", MethodType.methodType(Class.forName("net.minecraft.network.protocol.login.custom.CustomQueryAnswerPayload")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.protocol.login.custom.CustomQueryAnswerPayload")))
        }
    }

    val transactionId: Int
        get() = transactionIdHandle.invoke(handle) as Int

    val payload: Any
        get() = payloadHandle.invoke(handle) as Any

    fun copy(transactionId: Int = this.transactionId, payload: Any = this.payload): WrapperServerboundCustomQueryAnswerPacket {
        return WrapperServerboundCustomQueryAnswerPacket(constructorHandle.invoke(transactionId, payload))
    }

}
