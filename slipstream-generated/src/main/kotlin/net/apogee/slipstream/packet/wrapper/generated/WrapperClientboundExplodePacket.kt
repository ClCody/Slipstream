package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundExplodePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundExplodePacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getBlockInteractionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockInteraction", MethodType.methodType(Class.forName("net.minecraft.world.level.Explosion\$BlockInteraction")))
        }
        val getPowerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPower", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getToBlowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getToBlow", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getExplosionSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExplosionSound", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getKnockbackYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnockbackY", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getKnockbackXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnockbackX", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getKnockbackZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnockbackZ", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getLargeExplosionParticlesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLargeExplosionParticles", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
        val getSmallExplosionParticlesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSmallExplosionParticles", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
    }

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val blockInteraction: Any
        get() = getBlockInteractionHandle.invoke(handle) as Any

    val power: Float
        get() = getPowerHandle.invoke(handle) as Float

    val toBlow: Any
        get() = getToBlowHandle.invoke(handle) as Any

    val explosionSound: Any
        get() = getExplosionSoundHandle.invoke(handle) as Any

    val knockbackY: Float
        get() = getKnockbackYHandle.invoke(handle) as Float

    val knockbackX: Float
        get() = getKnockbackXHandle.invoke(handle) as Float

    val knockbackZ: Float
        get() = getKnockbackZHandle.invoke(handle) as Float

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

    val largeExplosionParticles: Any
        get() = getLargeExplosionParticlesHandle.invoke(handle) as Any

    val smallExplosionParticles: Any
        get() = getSmallExplosionParticlesHandle.invoke(handle) as Any

}

fun Any.isClientboundExplodePacket(): Boolean = WrapperClientboundExplodePacket.packetClass.isInstance(this)
fun Any.asClientboundExplodePacket(): WrapperClientboundExplodePacket = WrapperClientboundExplodePacket(this)
