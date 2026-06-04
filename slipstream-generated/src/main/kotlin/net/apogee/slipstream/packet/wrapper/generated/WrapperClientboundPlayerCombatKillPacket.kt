package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPlayerCombatKillPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerCombatKillPacket") }
        private val lookup = MethodHandles.lookup()

        val playerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "playerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val messageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "message", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val playerId: Int
        get() = playerIdHandle.invoke(handle) as Int

    val message: WrapperComponent
        get() = WrapperComponent(messageHandle.invoke(handle))

    fun copy(playerId: Int = this.playerId, message: WrapperComponent = this.message): WrapperClientboundPlayerCombatKillPacket {
        return WrapperClientboundPlayerCombatKillPacket(constructorHandle.invoke(playerId, message.handle))
    }

}
