package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundContainerSetSlotPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket") }
        private val lookup = MethodHandles.lookup()

        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getStateIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val slot: Int
        get() = getSlotHandle.invoke(handle) as Int

    val item: Any
        get() = getItemHandle.invoke(handle) as Any

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

    val stateId: Int
        get() = getStateIdHandle.invoke(handle) as Int

}

fun Any.isClientboundContainerSetSlotPacket(): Boolean = WrapperClientboundContainerSetSlotPacket.packetClass.isInstance(this)
fun Any.asClientboundContainerSetSlotPacket(): WrapperClientboundContainerSetSlotPacket = WrapperClientboundContainerSetSlotPacket(this)
