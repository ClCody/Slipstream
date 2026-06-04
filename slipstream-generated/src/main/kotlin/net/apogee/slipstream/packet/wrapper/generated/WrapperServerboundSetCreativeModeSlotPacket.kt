package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSetCreativeModeSlotPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSetCreativeModeSlotPacket") }
        private val lookup = MethodHandles.lookup()

        val slotNumHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "slotNum", MethodType.methodType(Short::class.javaPrimitiveType!!))
        }
        val itemStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "itemStack", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Short::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
    }

    val slotNum: Short
        get() = slotNumHandle.invoke(handle) as Short

    val itemStack: WrapperItemStack
        get() = WrapperItemStack(itemStackHandle.invoke(handle))

    fun copy(slotNum: Short = this.slotNum, itemStack: WrapperItemStack = this.itemStack): WrapperServerboundSetCreativeModeSlotPacket {
        return WrapperServerboundSetCreativeModeSlotPacket(constructorHandle.invoke(slotNum, itemStack.handle))
    }

}
