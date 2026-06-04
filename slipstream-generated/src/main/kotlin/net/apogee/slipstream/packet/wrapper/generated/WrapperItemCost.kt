package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemCost(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.trading.ItemCost") }
        private val lookup = MethodHandles.lookup()

        val itemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "item", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val countHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "count", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val componentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "components", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentPredicate")))
        }
        val itemStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "itemStack", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.component.DataComponentPredicate"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
    }

    val item: WrapperHolder
        get() = WrapperHolder(itemHandle.invoke(handle))

    val count: Int
        get() = countHandle.invoke(handle) as Int

    val components: WrapperDataComponentPredicate
        get() = WrapperDataComponentPredicate(componentsHandle.invoke(handle))

    val itemStack: WrapperItemStack
        get() = WrapperItemStack(itemStackHandle.invoke(handle))

    fun copy(item: WrapperHolder = this.item, count: Int = this.count, components: WrapperDataComponentPredicate = this.components, itemStack: WrapperItemStack = this.itemStack): WrapperItemCost {
        return WrapperItemCost(constructorHandle.invoke(item.handle, count, components.handle, itemStack.handle))
    }

}
