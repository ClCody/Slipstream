package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRecipeManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.crafting.RecipeManager") }
        private val lookup = MethodHandles.lookup()

        val byKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "byKey", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getRecipeForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeFor", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.item.crafting.RecipeType"), Class.forName("net.minecraft.world.item.crafting.RecipeInput"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.item.crafting.RecipeHolder")))
        }
        val getRecipeIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeIds", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val removeRecipeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeRecipe", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getRecipesForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipesFor", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.item.crafting.RecipeType"), Class.forName("net.minecraft.world.item.crafting.RecipeInput"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getRemainingItemsForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemainingItemsFor", MethodType.methodType(Class.forName("net.minecraft.core.NonNullList"), Class.forName("net.minecraft.world.item.crafting.RecipeType"), Class.forName("net.minecraft.world.item.crafting.RecipeInput"), Class.forName("net.minecraft.world.level.Level")))
        }
        val hadErrorsLoadingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hadErrorsLoading", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getOrderedRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrderedRecipes", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getAllRecipesForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllRecipesFor", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.item.crafting.RecipeType")))
        }
        val getRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipes", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val byTypeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("byType")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val byNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("byName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasErrorsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasErrors")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun byKey(arg0: WrapperResourceLocation): Any {
        return byKeyHandle.invoke(handle, arg0.handle) as Any
    }

    fun getRecipeFor(arg0: Any, arg1: WrapperRecipeInput, arg2: WrapperLevel, arg3: WrapperRecipeHolder): Any {
        return getRecipeForHandle.invoke(handle, arg0, arg1.handle, arg2.handle, arg3.handle) as Any
    }

    val recipeIds: Any
        get() = getRecipeIdsHandle.invoke(handle) as Any

    fun removeRecipe(arg0: WrapperResourceLocation): Boolean {
        return removeRecipeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getRecipesFor(arg0: Any, arg1: WrapperRecipeInput, arg2: WrapperLevel): Any {
        return getRecipesForHandle.invoke(handle, arg0, arg1.handle, arg2.handle) as Any
    }

    fun getRemainingItemsFor(arg0: Any, arg1: WrapperRecipeInput, arg2: WrapperLevel): WrapperNonNullList {
        return WrapperNonNullList(getRemainingItemsForHandle.invoke(handle, arg0, arg1.handle, arg2.handle))
    }

    val hadErrorsLoading: Boolean
        get() = hadErrorsLoadingHandle.invoke(handle) as Boolean

    val orderedRecipes: Any
        get() = getOrderedRecipesHandle.invoke(handle) as Any

    fun getAllRecipesFor(arg0: Any): Any {
        return getAllRecipesForHandle.invoke(handle, arg0) as Any
    }

    val recipes: Any
        get() = getRecipesHandle.invoke(handle) as Any

    fun setByType(value: Any) {
        byTypeSetterHandle.invoke(handle, value)
    }

    fun setByName(value: Any) {
        byNameSetterHandle.invoke(handle, value)
    }

    fun setHasErrors(value: Boolean) {
        hasErrorsSetterHandle.invoke(handle, value)
    }

}
