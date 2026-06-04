package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundLightUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLightUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getLightDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightData", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundLightUpdatePacketData")))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val z: Int
        get() = getZHandle.invoke(handle) as Int

    val lightData: Any
        get() = getLightDataHandle.invoke(handle) as Any

    val x: Int
        get() = getXHandle.invoke(handle) as Int

}

fun Any.isClientboundLightUpdatePacket(): Boolean = WrapperClientboundLightUpdatePacket.packetClass.isInstance(this)
fun Any.asClientboundLightUpdatePacket(): WrapperClientboundLightUpdatePacket = WrapperClientboundLightUpdatePacket(this)
