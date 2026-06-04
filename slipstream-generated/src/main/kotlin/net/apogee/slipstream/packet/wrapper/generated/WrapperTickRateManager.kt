package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTickRateManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.TickRateManager") }
        private val lookup = MethodHandles.lookup()

        val isFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFrozen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val nanosecondsPerTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nanosecondsPerTick", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val isEntityFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEntityFrozen", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val runsNormallyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "runsNormally", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val frozenTicksToRunHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "frozenTicksToRun", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val tickrateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickrate", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isSteppingForwardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSteppingForward", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val millisecondsPerTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "millisecondsPerTick", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val tickrateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickrate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val nanosecondsPerTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nanosecondsPerTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val frozenTicksToRunSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("frozenTicksToRun")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val runGameElementsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("runGameElements")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isFrozenSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isFrozen")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val frozen: Boolean
        get() = isFrozenHandle.invoke(handle) as Boolean

    val nanosecondsPerTick: Long
        get() = nanosecondsPerTickHandle.invoke(handle) as Long

    fun isEntityFrozen(arg0: WrapperEntity): Boolean {
        return isEntityFrozenHandle.invoke(handle, arg0.handle) as Boolean
    }

    val runsNormally: Boolean
        get() = runsNormallyHandle.invoke(handle) as Boolean

    val frozenTicksToRun: Int
        get() = frozenTicksToRunHandle.invoke(handle) as Int

    val tickrate: Float
        get() = tickrateHandle.invoke(handle) as Float

    val steppingForward: Boolean
        get() = isSteppingForwardHandle.invoke(handle) as Boolean

    val millisecondsPerTick: Float
        get() = millisecondsPerTickHandle.invoke(handle) as Float

    fun setTickrate(value: Float) {
        tickrateSetterHandle.invoke(handle, value)
    }

    fun setNanosecondsPerTick(value: Long) {
        nanosecondsPerTickSetterHandle.invoke(handle, value)
    }

    fun setFrozenTicksToRun(value: Int) {
        frozenTicksToRunSetterHandle.invoke(handle, value)
    }

    fun setRunGameElements(value: Boolean) {
        runGameElementsSetterHandle.invoke(handle, value)
    }

    fun setIsFrozen(value: Boolean) {
        isFrozenSetterHandle.invoke(handle, value)
    }

}
