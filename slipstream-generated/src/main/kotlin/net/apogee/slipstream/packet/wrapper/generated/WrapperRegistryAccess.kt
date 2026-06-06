package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRegistryAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.RegistryAccess") }
        private val lookup = MethodHandles.lookup()

        val lookupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lookup", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val freezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "freeze", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen")))
        }
        val registryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registry", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val listRegistriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listRegistries", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val registryOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryOrThrow", MethodType.methodType(Class.forName("net.minecraft.core.Registry"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val registriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registries", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val allRegistriesLifecycleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "allRegistriesLifecycle", MethodType.methodType(Class.forName("com.mojang.serialization.Lifecycle")))
        }
    }

    fun lookup(arg0: WrapperResourceKey): Any {
        return lookupHandle.invoke(handle, arg0.handle) as Any
    }

    val freeze: Any
        get() = freezeHandle.invoke(handle) as Any

    fun registry(arg0: WrapperResourceKey): Any {
        return registryHandle.invoke(handle, arg0.handle) as Any
    }

    val listRegistries: Any
        get() = listRegistriesHandle.invoke(handle) as Any

    fun registryOrThrow(arg0: WrapperResourceKey): WrapperRegistry {
        return WrapperRegistry(registryOrThrowHandle.invoke(handle, arg0.handle))
    }

    val registries: Any
        get() = registriesHandle.invoke(handle) as Any

    val allRegistriesLifecycle: Any
        get() = allRegistriesLifecycleHandle.invoke(handle) as Any

}
