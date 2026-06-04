package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetDefaultSpawnPositionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetDefaultSpawnPositionPacket") }
        private val lookup = MethodHandles.lookup()

        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAngle", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val angle: Float
        get() = getAngleHandle.invoke(handle) as Float

}

fun Any.isClientboundSetDefaultSpawnPositionPacket(): Boolean = WrapperClientboundSetDefaultSpawnPositionPacket.packetClass.isInstance(this)
fun Any.asClientboundSetDefaultSpawnPositionPacket(): WrapperClientboundSetDefaultSpawnPositionPacket = WrapperClientboundSetDefaultSpawnPositionPacket(this)
