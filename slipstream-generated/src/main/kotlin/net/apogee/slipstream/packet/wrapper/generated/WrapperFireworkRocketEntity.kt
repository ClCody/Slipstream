package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFireworkRocketEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.projectile.FireworkRocketEntity") }
        private val lookup = MethodHandles.lookup()

        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isShotAtAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShotAtAngle", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isAttackableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAttackable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldRenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRender", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val shouldRenderAtSqrDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRenderAtSqrDistance", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val calculateHorizontalHurtKnockbackDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "calculateHorizontalHurtKnockbackDirection", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair"), Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val lifeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("life")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lifetimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lifetime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val attachedToEntitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("attachedToEntity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawningEntitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawningEntity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val item: WrapperItemStack
        get() = WrapperItemStack(getItemHandle.invoke(handle))

    val shotAtAngle: Boolean
        get() = isShotAtAngleHandle.invoke(handle) as Boolean

    val attackable: Boolean
        get() = isAttackableHandle.invoke(handle) as Boolean

    fun shouldRender(arg0: Double, arg1: Double, arg2: Double): Boolean {
        return shouldRenderHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun shouldRenderAtSqrDistance(arg0: Double): Boolean {
        return shouldRenderAtSqrDistanceHandle.invoke(handle, arg0) as Boolean
    }

    fun calculateHorizontalHurtKnockbackDirection(arg0: WrapperLivingEntity, arg1: WrapperDamageSource): Any {
        return calculateHorizontalHurtKnockbackDirectionHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    fun setLife(value: Int) {
        lifeSetterHandle.invoke(handle, value)
    }

    fun setLifetime(value: Int) {
        lifetimeSetterHandle.invoke(handle, value)
    }

    fun setAttachedToEntity(value: WrapperLivingEntity) {
        attachedToEntitySetterHandle.invoke(handle, value.handle)
    }

    fun setSpawningEntity(value: Any) {
        spawningEntitySetterHandle.invoke(handle, value)
    }

}
