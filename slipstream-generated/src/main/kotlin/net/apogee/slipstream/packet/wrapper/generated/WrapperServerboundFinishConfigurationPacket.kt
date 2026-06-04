package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundFinishConfigurationPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.configuration.ServerboundFinishConfigurationPacket") }
        private val lookup = MethodHandles.lookup()

        val isTerminalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTerminal", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val terminal: Boolean
        get() = isTerminalHandle.invoke(handle) as Boolean

}

fun Any.isServerboundFinishConfigurationPacket(): Boolean = WrapperServerboundFinishConfigurationPacket.packetClass.isInstance(this)
fun Any.asServerboundFinishConfigurationPacket(): WrapperServerboundFinishConfigurationPacket = WrapperServerboundFinishConfigurationPacket(this)
