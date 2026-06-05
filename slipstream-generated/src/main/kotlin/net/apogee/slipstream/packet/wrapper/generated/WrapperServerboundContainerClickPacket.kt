package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundContainerClickPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundContainerClickPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getClickTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClickType", MethodType.methodType(Class.forName("net.minecraft.world.inventory.ClickType")))
        }
        val getButtonNumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getButtonNum", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getChangedSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChangedSlots", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.ints.Int2ObjectMap")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCarriedItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCarriedItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getStateIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSlotNumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlotNum", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val clickType: Any
        get() = getClickTypeHandle.invoke(handle) as Any

    val buttonNum: Int
        get() = getButtonNumHandle.invoke(handle) as Int

    val changedSlots: Any
        get() = getChangedSlotsHandle.invoke(handle) as Any

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

    val carriedItem: WrapperItemStack
        get() = WrapperItemStack(getCarriedItemHandle.invoke(handle))

    val stateId: Int
        get() = getStateIdHandle.invoke(handle) as Int

    val slotNum: Int
        get() = getSlotNumHandle.invoke(handle) as Int

}
