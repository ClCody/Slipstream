package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperExplosion(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.Explosion") }
        private val lookup = MethodHandles.lookup()

        val interactsWithBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interactsWithBlocks", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getIndirectSourceEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIndirectSourceEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getDirectSourceEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirectSourceEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val centerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "center", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getHitPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHitPlayers", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val canTriggerBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canTriggerBlocks", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val radiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "radius", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getToBlowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getToBlow", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getExplosionSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExplosionSound", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getBlockInteractionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockInteraction", MethodType.methodType(Class.forName("net.minecraft.world.level.Explosion\$BlockInteraction")))
        }
        val getLargeExplosionParticlesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLargeExplosionParticles", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
        val getSmallExplosionParticlesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSmallExplosionParticles", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
        val wasCanceledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasCanceled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yieldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yield")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val excludeSourceFromDamageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("excludeSourceFromDamage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blockCacheSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blockCache")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkPosCacheSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkPosCache")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkCacheSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkCache")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val interactsWithBlocks: Boolean
        get() = interactsWithBlocksHandle.invoke(handle) as Boolean

    val indirectSourceEntity: WrapperLivingEntity
        get() = WrapperLivingEntity(getIndirectSourceEntityHandle.invoke(handle))

    val directSourceEntity: WrapperEntity
        get() = WrapperEntity(getDirectSourceEntityHandle.invoke(handle))

    val center: WrapperVec3
        get() = WrapperVec3(centerHandle.invoke(handle))

    val hitPlayers: Any
        get() = getHitPlayersHandle.invoke(handle) as Any

    val canTriggerBlocks: Boolean
        get() = canTriggerBlocksHandle.invoke(handle) as Boolean

    val radius: Float
        get() = radiusHandle.invoke(handle) as Float

    val toBlow: Any
        get() = getToBlowHandle.invoke(handle) as Any

    val explosionSound: WrapperHolder
        get() = WrapperHolder(getExplosionSoundHandle.invoke(handle))

    val blockInteraction: Any
        get() = getBlockInteractionHandle.invoke(handle) as Any

    val largeExplosionParticles: WrapperParticleOptions
        get() = WrapperParticleOptions(getLargeExplosionParticlesHandle.invoke(handle))

    val smallExplosionParticles: WrapperParticleOptions
        get() = WrapperParticleOptions(getSmallExplosionParticlesHandle.invoke(handle))

    fun setWasCanceled(value: Boolean) {
        wasCanceledSetterHandle.invoke(handle, value)
    }

    fun setYield(value: Float) {
        yieldSetterHandle.invoke(handle, value)
    }

    fun setExcludeSourceFromDamage(value: Boolean) {
        excludeSourceFromDamageSetterHandle.invoke(handle, value)
    }

    fun setBlockCache(value: Any) {
        blockCacheSetterHandle.invoke(handle, value)
    }

    fun setChunkPosCache(value: Any) {
        chunkPosCacheSetterHandle.invoke(handle, value)
    }

    fun setChunkCache(value: Any) {
        chunkCacheSetterHandle.invoke(handle, value)
    }

}
