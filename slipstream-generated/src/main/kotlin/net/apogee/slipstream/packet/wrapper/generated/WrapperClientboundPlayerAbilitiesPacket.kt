package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPlayerAbilitiesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket") }
        private val lookup = MethodHandles.lookup()

        val isFlyingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlying", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInvulnerableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFlyingSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFlyingSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getWalkingSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWalkingSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val flying: Boolean
        get() = isFlyingHandle.invoke(handle) as Boolean

    val invulnerable: Boolean
        get() = isInvulnerableHandle.invoke(handle) as Boolean

    val flyingSpeed: Float
        get() = getFlyingSpeedHandle.invoke(handle) as Float

    val walkingSpeed: Float
        get() = getWalkingSpeedHandle.invoke(handle) as Float

}

fun Any.isClientboundPlayerAbilitiesPacket(): Boolean = WrapperClientboundPlayerAbilitiesPacket.packetClass.isInstance(this)
fun Any.asClientboundPlayerAbilitiesPacket(): WrapperClientboundPlayerAbilitiesPacket = WrapperClientboundPlayerAbilitiesPacket(this)
