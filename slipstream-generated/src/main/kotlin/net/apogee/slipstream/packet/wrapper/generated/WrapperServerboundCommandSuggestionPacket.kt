package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundCommandSuggestionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundCommandSuggestionPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCommandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommand", MethodType.methodType(String::class.java))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val command: String
        get() = getCommandHandle.invoke(handle) as String

}

fun Any.isServerboundCommandSuggestionPacket(): Boolean = WrapperServerboundCommandSuggestionPacket.packetClass.isInstance(this)
fun Any.asServerboundCommandSuggestionPacket(): WrapperServerboundCommandSuggestionPacket = WrapperServerboundCommandSuggestionPacket(this)
