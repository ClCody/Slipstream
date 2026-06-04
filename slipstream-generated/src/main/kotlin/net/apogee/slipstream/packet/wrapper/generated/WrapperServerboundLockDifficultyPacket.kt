package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundLockDifficultyPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundLockDifficultyPacket") }
        private val lookup = MethodHandles.lookup()

        val isLockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLocked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val locked: Boolean
        get() = isLockedHandle.invoke(handle) as Boolean

}

fun Any.isServerboundLockDifficultyPacket(): Boolean = WrapperServerboundLockDifficultyPacket.packetClass.isInstance(this)
fun Any.asServerboundLockDifficultyPacket(): WrapperServerboundLockDifficultyPacket = WrapperServerboundLockDifficultyPacket(this)
