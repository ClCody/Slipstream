package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundAnimatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundAnimatePacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val action: Int
        get() = getActionHandle.invoke(handle) as Int

}

fun Any.isClientboundAnimatePacket(): Boolean = WrapperClientboundAnimatePacket.packetClass.isInstance(this)
fun Any.asClientboundAnimatePacket(): WrapperClientboundAnimatePacket = WrapperClientboundAnimatePacket(this)
