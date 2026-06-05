package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelAccessor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.LevelAccessor") }
        private val lookup = MethodHandles.lookup()

        val getChunkSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkSource", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkSource")))
        }
        val getLevelDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelData", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.LevelData")))
        }
        val nextSubTickCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextSubTickCount", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getMinecraftWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinecraftWorld", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getBlockTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.LevelTickAccess")))
        }
        val getFluidTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.LevelTickAccess")))
        }
        val hasChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getCurrentDifficultyAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCurrentDifficultyAt", MethodType.methodType(Class.forName("net.minecraft.world.DifficultyInstance"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
        val dayTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dayTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource")))
        }
    }

    val chunkSource: WrapperChunkSource
        get() = WrapperChunkSource(getChunkSourceHandle.invoke(handle))

    val levelData: WrapperLevelData
        get() = WrapperLevelData(getLevelDataHandle.invoke(handle))

    val nextSubTickCount: Long
        get() = nextSubTickCountHandle.invoke(handle) as Long

    val minecraftWorld: WrapperServerLevel
        get() = WrapperServerLevel(getMinecraftWorldHandle.invoke(handle))

    val blockTicks: WrapperLevelTickAccess
        get() = WrapperLevelTickAccess(getBlockTicksHandle.invoke(handle))

    val fluidTicks: WrapperLevelTickAccess
        get() = WrapperLevelTickAccess(getFluidTicksHandle.invoke(handle))

    fun hasChunk(arg0: Int, arg1: Int): Boolean {
        return hasChunkHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun getCurrentDifficultyAt(arg0: WrapperBlockPos): WrapperDifficultyInstance {
        return WrapperDifficultyInstance(getCurrentDifficultyAtHandle.invoke(handle, arg0.handle))
    }

    val difficulty: Any
        get() = getDifficultyHandle.invoke(handle) as Any

    val dayTime: Long
        get() = dayTimeHandle.invoke(handle) as Long

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    val random: WrapperRandomSource
        get() = WrapperRandomSource(getRandomHandle.invoke(handle))

}
