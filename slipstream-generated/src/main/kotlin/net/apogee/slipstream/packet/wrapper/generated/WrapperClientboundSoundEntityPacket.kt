package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSoundEntityPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSoundEntityPacket") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSource", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundSource")))
        }
        val getSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSound", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getVolumeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVolume", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getPitchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPitch", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val seed: Long
        get() = getSeedHandle.invoke(handle) as Long

    val source: Any
        get() = getSourceHandle.invoke(handle) as Any

    val sound: Any
        get() = getSoundHandle.invoke(handle) as Any

    val volume: Float
        get() = getVolumeHandle.invoke(handle) as Float

    val pitch: Float
        get() = getPitchHandle.invoke(handle) as Float

}

fun Any.isClientboundSoundEntityPacket(): Boolean = WrapperClientboundSoundEntityPacket.packetClass.isInstance(this)
fun Any.asClientboundSoundEntityPacket(): WrapperClientboundSoundEntityPacket = WrapperClientboundSoundEntityPacket(this)
