package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAbstractContainerMenu(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.inventory.AbstractContainerMenu") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.inventory.MenuType")))
        }
        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.inventory.Slot"), Int::class.javaPrimitiveType!!))
        }
        val canTakeItemForPickAllHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canTakeItemForPickAll", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.inventory.Slot")))
        }
        val stillValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stillValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val findSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findSlot", MethodType.methodType(Class.forName("java.util.OptionalInt"), Class.forName("net.minecraft.world.Container"), Int::class.javaPrimitiveType!!))
        }
        val getTitleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTitle", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val quickMoveStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "quickMoveStack", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.player.Player"), Int::class.javaPrimitiveType!!))
        }
        val incrementStateIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "incrementStateId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isValidSlotIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValidSlotIndex", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val clickMenuButtonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clickMenuButton", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player"), Int::class.javaPrimitiveType!!))
        }
        val getBukkitViewHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitView", MethodType.methodType(Class.forName("org.bukkit.inventory.InventoryView")))
        }
        val getCarriedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCarried", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val canDragToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canDragTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.inventory.Slot")))
        }
        val getStateIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItems", MethodType.methodType(Class.forName("net.minecraft.core.NonNullList")))
        }
        val lastSlotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSlots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val slotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("slots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dataSlotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dataSlots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val carriedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("carried")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val remoteSlotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("remoteSlots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val remoteDataSlotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("remoteDataSlots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val remoteCarriedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("remoteCarried")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val stateIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("stateId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val quickcraftTypeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("quickcraftType")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val quickcraftStatusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("quickcraftStatus")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val synchronizerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("synchronizer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val suppressRemoteUpdatesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("suppressRemoteUpdates")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val checkReachableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("checkReachable")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val titleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("title")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperMenuType
        get() = WrapperMenuType(getTypeHandle.invoke(handle))

    fun getSlot(arg0: Int): WrapperSlot {
        return WrapperSlot(getSlotHandle.invoke(handle, arg0))
    }

    fun canTakeItemForPickAll(arg0: WrapperItemStack, arg1: WrapperSlot): Boolean {
        return canTakeItemForPickAllHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun stillValid(arg0: WrapperPlayer): Boolean {
        return stillValidHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun findSlot(arg0: WrapperContainer, arg1: Int): Any {
        return findSlotHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    val title: WrapperComponent
        get() = WrapperComponent(getTitleHandle.invoke(handle))

    fun quickMoveStack(arg0: WrapperPlayer, arg1: Int): WrapperItemStack {
        return WrapperItemStack(quickMoveStackHandle.invoke(handle, arg0.handle, arg1))
    }

    val incrementStateId: Int
        get() = incrementStateIdHandle.invoke(handle) as Int

    fun isValidSlotIndex(arg0: Int): Boolean {
        return isValidSlotIndexHandle.invoke(handle, arg0) as Boolean
    }

    fun clickMenuButton(arg0: WrapperPlayer, arg1: Int): Boolean {
        return clickMenuButtonHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val bukkitView: Any
        get() = getBukkitViewHandle.invoke(handle) as Any

    val carried: WrapperItemStack
        get() = WrapperItemStack(getCarriedHandle.invoke(handle))

    fun canDragTo(arg0: WrapperSlot): Boolean {
        return canDragToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val stateId: Int
        get() = getStateIdHandle.invoke(handle) as Int

    val items: WrapperNonNullList
        get() = WrapperNonNullList(getItemsHandle.invoke(handle))

    fun setLastSlots(value: WrapperNonNullList) {
        lastSlotsSetterHandle.invoke(handle, value.handle)
    }

    fun setSlots(value: WrapperNonNullList) {
        slotsSetterHandle.invoke(handle, value.handle)
    }

    fun setDataSlots(value: Any) {
        dataSlotsSetterHandle.invoke(handle, value)
    }

    fun setCarried(value: WrapperItemStack) {
        carriedSetterHandle.invoke(handle, value.handle)
    }

    fun setRemoteSlots(value: WrapperNonNullList) {
        remoteSlotsSetterHandle.invoke(handle, value.handle)
    }

    fun setRemoteDataSlots(value: Any) {
        remoteDataSlotsSetterHandle.invoke(handle, value)
    }

    fun setRemoteCarried(value: WrapperItemStack) {
        remoteCarriedSetterHandle.invoke(handle, value.handle)
    }

    fun setStateId(value: Int) {
        stateIdSetterHandle.invoke(handle, value)
    }

    fun setQuickcraftType(value: Int) {
        quickcraftTypeSetterHandle.invoke(handle, value)
    }

    fun setQuickcraftStatus(value: Int) {
        quickcraftStatusSetterHandle.invoke(handle, value)
    }

    fun setSynchronizer(value: Any) {
        synchronizerSetterHandle.invoke(handle, value)
    }

    fun setSuppressRemoteUpdates(value: Boolean) {
        suppressRemoteUpdatesSetterHandle.invoke(handle, value)
    }

    fun setCheckReachable(value: Boolean) {
        checkReachableSetterHandle.invoke(handle, value)
    }

    fun setTitle(value: WrapperComponent) {
        titleSetterHandle.invoke(handle, value.handle)
    }

}
