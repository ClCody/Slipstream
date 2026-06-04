package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTypedDataComponent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.TypedDataComponent") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Class.forName("java.lang.Object")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.component.DataComponentType"), Class.forName("java.lang.Object")))
        }
    }

    val type: WrapperDataComponentType
        get() = WrapperDataComponentType(typeHandle.invoke(handle))

    val value: Any
        get() = valueHandle.invoke(handle) as Any

    fun copy(type: WrapperDataComponentType = this.type, value: Any = this.value): WrapperTypedDataComponent {
        return WrapperTypedDataComponent(constructorHandle.invoke(type.handle, value))
    }

}
