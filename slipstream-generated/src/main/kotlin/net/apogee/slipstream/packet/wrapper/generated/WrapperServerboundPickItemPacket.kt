package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPickItemPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPickItemPacket") }
        private val lookup = MethodHandles.lookup()

        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val slot: Int
        get() = getSlotHandle.invoke(handle) as Int

}

fun Any.isServerboundPickItemPacket(): Boolean = WrapperServerboundPickItemPacket.packetClass.isInstance(this)
fun Any.asServerboundPickItemPacket(): WrapperServerboundPickItemPacket = WrapperServerboundPickItemPacket(this)
