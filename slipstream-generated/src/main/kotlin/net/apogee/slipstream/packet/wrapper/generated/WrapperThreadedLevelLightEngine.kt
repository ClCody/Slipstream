package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperThreadedLevelLightEngine(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ThreadedLevelLightEngine") }
        private val lookup = MethodHandles.lookup()

        val `starlight$serverRelightChunksHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starlight\$serverRelightChunks", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection"), Class.forName("java.util.function.Consumer"), Class.forName("java.util.function.IntConsumer")))
        }
        val runLightUpdatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "runLightUpdates", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val initializeLightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "initializeLight", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Boolean::class.javaPrimitiveType!!))
        }
        val waitForPendingTasksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "waitForPendingTasks", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val lightChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lightChunk", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Boolean::class.javaPrimitiveType!!))
        }
    }

    fun `starlight$serverRelightChunks`(arg0: Any, arg1: Any, arg2: Any): Int {
        return `starlight$serverRelightChunksHandle`.invoke(handle, arg0, arg1, arg2) as Int
    }

    val runLightUpdates: Int
        get() = runLightUpdatesHandle.invoke(handle) as Int

    fun initializeLight(arg0: WrapperChunkAccess, arg1: Boolean): Any {
        return initializeLightHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun waitForPendingTasks(arg0: Int, arg1: Int): Any {
        return waitForPendingTasksHandle.invoke(handle, arg0, arg1) as Any
    }

    fun lightChunk(arg0: WrapperChunkAccess, arg1: Boolean): Any {
        return lightChunkHandle.invoke(handle, arg0.handle, arg1) as Any
    }

}
