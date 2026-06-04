package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperParticleType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.particles.ParticleType") }
        private val lookup = MethodHandles.lookup()

        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("com.mojang.serialization.MapCodec")))
        }
        val getOverrideLimiterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOverrideLimiter", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val streamCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "streamCodec", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
    }

    val codec: Any
        get() = codecHandle.invoke(handle) as Any

    val overrideLimiter: Boolean
        get() = getOverrideLimiterHandle.invoke(handle) as Boolean

    val streamCodec: WrapperStreamCodec
        get() = WrapperStreamCodec(streamCodecHandle.invoke(handle))

}
