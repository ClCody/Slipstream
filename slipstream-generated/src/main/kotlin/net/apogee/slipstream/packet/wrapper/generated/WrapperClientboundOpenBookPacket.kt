package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundOpenBookPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundOpenBookPacket") }
        private val lookup = MethodHandles.lookup()

        val getHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
    }

    val hand: Any
        get() = getHandHandle.invoke(handle) as Any

}

fun Any.isClientboundOpenBookPacket(): Boolean = WrapperClientboundOpenBookPacket.packetClass.isInstance(this)
fun Any.asClientboundOpenBookPacket(): WrapperClientboundOpenBookPacket = WrapperClientboundOpenBookPacket(this)
