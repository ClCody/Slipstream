package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkScanAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.storage.ChunkScanAccess") }
        private val lookup = MethodHandles.lookup()

        val scanChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scanChunk", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.world.level.ChunkPos"), Class.forName("net.minecraft.nbt.StreamTagVisitor")))
        }
    }

    fun scanChunk(arg0: WrapperChunkPos, arg1: WrapperStreamTagVisitor): Any {
        return scanChunkHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

}
