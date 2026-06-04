package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundChunkBatchReceivedPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChunkBatchReceivedPacket") }
        private val lookup = MethodHandles.lookup()

        val desiredChunksPerTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "desiredChunksPerTick", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Float::class.javaPrimitiveType!!))
        }
    }

    val desiredChunksPerTick: Float
        get() = desiredChunksPerTickHandle.invoke(handle) as Float

    fun copy(desiredChunksPerTick: Float = this.desiredChunksPerTick): WrapperServerboundChunkBatchReceivedPacket {
        return WrapperServerboundChunkBatchReceivedPacket(constructorHandle.invoke(desiredChunksPerTick))
    }

}
