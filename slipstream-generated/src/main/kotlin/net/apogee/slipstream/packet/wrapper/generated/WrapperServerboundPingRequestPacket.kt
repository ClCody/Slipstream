package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPingRequestPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.ping.ServerboundPingRequestPacket") }
        private val lookup = MethodHandles.lookup()

        val getTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
    }

    val time: Long
        get() = getTimeHandle.invoke(handle) as Long

}

fun Any.isServerboundPingRequestPacket(): Boolean = WrapperServerboundPingRequestPacket.packetClass.isInstance(this)
fun Any.asServerboundPingRequestPacket(): WrapperServerboundPingRequestPacket = WrapperServerboundPingRequestPacket(this)
