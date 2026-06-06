package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperProjectile(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.projectile.Projectile") }
        private val lookup = MethodHandles.lookup()

        val getOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwner", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val deflectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "deflect", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.projectile.ProjectileDeflection"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.Entity"), Boolean::class.javaPrimitiveType!!))
        }
        val isPickableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPickable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAddEntityPacketHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAddEntityPacket", MethodType.methodType(Class.forName("net.minecraft.network.protocol.Packet"), Class.forName("net.minecraft.server.level.ServerEntity")))
        }
        val calculateHorizontalHurtKnockbackDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "calculateHorizontalHurtKnockbackDirection", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair"), Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val mayInteractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayInteract", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getPickRadiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickRadius", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getEffectSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffectSource", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val canHitEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canHitEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getMovementToShootHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMovementToShoot", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val mayBreakHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayBreak", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level")))
        }
        val preHitTargetOrDeflectSelfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "preHitTargetOrDeflectSelf", MethodType.methodType(Class.forName("net.minecraft.world.entity.projectile.ProjectileDeflection"), Class.forName("net.minecraft.world.phys.HitResult")))
        }
        val ownerUUIDSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ownerUUID")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedOwnerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedOwner")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val leftOwnerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("leftOwner")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasBeenShotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasBeenShot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastDeflectedBySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastDeflectedBy")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hitCancelledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hitCancelled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val owner: WrapperEntity
        get() = WrapperEntity(getOwnerHandle.invoke(handle))

    fun deflect(arg0: Any, arg1: WrapperEntity, arg2: WrapperEntity, arg3: Boolean): Boolean {
        return deflectHandle.invoke(handle, arg0, arg1.handle, arg2.handle, arg3) as Boolean
    }

    val pickable: Boolean
        get() = isPickableHandle.invoke(handle) as Boolean

    fun getAddEntityPacket(arg0: WrapperServerEntity): WrapperPacket {
        return WrapperPacket(getAddEntityPacketHandle.invoke(handle, arg0.handle))
    }

    fun calculateHorizontalHurtKnockbackDirection(arg0: WrapperLivingEntity, arg1: WrapperDamageSource): Any {
        return calculateHorizontalHurtKnockbackDirectionHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    fun mayInteract(arg0: WrapperLevel, arg1: WrapperBlockPos): Boolean {
        return mayInteractHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val pickRadius: Float
        get() = getPickRadiusHandle.invoke(handle) as Float

    val effectSource: WrapperEntity
        get() = WrapperEntity(getEffectSourceHandle.invoke(handle))

    fun canHitEntity(arg0: WrapperEntity): Boolean {
        return canHitEntityHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getMovementToShoot(arg0: Double, arg1: Double, arg2: Double, arg3: Float, arg4: Float): WrapperVec3 {
        return WrapperVec3(getMovementToShootHandle.invoke(handle, arg0, arg1, arg2, arg3, arg4))
    }

    fun mayBreak(arg0: WrapperLevel): Boolean {
        return mayBreakHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun preHitTargetOrDeflectSelf(arg0: WrapperHitResult): Any {
        return preHitTargetOrDeflectSelfHandle.invoke(handle, arg0.handle) as Any
    }

    fun setOwnerUUID(value: Any) {
        ownerUUIDSetterHandle.invoke(handle, value)
    }

    fun setCachedOwner(value: WrapperEntity) {
        cachedOwnerSetterHandle.invoke(handle, value.handle)
    }

    fun setLeftOwner(value: Boolean) {
        leftOwnerSetterHandle.invoke(handle, value)
    }

    fun setHasBeenShot(value: Boolean) {
        hasBeenShotSetterHandle.invoke(handle, value)
    }

    fun setLastDeflectedBy(value: WrapperEntity) {
        lastDeflectedBySetterHandle.invoke(handle, value.handle)
    }

    fun setHitCancelled(value: Boolean) {
        hitCancelledSetterHandle.invoke(handle, value)
    }

}
