package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSoundPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSoundPacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSource", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundSource")))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Double::class.javaPrimitiveType!!))
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

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val seed: Long
        get() = getSeedHandle.invoke(handle) as Long

    val source: Any
        get() = getSourceHandle.invoke(handle) as Any

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

    val sound: Any
        get() = getSoundHandle.invoke(handle) as Any

    val volume: Float
        get() = getVolumeHandle.invoke(handle) as Float

    val pitch: Float
        get() = getPitchHandle.invoke(handle) as Float

}

fun Any.isClientboundSoundPacket(): Boolean = WrapperClientboundSoundPacket.packetClass.isInstance(this)
fun Any.asClientboundSoundPacket(): WrapperClientboundSoundPacket = WrapperClientboundSoundPacket(this)
