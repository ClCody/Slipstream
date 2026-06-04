package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundSelectTradePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSelectTradePacket") }
        private val lookup = MethodHandles.lookup()

        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val item: Int
        get() = getItemHandle.invoke(handle) as Int

}

fun Any.isServerboundSelectTradePacket(): Boolean = WrapperServerboundSelectTradePacket.packetClass.isInstance(this)
fun Any.asServerboundSelectTradePacket(): WrapperServerboundSelectTradePacket = WrapperServerboundSelectTradePacket(this)
