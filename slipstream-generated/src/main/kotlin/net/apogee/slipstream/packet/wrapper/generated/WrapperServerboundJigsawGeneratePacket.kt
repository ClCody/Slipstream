package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundJigsawGeneratePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundJigsawGeneratePacket") }
        private val lookup = MethodHandles.lookup()

        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

}

fun Any.isServerboundJigsawGeneratePacket(): Boolean = WrapperServerboundJigsawGeneratePacket.packetClass.isInstance(this)
fun Any.asServerboundJigsawGeneratePacket(): WrapperServerboundJigsawGeneratePacket = WrapperServerboundJigsawGeneratePacket(this)
