package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundMoveVehiclePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundMoveVehiclePacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val xRot: Float
        get() = getXRotHandle.invoke(handle) as Float

    val yRot: Float
        get() = getYRotHandle.invoke(handle) as Float

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

}

fun Any.isClientboundMoveVehiclePacket(): Boolean = WrapperClientboundMoveVehiclePacket.packetClass.isInstance(this)
fun Any.asClientboundMoveVehiclePacket(): WrapperClientboundMoveVehiclePacket = WrapperClientboundMoveVehiclePacket(this)
