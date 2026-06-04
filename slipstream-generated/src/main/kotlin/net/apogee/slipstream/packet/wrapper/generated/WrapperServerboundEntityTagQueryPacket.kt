package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundEntityTagQueryPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundEntityTagQueryPacket") }
        private val lookup = MethodHandles.lookup()

        val getEntityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTransactionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTransactionId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val entityId: Int
        get() = getEntityIdHandle.invoke(handle) as Int

    val transactionId: Int
        get() = getTransactionIdHandle.invoke(handle) as Int

}

fun Any.isServerboundEntityTagQueryPacket(): Boolean = WrapperServerboundEntityTagQueryPacket.packetClass.isInstance(this)
fun Any.asServerboundEntityTagQueryPacket(): WrapperServerboundEntityTagQueryPacket = WrapperServerboundEntityTagQueryPacket(this)
