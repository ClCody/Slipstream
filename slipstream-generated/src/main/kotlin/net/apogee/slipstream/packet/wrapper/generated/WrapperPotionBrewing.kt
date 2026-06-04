package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPotionBrewing(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.alchemy.PotionBrewing") }
        private val lookup = MethodHandles.lookup()

        val mixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mix", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val reloadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reload", MethodType.methodType(Class.forName("net.minecraft.world.item.alchemy.PotionBrewing"), Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val hasMixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasMix", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isIngredientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isIngredient", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isPotionIngredientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPotionIngredient", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isCustomIngredientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCustomIngredient", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isBrewablePotionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBrewablePotion", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val hasContainerMixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasContainerMix", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val hasPotionMixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPotionMix", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val removePotionMixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removePotionMix", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("org.bukkit.NamespacedKey")))
        }
        val isCustomInputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCustomInput", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isContainerIngredientHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isContainerIngredient", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
    }

    fun mix(arg0: WrapperItemStack, arg1: WrapperItemStack): WrapperItemStack {
        return WrapperItemStack(mixHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun reload(arg0: WrapperFeatureFlagSet): WrapperPotionBrewing {
        return WrapperPotionBrewing(reloadHandle.invoke(handle, arg0.handle))
    }

    fun hasMix(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return hasMixHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun isIngredient(arg0: WrapperItemStack): Boolean {
        return isIngredientHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isPotionIngredient(arg0: WrapperItemStack): Boolean {
        return isPotionIngredientHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isCustomIngredient(arg0: WrapperItemStack): Boolean {
        return isCustomIngredientHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isBrewablePotion(arg0: WrapperHolder): Boolean {
        return isBrewablePotionHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun hasContainerMix(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return hasContainerMixHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun hasPotionMix(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return hasPotionMixHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun removePotionMix(arg0: Any): Boolean {
        return removePotionMixHandle.invoke(handle, arg0) as Boolean
    }

    fun isCustomInput(arg0: WrapperItemStack): Boolean {
        return isCustomInputHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isContainerIngredient(arg0: WrapperItemStack): Boolean {
        return isContainerIngredientHandle.invoke(handle, arg0.handle) as Boolean
    }

}
