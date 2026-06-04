package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundHelloPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundHelloPacket") }
        private val lookup = MethodHandles.lookup()

        val getPublicKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPublicKey", MethodType.methodType(Class.forName("java.security.PublicKey")))
        }
        val getChallengeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChallenge", MethodType.methodType(ByteArray::class.java))
        }
        val getServerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServerId", MethodType.methodType(String::class.java))
        }
    }

    val publicKey: Any
        get() = getPublicKeyHandle.invoke(handle) as Any

    val challenge: ByteArray
        get() = getChallengeHandle.invoke(handle) as ByteArray

    val serverId: String
        get() = getServerIdHandle.invoke(handle) as String

}

fun Any.isClientboundHelloPacket(): Boolean = WrapperClientboundHelloPacket.packetClass.isInstance(this)
fun Any.asClientboundHelloPacket(): WrapperClientboundHelloPacket = WrapperClientboundHelloPacket(this)
