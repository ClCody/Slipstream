package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetBorderLerpSizePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderLerpSizePacket") }
        private val lookup = MethodHandles.lookup()

        val getNewSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNewSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getOldSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOldSize", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getLerpTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLerpTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
    }

    val newSize: Double
        get() = getNewSizeHandle.invoke(handle) as Double

    val oldSize: Double
        get() = getOldSizeHandle.invoke(handle) as Double

    val lerpTime: Long
        get() = getLerpTimeHandle.invoke(handle) as Long

}

fun Any.isClientboundSetBorderLerpSizePacket(): Boolean = WrapperClientboundSetBorderLerpSizePacket.packetClass.isInstance(this)
fun Any.asClientboundSetBorderLerpSizePacket(): WrapperClientboundSetBorderLerpSizePacket = WrapperClientboundSetBorderLerpSizePacket(this)
