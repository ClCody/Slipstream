package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetPassengersPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetPassengersPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengers", MethodType.methodType(IntArray::class.java))
        }
        val getVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVehicle", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val passengers: IntArray
        get() = getPassengersHandle.invoke(handle) as IntArray

    val vehicle: Int
        get() = getVehicleHandle.invoke(handle) as Int

}
