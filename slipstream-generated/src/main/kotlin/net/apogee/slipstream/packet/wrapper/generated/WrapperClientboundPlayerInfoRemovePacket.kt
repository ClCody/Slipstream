package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPlayerInfoRemovePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerInfoRemovePacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

}

fun Any.isClientboundPlayerInfoRemovePacket(): Boolean = WrapperClientboundPlayerInfoRemovePacket.packetClass.isInstance(this)
fun Any.asClientboundPlayerInfoRemovePacket(): WrapperClientboundPlayerInfoRemovePacket = WrapperClientboundPlayerInfoRemovePacket(this)
