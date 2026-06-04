package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundStartConfigurationPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundStartConfigurationPacket") }
        private val lookup = MethodHandles.lookup()

        val isTerminalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTerminal", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val terminal: Boolean
        get() = isTerminalHandle.invoke(handle) as Boolean

}

fun Any.isClientboundStartConfigurationPacket(): Boolean = WrapperClientboundStartConfigurationPacket.packetClass.isInstance(this)
fun Any.asClientboundStartConfigurationPacket(): WrapperClientboundStartConfigurationPacket = WrapperClientboundStartConfigurationPacket(this)
