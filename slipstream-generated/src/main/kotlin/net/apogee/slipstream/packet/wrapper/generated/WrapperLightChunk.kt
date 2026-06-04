package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLightChunk(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.LightChunk") }
        private val lookup = MethodHandles.lookup()

        val getSkyLightSourcesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSkyLightSources", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.ChunkSkyLightSources")))
        }
    }

    val skyLightSources: WrapperChunkSkyLightSources
        get() = WrapperChunkSkyLightSources(getSkyLightSourcesHandle.invoke(handle))

}
