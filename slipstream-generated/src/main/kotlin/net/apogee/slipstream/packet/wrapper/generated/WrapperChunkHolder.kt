package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ChunkHolder") }
        private val lookup = MethodHandles.lookup()

        val getFullChunkNowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFullChunkNow", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk")))
        }
        val getTickingChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickingChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk")))
        }
        val getChunkToSendHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkToSend", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk")))
        }
        val getFullChunkNowUncheckedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFullChunkNowUnchecked", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk")))
        }
        val `moonrise$hasChunkBeenSentHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$hasChunkBeenSent", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val `moonrise$getPlayersHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getPlayers", MethodType.methodType(Class.forName("java.util.List"), Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getFullChunkHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getFullChunk", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.LevelChunk")))
        }
        val wasAccessibleSinceLastSaveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "wasAccessibleSinceLastSave", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTickingChunkFutureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickingChunkFuture", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture")))
        }
        val getEntityTickingChunkFutureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityTickingChunkFuture", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture")))
        }
        val `moonrise$getRealChunkHolderHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getRealChunkHolder", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.scheduling.NewChunkHolder")))
        }
        val getFullChunkFutureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFullChunkFuture", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture")))
        }
        val getSendSyncFutureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSendSyncFuture", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture")))
        }
        val getSaveSyncFutureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSaveSyncFuture", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture")))
        }
        val isReadyForSavingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReadyForSaving", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getQueueLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getQueueLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTicketLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicketLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hasChangedSectionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasChangedSections")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val newChunkHolderSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("newChunkHolder")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val fullChunkNow: WrapperLevelChunk
        get() = WrapperLevelChunk(getFullChunkNowHandle.invoke(handle))

    val tickingChunk: WrapperLevelChunk
        get() = WrapperLevelChunk(getTickingChunkHandle.invoke(handle))

    val chunkToSend: WrapperLevelChunk
        get() = WrapperLevelChunk(getChunkToSendHandle.invoke(handle))

    val fullChunkNowUnchecked: WrapperLevelChunk
        get() = WrapperLevelChunk(getFullChunkNowUncheckedHandle.invoke(handle))

    fun `moonrise$hasChunkBeenSent`(arg0: WrapperServerPlayer): Boolean {
        return `moonrise$hasChunkBeenSentHandle`.invoke(handle, arg0.handle) as Boolean
    }

    fun `moonrise$getPlayers`(arg0: Boolean): Any {
        return `moonrise$getPlayersHandle`.invoke(handle, arg0) as Any
    }

    val `moonrise$getFullChunk`: WrapperLevelChunk
        get() = WrapperLevelChunk(`moonrise$getFullChunkHandle`.invoke(handle))

    val wasAccessibleSinceLastSave: Boolean
        get() = wasAccessibleSinceLastSaveHandle.invoke(handle) as Boolean

    val tickingChunkFuture: Any
        get() = getTickingChunkFutureHandle.invoke(handle) as Any

    val entityTickingChunkFuture: Any
        get() = getEntityTickingChunkFutureHandle.invoke(handle) as Any

    val `moonrise$getRealChunkHolder`: Any
        get() = `moonrise$getRealChunkHolderHandle`.invoke(handle) as Any

    val fullChunkFuture: Any
        get() = getFullChunkFutureHandle.invoke(handle) as Any

    val sendSyncFuture: Any
        get() = getSendSyncFutureHandle.invoke(handle) as Any

    val saveSyncFuture: Any
        get() = getSaveSyncFutureHandle.invoke(handle) as Any

    val readyForSaving: Boolean
        get() = isReadyForSavingHandle.invoke(handle) as Boolean

    val queueLevel: Int
        get() = getQueueLevelHandle.invoke(handle) as Int

    val ticketLevel: Int
        get() = getTicketLevelHandle.invoke(handle) as Int

    fun setHasChangedSections(value: Boolean) {
        hasChangedSectionsSetterHandle.invoke(handle, value)
    }

    fun setNewChunkHolder(value: Any) {
        newChunkHolderSetterHandle.invoke(handle, value)
    }

}
