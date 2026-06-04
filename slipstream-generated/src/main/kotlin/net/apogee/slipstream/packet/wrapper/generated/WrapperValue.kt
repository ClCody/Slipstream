package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperValue(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.properties.Property\$Value") }
        private val lookup = MethodHandles.lookup()

        val propertyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "property", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.properties.Property")))
        }
        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Class.forName("java.lang.Comparable")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.level.block.state.properties.Property"), Class.forName("java.lang.Comparable")))
        }
    }

    val property: WrapperProperty
        get() = WrapperProperty(propertyHandle.invoke(handle))

    val value: Any
        get() = valueHandle.invoke(handle) as Any

    fun copy(property: WrapperProperty = this.property, value: Any = this.value): WrapperValue {
        return WrapperValue(constructorHandle.invoke(property.handle, value))
    }

}
