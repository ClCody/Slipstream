package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundChatCommandPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChatCommandPacket") }
        private val lookup = MethodHandles.lookup()

        val commandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "command", MethodType.methodType(String::class.java))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java))
        }
    }

    val command: String
        get() = commandHandle.invoke(handle) as String

    fun copy(command: String = this.command): WrapperServerboundChatCommandPacket {
        return WrapperServerboundChatCommandPacket(constructorHandle.invoke(command))
    }

}
