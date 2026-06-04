package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundChunkBatchReceivedPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChunkBatchReceivedPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

}

fun Any.isServerboundChunkBatchReceivedPacket(): Boolean = WrapperServerboundChunkBatchReceivedPacket.packetClass.isInstance(this)
fun Any.asServerboundChunkBatchReceivedPacket(): WrapperServerboundChunkBatchReceivedPacket = WrapperServerboundChunkBatchReceivedPacket(this)
