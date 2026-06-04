package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPlayerCombatKillPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerCombatKillPacket") }
        private val lookup = MethodHandles.lookup()

        val hashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isSkippableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSkippable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val hCode: Int
        get() = hashCodeHandle.invoke(handle) as Int

    val skippable: Boolean
        get() = isSkippableHandle.invoke(handle) as Boolean

}

fun Any.isClientboundPlayerCombatKillPacket(): Boolean = WrapperClientboundPlayerCombatKillPacket.packetClass.isInstance(this)
fun Any.asClientboundPlayerCombatKillPacket(): WrapperClientboundPlayerCombatKillPacket = WrapperClientboundPlayerCombatKillPacket(this)
