package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundContainerClosePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundContainerClosePacket") }
        private val lookup = MethodHandles.lookup()

        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isServerboundContainerClosePacket(): Boolean = WrapperServerboundContainerClosePacket.packetClass.isInstance(this)
fun Any.asServerboundContainerClosePacket(): WrapperServerboundContainerClosePacket = WrapperServerboundContainerClosePacket(this)
