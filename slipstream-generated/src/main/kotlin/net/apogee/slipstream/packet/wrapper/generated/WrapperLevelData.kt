package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.LevelData") }
        private val lookup = MethodHandles.lookup()

        val getGameTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val isDifficultyLockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDifficultyLocked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGameRulesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameRules", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
        }
        val getSpawnPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isThunderingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isThundering", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSpawnAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnAngle", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isRainingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRaining", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isHardcoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHardcore", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
        val getDayTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDayTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
    }

    val gameTime: Long
        get() = getGameTimeHandle.invoke(handle) as Long

    val difficultyLocked: Boolean
        get() = isDifficultyLockedHandle.invoke(handle) as Boolean

    val gameRules: WrapperGameRules
        get() = WrapperGameRules(getGameRulesHandle.invoke(handle))

    val spawnPos: WrapperBlockPos
        get() = WrapperBlockPos(getSpawnPosHandle.invoke(handle))

    val thundering: Boolean
        get() = isThunderingHandle.invoke(handle) as Boolean

    val spawnAngle: Float
        get() = getSpawnAngleHandle.invoke(handle) as Float

    val raining: Boolean
        get() = isRainingHandle.invoke(handle) as Boolean

    val hardcore: Boolean
        get() = isHardcoreHandle.invoke(handle) as Boolean

    val difficulty: Any
        get() = getDifficultyHandle.invoke(handle) as Any

    val dayTime: Long
        get() = getDayTimeHandle.invoke(handle) as Long

}
