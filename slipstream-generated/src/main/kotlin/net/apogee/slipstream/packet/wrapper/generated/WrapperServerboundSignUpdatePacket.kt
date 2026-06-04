package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundSignUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSignUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isFrontTextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFrontText", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLinesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLines", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
    }

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val frontText: Boolean
        get() = isFrontTextHandle.invoke(handle) as Boolean

    val lines: Any
        get() = getLinesHandle.invoke(handle) as Any

}

fun Any.isServerboundSignUpdatePacket(): Boolean = WrapperServerboundSignUpdatePacket.packetClass.isInstance(this)
fun Any.asServerboundSignUpdatePacket(): WrapperServerboundSignUpdatePacket = WrapperServerboundSignUpdatePacket(this)
