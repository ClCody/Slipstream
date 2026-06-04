package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundChunkBatchFinishedPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundChunkBatchFinishedPacket") }
        private val lookup = MethodHandles.lookup()

        val batchSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "batchSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!))
        }
    }

    val batchSize: Int
        get() = batchSizeHandle.invoke(handle) as Int

    fun copy(batchSize: Int = this.batchSize): WrapperClientboundChunkBatchFinishedPacket {
        return WrapperClientboundChunkBatchFinishedPacket(constructorHandle.invoke(batchSize))
    }

}
