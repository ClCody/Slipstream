package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundHelloPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundHelloPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getPublicKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPublicKey", MethodType.methodType(Class.forName("java.security.PublicKey")))
        }
        val getChallengeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChallenge", MethodType.methodType(ByteArray::class.java))
        }
        val shouldAuthenticateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldAuthenticate", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getServerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServerId", MethodType.methodType(String::class.java))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val publicKey: Any
        get() = getPublicKeyHandle.invoke(handle) as Any

    val challenge: ByteArray
        get() = getChallengeHandle.invoke(handle) as ByteArray

    val shouldAuthenticate: Boolean
        get() = shouldAuthenticateHandle.invoke(handle) as Boolean

    val serverId: String
        get() = getServerIdHandle.invoke(handle) as String

}
