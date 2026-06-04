package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundContainerSetDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundContainerSetDataPacket") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val value: Int
        get() = getValueHandle.invoke(handle) as Int

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isClientboundContainerSetDataPacket(): Boolean = WrapperClientboundContainerSetDataPacket.packetClass.isInstance(this)
fun Any.asClientboundContainerSetDataPacket(): WrapperClientboundContainerSetDataPacket = WrapperClientboundContainerSetDataPacket(this)
