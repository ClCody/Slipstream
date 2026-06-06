package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPlayerAbilitiesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getFlyingSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFlyingSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isInvulnerableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWalkingSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWalkingSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canInstabuildHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canInstabuild", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canFlyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canFly", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isFlyingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlying", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val flyingSpeed: Float
        get() = getFlyingSpeedHandle.invoke(handle) as Float

    val invulnerable: Boolean
        get() = isInvulnerableHandle.invoke(handle) as Boolean

    val walkingSpeed: Float
        get() = getWalkingSpeedHandle.invoke(handle) as Float

    val canInstabuild: Boolean
        get() = canInstabuildHandle.invoke(handle) as Boolean

    val canFly: Boolean
        get() = canFlyHandle.invoke(handle) as Boolean

    val flying: Boolean
        get() = isFlyingHandle.invoke(handle) as Boolean

}
