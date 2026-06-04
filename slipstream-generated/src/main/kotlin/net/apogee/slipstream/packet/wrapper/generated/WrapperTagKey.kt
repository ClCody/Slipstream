package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTagKey(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.tags.TagKey") }
        private val lookup = MethodHandles.lookup()

        val registryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registry", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val locationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "location", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val registry: WrapperResourceKey
        get() = WrapperResourceKey(registryHandle.invoke(handle))

    val location: WrapperResourceLocation
        get() = WrapperResourceLocation(locationHandle.invoke(handle))

    fun copy(registry: WrapperResourceKey = this.registry, location: WrapperResourceLocation = this.location): WrapperTagKey {
        return WrapperTagKey(constructorHandle.invoke(registry.handle, location.handle))
    }

}
