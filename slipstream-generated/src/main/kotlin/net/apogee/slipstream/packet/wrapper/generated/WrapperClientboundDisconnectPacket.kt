package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundDisconnectPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundDisconnectPacket") }
        private val lookup = MethodHandles.lookup()

        val reasonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reason", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val reason: WrapperComponent
        get() = WrapperComponent(reasonHandle.invoke(handle))

    fun copy(reason: WrapperComponent = this.reason): WrapperClientboundDisconnectPacket {
        return WrapperClientboundDisconnectPacket(constructorHandle.invoke(reason.handle))
    }

}
