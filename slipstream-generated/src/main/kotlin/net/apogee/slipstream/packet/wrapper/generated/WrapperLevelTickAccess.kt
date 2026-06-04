package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelTickAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.ticks.LevelTickAccess") }
        private val lookup = MethodHandles.lookup()

        val willTickThisTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "willTickThisTick", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.lang.Object")))
        }
    }

    fun willTickThisTick(arg0: WrapperBlockPos, arg1: Any): Boolean {
        return willTickThisTickHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

}
