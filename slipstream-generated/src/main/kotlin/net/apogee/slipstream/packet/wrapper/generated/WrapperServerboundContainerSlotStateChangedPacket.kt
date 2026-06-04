package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundContainerSlotStateChangedPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundContainerSlotStateChangedPacket") }
        private val lookup = MethodHandles.lookup()

        val slotIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "slotId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val containerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "containerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val newStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "newState", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
    }

    val slotId: Int
        get() = slotIdHandle.invoke(handle) as Int

    val containerId: Int
        get() = containerIdHandle.invoke(handle) as Int

    val newState: Boolean
        get() = newStateHandle.invoke(handle) as Boolean

    fun copy(slotId: Int = this.slotId, containerId: Int = this.containerId, newState: Boolean = this.newState): WrapperServerboundContainerSlotStateChangedPacket {
        return WrapperServerboundContainerSlotStateChangedPacket(constructorHandle.invoke(slotId, containerId, newState))
    }

}
