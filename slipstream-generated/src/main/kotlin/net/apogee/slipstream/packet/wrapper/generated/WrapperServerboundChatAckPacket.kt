package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundChatAckPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChatAckPacket") }
        private val lookup = MethodHandles.lookup()

        val offsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "offset", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!))
        }
    }

    val offset: Int
        get() = offsetHandle.invoke(handle) as Int

    fun copy(offset: Int = this.offset): WrapperServerboundChatAckPacket {
        return WrapperServerboundChatAckPacket(constructorHandle.invoke(offset))
    }

}
