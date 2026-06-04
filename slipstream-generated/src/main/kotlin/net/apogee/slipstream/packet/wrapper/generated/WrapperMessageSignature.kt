package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMessageSignature(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.MessageSignature") }
        private val lookup = MethodHandles.lookup()

        val bytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "bytes", MethodType.methodType(ByteArray::class.java))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, ByteArray::class.java))
        }
    }

    val bytes: ByteArray
        get() = bytesHandle.invoke(handle) as ByteArray

    fun copy(bytes: ByteArray = this.bytes): WrapperMessageSignature {
        return WrapperMessageSignature(constructorHandle.invoke(bytes))
    }

}
