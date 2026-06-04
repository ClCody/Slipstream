package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundStopSoundPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundStopSoundPacket") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSource", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundSource")))
        }
    }

    val name: Any
        get() = getNameHandle.invoke(handle) as Any

    val source: Any
        get() = getSourceHandle.invoke(handle) as Any

}

fun Any.isClientboundStopSoundPacket(): Boolean = WrapperClientboundStopSoundPacket.packetClass.isInstance(this)
fun Any.asClientboundStopSoundPacket(): WrapperClientboundStopSoundPacket = WrapperClientboundStopSoundPacket(this)
