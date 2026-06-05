package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerTickRateManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.ServerTickRateManager") }
        private val lookup = MethodHandles.lookup()

        val isSprintingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSprinting", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val checkShouldSprintThisTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "checkShouldSprintThisTick", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val requestGameToSprintHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requestGameToSprint", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val stopSteppingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stopStepping", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val stopSprintingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stopSprinting", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val stepGameIfPausedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stepGameIfPaused", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val remainingSprintTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("remainingSprintTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sprintTickStartTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sprintTickStartTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sprintTimeSpendSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sprintTimeSpend")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val scheduledCurrentSprintTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("scheduledCurrentSprintTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val previousIsFrozenSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("previousIsFrozen")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val sprinting: Boolean
        get() = isSprintingHandle.invoke(handle) as Boolean

    val checkShouldSprintThisTick: Boolean
        get() = checkShouldSprintThisTickHandle.invoke(handle) as Boolean

    fun requestGameToSprint(arg0: Int): Boolean {
        return requestGameToSprintHandle.invoke(handle, arg0) as Boolean
    }

    val stopStepping: Boolean
        get() = stopSteppingHandle.invoke(handle) as Boolean

    fun stopSprinting(arg0: Boolean): Boolean {
        return stopSprintingHandle.invoke(handle, arg0) as Boolean
    }

    fun stepGameIfPaused(arg0: Int): Boolean {
        return stepGameIfPausedHandle.invoke(handle, arg0) as Boolean
    }

    fun setRemainingSprintTicks(value: Long) {
        remainingSprintTicksSetterHandle.invoke(handle, value)
    }

    fun setSprintTickStartTime(value: Long) {
        sprintTickStartTimeSetterHandle.invoke(handle, value)
    }

    fun setSprintTimeSpend(value: Long) {
        sprintTimeSpendSetterHandle.invoke(handle, value)
    }

    fun setScheduledCurrentSprintTicks(value: Long) {
        scheduledCurrentSprintTicksSetterHandle.invoke(handle, value)
    }

    fun setPreviousIsFrozen(value: Boolean) {
        previousIsFrozenSetterHandle.invoke(handle, value)
    }

}
