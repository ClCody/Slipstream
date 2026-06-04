package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPackSelectionConfig(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.PackSelectionConfig") }
        private val lookup = MethodHandles.lookup()

        val requiredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "required", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val defaultPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "defaultPosition", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.Pack\$Position")))
        }
        val fixedPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fixedPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.packs.repository.Pack\$Position"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val required: Boolean
        get() = requiredHandle.invoke(handle) as Boolean

    val defaultPosition: Any
        get() = defaultPositionHandle.invoke(handle) as Any

    val fixedPosition: Boolean
        get() = fixedPositionHandle.invoke(handle) as Boolean

    fun copy(required: Boolean = this.required, defaultPosition: Any = this.defaultPosition, fixedPosition: Boolean = this.fixedPosition): WrapperPackSelectionConfig {
        return WrapperPackSelectionConfig(constructorHandle.invoke(required, defaultPosition, fixedPosition))
    }

}
