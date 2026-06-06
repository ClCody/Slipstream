package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRegistryLookup(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderLookup\$RegistryLookup") }
        private val lookup = MethodHandles.lookup()

        val keyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "key", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val filterFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filterFeatures", MethodType.methodType(Class.forName("net.minecraft.core.HolderLookup\$RegistryLookup"), Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val registryLifecycleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryLifecycle", MethodType.methodType(Class.forName("com.mojang.serialization.Lifecycle")))
        }
        val filterElementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "filterElements", MethodType.methodType(Class.forName("net.minecraft.core.HolderLookup\$RegistryLookup"), Class.forName("java.util.function.Predicate")))
        }
    }

    val key: WrapperResourceKey
        get() = WrapperResourceKey(keyHandle.invoke(handle))

    fun filterFeatures(arg0: WrapperFeatureFlagSet): WrapperRegistryLookup {
        return WrapperRegistryLookup(filterFeaturesHandle.invoke(handle, arg0.handle))
    }

    val registryLifecycle: Any
        get() = registryLifecycleHandle.invoke(handle) as Any

    fun filterElements(arg0: Any): WrapperRegistryLookup {
        return WrapperRegistryLookup(filterElementsHandle.invoke(handle, arg0))
    }

}
