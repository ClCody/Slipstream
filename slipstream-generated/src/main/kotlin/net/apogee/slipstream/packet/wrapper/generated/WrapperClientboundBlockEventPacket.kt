package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundBlockEventPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundBlockEventPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getB0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getB0", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getB1Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getB1", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.block.Block")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val b0: Int
        get() = getB0Handle.invoke(handle) as Int

    val b1: Int
        get() = getB1Handle.invoke(handle) as Int

    val block: WrapperBlock
        get() = WrapperBlock(getBlockHandle.invoke(handle))

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(getPosHandle.invoke(handle))

}
