package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetBorderSizePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderSizePacket") }
        private val lookup = MethodHandles.lookup()

        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val size: Double
        get() = getSizeHandle.invoke(handle) as Double

}

fun Any.isClientboundSetBorderSizePacket(): Boolean = WrapperClientboundSetBorderSizePacket.packetClass.isInstance(this)
fun Any.asClientboundSetBorderSizePacket(): WrapperClientboundSetBorderSizePacket = WrapperClientboundSetBorderSizePacket(this)
