package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundTeleportEntityPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getyRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getyRot", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val isOnGroundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOnGround", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getxRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getxRot", MethodType.methodType(Byte::class.javaPrimitiveType!!))
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

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val yRot: Byte
        get() = getyRotHandle.invoke(handle) as Byte

    val onGround: Boolean
        get() = isOnGroundHandle.invoke(handle) as Boolean

    val xRot: Byte
        get() = getxRotHandle.invoke(handle) as Byte

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

}

fun Any.isClientboundTeleportEntityPacket(): Boolean = WrapperClientboundTeleportEntityPacket.packetClass.isInstance(this)
fun Any.asClientboundTeleportEntityPacket(): WrapperClientboundTeleportEntityPacket = WrapperClientboundTeleportEntityPacket(this)
