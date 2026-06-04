package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundForgetLevelChunkPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket") }
        private val lookup = MethodHandles.lookup()

        val posHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pos", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.ChunkPos")))
        }
    }

    val pos: WrapperChunkPos
        get() = WrapperChunkPos(posHandle.invoke(handle))

    fun copy(pos: WrapperChunkPos = this.pos): WrapperClientboundForgetLevelChunkPacket {
        return WrapperClientboundForgetLevelChunkPacket(constructorHandle.invoke(pos.handle))
    }

}
