package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetBorderLerpSizePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderLerpSizePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getLerpTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getOldSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOldSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getNewSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val lerpTime: Long
        get() = getLerpTimeHandle.invoke(handle) as Long

    val oldSize: Double
        get() = getOldSizeHandle.invoke(handle) as Double

    val newSize: Double
        get() = getNewSizeHandle.invoke(handle) as Double

}
