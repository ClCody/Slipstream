package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTrackedEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ChunkMap\$TrackedEntity") }
        private val lookup = MethodHandles.lookup()

        val lastSectionPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSectionPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastChunkUpdateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastChunkUpdate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastTrackedChunkSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastTrackedChunk")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun setLastSectionPos(value: WrapperSectionPos) {
        lastSectionPosSetterHandle.invoke(handle, value.handle)
    }

    fun setLastChunkUpdate(value: Long) {
        lastChunkUpdateSetterHandle.invoke(handle, value)
    }

    fun setLastTrackedChunk(value: Any) {
        lastTrackedChunkSetterHandle.invoke(handle, value)
    }

}
