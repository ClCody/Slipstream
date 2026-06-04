package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperScoreAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.ScoreAccess") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val addHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "add", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val incrementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "increment", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val displayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "display", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val lockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "locked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val get: Int
        get() = getHandle.invoke(handle) as Int

    fun add(arg0: Int): Int {
        return addHandle.invoke(handle, arg0) as Int
    }

    val increment: Int
        get() = incrementHandle.invoke(handle) as Int

    val display: WrapperComponent
        get() = WrapperComponent(displayHandle.invoke(handle))

    val locked: Boolean
        get() = lockedHandle.invoke(handle) as Boolean

}
