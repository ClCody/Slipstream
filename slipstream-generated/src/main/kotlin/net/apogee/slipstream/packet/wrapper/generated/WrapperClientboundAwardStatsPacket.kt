package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundAwardStatsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundAwardStatsPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

}

fun Any.isClientboundAwardStatsPacket(): Boolean = WrapperClientboundAwardStatsPacket.packetClass.isInstance(this)
fun Any.asClientboundAwardStatsPacket(): WrapperClientboundAwardStatsPacket = WrapperClientboundAwardStatsPacket(this)
