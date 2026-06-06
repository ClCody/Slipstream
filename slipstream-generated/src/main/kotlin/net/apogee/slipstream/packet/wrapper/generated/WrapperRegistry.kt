package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRegistry(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.Registry") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val streamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stream", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val entrySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entrySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKey", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation"), Class.forName("java.lang.Object")))
        }
        val keyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "key", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val containsKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "containsKey", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val keysHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "keys", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("com.mojang.serialization.DynamicOps")))
        }
        val keySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "keySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val freezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "freeze", MethodType.methodType(Class.forName("net.minecraft.core.Registry")))
        }
        val getTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTag", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.tags.TagKey")))
        }
        val holderByNameCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holderByNameCodec", MethodType.methodType(Class.forName("com.mojang.serialization.Codec")))
        }
        val getOptionalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOptional", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getAnyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAny", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val holdersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holders", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHolder", MethodType.methodType(Class.forName("java.util.Optional"), Int::class.javaPrimitiveType!!))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.util.RandomSource")))
        }
        val byNameCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "byNameCodec", MethodType.methodType(Class.forName("com.mojang.serialization.Codec")))
        }
        val wrapAsHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "wrapAsHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Class.forName("java.lang.Object")))
        }
        val getHolderOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHolderOrThrow", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val asLookupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asLookup", MethodType.methodType(Class.forName("net.minecraft.core.HolderLookup\$RegistryLookup")))
        }
        val getTagNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTagNames", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val asHolderIdMapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asHolderIdMap", MethodType.methodType(Class.forName("net.minecraft.core.IdMap")))
        }
        val registryLifecycleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryLifecycle", MethodType.methodType(Class.forName("com.mojang.serialization.Lifecycle")))
        }
        val asTagAddingLookupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asTagAddingLookup", MethodType.methodType(Class.forName("net.minecraft.core.HolderLookup\$RegistryLookup")))
        }
        val registrationInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registrationInfo", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getOrCreateTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreateTag", MethodType.methodType(Class.forName("net.minecraft.core.HolderSet\$Named"), Class.forName("net.minecraft.tags.TagKey")))
        }
        val registryKeySetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryKeySet", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getRandomElementOfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomElementOf", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.tags.TagKey"), Class.forName("net.minecraft.util.RandomSource")))
        }
        val holderOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holderOwner", MethodType.methodType(Class.forName("net.minecraft.core.HolderOwner")))
        }
        val getResourceKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResourceKey", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.lang.Object")))
        }
        val getTagOrEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTagOrEmpty", MethodType.methodType(Class.forName("java.lang.Iterable"), Class.forName("net.minecraft.tags.TagKey")))
        }
        val getTagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTags", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getOrThrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrThrow", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val createIntrusiveHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createIntrusiveHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference"), Class.forName("java.lang.Object")))
        }
    }

    fun get(arg0: WrapperResourceLocation): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    val stream: Any
        get() = streamHandle.invoke(handle) as Any

    val entrySet: Any
        get() = entrySetHandle.invoke(handle) as Any

    fun getKey(arg0: Any): WrapperResourceLocation {
        return WrapperResourceLocation(getKeyHandle.invoke(handle, arg0))
    }

    val key: WrapperResourceKey
        get() = WrapperResourceKey(keyHandle.invoke(handle))

    fun containsKey(arg0: WrapperResourceKey): Boolean {
        return containsKeyHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getId(arg0: Any): Int {
        return getIdHandle.invoke(handle, arg0) as Int
    }

    fun keys(arg0: Any): Any {
        return keysHandle.invoke(handle, arg0) as Any
    }

    val keySet: Any
        get() = keySetHandle.invoke(handle) as Any

    val freeze: WrapperRegistry
        get() = WrapperRegistry(freezeHandle.invoke(handle))

    fun getTag(arg0: WrapperTagKey): Any {
        return getTagHandle.invoke(handle, arg0.handle) as Any
    }

    val holderByNameCodec: Any
        get() = holderByNameCodecHandle.invoke(handle) as Any

    fun getOptional(arg0: WrapperResourceKey): Any {
        return getOptionalHandle.invoke(handle, arg0.handle) as Any
    }

    val any: Any
        get() = getAnyHandle.invoke(handle) as Any

    val holders: Any
        get() = holdersHandle.invoke(handle) as Any

    fun getHolder(arg0: Int): Any {
        return getHolderHandle.invoke(handle, arg0) as Any
    }

    fun getRandom(arg0: WrapperRandomSource): Any {
        return getRandomHandle.invoke(handle, arg0.handle) as Any
    }

    val byNameCodec: Any
        get() = byNameCodecHandle.invoke(handle) as Any

    fun wrapAsHolder(arg0: Any): WrapperHolder {
        return WrapperHolder(wrapAsHolderHandle.invoke(handle, arg0))
    }

    fun getHolderOrThrow(arg0: WrapperResourceKey): WrapperReference {
        return WrapperReference(getHolderOrThrowHandle.invoke(handle, arg0.handle))
    }

    val asLookup: WrapperRegistryLookup
        get() = WrapperRegistryLookup(asLookupHandle.invoke(handle))

    val tagNames: Any
        get() = getTagNamesHandle.invoke(handle) as Any

    val asHolderIdMap: WrapperIdMap
        get() = WrapperIdMap(asHolderIdMapHandle.invoke(handle))

    val registryLifecycle: Any
        get() = registryLifecycleHandle.invoke(handle) as Any

    val asTagAddingLookup: WrapperRegistryLookup
        get() = WrapperRegistryLookup(asTagAddingLookupHandle.invoke(handle))

    fun registrationInfo(arg0: WrapperResourceKey): Any {
        return registrationInfoHandle.invoke(handle, arg0.handle) as Any
    }

    fun getOrCreateTag(arg0: WrapperTagKey): WrapperNamed {
        return WrapperNamed(getOrCreateTagHandle.invoke(handle, arg0.handle))
    }

    val registryKeySet: Any
        get() = registryKeySetHandle.invoke(handle) as Any

    fun getRandomElementOf(arg0: WrapperTagKey, arg1: WrapperRandomSource): Any {
        return getRandomElementOfHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    val holderOwner: WrapperHolderOwner
        get() = WrapperHolderOwner(holderOwnerHandle.invoke(handle))

    fun getResourceKey(arg0: Any): Any {
        return getResourceKeyHandle.invoke(handle, arg0) as Any
    }

    fun getTagOrEmpty(arg0: WrapperTagKey): Any {
        return getTagOrEmptyHandle.invoke(handle, arg0.handle) as Any
    }

    val tags: Any
        get() = getTagsHandle.invoke(handle) as Any

    fun getOrThrow(arg0: WrapperResourceKey): Any {
        return getOrThrowHandle.invoke(handle, arg0.handle) as Any
    }

    fun createIntrusiveHolder(arg0: Any): WrapperReference {
        return WrapperReference(createIntrusiveHolderHandle.invoke(handle, arg0))
    }

}
