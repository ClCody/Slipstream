package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRecipeHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.crafting.RecipeHolder") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Class.forName("net.minecraft.world.item.crafting.Recipe")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceLocation"), Class.forName("net.minecraft.world.item.crafting.Recipe")))
        }
    }

    val id: WrapperResourceLocation
        get() = WrapperResourceLocation(idHandle.invoke(handle))

    val value: WrapperRecipe
        get() = WrapperRecipe(valueHandle.invoke(handle))

    fun copy(id: WrapperResourceLocation = this.id, value: WrapperRecipe = this.value): WrapperRecipeHolder {
        return WrapperRecipeHolder(constructorHandle.invoke(id.handle, value.handle))
    }

}
