package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundBlockEntityTagQueryPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundBlockEntityTagQueryPacket") }
        private val lookup = MethodHandles.lookup()

        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getTransactionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTransactionId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val transactionId: Int
        get() = getTransactionIdHandle.invoke(handle) as Int

}

fun Any.isServerboundBlockEntityTagQueryPacket(): Boolean = WrapperServerboundBlockEntityTagQueryPacket.packetClass.isInstance(this)
fun Any.asServerboundBlockEntityTagQueryPacket(): WrapperServerboundBlockEntityTagQueryPacket = WrapperServerboundBlockEntityTagQueryPacket(this)
