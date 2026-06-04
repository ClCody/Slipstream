package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundContainerSetContentPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket") }
        private val lookup = MethodHandles.lookup()

        val hasLargePacketFallbackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLargePacketFallback", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCarriedItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCarriedItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItems", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getStateIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val largePacketFallback: Boolean
        get() = hasLargePacketFallbackHandle.invoke(handle) as Boolean

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

    val carriedItem: Any
        get() = getCarriedItemHandle.invoke(handle) as Any

    val items: Any
        get() = getItemsHandle.invoke(handle) as Any

    val stateId: Int
        get() = getStateIdHandle.invoke(handle) as Int

}

fun Any.isClientboundContainerSetContentPacket(): Boolean = WrapperClientboundContainerSetContentPacket.packetClass.isInstance(this)
fun Any.asClientboundContainerSetContentPacket(): WrapperClientboundContainerSetContentPacket = WrapperClientboundContainerSetContentPacket(this)
