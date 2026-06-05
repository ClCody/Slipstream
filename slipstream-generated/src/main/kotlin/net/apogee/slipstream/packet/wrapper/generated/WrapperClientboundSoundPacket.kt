package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSoundPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSoundPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
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
        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getPitchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPitch", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getVolumeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVolume", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSound", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val seed: Long
        get() = getSeedHandle.invoke(handle) as Long

    val source: Any
        get() = getSourceHandle.invoke(handle) as Any

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val x: Double
        get() = getXHandle.invoke(handle) as Double

    val z: Double
        get() = getZHandle.invoke(handle) as Double

    val pitch: Float
        get() = getPitchHandle.invoke(handle) as Float

    val volume: Float
        get() = getVolumeHandle.invoke(handle) as Float

    val sound: WrapperHolder
        get() = WrapperHolder(getSoundHandle.invoke(handle))

}
