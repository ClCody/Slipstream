package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundOpenSignEditorPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundOpenSignEditorPacket") }
        private val lookup = MethodHandles.lookup()

        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isFrontTextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFrontText", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val frontText: Boolean
        get() = isFrontTextHandle.invoke(handle) as Boolean

}

fun Any.isClientboundOpenSignEditorPacket(): Boolean = WrapperClientboundOpenSignEditorPacket.packetClass.isInstance(this)
fun Any.asClientboundOpenSignEditorPacket(): WrapperClientboundOpenSignEditorPacket = WrapperClientboundOpenSignEditorPacket(this)
