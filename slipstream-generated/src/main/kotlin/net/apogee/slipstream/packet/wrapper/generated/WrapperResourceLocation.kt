package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperResourceLocation(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.resources.ResourceLocation") }
        private val lookup = MethodHandles.lookup()

        val compareToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compareTo", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getPathHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPath", MethodType.methodType(String::class.java))
        }
        val withPrefixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPrefix", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation"), String::class.java))
        }
        val withSuffixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withSuffix", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation"), String::class.java))
        }
        val withPathHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPath", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation"), String::class.java))
        }
        val getNamespaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNamespace", MethodType.methodType(String::class.java))
        }
        val toDebugFileNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toDebugFileName", MethodType.methodType(String::class.java))
        }
        val toShortLanguageKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toShortLanguageKey", MethodType.methodType(String::class.java))
        }
        val toLanguageKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toLanguageKey", MethodType.methodType(String::class.java, String::class.java, String::class.java))
        }
    }

    fun compareTo(arg0: WrapperResourceLocation): Int {
        return compareToHandle.invoke(handle, arg0.handle) as Int
    }

    val path: String
        get() = getPathHandle.invoke(handle) as String

    fun withPrefix(arg0: String): WrapperResourceLocation {
        return WrapperResourceLocation(withPrefixHandle.invoke(handle, arg0))
    }

    fun withSuffix(arg0: String): WrapperResourceLocation {
        return WrapperResourceLocation(withSuffixHandle.invoke(handle, arg0))
    }

    fun withPath(arg0: String): WrapperResourceLocation {
        return WrapperResourceLocation(withPathHandle.invoke(handle, arg0))
    }

    val namespace: String
        get() = getNamespaceHandle.invoke(handle) as String

    val toDebugFileName: String
        get() = toDebugFileNameHandle.invoke(handle) as String

    val toShortLanguageKey: String
        get() = toShortLanguageKeyHandle.invoke(handle) as String

    fun toLanguageKey(arg0: String, arg1: String): String {
        return toLanguageKeyHandle.invoke(handle, arg0, arg1) as String
    }

}
