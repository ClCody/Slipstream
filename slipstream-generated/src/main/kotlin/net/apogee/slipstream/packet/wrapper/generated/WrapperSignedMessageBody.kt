package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSignedMessageBody(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.SignedMessageBody") }
        private val lookup = MethodHandles.lookup()

        val contentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "content", MethodType.methodType(String::class.java))
        }
        val timeStampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "timeStamp", MethodType.methodType(Class.forName("java.time.Instant")))
        }
        val saltHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "salt", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val lastSeenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lastSeen", MethodType.methodType(Class.forName("net.minecraft.network.chat.LastSeenMessages")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("java.time.Instant"), Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.LastSeenMessages")))
        }
    }

    val content: String
        get() = contentHandle.invoke(handle) as String

    val timeStamp: Any
        get() = timeStampHandle.invoke(handle) as Any

    val salt: Long
        get() = saltHandle.invoke(handle) as Long

    val lastSeen: WrapperLastSeenMessages
        get() = WrapperLastSeenMessages(lastSeenHandle.invoke(handle))

    fun copy(content: String = this.content, timeStamp: Any = this.timeStamp, salt: Long = this.salt, lastSeen: WrapperLastSeenMessages = this.lastSeen): WrapperSignedMessageBody {
        return WrapperSignedMessageBody(constructorHandle.invoke(content, timeStamp, salt, lastSeen.handle))
    }

}
