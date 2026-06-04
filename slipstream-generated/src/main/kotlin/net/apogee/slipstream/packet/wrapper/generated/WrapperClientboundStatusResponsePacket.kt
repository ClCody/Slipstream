package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundStatusResponsePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.status.ClientboundStatusResponsePacket") }
        private val lookup = MethodHandles.lookup()

        val statusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "status", MethodType.methodType(Class.forName("net.minecraft.network.protocol.status.ServerStatus")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.protocol.status.ServerStatus")))
        }
    }

    val status: WrapperServerStatus
        get() = WrapperServerStatus(statusHandle.invoke(handle))

    fun copy(status: WrapperServerStatus = this.status): WrapperClientboundStatusResponsePacket {
        return WrapperClientboundStatusResponsePacket(constructorHandle.invoke(status.handle))
    }

}
