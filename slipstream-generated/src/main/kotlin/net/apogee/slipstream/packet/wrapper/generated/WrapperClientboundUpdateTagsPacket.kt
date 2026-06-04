package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundUpdateTagsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundUpdateTagsPacket") }
        private val lookup = MethodHandles.lookup()

        val getTagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTags", MethodType.methodType(Class.forName("java.util.Map")))
        }
    }

    val tags: Any
        get() = getTagsHandle.invoke(handle) as Any

}

fun Any.isClientboundUpdateTagsPacket(): Boolean = WrapperClientboundUpdateTagsPacket.packetClass.isInstance(this)
fun Any.asClientboundUpdateTagsPacket(): WrapperClientboundUpdateTagsPacket = WrapperClientboundUpdateTagsPacket(this)
