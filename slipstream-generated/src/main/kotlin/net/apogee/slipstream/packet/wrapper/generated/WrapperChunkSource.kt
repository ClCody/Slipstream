package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.ChunkSource") }
        private val lookup = MethodHandles.lookup()

        val getLoadedChunksCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLoadedChunksCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getChunkForLightingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkForLighting", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LightChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkNowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkNow", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val getLightEngineHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightEngine", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.LevelLightEngine")))
        }
        val gatherStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gatherStats", MethodType.methodType(String::class.java))
        }
    }

    val loadedChunksCount: Int
        get() = getLoadedChunksCountHandle.invoke(handle) as Int

    fun getChunkForLighting(arg0: Int, arg1: Int): WrapperLightChunk {
        return WrapperLightChunk(getChunkForLightingHandle.invoke(handle, arg0, arg1))
    }

    fun getChunkNow(arg0: Int, arg1: Int): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkNowHandle.invoke(handle, arg0, arg1))
    }

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getChunk(arg0: Int, arg1: Int, arg2: Boolean): WrapperLevelChunk {
        return WrapperLevelChunk(getChunkHandle.invoke(handle, arg0, arg1, arg2))
    }

    val lightEngine: WrapperLevelLightEngine
        get() = WrapperLevelLightEngine(getLightEngineHandle.invoke(handle))

    val gatherStats: String
        get() = gatherStatsHandle.invoke(handle) as String

}
