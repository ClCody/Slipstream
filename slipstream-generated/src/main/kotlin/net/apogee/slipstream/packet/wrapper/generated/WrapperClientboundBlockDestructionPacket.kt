package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundBlockDestructionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProgress", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val progress: Int
        get() = getProgressHandle.invoke(handle) as Int

}

fun Any.isClientboundBlockDestructionPacket(): Boolean = WrapperClientboundBlockDestructionPacket.packetClass.isInstance(this)
fun Any.asClientboundBlockDestructionPacket(): WrapperClientboundBlockDestructionPacket = WrapperClientboundBlockDestructionPacket(this)
