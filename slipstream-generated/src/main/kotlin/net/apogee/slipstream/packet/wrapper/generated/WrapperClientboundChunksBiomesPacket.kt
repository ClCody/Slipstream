package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundChunksBiomesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket") }
        private val lookup = MethodHandles.lookup()

        val chunkBiomeDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunkBiomeData", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List")))
        }
    }

    val chunkBiomeData: Any
        get() = chunkBiomeDataHandle.invoke(handle) as Any

    fun copy(chunkBiomeData: Any = this.chunkBiomeData): WrapperClientboundChunksBiomesPacket {
        return WrapperClientboundChunksBiomesPacket(constructorHandle.invoke(chunkBiomeData))
    }

}
