package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundKeepAlivePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ServerboundKeepAlivePacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
    }

    val id: Long
        get() = getIdHandle.invoke(handle) as Long

}

fun Any.isServerboundKeepAlivePacket(): Boolean = WrapperServerboundKeepAlivePacket.packetClass.isInstance(this)
fun Any.asServerboundKeepAlivePacket(): WrapperServerboundKeepAlivePacket = WrapperServerboundKeepAlivePacket(this)
