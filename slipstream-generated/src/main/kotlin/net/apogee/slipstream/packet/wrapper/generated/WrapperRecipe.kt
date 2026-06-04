package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRecipe(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.crafting.Recipe") }
        private val lookup = MethodHandles.lookup()

        val matchesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "matches", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.crafting.RecipeInput"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.item.crafting.RecipeType")))
        }
        val getIngredientsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIngredients", MethodType.methodType(Class.forName("net.minecraft.core.NonNullList")))
        }
        val getSerializerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSerializer", MethodType.methodType(Class.forName("net.minecraft.world.item.crafting.RecipeSerializer")))
        }
        val isSpecialHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSpecial", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val assembleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "assemble", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.crafting.RecipeInput"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val hasExactIngredientsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasExactIngredients", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canCraftInDimensionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canCraftInDimensions", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getGroupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGroup", MethodType.methodType(String::class.java))
        }
        val showNotificationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "showNotification", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getToastSymbolHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getToastSymbol", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isIncompleteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isIncomplete", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val toBukkitRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toBukkitRecipe", MethodType.methodType(Class.forName("org.bukkit.inventory.Recipe"), Class.forName("org.bukkit.NamespacedKey")))
        }
        val getResultItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResultItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getRemainingItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemainingItems", MethodType.methodType(Class.forName("net.minecraft.core.NonNullList"), Class.forName("net.minecraft.world.item.crafting.RecipeInput")))
        }
    }

    fun matches(arg0: WrapperRecipeInput, arg1: WrapperLevel): Boolean {
        return matchesHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val type: Any
        get() = getTypeHandle.invoke(handle) as Any

    val ingredients: WrapperNonNullList
        get() = WrapperNonNullList(getIngredientsHandle.invoke(handle))

    val serializer: WrapperRecipeSerializer
        get() = WrapperRecipeSerializer(getSerializerHandle.invoke(handle))

    val special: Boolean
        get() = isSpecialHandle.invoke(handle) as Boolean

    fun assemble(arg0: WrapperRecipeInput, arg1: WrapperProvider): WrapperItemStack {
        return WrapperItemStack(assembleHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val exactIngredients: Boolean
        get() = hasExactIngredientsHandle.invoke(handle) as Boolean

    fun canCraftInDimensions(arg0: Int, arg1: Int): Boolean {
        return canCraftInDimensionsHandle.invoke(handle, arg0, arg1) as Boolean
    }

    val group: String
        get() = getGroupHandle.invoke(handle) as String

    val showNotification: Boolean
        get() = showNotificationHandle.invoke(handle) as Boolean

    val toastSymbol: WrapperItemStack
        get() = WrapperItemStack(getToastSymbolHandle.invoke(handle))

    val incomplete: Boolean
        get() = isIncompleteHandle.invoke(handle) as Boolean

    fun toBukkitRecipe(arg0: Any): Any {
        return toBukkitRecipeHandle.invoke(handle, arg0) as Any
    }

    fun getResultItem(arg0: WrapperProvider): WrapperItemStack {
        return WrapperItemStack(getResultItemHandle.invoke(handle, arg0.handle))
    }

    fun getRemainingItems(arg0: WrapperRecipeInput): WrapperNonNullList {
        return WrapperNonNullList(getRemainingItemsHandle.invoke(handle, arg0.handle))
    }

}
