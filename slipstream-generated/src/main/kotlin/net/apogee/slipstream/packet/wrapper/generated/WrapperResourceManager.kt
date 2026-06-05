package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperResourceManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.resources.ResourceManager") }
        private val lookup = MethodHandles.lookup()

        val listPacksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listPacks", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val listResourceStacksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listResourceStacks", MethodType.methodType(Class.forName("java.util.Map"), String::class.java, Class.forName("java.util.function.Predicate")))
        }
        val getResourceStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResourceStack", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getNamespacesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNamespaces", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val listResourcesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listResources", MethodType.methodType(Class.forName("java.util.Map"), String::class.java, Class.forName("java.util.function.Predicate")))
        }
    }

    val listPacks: Any
        get() = listPacksHandle.invoke(handle) as Any

    fun listResourceStacks(arg0: String, arg1: Any): Any {
        return listResourceStacksHandle.invoke(handle, arg0, arg1) as Any
    }

    fun getResourceStack(arg0: WrapperResourceLocation): Any {
        return getResourceStackHandle.invoke(handle, arg0.handle) as Any
    }

    val namespaces: Any
        get() = getNamespacesHandle.invoke(handle) as Any

    fun listResources(arg0: String, arg1: Any): Any {
        return listResourcesHandle.invoke(handle, arg0, arg1) as Any
    }

}
