package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundLoginDisconnectPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundLoginDisconnectPacket") }
        private val lookup = MethodHandles.lookup()

        val getReasonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getReason", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val reason: Any
        get() = getReasonHandle.invoke(handle) as Any

}

fun Any.isClientboundLoginDisconnectPacket(): Boolean = WrapperClientboundLoginDisconnectPacket.packetClass.isInstance(this)
fun Any.asClientboundLoginDisconnectPacket(): WrapperClientboundLoginDisconnectPacket = WrapperClientboundLoginDisconnectPacket(this)
