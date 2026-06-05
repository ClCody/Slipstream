package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTooltipFlag(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.TooltipFlag") }
        private val lookup = MethodHandles.lookup()

        val isCreativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCreative", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isAdvancedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAdvanced", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val creative: Boolean
        get() = isCreativeHandle.invoke(handle) as Boolean

    val advanced: Boolean
        get() = isAdvancedHandle.invoke(handle) as Boolean

}
