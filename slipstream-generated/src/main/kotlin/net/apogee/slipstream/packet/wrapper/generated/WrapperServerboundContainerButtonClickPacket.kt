package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundContainerButtonClickPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundContainerButtonClickPacket") }
        private val lookup = MethodHandles.lookup()

        val containerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "containerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val buttonIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "buttonId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    val containerId: Int
        get() = containerIdHandle.invoke(handle) as Int

    val buttonId: Int
        get() = buttonIdHandle.invoke(handle) as Int

    fun copy(containerId: Int = this.containerId, buttonId: Int = this.buttonId): WrapperServerboundContainerButtonClickPacket {
        return WrapperServerboundContainerButtonClickPacket(constructorHandle.invoke(containerId, buttonId))
    }

}
