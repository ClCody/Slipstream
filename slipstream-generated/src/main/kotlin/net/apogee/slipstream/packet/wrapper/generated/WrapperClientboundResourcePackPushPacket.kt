package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundResourcePackPushPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hashHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hash", MethodType.methodType(String::class.java))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

    val h: String
        get() = hashHandle.invoke(handle) as String

}

fun Any.isClientboundResourcePackPushPacket(): Boolean = WrapperClientboundResourcePackPushPacket.packetClass.isInstance(this)
fun Any.asClientboundResourcePackPushPacket(): WrapperClientboundResourcePackPushPacket = WrapperClientboundResourcePackPushPacket(this)
