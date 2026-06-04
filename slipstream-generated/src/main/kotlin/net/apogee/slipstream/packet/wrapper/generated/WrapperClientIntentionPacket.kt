package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientIntentionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.handshake.ClientIntentionPacket") }
        private val lookup = MethodHandles.lookup()

        val protocolVersionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "protocolVersion", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hostNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hostName", MethodType.methodType(String::class.java))
        }
        val portHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "port", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val intentionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "intention", MethodType.methodType(Class.forName("net.minecraft.network.protocol.handshake.ClientIntent")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, String::class.java, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.protocol.handshake.ClientIntent")))
        }
    }

    val protocolVersion: Int
        get() = protocolVersionHandle.invoke(handle) as Int

    val hostName: String
        get() = hostNameHandle.invoke(handle) as String

    val port: Int
        get() = portHandle.invoke(handle) as Int

    val intention: Any
        get() = intentionHandle.invoke(handle) as Any

    fun copy(protocolVersion: Int = this.protocolVersion, hostName: String = this.hostName, port: Int = this.port, intention: Any = this.intention): WrapperClientIntentionPacket {
        return WrapperClientIntentionPacket(constructorHandle.invoke(protocolVersion, hostName, port, intention))
    }

}
