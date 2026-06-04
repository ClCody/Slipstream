package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundLightUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLightUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getLightDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightData", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData")))
        }
        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val lightData: WrapperClientboundLightUpdatePacketData
        get() = WrapperClientboundLightUpdatePacketData(getLightDataHandle.invoke(handle))

    val z: Int
        get() = getZHandle.invoke(handle) as Int

    val x: Int
        get() = getXHandle.invoke(handle) as Int

}
