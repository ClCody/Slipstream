package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPlayerPositionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
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
        val getRelativeArgumentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRelativeArguments", MethodType.methodType(Class.forName("java.util.Set")))
        }
    }

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val xRot: Float
        get() = getXRotHandle.invoke(handle) as Float

    val yRot: Float
        get() = getYRotHandle.invoke(handle) as Float

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

    val relativeArguments: Any
        get() = getRelativeArgumentsHandle.invoke(handle) as Any

}

fun Any.isClientboundPlayerPositionPacket(): Boolean = WrapperClientboundPlayerPositionPacket.packetClass.isInstance(this)
fun Any.asClientboundPlayerPositionPacket(): WrapperClientboundPlayerPositionPacket = WrapperClientboundPlayerPositionPacket(this)
