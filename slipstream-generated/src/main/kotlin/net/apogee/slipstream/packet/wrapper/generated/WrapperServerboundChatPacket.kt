package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundChatPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChatPacket") }
        private val lookup = MethodHandles.lookup()

        val messageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "message", MethodType.methodType(String::class.java))
        }
        val timeStampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "timeStamp", MethodType.methodType(Class.forName("java.time.Instant")))
        }
        val saltHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "salt", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val signatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "signature", MethodType.methodType(Class.forName("net.minecraft.network.chat.MessageSignature")))
        }
        val lastSeenMessagesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lastSeenMessages", MethodType.methodType(Class.forName("net.minecraft.network.chat.LastSeenMessages\$Update")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("java.time.Instant"), Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.MessageSignature"), Class.forName("net.minecraft.network.chat.LastSeenMessages\$Update")))
        }
    }

    val message: String
        get() = messageHandle.invoke(handle) as String

    val timeStamp: Any
        get() = timeStampHandle.invoke(handle) as Any

    val salt: Long
        get() = saltHandle.invoke(handle) as Long

    val signature: WrapperMessageSignature
        get() = WrapperMessageSignature(signatureHandle.invoke(handle))

    val lastSeenMessages: WrapperUpdate
        get() = WrapperUpdate(lastSeenMessagesHandle.invoke(handle))

    fun copy(message: String = this.message, timeStamp: Any = this.timeStamp, salt: Long = this.salt, signature: WrapperMessageSignature = this.signature, lastSeenMessages: WrapperUpdate = this.lastSeenMessages): WrapperServerboundChatPacket {
        return WrapperServerboundChatPacket(constructorHandle.invoke(message, timeStamp, salt, signature.handle, lastSeenMessages.handle))
    }

}
