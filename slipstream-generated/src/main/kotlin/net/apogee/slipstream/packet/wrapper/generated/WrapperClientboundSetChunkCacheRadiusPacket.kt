package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetChunkCacheRadiusPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetChunkCacheRadiusPacket") }
        private val lookup = MethodHandles.lookup()

        val getRadiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRadius", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val radius: Int
        get() = getRadiusHandle.invoke(handle) as Int

}

fun Any.isClientboundSetChunkCacheRadiusPacket(): Boolean = WrapperClientboundSetChunkCacheRadiusPacket.packetClass.isInstance(this)
fun Any.asClientboundSetChunkCacheRadiusPacket(): WrapperClientboundSetChunkCacheRadiusPacket = WrapperClientboundSetChunkCacheRadiusPacket(this)
