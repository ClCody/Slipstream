package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetSimulationDistancePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetSimulationDistancePacket") }
        private val lookup = MethodHandles.lookup()

        val simulationDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "simulationDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!))
        }
    }

    val simulationDistance: Int
        get() = simulationDistanceHandle.invoke(handle) as Int

    fun copy(simulationDistance: Int = this.simulationDistance): WrapperClientboundSetSimulationDistancePacket {
        return WrapperClientboundSetSimulationDistancePacket(constructorHandle.invoke(simulationDistance))
    }

}
