package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelTicks(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.ticks.LevelTicks") }
        private val lookup = MethodHandles.lookup()

        val countHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "count", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hasScheduledTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasScheduledTick", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.lang.Object")))
        }
        val willTickThisTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "willTickThisTick", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.lang.Object")))
        }
    }

    val count: Int
        get() = countHandle.invoke(handle) as Int

    fun hasScheduledTick(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return hasScheduledTickHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun willTickThisTick(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return willTickThisTickHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

}
