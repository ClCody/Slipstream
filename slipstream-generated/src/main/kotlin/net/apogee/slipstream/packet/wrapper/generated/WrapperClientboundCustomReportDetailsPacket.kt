package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCustomReportDetailsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundCustomReportDetailsPacket") }
        private val lookup = MethodHandles.lookup()

        val detailsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "details", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.Map")))
        }
    }

    val details: Any
        get() = detailsHandle.invoke(handle) as Any

    fun copy(details: Any = this.details): WrapperClientboundCustomReportDetailsPacket {
        return WrapperClientboundCustomReportDetailsPacket(constructorHandle.invoke(details))
    }

}
