package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundRotateHeadPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundRotateHeadPacket") }
        private val lookup = MethodHandles.lookup()

        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getYHeadRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYHeadRot", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
    }

    fun getEntity(arg0: Any): Any {
        return getEntityHandle.invoke(handle, arg0) as Any
    }

    val yHeadRot: Byte
        get() = getYHeadRotHandle.invoke(handle) as Byte

}

fun Any.isClientboundRotateHeadPacket(): Boolean = WrapperClientboundRotateHeadPacket.packetClass.isInstance(this)
fun Any.asClientboundRotateHeadPacket(): WrapperClientboundRotateHeadPacket = WrapperClientboundRotateHeadPacket(this)
