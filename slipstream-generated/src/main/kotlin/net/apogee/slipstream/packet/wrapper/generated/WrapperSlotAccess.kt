package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSlotAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.SlotAccess") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val setHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "set", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
    }

    val get: WrapperItemStack
        get() = WrapperItemStack(getHandle.invoke(handle))

    fun set(arg0: WrapperItemStack): Boolean {
        return setHandle.invoke(handle, arg0.handle) as Boolean
    }

}
