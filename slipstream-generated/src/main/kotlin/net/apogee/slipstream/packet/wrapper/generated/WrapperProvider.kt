package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperProvider(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderGetter\$Provider") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val lookupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lookup", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val lookupOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lookupOrThrow", MethodType.methodType(Class.forName("net.minecraft.core.HolderGetter"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
    }

    fun get(arg0: WrapperResourceKey, arg1: WrapperResourceKey): Any {
        return getHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    fun lookup(arg0: WrapperResourceKey): Any {
        return lookupHandle.invoke(handle, arg0.handle) as Any
    }

    fun lookupOrThrow(arg0: WrapperResourceKey): WrapperHolderGetter {
        return WrapperHolderGetter(lookupOrThrowHandle.invoke(handle, arg0.handle))
    }

}
