package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundTransferPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundTransferPacket") }
        private val lookup = MethodHandles.lookup()

        val hostHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "host", MethodType.methodType(String::class.java))
        }
        val portHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "port", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Int::class.javaPrimitiveType!!))
        }
    }

    val host: String
        get() = hostHandle.invoke(handle) as String

    val port: Int
        get() = portHandle.invoke(handle) as Int

    fun copy(host: String = this.host, port: Int = this.port): WrapperClientboundTransferPacket {
        return WrapperClientboundTransferPacket(constructorHandle.invoke(host, port))
    }

}
