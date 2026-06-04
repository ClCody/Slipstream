package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemEnchantments(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.enchantment.ItemEnchantments") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val entrySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entrySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val keySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "keySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val withTooltipHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withTooltip", MethodType.methodType(Class.forName("net.minecraft.world.item.enchantment.ItemEnchantments"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val entrySet: Any
        get() = entrySetHandle.invoke(handle) as Any

    val keySet: Any
        get() = keySetHandle.invoke(handle) as Any

    fun getLevel(arg0: WrapperHolder): Int {
        return getLevelHandle.invoke(handle, arg0.handle) as Int
    }

    fun withTooltip(arg0: Boolean): WrapperItemEnchantments {
        return WrapperItemEnchantments(withTooltipHandle.invoke(handle, arg0))
    }

}
