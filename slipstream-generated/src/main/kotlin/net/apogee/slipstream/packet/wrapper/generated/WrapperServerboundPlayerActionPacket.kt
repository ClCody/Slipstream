package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundPlayerActionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerActionPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerActionPacket\$Action")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getSequenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSequence", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val action: Any
        get() = getActionHandle.invoke(handle) as Any

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(getPosHandle.invoke(handle))

    val direction: Any
        get() = getDirectionHandle.invoke(handle) as Any

    val sequence: Int
        get() = getSequenceHandle.invoke(handle) as Int

}
