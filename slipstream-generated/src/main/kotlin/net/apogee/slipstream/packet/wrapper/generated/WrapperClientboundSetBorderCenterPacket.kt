package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetBorderCenterPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderCenterPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getNewCenterXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewCenterZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewCenterZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val newCenterX: Double
        get() = getNewCenterXHandle.invoke(handle) as Double

    val newCenterZ: Double
        get() = getNewCenterZHandle.invoke(handle) as Double

}
