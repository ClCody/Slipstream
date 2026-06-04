package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAdvancementRewards(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.AdvancementRewards") }
        private val lookup = MethodHandles.lookup()

        val experienceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "experience", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val lootHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "loot", MethodType.methodType(Class.forName("java.util.List")))
        }
        val recipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "recipes", MethodType.methodType(Class.forName("java.util.List")))
        }
        val functionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "function", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("java.util.List"), Class.forName("java.util.List"), Class.forName("java.util.Optional")))
        }
    }

    val experience: Int
        get() = experienceHandle.invoke(handle) as Int

    val loot: Any
        get() = lootHandle.invoke(handle) as Any

    val recipes: Any
        get() = recipesHandle.invoke(handle) as Any

    val function: Any
        get() = functionHandle.invoke(handle) as Any

    fun copy(experience: Int = this.experience, loot: Any = this.loot, recipes: Any = this.recipes, function: Any = this.function): WrapperAdvancementRewards {
        return WrapperAdvancementRewards(constructorHandle.invoke(experience, loot, recipes, function))
    }

}
