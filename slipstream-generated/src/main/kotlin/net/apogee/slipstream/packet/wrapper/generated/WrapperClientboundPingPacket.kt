package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPingPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundPingPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

}

fun Any.isClientboundPingPacket(): Boolean = WrapperClientboundPingPacket.packetClass.isInstance(this)
fun Any.asClientboundPingPacket(): WrapperClientboundPingPacket = WrapperClientboundPingPacket(this)
