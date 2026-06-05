package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperReference(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.Holder\$Reference") }
        private val lookup = MethodHandles.lookup()

        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Class.forName("java.lang.Object")))
        }
        val kindHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "kind", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Kind")))
        }
        val keyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "key", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val unwrapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrap", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Either")))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val tagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tags", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val canSerializeInHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSerializeIn", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.HolderOwner")))
        }
        val unwrapKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "unwrapKey", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val isBoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBound", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val tagsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tags")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val keySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("key")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val valueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("value")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val value: Any
        get() = valueHandle.invoke(handle) as Any

    val kind: Any
        get() = kindHandle.invoke(handle) as Any

    val key: WrapperResourceKey
        get() = WrapperResourceKey(keyHandle.invoke(handle))

    val unwrap: Any
        get() = unwrapHandle.invoke(handle) as Any

    fun `is`(arg0: WrapperResourceLocation): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    val tags: Any
        get() = tagsHandle.invoke(handle) as Any

    fun canSerializeIn(arg0: WrapperHolderOwner): Boolean {
        return canSerializeInHandle.invoke(handle, arg0.handle) as Boolean
    }

    val unwrapKey: Any
        get() = unwrapKeyHandle.invoke(handle) as Any

    val bound: Boolean
        get() = isBoundHandle.invoke(handle) as Boolean

    fun setTags(value: Any) {
        tagsSetterHandle.invoke(handle, value)
    }

    fun setKey(value: WrapperResourceKey) {
        keySetterHandle.invoke(handle, value.handle)
    }

    fun setValue(value: Any) {
        valueSetterHandle.invoke(handle, value)
    }

}
