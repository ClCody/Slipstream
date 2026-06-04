package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundTickingStatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTickingStatePacket") }
        private val lookup = MethodHandles.lookup()

        val tickRateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickRate", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFrozen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
    }

    val tickRate: Float
        get() = tickRateHandle.invoke(handle) as Float

    val isFrozen: Boolean
        get() = isFrozenHandle.invoke(handle) as Boolean

    fun copy(tickRate: Float = this.tickRate, isFrozen: Boolean = this.isFrozen): WrapperClientboundTickingStatePacket {
        return WrapperClientboundTickingStatePacket(constructorHandle.invoke(tickRate, isFrozen))
    }

}
