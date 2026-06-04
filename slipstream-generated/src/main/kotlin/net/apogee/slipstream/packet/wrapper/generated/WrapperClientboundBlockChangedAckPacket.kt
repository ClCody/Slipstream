package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundBlockChangedAckPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundBlockChangedAckPacket") }
        private val lookup = MethodHandles.lookup()

        val sequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!))
        }
    }

    val sequence: Int
        get() = sequenceHandle.invoke(handle) as Int

    fun copy(sequence: Int = this.sequence): WrapperClientboundBlockChangedAckPacket {
        return WrapperClientboundBlockChangedAckPacket(constructorHandle.invoke(sequence))
    }

}
