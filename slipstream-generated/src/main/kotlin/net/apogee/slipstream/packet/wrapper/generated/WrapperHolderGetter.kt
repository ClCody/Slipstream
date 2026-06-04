package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHolderGetter(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderGetter") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrThrow", MethodType.methodType(Class.forName("net.minecraft.core.HolderSet\$Named"), Class.forName("net.minecraft.tags.TagKey")))
        }
    }

    fun get(arg0: WrapperResourceKey): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    fun getOrThrow(arg0: WrapperTagKey): WrapperNamed {
        return WrapperNamed(getOrThrowHandle.invoke(handle, arg0.handle))
    }

}
