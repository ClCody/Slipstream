package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPongPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ServerboundPongPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

}

fun Any.isServerboundPongPacket(): Boolean = WrapperServerboundPongPacket.packetClass.isInstance(this)
fun Any.asServerboundPongPacket(): WrapperServerboundPongPacket = WrapperServerboundPongPacket(this)
