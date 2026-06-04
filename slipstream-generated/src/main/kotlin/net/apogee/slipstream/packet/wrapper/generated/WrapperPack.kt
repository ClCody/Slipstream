package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPack(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.repository.Pack") }
        private val lookup = MethodHandles.lookup()

        val locationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "location", MethodType.methodType(Class.forName("net.minecraft.server.packs.PackLocationInfo")))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(String::class.java))
        }
        val openHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "open", MethodType.methodType(Class.forName("net.minecraft.server.packs.PackResources")))
        }
        val getDefaultPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultPosition", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.Pack\$Position")))
        }
        val getCompatibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCompatibility", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.PackCompatibility")))
        }
        val selectionConfigHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "selectionConfig", MethodType.methodType(Class.forName("net.minecraft.server.packs.PackSelectionConfig")))
        }
        val getPackSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPackSource", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.PackSource")))
        }
        val getChatLinkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChatLink", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component"), Boolean::class.javaPrimitiveType!!))
        }
        val isFixedPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFixedPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDescriptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescription", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val isRequiredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRequired", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRequestedFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRequestedFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val getTitleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTitle", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val location: WrapperPackLocationInfo
        get() = WrapperPackLocationInfo(locationHandle.invoke(handle))

    val id: String
        get() = getIdHandle.invoke(handle) as String

    val open: WrapperPackResources
        get() = WrapperPackResources(openHandle.invoke(handle))

    val defaultPosition: Any
        get() = getDefaultPositionHandle.invoke(handle) as Any

    val compatibility: Any
        get() = getCompatibilityHandle.invoke(handle) as Any

    val selectionConfig: WrapperPackSelectionConfig
        get() = WrapperPackSelectionConfig(selectionConfigHandle.invoke(handle))

    val packSource: WrapperPackSource
        get() = WrapperPackSource(getPackSourceHandle.invoke(handle))

    fun getChatLink(arg0: Boolean): WrapperComponent {
        return WrapperComponent(getChatLinkHandle.invoke(handle, arg0))
    }

    val fixedPosition: Boolean
        get() = isFixedPositionHandle.invoke(handle) as Boolean

    val description: WrapperComponent
        get() = WrapperComponent(getDescriptionHandle.invoke(handle))

    val required: Boolean
        get() = isRequiredHandle.invoke(handle) as Boolean

    val requestedFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(getRequestedFeaturesHandle.invoke(handle))

    val title: WrapperComponent
        get() = WrapperComponent(getTitleHandle.invoke(handle))

}
