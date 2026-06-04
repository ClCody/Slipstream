package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundUpdateEnabledFeaturesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.configuration.ClientboundUpdateEnabledFeaturesPacket") }
        private val lookup = MethodHandles.lookup()

        val featuresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "features", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.Set")))
        }
    }

    val features: Any
        get() = featuresHandle.invoke(handle) as Any

    fun copy(features: Any = this.features): WrapperClientboundUpdateEnabledFeaturesPacket {
        return WrapperClientboundUpdateEnabledFeaturesPacket(constructorHandle.invoke(features))
    }

}
