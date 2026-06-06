package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBiomeGenerationSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.BiomeGenerationSettings") }
        private val lookup = MethodHandles.lookup()

        val featuresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "features", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getFlowerFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFlowerFeatures", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getCarversHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCarvers", MethodType.methodType(Class.forName("java.lang.Iterable"), Class.forName("net.minecraft.world.level.levelgen.GenerationStep\$Carving")))
        }
        val hasFeatureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasFeature", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.placement.PlacedFeature")))
        }
    }

    val features: Any
        get() = featuresHandle.invoke(handle) as Any

    val flowerFeatures: Any
        get() = getFlowerFeaturesHandle.invoke(handle) as Any

    fun getCarvers(arg0: Any): Any {
        return getCarversHandle.invoke(handle, arg0) as Any
    }

    fun hasFeature(arg0: WrapperPlacedFeature): Boolean {
        return hasFeatureHandle.invoke(handle, arg0.handle) as Boolean
    }

}
