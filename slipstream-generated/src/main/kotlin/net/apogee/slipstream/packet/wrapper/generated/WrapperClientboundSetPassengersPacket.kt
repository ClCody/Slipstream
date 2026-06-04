package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetPassengersPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetPassengersPacket") }
        private val lookup = MethodHandles.lookup()

        val getVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVehicle", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengers", MethodType.methodType(IntArray::class.java))
        }
    }

    val vehicle: Int
        get() = getVehicleHandle.invoke(handle) as Int

    val passengers: IntArray
        get() = getPassengersHandle.invoke(handle) as IntArray

}

fun Any.isClientboundSetPassengersPacket(): Boolean = WrapperClientboundSetPassengersPacket.packetClass.isInstance(this)
fun Any.asClientboundSetPassengersPacket(): WrapperClientboundSetPassengersPacket = WrapperClientboundSetPassengersPacket(this)
