package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundLevelEventPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLevelEventPacket") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getData", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isGlobalEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isGlobalEvent", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: Int
        get() = getTypeHandle.invoke(handle) as Int

    val data: Int
        get() = getDataHandle.invoke(handle) as Int

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val globalEvent: Boolean
        get() = isGlobalEventHandle.invoke(handle) as Boolean

}

fun Any.isClientboundLevelEventPacket(): Boolean = WrapperClientboundLevelEventPacket.packetClass.isInstance(this)
fun Any.asClientboundLevelEventPacket(): WrapperClientboundLevelEventPacket = WrapperClientboundLevelEventPacket(this)
