package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemAttributeModifiers(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.component.ItemAttributeModifiers") }
        private val lookup = MethodHandles.lookup()

        val modifiersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "modifiers", MethodType.methodType(Class.forName("java.util.List")))
        }
        val showInTooltipHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "showInTooltip", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val modifiers: Any
        get() = modifiersHandle.invoke(handle) as Any

    val showInTooltip: Boolean
        get() = showInTooltipHandle.invoke(handle) as Boolean

    fun copy(modifiers: Any = this.modifiers, showInTooltip: Boolean = this.showInTooltip): WrapperItemAttributeModifiers {
        return WrapperItemAttributeModifiers(constructorHandle.invoke(modifiers, showInTooltip))
    }

}
