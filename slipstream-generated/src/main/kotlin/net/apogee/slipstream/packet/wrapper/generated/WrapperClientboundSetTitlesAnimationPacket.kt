package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetTitlesAnimationPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getFadeInHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFadeIn", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getFadeOutHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFadeOut", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getStayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStay", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val fadeIn: Int
        get() = getFadeInHandle.invoke(handle) as Int

    val fadeOut: Int
        get() = getFadeOutHandle.invoke(handle) as Int

    val stay: Int
        get() = getStayHandle.invoke(handle) as Int

}
