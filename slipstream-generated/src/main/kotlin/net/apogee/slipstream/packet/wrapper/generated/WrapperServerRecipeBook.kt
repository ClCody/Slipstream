package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerRecipeBook(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.stats.ServerRecipeBook") }
        private val lookup = MethodHandles.lookup()

        val toNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toNbt", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val addRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addRecipes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val removeRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeRecipes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
    }

    val toNbt: WrapperCompoundTag
        get() = WrapperCompoundTag(toNbtHandle.invoke(handle))

    fun addRecipes(arg0: Any, arg1: WrapperServerPlayer): Int {
        return addRecipesHandle.invoke(handle, arg0, arg1.handle) as Int
    }

    fun removeRecipes(arg0: Any, arg1: WrapperServerPlayer): Int {
        return removeRecipesHandle.invoke(handle, arg0, arg1.handle) as Int
    }

}
