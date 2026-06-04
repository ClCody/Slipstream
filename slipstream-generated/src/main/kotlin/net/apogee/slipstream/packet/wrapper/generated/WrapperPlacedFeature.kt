package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlacedFeature(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.placement.PlacedFeature") }
        private val lookup = MethodHandles.lookup()

        val featureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "feature", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val placementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "placement", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.Holder"), Class.forName("java.util.List")))
        }
    }

    val feature: WrapperHolder
        get() = WrapperHolder(featureHandle.invoke(handle))

    val placement: Any
        get() = placementHandle.invoke(handle) as Any

    fun copy(feature: WrapperHolder = this.feature, placement: Any = this.placement): WrapperPlacedFeature {
        return WrapperPlacedFeature(constructorHandle.invoke(feature.handle, placement))
    }

}
