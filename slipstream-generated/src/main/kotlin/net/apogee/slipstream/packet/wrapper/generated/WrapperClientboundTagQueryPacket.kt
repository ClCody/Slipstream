package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundTagQueryPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTagQueryPacket") }
        private val lookup = MethodHandles.lookup()

        val getTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val isSkippableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSkippable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTransactionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTransactionId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val tag: Any
        get() = getTagHandle.invoke(handle) as Any

    val skippable: Boolean
        get() = isSkippableHandle.invoke(handle) as Boolean

    val transactionId: Int
        get() = getTransactionIdHandle.invoke(handle) as Int

}

fun Any.isClientboundTagQueryPacket(): Boolean = WrapperClientboundTagQueryPacket.packetClass.isInstance(this)
fun Any.asClientboundTagQueryPacket(): WrapperClientboundTagQueryPacket = WrapperClientboundTagQueryPacket(this)
