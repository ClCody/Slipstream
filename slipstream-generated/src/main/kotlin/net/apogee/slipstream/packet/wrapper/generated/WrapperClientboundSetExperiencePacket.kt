package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetExperiencePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetExperiencePacket") }
        private val lookup = MethodHandles.lookup()

        val getTotalExperienceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTotalExperience", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getExperienceLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExperienceLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getExperienceProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExperienceProgress", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val totalExperience: Int
        get() = getTotalExperienceHandle.invoke(handle) as Int

    val experienceLevel: Int
        get() = getExperienceLevelHandle.invoke(handle) as Int

    val experienceProgress: Float
        get() = getExperienceProgressHandle.invoke(handle) as Float

}

fun Any.isClientboundSetExperiencePacket(): Boolean = WrapperClientboundSetExperiencePacket.packetClass.isInstance(this)
fun Any.asClientboundSetExperiencePacket(): WrapperClientboundSetExperiencePacket = WrapperClientboundSetExperiencePacket(this)
