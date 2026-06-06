package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperResourceKey(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.resources.ResourceKey") }
        private val lookup = MethodHandles.lookup()

        val castHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cast", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val locationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "location", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val registryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registry", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val registryKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryKey", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val isForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFor", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceKey")))
        }
    }

    fun cast(arg0: WrapperResourceKey): Any {
        return castHandle.invoke(handle, arg0.handle) as Any
    }

    val location: WrapperResourceLocation
        get() = WrapperResourceLocation(locationHandle.invoke(handle))

    val registry: WrapperResourceLocation
        get() = WrapperResourceLocation(registryHandle.invoke(handle))

    val registryKey: WrapperResourceKey
        get() = WrapperResourceKey(registryKeyHandle.invoke(handle))

    fun isFor(arg0: WrapperResourceKey): Boolean {
        return isForHandle.invoke(handle, arg0.handle) as Boolean
    }

}
