package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundPaddleBoatPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPaddleBoatPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getLeftHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLeft", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRight", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val left: Boolean
        get() = getLeftHandle.invoke(handle) as Boolean

    val right: Boolean
        get() = getRightHandle.invoke(handle) as Boolean

}
