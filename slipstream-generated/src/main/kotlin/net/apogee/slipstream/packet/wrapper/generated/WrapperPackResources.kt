package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPackResources(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.PackResources") }
        private val lookup = MethodHandles.lookup()

        val getResourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResource", MethodType.methodType(Class.forName("net.minecraft.server.packs.resources.IoSupplier"), Class.forName("net.minecraft.server.packs.PackType"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val locationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "location", MethodType.methodType(Class.forName("net.minecraft.server.packs.PackLocationInfo")))
        }
        val getRootResourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRootResource", MethodType.methodType(Class.forName("net.minecraft.server.packs.resources.IoSupplier"), Class.forName("[Ljava.lang.String;")))
        }
        val knownPackInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "knownPackInfo", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getMetadataSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMetadataSection", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.server.packs.metadata.MetadataSectionSerializer")))
        }
        val getNamespacesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNamespaces", MethodType.methodType(Class.forName("java.util.Set"), Class.forName("net.minecraft.server.packs.PackType")))
        }
        val packIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packId", MethodType.methodType(String::class.java))
        }
    }

    fun getResource(arg0: Any, arg1: WrapperResourceLocation): WrapperIoSupplier {
        return WrapperIoSupplier(getResourceHandle.invoke(handle, arg0, arg1.handle))
    }

    val location: WrapperPackLocationInfo
        get() = WrapperPackLocationInfo(locationHandle.invoke(handle))

    fun getRootResource(arg0: Any): WrapperIoSupplier {
        return WrapperIoSupplier(getRootResourceHandle.invoke(handle, arg0))
    }

    val knownPackInfo: Any
        get() = knownPackInfoHandle.invoke(handle) as Any

    fun getMetadataSection(arg0: WrapperMetadataSectionSerializer): Any {
        return getMetadataSectionHandle.invoke(handle, arg0.handle) as Any
    }

    fun getNamespaces(arg0: Any): Any {
        return getNamespacesHandle.invoke(handle, arg0) as Any
    }

    val packId: String
        get() = packIdHandle.invoke(handle) as String

}
