package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRegistryOps(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.resources.RegistryOps") }
        private val lookup = MethodHandles.lookup()

        val ownerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "owner", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getter", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val withParentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withParent", MethodType.methodType(Class.forName("net.minecraft.resources.RegistryOps"), Class.forName("com.mojang.serialization.DynamicOps")))
        }
    }

    fun owner(arg0: WrapperResourceKey): Any {
        return ownerHandle.invoke(handle, arg0.handle) as Any
    }

    fun getter(arg0: WrapperResourceKey): Any {
        return getterHandle.invoke(handle, arg0.handle) as Any
    }

    fun withParent(arg0: Any): WrapperRegistryOps {
        return WrapperRegistryOps(withParentHandle.invoke(handle, arg0))
    }

}
