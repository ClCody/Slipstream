package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundLevelChunkPacketData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData") }
        private val lookup = MethodHandles.lookup()

        val getBlockEntitiesTagsConsumerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntitiesTagsConsumer", MethodType.methodType(Class.forName("java.util.function.Consumer"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getHeightmapsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeightmaps", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getReadBufferHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getReadBuffer", MethodType.methodType(Class.forName("net.minecraft.network.FriendlyByteBuf")))
        }
        val getExtraPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExtraPackets", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    fun getBlockEntitiesTagsConsumer(arg0: Int, arg1: Int): Any {
        return getBlockEntitiesTagsConsumerHandle.invoke(handle, arg0, arg1) as Any
    }

    val heightmaps: WrapperCompoundTag
        get() = WrapperCompoundTag(getHeightmapsHandle.invoke(handle))

    val readBuffer: WrapperFriendlyByteBuf
        get() = WrapperFriendlyByteBuf(getReadBufferHandle.invoke(handle))

    val extraPackets: Any
        get() = getExtraPacketsHandle.invoke(handle) as Any

}
