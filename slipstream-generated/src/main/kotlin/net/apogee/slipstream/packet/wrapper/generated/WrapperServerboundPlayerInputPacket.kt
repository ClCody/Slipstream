package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundPlayerInputPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerInputPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val isShiftKeyDownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShiftKeyDown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isJumpingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isJumping", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getZzaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZza", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getXxaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXxa", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val shiftKeyDown: Boolean
        get() = isShiftKeyDownHandle.invoke(handle) as Boolean

    val jumping: Boolean
        get() = isJumpingHandle.invoke(handle) as Boolean

    val zza: Float
        get() = getZzaHandle.invoke(handle) as Float

    val xxa: Float
        get() = getXxaHandle.invoke(handle) as Float

}
