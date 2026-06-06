package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelLightEngine(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.lighting.LevelLightEngine") }
        private val lookup = MethodHandles.lookup()

        val getMinLightSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinLightSection", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRawBrightnessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRawBrightness", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Int::class.javaPrimitiveType!!))
        }
        val getLayerListenerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLayerListener", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.LayerLightEventListener"), Class.forName("net.minecraft.world.level.LightLayer")))
        }
        val lightOnInSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lightOnInSection", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.SectionPos")))
        }
        val getDebugDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDebugData", MethodType.methodType(String::class.java, Class.forName("net.minecraft.world.level.LightLayer"), Class.forName("net.minecraft.core.SectionPos")))
        }
        val getMaxLightSectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxLightSection", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hasLightWorkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLightWork", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val runLightUpdatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "runLightUpdates", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDebugSectionTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDebugSectionType", MethodType.methodType(Class.forName("net.minecraft.world.level.lighting.LayerLightSectionStorage\$SectionType"), Class.forName("net.minecraft.world.level.LightLayer"), Class.forName("net.minecraft.core.SectionPos")))
        }
        val `starlight$getLightEngineHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starlight\$getLightEngine", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.starlight.light.StarLightInterface")))
        }
        val getLightSectionCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightSectionCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val minLightSection: Int
        get() = getMinLightSectionHandle.invoke(handle) as Int

    fun getRawBrightness(arg0: WrapperBlockPos, arg1: Int): Int {
        return getRawBrightnessHandle.invoke(handle, arg0.handle, arg1) as Int
    }

    fun getLayerListener(arg0: Any): WrapperLayerLightEventListener {
        return WrapperLayerLightEventListener(getLayerListenerHandle.invoke(handle, arg0))
    }

    fun lightOnInSection(arg0: WrapperSectionPos): Boolean {
        return lightOnInSectionHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getDebugData(arg0: Any, arg1: WrapperSectionPos): String {
        return getDebugDataHandle.invoke(handle, arg0, arg1.handle) as String
    }

    val maxLightSection: Int
        get() = getMaxLightSectionHandle.invoke(handle) as Int

    val lightWork: Boolean
        get() = hasLightWorkHandle.invoke(handle) as Boolean

    val runLightUpdates: Int
        get() = runLightUpdatesHandle.invoke(handle) as Int

    fun getDebugSectionType(arg0: Any, arg1: WrapperSectionPos): Any {
        return getDebugSectionTypeHandle.invoke(handle, arg0, arg1.handle) as Any
    }

    val `starlight$getLightEngine`: Any
        get() = `starlight$getLightEngineHandle`.invoke(handle) as Any

    val lightSectionCount: Int
        get() = getLightSectionCountHandle.invoke(handle) as Int

}
