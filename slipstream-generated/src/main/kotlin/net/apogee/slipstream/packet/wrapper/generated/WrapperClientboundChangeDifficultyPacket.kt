package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundChangeDifficultyPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundChangeDifficultyPacket") }
        private val lookup = MethodHandles.lookup()

        val isLockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLocked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
    }

    val locked: Boolean
        get() = isLockedHandle.invoke(handle) as Boolean

    val difficulty: Any
        get() = getDifficultyHandle.invoke(handle) as Any

}

fun Any.isClientboundChangeDifficultyPacket(): Boolean = WrapperClientboundChangeDifficultyPacket.packetClass.isInstance(this)
fun Any.asClientboundChangeDifficultyPacket(): WrapperClientboundChangeDifficultyPacket = WrapperClientboundChangeDifficultyPacket(this)
