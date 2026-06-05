package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHolderLookup(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.HolderLookup") }
        private val lookup = MethodHandles.lookup()

        val listElementIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listElementIds", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val listElementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listElements", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val listTagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listTags", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val listTagIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listTagIds", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
    }

    val listElementIds: Any
        get() = listElementIdsHandle.invoke(handle) as Any

    val listElements: Any
        get() = listElementsHandle.invoke(handle) as Any

    val listTags: Any
        get() = listTagsHandle.invoke(handle) as Any

    val listTagIds: Any
        get() = listTagIdsHandle.invoke(handle) as Any

}
