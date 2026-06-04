package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundLoginCompressionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundLoginCompressionPacket") }
        private val lookup = MethodHandles.lookup()

        val getCompressionThresholdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCompressionThreshold", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val compressionThreshold: Int
        get() = getCompressionThresholdHandle.invoke(handle) as Int

}

fun Any.isClientboundLoginCompressionPacket(): Boolean = WrapperClientboundLoginCompressionPacket.packetClass.isInstance(this)
fun Any.asClientboundLoginCompressionPacket(): WrapperClientboundLoginCompressionPacket = WrapperClientboundLoginCompressionPacket(this)
