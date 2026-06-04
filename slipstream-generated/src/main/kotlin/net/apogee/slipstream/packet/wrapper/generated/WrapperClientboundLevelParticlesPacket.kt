package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundLevelParticlesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getYDistHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYDist", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getZDistHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZDist", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getXDistHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXDist", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isOverrideLimiterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOverrideLimiter", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getParticleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParticle", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
        val getMaxSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val count: Int
        get() = getCountHandle.invoke(handle) as Int

    val yDist: Float
        get() = getYDistHandle.invoke(handle) as Float

    val zDist: Float
        get() = getZDistHandle.invoke(handle) as Float

    val xDist: Float
        get() = getXDistHandle.invoke(handle) as Float

    val overrideLimiter: Boolean
        get() = isOverrideLimiterHandle.invoke(handle) as Boolean

    val particle: Any
        get() = getParticleHandle.invoke(handle) as Any

    val maxSpeed: Float
        get() = getMaxSpeedHandle.invoke(handle) as Float

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

}

fun Any.isClientboundLevelParticlesPacket(): Boolean = WrapperClientboundLevelParticlesPacket.packetClass.isInstance(this)
fun Any.asClientboundLevelParticlesPacket(): WrapperClientboundLevelParticlesPacket = WrapperClientboundLevelParticlesPacket(this)
