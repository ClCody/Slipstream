package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRecipeBookSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.stats.RecipeBookSettings") }
        private val lookup = MethodHandles.lookup()

        val isOpenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOpen", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.inventory.RecipeBookType")))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.stats.RecipeBookSettings")))
        }
        val isFilteringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFiltering", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.inventory.RecipeBookType")))
        }
    }

    fun isOpen(arg0: Any): Boolean {
        return isOpenHandle.invoke(handle, arg0) as Boolean
    }

    val copy: WrapperRecipeBookSettings
        get() = WrapperRecipeBookSettings(copyHandle.invoke(handle))

    fun isFiltering(arg0: Any): Boolean {
        return isFilteringHandle.invoke(handle, arg0) as Boolean
    }

}
