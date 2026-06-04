package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPongResponsePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.ping.ClientboundPongResponsePacket") }
        private val lookup = MethodHandles.lookup()

        val timeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "time", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Long::class.javaPrimitiveType!!))
        }
    }

    val time: Long
        get() = timeHandle.invoke(handle) as Long

    fun copy(time: Long = this.time): WrapperClientboundPongResponsePacket {
        return WrapperClientboundPongResponsePacket(constructorHandle.invoke(time))
    }

}
