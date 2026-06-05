package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundGameEventPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundGameEventPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getParamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParam", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEvent", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundGameEventPacket\$Type")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val param: Float
        get() = getParamHandle.invoke(handle) as Float

    val event: WrapperType
        get() = WrapperType(getEventHandle.invoke(handle))

}
