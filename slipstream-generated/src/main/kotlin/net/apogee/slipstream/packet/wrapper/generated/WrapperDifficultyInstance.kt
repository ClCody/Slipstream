package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDifficultyInstance(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.DifficultyInstance") }
        private val lookup = MethodHandles.lookup()

        val getEffectiveDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffectiveDifficulty", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getSpecialMultiplierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpecialMultiplier", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isHarderThanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHarderThan", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val isHardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHard", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
    }

    val effectiveDifficulty: Float
        get() = getEffectiveDifficultyHandle.invoke(handle) as Float

    val specialMultiplier: Float
        get() = getSpecialMultiplierHandle.invoke(handle) as Float

    fun isHarderThan(arg0: Float): Boolean {
        return isHarderThanHandle.invoke(handle, arg0) as Boolean
    }

    val hard: Boolean
        get() = isHardHandle.invoke(handle) as Boolean

    val difficulty: Any
        get() = getDifficultyHandle.invoke(handle) as Any

}
