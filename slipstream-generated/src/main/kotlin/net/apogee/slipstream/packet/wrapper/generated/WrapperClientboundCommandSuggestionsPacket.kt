package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCommandSuggestionsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val startHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "start", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val lengthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "length", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val suggestionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "suggestions", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.util.List")))
        }
    }

    val id: Int
        get() = idHandle.invoke(handle) as Int

    val start: Int
        get() = startHandle.invoke(handle) as Int

    val length: Int
        get() = lengthHandle.invoke(handle) as Int

    val suggestions: Any
        get() = suggestionsHandle.invoke(handle) as Any

    fun copy(id: Int = this.id, start: Int = this.start, length: Int = this.length, suggestions: Any = this.suggestions): WrapperClientboundCommandSuggestionsPacket {
        return WrapperClientboundCommandSuggestionsPacket(constructorHandle.invoke(id, start, length, suggestions))
    }

}
