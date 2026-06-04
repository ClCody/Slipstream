package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundTakeItemEntityPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTakeItemEntityPacket") }
        private val lookup = MethodHandles.lookup()

        val getAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPlayerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getItemIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val amount: Int
        get() = getAmountHandle.invoke(handle) as Int

    val playerId: Int
        get() = getPlayerIdHandle.invoke(handle) as Int

    val itemId: Int
        get() = getItemIdHandle.invoke(handle) as Int

}

fun Any.isClientboundTakeItemEntityPacket(): Boolean = WrapperClientboundTakeItemEntityPacket.packetClass.isInstance(this)
fun Any.asClientboundTakeItemEntityPacket(): WrapperClientboundTakeItemEntityPacket = WrapperClientboundTakeItemEntityPacket(this)
