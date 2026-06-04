package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetCarriedItemPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetCarriedItemPacket") }
        private val lookup = MethodHandles.lookup()

        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val slot: Int
        get() = getSlotHandle.invoke(handle) as Int

}

fun Any.isClientboundSetCarriedItemPacket(): Boolean = WrapperClientboundSetCarriedItemPacket.packetClass.isInstance(this)
fun Any.asClientboundSetCarriedItemPacket(): WrapperClientboundSetCarriedItemPacket = WrapperClientboundSetCarriedItemPacket(this)
