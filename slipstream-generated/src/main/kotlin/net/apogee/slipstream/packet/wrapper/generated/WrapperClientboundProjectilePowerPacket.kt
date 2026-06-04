package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundProjectilePowerPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundProjectilePowerPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAccelerationPowerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAccelerationPower", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val accelerationPower: Double
        get() = getAccelerationPowerHandle.invoke(handle) as Double

}

fun Any.isClientboundProjectilePowerPacket(): Boolean = WrapperClientboundProjectilePowerPacket.packetClass.isInstance(this)
fun Any.asClientboundProjectilePowerPacket(): WrapperClientboundProjectilePowerPacket = WrapperClientboundProjectilePowerPacket(this)
