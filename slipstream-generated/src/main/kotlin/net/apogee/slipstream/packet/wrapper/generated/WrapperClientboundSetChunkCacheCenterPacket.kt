package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetChunkCacheCenterPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetChunkCacheCenterPacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val z: Int
        get() = getZHandle.invoke(handle) as Int

    val x: Int
        get() = getXHandle.invoke(handle) as Int

}

fun Any.isClientboundSetChunkCacheCenterPacket(): Boolean = WrapperClientboundSetChunkCacheCenterPacket.packetClass.isInstance(this)
fun Any.asClientboundSetChunkCacheCenterPacket(): WrapperClientboundSetChunkCacheCenterPacket = WrapperClientboundSetChunkCacheCenterPacket(this)
