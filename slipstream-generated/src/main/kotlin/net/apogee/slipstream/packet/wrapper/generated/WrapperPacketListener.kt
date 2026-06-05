package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPacketListener(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.PacketListener") }
        private val lookup = MethodHandles.lookup()

        val protocolHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "protocol", MethodType.methodType(Class.forName("net.minecraft.network.ConnectionProtocol")))
        }
        val shouldHandleMessageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldHandleMessage", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.protocol.Packet")))
        }
        val isAcceptingMessagesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAcceptingMessages", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val createDisconnectionInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createDisconnectionInfo", MethodType.methodType(Class.forName("net.minecraft.network.DisconnectionDetails"), Class.forName("net.minecraft.network.chat.Component"), Class.forName("java.lang.Throwable")))
        }
        val flowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "flow", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketFlow")))
        }
    }

    val protocol: Any
        get() = protocolHandle.invoke(handle) as Any

    fun shouldHandleMessage(arg0: WrapperPacket): Boolean {
        return shouldHandleMessageHandle.invoke(handle, arg0.handle) as Boolean
    }

    val acceptingMessages: Boolean
        get() = isAcceptingMessagesHandle.invoke(handle) as Boolean

    fun createDisconnectionInfo(arg0: WrapperComponent, arg1: Any): WrapperDisconnectionDetails {
        return WrapperDisconnectionDetails(createDisconnectionInfoHandle.invoke(handle, arg0.handle, arg1))
    }

    val flow: Any
        get() = flowHandle.invoke(handle) as Any

}
