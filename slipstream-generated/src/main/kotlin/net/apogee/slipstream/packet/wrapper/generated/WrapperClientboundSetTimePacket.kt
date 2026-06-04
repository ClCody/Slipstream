package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetTimePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetTimePacket") }
        private val lookup = MethodHandles.lookup()

        val getDayTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDayTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getGameTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
    }

    val dayTime: Long
        get() = getDayTimeHandle.invoke(handle) as Long

    val gameTime: Long
        get() = getGameTimeHandle.invoke(handle) as Long

}

fun Any.isClientboundSetTimePacket(): Boolean = WrapperClientboundSetTimePacket.packetClass.isInstance(this)
fun Any.asClientboundSetTimePacket(): WrapperClientboundSetTimePacket = WrapperClientboundSetTimePacket(this)
