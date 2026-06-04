package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundPlayerInputPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerInputPacket") }
        private val lookup = MethodHandles.lookup()

        val isJumpingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isJumping", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isShiftKeyDownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShiftKeyDown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getXxaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXxa", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getZzaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZza", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val jumping: Boolean
        get() = isJumpingHandle.invoke(handle) as Boolean

    val shiftKeyDown: Boolean
        get() = isShiftKeyDownHandle.invoke(handle) as Boolean

    val xxa: Float
        get() = getXxaHandle.invoke(handle) as Float

    val zza: Float
        get() = getZzaHandle.invoke(handle) as Float

}

fun Any.isServerboundPlayerInputPacket(): Boolean = WrapperServerboundPlayerInputPacket.packetClass.isInstance(this)
fun Any.asServerboundPlayerInputPacket(): WrapperServerboundPlayerInputPacket = WrapperServerboundPlayerInputPacket(this)
