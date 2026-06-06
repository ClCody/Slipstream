package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAbstractArrow(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.projectile.AbstractArrow") }
        private val lookup = MethodHandles.lookup()

        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.entity.SlotAccess"), Int::class.javaPrimitiveType!!))
        }
        val getPierceLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPierceLevel", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val isPickableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPickable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isAttackableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAttackable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWeaponItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWeaponItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val shouldRenderAtSqrDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRenderAtSqrDistance", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val canHitEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canHitEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val preHitTargetOrDeflectSelfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "preHitTargetOrDeflectSelf", MethodType.methodType(Class.forName("net.minecraft.world.entity.projectile.ProjectileDeflection"), Class.forName("net.minecraft.world.phys.HitResult")))
        }
        val isNoPhysicsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isNoPhysics", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shotFromCrossbowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shotFromCrossbow", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPickupItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickupItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isCritArrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCritArrow", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBaseDamageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseDamage", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getPickupItemStackOriginHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickupItemStackOrigin", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val lastStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inGroundSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inGround")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inGroundTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inGroundTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pickupSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pickup")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val shakeTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("shakeTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lifeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("life")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val baseDamageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("baseDamage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val soundEventSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("soundEvent")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val piercingIgnoreEntityIdsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("piercingIgnoreEntityIds")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val piercedAndKilledEntitiesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("piercedAndKilledEntities")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pickupItemStackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pickupItemStack")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val firedFromWeaponSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("firedFromWeapon")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getSlot(arg0: Int): WrapperSlotAccess {
        return WrapperSlotAccess(getSlotHandle.invoke(handle, arg0))
    }

    val pierceLevel: Byte
        get() = getPierceLevelHandle.invoke(handle) as Byte

    val pickable: Boolean
        get() = isPickableHandle.invoke(handle) as Boolean

    val attackable: Boolean
        get() = isAttackableHandle.invoke(handle) as Boolean

    val weaponItem: WrapperItemStack
        get() = WrapperItemStack(getWeaponItemHandle.invoke(handle))

    fun shouldRenderAtSqrDistance(arg0: Double): Boolean {
        return shouldRenderAtSqrDistanceHandle.invoke(handle, arg0) as Boolean
    }

    fun canHitEntity(arg0: WrapperEntity): Boolean {
        return canHitEntityHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun preHitTargetOrDeflectSelf(arg0: WrapperHitResult): Any {
        return preHitTargetOrDeflectSelfHandle.invoke(handle, arg0.handle) as Any
    }

    val noPhysics: Boolean
        get() = isNoPhysicsHandle.invoke(handle) as Boolean

    val shotFromCrossbow: Boolean
        get() = shotFromCrossbowHandle.invoke(handle) as Boolean

    val pickupItem: WrapperItemStack
        get() = WrapperItemStack(getPickupItemHandle.invoke(handle))

    val critArrow: Boolean
        get() = isCritArrowHandle.invoke(handle) as Boolean

    val baseDamage: Double
        get() = getBaseDamageHandle.invoke(handle) as Double

    val pickupItemStackOrigin: WrapperItemStack
        get() = WrapperItemStack(getPickupItemStackOriginHandle.invoke(handle))

    fun setLastState(value: WrapperBlockState) {
        lastStateSetterHandle.invoke(handle, value.handle)
    }

    fun setInGround(value: Boolean) {
        inGroundSetterHandle.invoke(handle, value)
    }

    fun setInGroundTime(value: Int) {
        inGroundTimeSetterHandle.invoke(handle, value)
    }

    fun setPickup(value: Any) {
        pickupSetterHandle.invoke(handle, value)
    }

    fun setShakeTime(value: Int) {
        shakeTimeSetterHandle.invoke(handle, value)
    }

    fun setLife(value: Int) {
        lifeSetterHandle.invoke(handle, value)
    }

    fun setBaseDamage(value: Double) {
        baseDamageSetterHandle.invoke(handle, value)
    }

    fun setSoundEvent(value: WrapperSoundEvent) {
        soundEventSetterHandle.invoke(handle, value.handle)
    }

    fun setPiercingIgnoreEntityIds(value: Any) {
        piercingIgnoreEntityIdsSetterHandle.invoke(handle, value)
    }

    fun setPiercedAndKilledEntities(value: Any) {
        piercedAndKilledEntitiesSetterHandle.invoke(handle, value)
    }

    fun setPickupItemStack(value: WrapperItemStack) {
        pickupItemStackSetterHandle.invoke(handle, value.handle)
    }

    fun setFiredFromWeapon(value: WrapperItemStack) {
        firedFromWeaponSetterHandle.invoke(handle, value.handle)
    }

}
