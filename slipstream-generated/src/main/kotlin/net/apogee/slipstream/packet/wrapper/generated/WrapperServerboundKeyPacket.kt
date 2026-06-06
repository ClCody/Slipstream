package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundKeyPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ServerboundKeyPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val isChallengeValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isChallengeValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, ByteArray::class.java, Class.forName("java.security.PrivateKey")))
        }
        val getSecretKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSecretKey", MethodType.methodType(Class.forName("javax.crypto.SecretKey"), Class.forName("java.security.PrivateKey")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    fun isChallengeValid(arg0: ByteArray, arg1: Any): Boolean {
        return isChallengeValidHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getSecretKey(arg0: Any): Any {
        return getSecretKeyHandle.invoke(handle, arg0) as Any
    }

}
