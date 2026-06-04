package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundLevelChunkWithLightPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getExtraPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExtraPackets", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getChunkDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkData", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData")))
        }
        val getLightDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightData", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData")))
        }
        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isReadyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReady", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val readySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ready")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val extraPackets: Any
        get() = getExtraPacketsHandle.invoke(handle) as Any

    val chunkData: WrapperClientboundLevelChunkPacketData
        get() = WrapperClientboundLevelChunkPacketData(getChunkDataHandle.invoke(handle))

    val lightData: WrapperClientboundLightUpdatePacketData
        get() = WrapperClientboundLightUpdatePacketData(getLightDataHandle.invoke(handle))

    val z: Int
        get() = getZHandle.invoke(handle) as Int

    val x: Int
        get() = getXHandle.invoke(handle) as Int

    val ready: Boolean
        get() = isReadyHandle.invoke(handle) as Boolean

    fun setReady(value: Boolean) {
        readySetterHandle.invoke(handle, value)
    }

}
