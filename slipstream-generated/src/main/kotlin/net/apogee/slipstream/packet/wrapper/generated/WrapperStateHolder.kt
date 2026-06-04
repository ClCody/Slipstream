package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStateHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.StateHolder") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Class.forName("java.lang.Comparable"), Class.forName("net.minecraft.world.level.block.state.properties.Property")))
        }
        val getPropertiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProperties", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val setValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setValue", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.world.level.block.state.properties.Property"), Class.forName("java.lang.Comparable")))
        }
        val hasPropertyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasProperty", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.properties.Property")))
        }
        val getOptionalValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOptionalValue", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.level.block.state.properties.Property")))
        }
        val trySetValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "trySetValue", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.world.level.block.state.properties.Property"), Class.forName("java.lang.Comparable")))
        }
        val cycleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cycle", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.world.level.block.state.properties.Property")))
        }
        val getValuesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValues", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val neighboursSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("neighbours")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getValue(arg0: WrapperProperty): Any {
        return getValueHandle.invoke(handle, arg0.handle) as Any
    }

    val properties: Any
        get() = getPropertiesHandle.invoke(handle) as Any

    fun setValue(arg0: WrapperProperty, arg1: Any): Any {
        return setValueHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun hasProperty(arg0: WrapperProperty): Boolean {
        return hasPropertyHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getOptionalValue(arg0: WrapperProperty): Any {
        return getOptionalValueHandle.invoke(handle, arg0.handle) as Any
    }

    fun trySetValue(arg0: WrapperProperty, arg1: Any): Any {
        return trySetValueHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun cycle(arg0: WrapperProperty): Any {
        return cycleHandle.invoke(handle, arg0.handle) as Any
    }

    val values: Any
        get() = getValuesHandle.invoke(handle) as Any

    fun setNeighbours(value: Any) {
        neighboursSetterHandle.invoke(handle, value)
    }

}
