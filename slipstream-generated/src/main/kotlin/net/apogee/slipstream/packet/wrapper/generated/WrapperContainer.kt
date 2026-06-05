package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperContainer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.Container") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocation", MethodType.methodType(Class.forName("org.bukkit.Location")))
        }
        val getOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwner", MethodType.methodType(Class.forName("org.bukkit.inventory.InventoryHolder")))
        }
        val getContentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContents", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val stillValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stillValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getViewersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getViewers", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getContainerSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val removeItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getMaxStackSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxStackSize", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val canPlaceItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canPlaceItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val hasAnyMatchingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasAnyMatching", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
        val countItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "countItem", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.Item")))
        }
        val hasAnyOfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasAnyOf", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Set")))
        }
        val removeItemNoUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeItemNoUpdate", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val canTakeItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canTakeItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.Container"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val location: Any
        get() = getLocationHandle.invoke(handle) as Any

    val owner: Any
        get() = getOwnerHandle.invoke(handle) as Any

    val contents: Any
        get() = getContentsHandle.invoke(handle) as Any

    fun getItem(arg0: Int): WrapperItemStack {
        return WrapperItemStack(getItemHandle.invoke(handle, arg0))
    }

    fun stillValid(arg0: WrapperPlayer): Boolean {
        return stillValidHandle.invoke(handle, arg0.handle) as Boolean
    }

    val viewers: Any
        get() = getViewersHandle.invoke(handle) as Any

    val containerSize: Int
        get() = getContainerSizeHandle.invoke(handle) as Int

    fun removeItem(arg0: Int, arg1: Int): WrapperItemStack {
        return WrapperItemStack(removeItemHandle.invoke(handle, arg0, arg1))
    }

    fun getMaxStackSize(arg0: WrapperItemStack): Int {
        return getMaxStackSizeHandle.invoke(handle, arg0.handle) as Int
    }

    fun canPlaceItem(arg0: Int, arg1: WrapperItemStack): Boolean {
        return canPlaceItemHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun hasAnyMatching(arg0: Any): Boolean {
        return hasAnyMatchingHandle.invoke(handle, arg0) as Boolean
    }

    fun countItem(arg0: WrapperItem): Int {
        return countItemHandle.invoke(handle, arg0.handle) as Int
    }

    fun hasAnyOf(arg0: Any): Boolean {
        return hasAnyOfHandle.invoke(handle, arg0) as Boolean
    }

    fun removeItemNoUpdate(arg0: Int): WrapperItemStack {
        return WrapperItemStack(removeItemNoUpdateHandle.invoke(handle, arg0))
    }

    fun canTakeItem(arg0: WrapperContainer, arg1: Int, arg2: WrapperItemStack): Boolean {
        return canTakeItemHandle.invoke(handle, arg0.handle, arg1, arg2.handle) as Boolean
    }

}
