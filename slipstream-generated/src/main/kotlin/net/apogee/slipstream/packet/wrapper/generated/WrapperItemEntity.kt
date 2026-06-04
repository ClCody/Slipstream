package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.item.ItemEntity") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.entity.item.ItemEntity")))
        }
        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.entity.SlotAccess"), Int::class.javaPrimitiveType!!))
        }
        val getOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwner", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getAgeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAge", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSpinHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpin", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val fireImmuneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fireImmune", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val changeDimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "changeDimension", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.portal.DimensionTransition")))
        }
        val isAttackableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAttackable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSoundSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSoundSource", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundSource")))
        }
        val dampensVibrationsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dampensVibrations", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val hasPickUpDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPickUpDelay", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getVisualRotationYInDegreesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisualRotationYInDegrees", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getBlockPosBelowThatAffectsMyMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockPosBelowThatAffectsMyMovement", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val ageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("age")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pickupDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pickupDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val healthSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("health")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val throwerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("thrower")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedThrowerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedThrower")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val targetSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("target")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val canMobPickupSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("canMobPickup")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val despawnRateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("despawnRate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val frictionStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("frictionState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: WrapperComponent
        get() = WrapperComponent(getNameHandle.invoke(handle))

    val copy: WrapperItemEntity
        get() = WrapperItemEntity(copyHandle.invoke(handle))

    fun getSlot(arg0: Int): WrapperSlotAccess {
        return WrapperSlotAccess(getSlotHandle.invoke(handle, arg0))
    }

    val owner: WrapperEntity
        get() = WrapperEntity(getOwnerHandle.invoke(handle))

    val item: WrapperItemStack
        get() = WrapperItemStack(getItemHandle.invoke(handle))

    val age: Int
        get() = getAgeHandle.invoke(handle) as Int

    fun getSpin(arg0: Float): Float {
        return getSpinHandle.invoke(handle, arg0) as Float
    }

    val fireImmune: Boolean
        get() = fireImmuneHandle.invoke(handle) as Boolean

    fun changeDimension(arg0: WrapperDimensionTransition): WrapperEntity {
        return WrapperEntity(changeDimensionHandle.invoke(handle, arg0.handle))
    }

    val attackable: Boolean
        get() = isAttackableHandle.invoke(handle) as Boolean

    val soundSource: Any
        get() = getSoundSourceHandle.invoke(handle) as Any

    val dampensVibrations: Boolean
        get() = dampensVibrationsHandle.invoke(handle) as Boolean

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val pickUpDelay: Boolean
        get() = hasPickUpDelayHandle.invoke(handle) as Boolean

    val visualRotationYInDegrees: Float
        get() = getVisualRotationYInDegreesHandle.invoke(handle) as Float

    val blockPosBelowThatAffectsMyMovement: WrapperBlockPos
        get() = WrapperBlockPos(getBlockPosBelowThatAffectsMyMovementHandle.invoke(handle))

    fun setAge(value: Int) {
        ageSetterHandle.invoke(handle, value)
    }

    fun setPickupDelay(value: Int) {
        pickupDelaySetterHandle.invoke(handle, value)
    }

    fun setHealth(value: Int) {
        healthSetterHandle.invoke(handle, value)
    }

    fun setThrower(value: Any) {
        throwerSetterHandle.invoke(handle, value)
    }

    fun setCachedThrower(value: WrapperEntity) {
        cachedThrowerSetterHandle.invoke(handle, value.handle)
    }

    fun setTarget(value: Any) {
        targetSetterHandle.invoke(handle, value)
    }

    fun setCanMobPickup(value: Boolean) {
        canMobPickupSetterHandle.invoke(handle, value)
    }

    fun setDespawnRate(value: Int) {
        despawnRateSetterHandle.invoke(handle, value)
    }

    fun setFrictionState(value: Any) {
        frictionStateSetterHandle.invoke(handle, value)
    }

}
