package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundTickingStatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundTickingStatePacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFrozen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

    val frozen: Boolean
        get() = isFrozenHandle.invoke(handle) as Boolean

}

fun Any.isClientboundTickingStatePacket(): Boolean = WrapperClientboundTickingStatePacket.packetClass.isInstance(this)
fun Any.asClientboundTickingStatePacket(): WrapperClientboundTickingStatePacket = WrapperClientboundTickingStatePacket(this)
