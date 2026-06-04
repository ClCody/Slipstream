package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetEntityMotionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getZaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZa", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXa", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getYaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYa", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val za: Double
        get() = getZaHandle.invoke(handle) as Double

    val xa: Double
        get() = getXaHandle.invoke(handle) as Double

    val ya: Double
        get() = getYaHandle.invoke(handle) as Double

}

fun Any.isClientboundSetEntityMotionPacket(): Boolean = WrapperClientboundSetEntityMotionPacket.packetClass.isInstance(this)
fun Any.asClientboundSetEntityMotionPacket(): WrapperClientboundSetEntityMotionPacket = WrapperClientboundSetEntityMotionPacket(this)
