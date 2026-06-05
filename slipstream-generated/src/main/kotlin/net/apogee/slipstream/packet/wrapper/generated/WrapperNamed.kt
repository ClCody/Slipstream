package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNamed(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderSet\$Named") }
        private val lookup = MethodHandles.lookup()

        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val keyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "key", MethodType.methodType(Class.forName("net.minecraft.tags.TagKey")))
        }
        val unwrapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrap", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Either")))
        }
        val canSerializeInHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSerializeIn", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.HolderOwner")))
        }
        val unwrapKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrapKey", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val contentsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("contents")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun contains(arg0: WrapperHolder): Boolean {
        return containsHandle.invoke(handle, arg0.handle) as Boolean
    }

    val key: WrapperTagKey
        get() = WrapperTagKey(keyHandle.invoke(handle))

    val unwrap: Any
        get() = unwrapHandle.invoke(handle) as Any

    fun canSerializeIn(arg0: WrapperHolderOwner): Boolean {
        return canSerializeInHandle.invoke(handle, arg0.handle) as Boolean
    }

    val unwrapKey: Any
        get() = unwrapKeyHandle.invoke(handle) as Any

    fun setContents(value: Any) {
        contentsSetterHandle.invoke(handle, value)
    }

}
