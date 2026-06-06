package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.Packet") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val isTerminalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTerminal", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isSkippableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSkippable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasFinishListenerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasFinishListener", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val packetTooLargeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packetTooLarge", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.Connection")))
        }
        val getExtraPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExtraPackets", MethodType.methodType(Class.forName("java.util.List")))
        }
        val hasLargePacketFallbackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLargePacketFallback", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isReadyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReady", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val terminal: Boolean
        get() = isTerminalHandle.invoke(handle) as Boolean

    val skippable: Boolean
        get() = isSkippableHandle.invoke(handle) as Boolean

    val finishListener: Boolean
        get() = hasFinishListenerHandle.invoke(handle) as Boolean

    fun packetTooLarge(arg0: WrapperConnection): Boolean {
        return packetTooLargeHandle.invoke(handle, arg0.handle) as Boolean
    }

    val extraPackets: Any
        get() = getExtraPacketsHandle.invoke(handle) as Any

    val largePacketFallback: Boolean
        get() = hasLargePacketFallbackHandle.invoke(handle) as Boolean

    val ready: Boolean
        get() = isReadyHandle.invoke(handle) as Boolean

}
