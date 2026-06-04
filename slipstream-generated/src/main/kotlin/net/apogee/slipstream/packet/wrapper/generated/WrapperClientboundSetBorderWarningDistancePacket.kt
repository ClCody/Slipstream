package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetBorderWarningDistancePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetBorderWarningDistancePacket") }
        private val lookup = MethodHandles.lookup()

        val getWarningBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWarningBlocks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val warningBlocks: Int
        get() = getWarningBlocksHandle.invoke(handle) as Int

}

fun Any.isClientboundSetBorderWarningDistancePacket(): Boolean = WrapperClientboundSetBorderWarningDistancePacket.packetClass.isInstance(this)
fun Any.asClientboundSetBorderWarningDistancePacket(): WrapperClientboundSetBorderWarningDistancePacket = WrapperClientboundSetBorderWarningDistancePacket(this)
