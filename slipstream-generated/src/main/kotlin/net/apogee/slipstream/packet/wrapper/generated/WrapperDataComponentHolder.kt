package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataComponentHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.DataComponentHolder") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val getOrDefaultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrDefault", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType"), Class.forName("java.lang.Object")))
        }
        val hasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "has", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val getComponentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getComponents", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
    }

    fun get(arg0: WrapperDataComponentType): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    fun getOrDefault(arg0: WrapperDataComponentType, arg1: Any): Any {
        return getOrDefaultHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun has(arg0: WrapperDataComponentType): Boolean {
        return hasHandle.invoke(handle, arg0.handle) as Boolean
    }

    val components: WrapperDataComponentMap
        get() = WrapperDataComponentMap(getComponentsHandle.invoke(handle))

}
