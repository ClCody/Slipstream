package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemCooldowns(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.ItemCooldowns") }
        private val lookup = MethodHandles.lookup()

        val isOnCooldownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOnCooldown", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.Item")))
        }
        val getCooldownPercentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCooldownPercent", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.Item"), Float::class.javaPrimitiveType!!))
        }
        val tickCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun isOnCooldown(arg0: WrapperItem): Boolean {
        return isOnCooldownHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getCooldownPercent(arg0: WrapperItem, arg1: Float): Float {
        return getCooldownPercentHandle.invoke(handle, arg0.handle, arg1) as Float
    }

    fun setTickCount(value: Int) {
        tickCountSetterHandle.invoke(handle, value)
    }

}
