package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFoodData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.food.FoodData") }
        private val lookup = MethodHandles.lookup()

        val needsFoodHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "needsFood", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFoodLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFoodLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSaturationLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSaturationLevel", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getExhaustionLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExhaustionLevel", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getLastFoodLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastFoodLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val foodLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("foodLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val saturationLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("saturationLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val exhaustionLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("exhaustionLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickTimerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickTimer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val entityhumanSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("entityhuman")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val saturatedRegenRateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("saturatedRegenRate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val unsaturatedRegenRateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("unsaturatedRegenRate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val starvationRateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("starvationRate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastFoodLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastFoodLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val needsFood: Boolean
        get() = needsFoodHandle.invoke(handle) as Boolean

    val foodLevel: Int
        get() = getFoodLevelHandle.invoke(handle) as Int

    val saturationLevel: Float
        get() = getSaturationLevelHandle.invoke(handle) as Float

    val exhaustionLevel: Float
        get() = getExhaustionLevelHandle.invoke(handle) as Float

    val lastFoodLevel: Int
        get() = getLastFoodLevelHandle.invoke(handle) as Int

    fun setFoodLevel(value: Int) {
        foodLevelSetterHandle.invoke(handle, value)
    }

    fun setSaturationLevel(value: Float) {
        saturationLevelSetterHandle.invoke(handle, value)
    }

    fun setExhaustionLevel(value: Float) {
        exhaustionLevelSetterHandle.invoke(handle, value)
    }

    fun setTickTimer(value: Int) {
        tickTimerSetterHandle.invoke(handle, value)
    }

    fun setEntityhuman(value: WrapperPlayer) {
        entityhumanSetterHandle.invoke(handle, value.handle)
    }

    fun setSaturatedRegenRate(value: Int) {
        saturatedRegenRateSetterHandle.invoke(handle, value)
    }

    fun setUnsaturatedRegenRate(value: Int) {
        unsaturatedRegenRateSetterHandle.invoke(handle, value)
    }

    fun setStarvationRate(value: Int) {
        starvationRateSetterHandle.invoke(handle, value)
    }

    fun setLastFoodLevel(value: Int) {
        lastFoodLevelSetterHandle.invoke(handle, value)
    }

}
