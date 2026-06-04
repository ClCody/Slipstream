package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundClientCommandPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundClientCommandPacket") }
        private val lookup = MethodHandles.lookup()

        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ServerboundClientCommandPacket\$Action")))
        }
    }

    val action: Any
        get() = getActionHandle.invoke(handle) as Any

}

fun Any.isServerboundClientCommandPacket(): Boolean = WrapperServerboundClientCommandPacket.packetClass.isInstance(this)
fun Any.asServerboundClientCommandPacket(): WrapperServerboundClientCommandPacket = WrapperServerboundClientCommandPacket(this)
