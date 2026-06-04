package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundRegistryDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.configuration.ClientboundRegistryDataPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

}

fun Any.isClientboundRegistryDataPacket(): Boolean = WrapperClientboundRegistryDataPacket.packetClass.isInstance(this)
fun Any.asClientboundRegistryDataPacket(): WrapperClientboundRegistryDataPacket = WrapperClientboundRegistryDataPacket(this)
