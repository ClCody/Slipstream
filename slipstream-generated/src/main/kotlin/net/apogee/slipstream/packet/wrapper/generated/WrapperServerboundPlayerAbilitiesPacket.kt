package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPlayerAbilitiesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerAbilitiesPacket") }
        private val lookup = MethodHandles.lookup()

        val isFlyingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlying", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val flying: Boolean
        get() = isFlyingHandle.invoke(handle) as Boolean

}

fun Any.isServerboundPlayerAbilitiesPacket(): Boolean = WrapperServerboundPlayerAbilitiesPacket.packetClass.isInstance(this)
fun Any.asServerboundPlayerAbilitiesPacket(): WrapperServerboundPlayerAbilitiesPacket = WrapperServerboundPlayerAbilitiesPacket(this)
