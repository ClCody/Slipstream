package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundChatCommandSignedPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChatCommandSignedPacket") }
        private val lookup = MethodHandles.lookup()

        val commandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "command", MethodType.methodType(String::class.java))
        }
        val timeStampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "timeStamp", MethodType.methodType(Class.forName("java.time.Instant")))
        }
        val saltHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "salt", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val argumentSignaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "argumentSignatures", MethodType.methodType(Class.forName("net.minecraft.commands.arguments.ArgumentSignatures")))
        }
        val lastSeenMessagesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lastSeenMessages", MethodType.methodType(Class.forName("net.minecraft.network.chat.LastSeenMessages\$Update")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("java.time.Instant"), Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.commands.arguments.ArgumentSignatures"), Class.forName("net.minecraft.network.chat.LastSeenMessages\$Update")))
        }
    }

    val command: String
        get() = commandHandle.invoke(handle) as String

    val timeStamp: Any
        get() = timeStampHandle.invoke(handle) as Any

    val salt: Long
        get() = saltHandle.invoke(handle) as Long

    val argumentSignatures: WrapperArgumentSignatures
        get() = WrapperArgumentSignatures(argumentSignaturesHandle.invoke(handle))

    val lastSeenMessages: WrapperUpdate
        get() = WrapperUpdate(lastSeenMessagesHandle.invoke(handle))

    fun copy(command: String = this.command, timeStamp: Any = this.timeStamp, salt: Long = this.salt, argumentSignatures: WrapperArgumentSignatures = this.argumentSignatures, lastSeenMessages: WrapperUpdate = this.lastSeenMessages): WrapperServerboundChatCommandSignedPacket {
        return WrapperServerboundChatCommandSignedPacket(constructorHandle.invoke(command, timeStamp, salt, argumentSignatures.handle, lastSeenMessages.handle))
    }

}
