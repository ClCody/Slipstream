package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSignedMessageLink(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.SignedMessageLink") }
        private val lookup = MethodHandles.lookup()

        val indexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "index", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val senderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sender", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val sessionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sessionId", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("java.util.UUID"), Class.forName("java.util.UUID")))
        }
    }

    val index: Int
        get() = indexHandle.invoke(handle) as Int

    val sender: Any
        get() = senderHandle.invoke(handle) as Any

    val sessionId: Any
        get() = sessionIdHandle.invoke(handle) as Any

    fun copy(index: Int = this.index, sender: Any = this.sender, sessionId: Any = this.sessionId): WrapperSignedMessageLink {
        return WrapperSignedMessageLink(constructorHandle.invoke(index, sender, sessionId))
    }

}
