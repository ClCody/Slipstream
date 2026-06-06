package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundContainerSetContentPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCarriedItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCarriedItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val packetTooLargeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packetTooLarge", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.Connection")))
        }
        val hasLargePacketFallbackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLargePacketFallback", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getStateIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItems", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

    val carriedItem: WrapperItemStack
        get() = WrapperItemStack(getCarriedItemHandle.invoke(handle))

    fun packetTooLarge(arg0: WrapperConnection): Boolean {
        return packetTooLargeHandle.invoke(handle, arg0.handle) as Boolean
    }

    val largePacketFallback: Boolean
        get() = hasLargePacketFallbackHandle.invoke(handle) as Boolean

    val stateId: Int
        get() = getStateIdHandle.invoke(handle) as Int

    val items: Any
        get() = getItemsHandle.invoke(handle) as Any

}
