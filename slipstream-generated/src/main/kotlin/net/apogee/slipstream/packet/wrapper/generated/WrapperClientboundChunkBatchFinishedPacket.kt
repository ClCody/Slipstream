package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundChunkBatchFinishedPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundChunkBatchFinishedPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

}

fun Any.isClientboundChunkBatchFinishedPacket(): Boolean = WrapperClientboundChunkBatchFinishedPacket.packetClass.isInstance(this)
fun Any.asClientboundChunkBatchFinishedPacket(): WrapperClientboundChunkBatchFinishedPacket = WrapperClientboundChunkBatchFinishedPacket(this)
