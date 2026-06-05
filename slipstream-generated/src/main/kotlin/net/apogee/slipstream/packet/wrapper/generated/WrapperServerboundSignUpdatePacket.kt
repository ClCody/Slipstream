package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSignUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSignUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val isFrontTextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFrontText", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getLinesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLines", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val frontText: Boolean
        get() = isFrontTextHandle.invoke(handle) as Boolean

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(getPosHandle.invoke(handle))

    val lines: Any
        get() = getLinesHandle.invoke(handle) as Any

}
