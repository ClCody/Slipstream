package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetHealthPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetHealthPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getSaturationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSaturation", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getFoodHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFood", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHealthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHealth", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val saturation: Float
        get() = getSaturationHandle.invoke(handle) as Float

    val food: Int
        get() = getFoodHandle.invoke(handle) as Int

    val health: Float
        get() = getHealthHandle.invoke(handle) as Float

}
