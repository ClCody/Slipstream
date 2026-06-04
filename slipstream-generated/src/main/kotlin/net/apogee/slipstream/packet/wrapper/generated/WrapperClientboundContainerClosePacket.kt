package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundContainerClosePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundContainerClosePacket") }
        private val lookup = MethodHandles.lookup()

        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isClientboundContainerClosePacket(): Boolean = WrapperClientboundContainerClosePacket.packetClass.isInstance(this)
fun Any.asClientboundContainerClosePacket(): WrapperClientboundContainerClosePacket = WrapperClientboundContainerClosePacket(this)
