package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetBorderWarningDelayPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderWarningDelayPacket") }
        private val lookup = MethodHandles.lookup()

        val getWarningDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningDelay", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val warningDelay: Int
        get() = getWarningDelayHandle.invoke(handle) as Int

}

fun Any.isClientboundSetBorderWarningDelayPacket(): Boolean = WrapperClientboundSetBorderWarningDelayPacket.packetClass.isInstance(this)
fun Any.asClientboundSetBorderWarningDelayPacket(): WrapperClientboundSetBorderWarningDelayPacket = WrapperClientboundSetBorderWarningDelayPacket(this)
