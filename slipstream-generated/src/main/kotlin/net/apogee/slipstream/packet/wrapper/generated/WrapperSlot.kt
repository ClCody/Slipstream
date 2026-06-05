package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSlot(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.inventory.Slot") }
        private val lookup = MethodHandles.lookup()

        val removeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "remove", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val isActiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isActive", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val mayPickupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayPickup", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val safeTakeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "safeTake", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val safeInsertHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "safeInsert", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val isFakeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFake", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val mayPlaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayPlace", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val tryRemoveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryRemove", MethodType.methodType(Class.forName("java.util.Optional"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getMaxStackSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxStackSize", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isHighlightableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHighlightable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getContainerSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerSlot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val allowModificationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "allowModification", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getNoItemIconHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoItemIcon", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Pair")))
        }
        val hasItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val indexSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("index")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun remove(arg0: Int): WrapperItemStack {
        return WrapperItemStack(removeHandle.invoke(handle, arg0))
    }

    val active: Boolean
        get() = isActiveHandle.invoke(handle) as Boolean

    val item: WrapperItemStack
        get() = WrapperItemStack(getItemHandle.invoke(handle))

    fun mayPickup(arg0: WrapperPlayer): Boolean {
        return mayPickupHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun safeTake(arg0: Int, arg1: Int, arg2: WrapperPlayer): WrapperItemStack {
        return WrapperItemStack(safeTakeHandle.invoke(handle, arg0, arg1, arg2.handle))
    }

    fun safeInsert(arg0: WrapperItemStack, arg1: Int): WrapperItemStack {
        return WrapperItemStack(safeInsertHandle.invoke(handle, arg0.handle, arg1))
    }

    val fake: Boolean
        get() = isFakeHandle.invoke(handle) as Boolean

    fun mayPlace(arg0: WrapperItemStack): Boolean {
        return mayPlaceHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun tryRemove(arg0: Int, arg1: Int, arg2: WrapperPlayer): Any {
        return tryRemoveHandle.invoke(handle, arg0, arg1, arg2.handle) as Any
    }

    fun getMaxStackSize(arg0: WrapperItemStack): Int {
        return getMaxStackSizeHandle.invoke(handle, arg0.handle) as Int
    }

    val highlightable: Boolean
        get() = isHighlightableHandle.invoke(handle) as Boolean

    val containerSlot: Int
        get() = getContainerSlotHandle.invoke(handle) as Int

    fun allowModification(arg0: WrapperPlayer): Boolean {
        return allowModificationHandle.invoke(handle, arg0.handle) as Boolean
    }

    val noItemIcon: Any
        get() = getNoItemIconHandle.invoke(handle) as Any

    val hasItem: Boolean
        get() = hasItemHandle.invoke(handle) as Boolean

    fun setIndex(value: Int) {
        indexSetterHandle.invoke(handle, value)
    }

}
