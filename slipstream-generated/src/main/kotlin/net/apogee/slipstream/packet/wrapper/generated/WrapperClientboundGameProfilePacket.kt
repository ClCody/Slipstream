package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundGameProfilePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundGameProfilePacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isTerminalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTerminal", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

    val terminal: Boolean
        get() = isTerminalHandle.invoke(handle) as Boolean

}

fun Any.isClientboundGameProfilePacket(): Boolean = WrapperClientboundGameProfilePacket.packetClass.isInstance(this)
fun Any.asClientboundGameProfilePacket(): WrapperClientboundGameProfilePacket = WrapperClientboundGameProfilePacket(this)
