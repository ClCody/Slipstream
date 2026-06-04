package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundContainerButtonClickPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundContainerButtonClickPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

}

fun Any.isServerboundContainerButtonClickPacket(): Boolean = WrapperServerboundContainerButtonClickPacket.packetClass.isInstance(this)
fun Any.asServerboundContainerButtonClickPacket(): WrapperServerboundContainerButtonClickPacket = WrapperServerboundContainerButtonClickPacket(this)
