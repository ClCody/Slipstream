package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundTickingStepPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTickingStepPacket") }
        private val lookup = MethodHandles.lookup()

        val tickStepsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickSteps", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!))
        }
    }

    val tickSteps: Int
        get() = tickStepsHandle.invoke(handle) as Int

    fun copy(tickSteps: Int = this.tickSteps): WrapperClientboundTickingStepPacket {
        return WrapperClientboundTickingStepPacket(constructorHandle.invoke(tickSteps))
    }

}
