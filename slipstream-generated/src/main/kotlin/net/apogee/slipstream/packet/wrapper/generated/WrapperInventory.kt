package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperInventory(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.player.Inventory") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val addHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "add", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val getLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocation", MethodType.methodType(Class.forName("org.bukkit.Location")))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag"), Class.forName("net.minecraft.nbt.ListTag")))
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
        val canHoldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canHold", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val removeItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getDestroySpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDestroySpeed", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getMaxStackSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxStackSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val findSlotMatchingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findSlotMatchingItem", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val findSlotMatchingUnusedItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findSlotMatchingUnusedItem", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getSlotWithRemainingSpaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlotWithRemainingSpace", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getSuitableHotbarSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSuitableHotbarSlot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val clearOrCountMatchingItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clearOrCountMatchingItems", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.Container")))
        }
        val getTimesChangedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTimesChanged", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getArmorContentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmorContents", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getFreeSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFreeSlot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getArmorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmor", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val getSelectedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelected", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val removeFromSelectedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeFromSelected", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Boolean::class.javaPrimitiveType!!))
        }
        val removeItemNoUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeItemNoUpdate", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val selectedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("selected")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val timesChangedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("timesChanged")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val transactionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("transaction")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxStackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxStack")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: WrapperComponent
        get() = WrapperComponent(getNameHandle.invoke(handle))

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun add(arg0: Int, arg1: WrapperItemStack): Boolean {
        return addHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun contains(arg0: WrapperTagKey): Boolean {
        return containsHandle.invoke(handle, arg0.handle) as Boolean
    }

    val location: Any
        get() = getLocationHandle.invoke(handle) as Any

    fun save(arg0: WrapperListTag): WrapperListTag {
        return WrapperListTag(saveHandle.invoke(handle, arg0.handle))
    }

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

    fun canHold(arg0: WrapperItemStack): Int {
        return canHoldHandle.invoke(handle, arg0.handle) as Int
    }

    fun removeItem(arg0: Int, arg1: Int): WrapperItemStack {
        return WrapperItemStack(removeItemHandle.invoke(handle, arg0, arg1))
    }

    fun getDestroySpeed(arg0: WrapperBlockState): Float {
        return getDestroySpeedHandle.invoke(handle, arg0.handle) as Float
    }

    val maxStackSize: Int
        get() = getMaxStackSizeHandle.invoke(handle) as Int

    fun findSlotMatchingItem(arg0: WrapperItemStack): Int {
        return findSlotMatchingItemHandle.invoke(handle, arg0.handle) as Int
    }

    fun findSlotMatchingUnusedItem(arg0: WrapperItemStack): Int {
        return findSlotMatchingUnusedItemHandle.invoke(handle, arg0.handle) as Int
    }

    fun getSlotWithRemainingSpace(arg0: WrapperItemStack): Int {
        return getSlotWithRemainingSpaceHandle.invoke(handle, arg0.handle) as Int
    }

    val suitableHotbarSlot: Int
        get() = getSuitableHotbarSlotHandle.invoke(handle) as Int

    fun clearOrCountMatchingItems(arg0: Any, arg1: Int, arg2: WrapperContainer): Int {
        return clearOrCountMatchingItemsHandle.invoke(handle, arg0, arg1, arg2.handle) as Int
    }

    val timesChanged: Int
        get() = getTimesChangedHandle.invoke(handle) as Int

    val armorContents: Any
        get() = getArmorContentsHandle.invoke(handle) as Any

    val freeSlot: Int
        get() = getFreeSlotHandle.invoke(handle) as Int

    fun getArmor(arg0: Int): WrapperItemStack {
        return WrapperItemStack(getArmorHandle.invoke(handle, arg0))
    }

    val selected: WrapperItemStack
        get() = WrapperItemStack(getSelectedHandle.invoke(handle))

    fun removeFromSelected(arg0: Boolean): WrapperItemStack {
        return WrapperItemStack(removeFromSelectedHandle.invoke(handle, arg0))
    }

    fun removeItemNoUpdate(arg0: Int): WrapperItemStack {
        return WrapperItemStack(removeItemNoUpdateHandle.invoke(handle, arg0))
    }

    fun setSelected(value: Int) {
        selectedSetterHandle.invoke(handle, value)
    }

    fun setTimesChanged(value: Int) {
        timesChangedSetterHandle.invoke(handle, value)
    }

    fun setTransaction(value: Any) {
        transactionSetterHandle.invoke(handle, value)
    }

    fun setMaxStack(value: Int) {
        maxStackSetterHandle.invoke(handle, value)
    }

}
