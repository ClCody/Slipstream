package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetExperiencePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetExperiencePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getExperienceLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExperienceLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTotalExperienceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTotalExperience", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getExperienceProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExperienceProgress", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val experienceLevel: Int
        get() = getExperienceLevelHandle.invoke(handle) as Int

    val totalExperience: Int
        get() = getTotalExperienceHandle.invoke(handle) as Int

    val experienceProgress: Float
        get() = getExperienceProgressHandle.invoke(handle) as Float

}
