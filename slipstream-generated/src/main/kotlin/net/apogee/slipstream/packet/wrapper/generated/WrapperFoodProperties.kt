package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFoodProperties(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.food.FoodProperties") }
        private val lookup = MethodHandles.lookup()

        val nutritionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nutrition", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saturationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saturation", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canAlwaysEatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canAlwaysEat", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val eatSecondsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "eatSeconds", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val usingConvertsToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "usingConvertsTo", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val effectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "effects", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Class.forName("java.util.Optional"), Class.forName("java.util.List")))
        }
    }

    val nutrition: Int
        get() = nutritionHandle.invoke(handle) as Int

    val saturation: Float
        get() = saturationHandle.invoke(handle) as Float

    val canAlwaysEat: Boolean
        get() = canAlwaysEatHandle.invoke(handle) as Boolean

    val eatSeconds: Float
        get() = eatSecondsHandle.invoke(handle) as Float

    val usingConvertsTo: Any
        get() = usingConvertsToHandle.invoke(handle) as Any

    val effects: Any
        get() = effectsHandle.invoke(handle) as Any

    fun copy(nutrition: Int = this.nutrition, saturation: Float = this.saturation, canAlwaysEat: Boolean = this.canAlwaysEat, eatSeconds: Float = this.eatSeconds, usingConvertsTo: Any = this.usingConvertsTo, effects: Any = this.effects): WrapperFoodProperties {
        return WrapperFoodProperties(constructorHandle.invoke(nutrition, saturation, canAlwaysEat, eatSeconds, usingConvertsTo, effects))
    }

}
