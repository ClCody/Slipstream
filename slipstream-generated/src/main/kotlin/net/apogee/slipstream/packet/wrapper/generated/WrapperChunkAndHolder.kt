package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkAndHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ServerChunkCache\$ChunkAndHolder") }
        private val lookup = MethodHandles.lookup()

        val chunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk")))
        }
        val holderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holder", MethodType.methodType(Class.forName("net.minecraft.server.level.ChunkHolder")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Class.forName("net.minecraft.server.level.ChunkHolder")))
        }
    }

    val chunk: WrapperLevelChunk
        get() = WrapperLevelChunk(chunkHandle.invoke(handle))

    val holder: WrapperChunkHolder
        get() = WrapperChunkHolder(holderHandle.invoke(handle))

    fun copy(chunk: WrapperLevelChunk = this.chunk, holder: WrapperChunkHolder = this.holder): WrapperChunkAndHolder {
        return WrapperChunkAndHolder(constructorHandle.invoke(chunk.handle, holder.handle))
    }

}
