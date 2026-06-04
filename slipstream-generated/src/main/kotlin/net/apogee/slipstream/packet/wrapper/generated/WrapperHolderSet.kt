package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHolderSet(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderSet") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!))
        }
        val streamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stream", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val unwrapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrap", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Either")))
        }
        val unwrapKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrapKey", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val canSerializeInHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSerializeIn", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.HolderOwner")))
        }
        val getRandomElementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomElement", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.util.RandomSource")))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun get(arg0: Int): WrapperHolder {
        return WrapperHolder(getHandle.invoke(handle, arg0))
    }

    val stream: Any
        get() = streamHandle.invoke(handle) as Any

    fun contains(arg0: WrapperHolder): Boolean {
        return containsHandle.invoke(handle, arg0.handle) as Boolean
    }

    val unwrap: Any
        get() = unwrapHandle.invoke(handle) as Any

    val unwrapKey: Any
        get() = unwrapKeyHandle.invoke(handle) as Any

    fun canSerializeIn(arg0: WrapperHolderOwner): Boolean {
        return canSerializeInHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getRandomElement(arg0: WrapperRandomSource): Any {
        return getRandomElementHandle.invoke(handle, arg0.handle) as Any
    }

}
