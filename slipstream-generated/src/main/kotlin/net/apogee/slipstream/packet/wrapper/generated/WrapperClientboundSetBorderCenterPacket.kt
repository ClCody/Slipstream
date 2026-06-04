package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetBorderCenterPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderCenterPacket") }
        private val lookup = MethodHandles.lookup()

        val getNewCenterXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewCenterZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val newCenterX: Double
        get() = getNewCenterXHandle.invoke(handle) as Double

    val newCenterZ: Double
        get() = getNewCenterZHandle.invoke(handle) as Double

}

fun Any.isClientboundSetBorderCenterPacket(): Boolean = WrapperClientboundSetBorderCenterPacket.packetClass.isInstance(this)
fun Any.asClientboundSetBorderCenterPacket(): WrapperClientboundSetBorderCenterPacket = WrapperClientboundSetBorderCenterPacket(this)
