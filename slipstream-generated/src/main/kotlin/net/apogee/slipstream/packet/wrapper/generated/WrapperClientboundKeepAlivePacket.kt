package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundKeepAlivePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundKeepAlivePacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
    }

    val id: Long
        get() = getIdHandle.invoke(handle) as Long

}

fun Any.isClientboundKeepAlivePacket(): Boolean = WrapperClientboundKeepAlivePacket.packetClass.isInstance(this)
fun Any.asClientboundKeepAlivePacket(): WrapperClientboundKeepAlivePacket = WrapperClientboundKeepAlivePacket(this)
