package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSetCommandBlockPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSetCommandBlockPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val isAutomaticHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAutomatic", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getModeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMode", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.CommandBlockEntity\$Mode")))
        }
        val getCommandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommand", MethodType.methodType(String::class.java))
        }
        val isConditionalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isConditional", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isTrackOutputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTrackOutput", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val automatic: Boolean
        get() = isAutomaticHandle.invoke(handle) as Boolean

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(getPosHandle.invoke(handle))

    val mode: Any
        get() = getModeHandle.invoke(handle) as Any

    val command: String
        get() = getCommandHandle.invoke(handle) as String

    val conditional: Boolean
        get() = isConditionalHandle.invoke(handle) as Boolean

    val trackOutput: Boolean
        get() = isTrackOutputHandle.invoke(handle) as Boolean

}
