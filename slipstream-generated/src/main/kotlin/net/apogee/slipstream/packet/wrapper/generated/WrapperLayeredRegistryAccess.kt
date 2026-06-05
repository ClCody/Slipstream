package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLayeredRegistryAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.LayeredRegistryAccess") }
        private val lookup = MethodHandles.lookup()

        val getLayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLayer", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen"), Class.forName("java.lang.Object")))
        }
        val compositeAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compositeAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen")))
        }
        val getAccessFromHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAccessFrom", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen"), Class.forName("java.lang.Object")))
        }
        val getAccessForLoadingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAccessForLoading", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen"), Class.forName("java.lang.Object")))
        }
        val replaceFromHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "replaceFrom", MethodType.methodType(Class.forName("net.minecraft.core.LayeredRegistryAccess"), Class.forName("java.lang.Object"), Class.forName("[Lnet.minecraft.core.RegistryAccess\$Frozen;")))
        }
    }

    fun getLayer(arg0: Any): Any {
        return getLayerHandle.invoke(handle, arg0) as Any
    }

    val compositeAccess: Any
        get() = compositeAccessHandle.invoke(handle) as Any

    fun getAccessFrom(arg0: Any): Any {
        return getAccessFromHandle.invoke(handle, arg0) as Any
    }

    fun getAccessForLoading(arg0: Any): Any {
        return getAccessForLoadingHandle.invoke(handle, arg0) as Any
    }

    fun replaceFrom(arg0: Any, arg1: Any): WrapperLayeredRegistryAccess {
        return WrapperLayeredRegistryAccess(replaceFromHandle.invoke(handle, arg0, arg1))
    }

}
