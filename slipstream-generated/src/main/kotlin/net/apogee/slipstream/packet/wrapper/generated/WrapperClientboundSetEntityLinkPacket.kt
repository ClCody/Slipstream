package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetEntityLinkPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetEntityLinkPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getSourceIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSourceId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDestIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDestId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val sourceId: Int
        get() = getSourceIdHandle.invoke(handle) as Int

    val destId: Int
        get() = getDestIdHandle.invoke(handle) as Int

}
