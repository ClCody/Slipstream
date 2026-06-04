package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundBlockUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
    }

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val blockState: Any
        get() = getBlockStateHandle.invoke(handle) as Any

}

fun Any.isClientboundBlockUpdatePacket(): Boolean = WrapperClientboundBlockUpdatePacket.packetClass.isInstance(this)
fun Any.asClientboundBlockUpdatePacket(): WrapperClientboundBlockUpdatePacket = WrapperClientboundBlockUpdatePacket(this)
