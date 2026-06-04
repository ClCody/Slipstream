package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundUpdateAttributesPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket") }
        private val lookup = MethodHandles.lookup()

        val getEntityIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getValuesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValues", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val entityId: Int
        get() = getEntityIdHandle.invoke(handle) as Int

    val values: Any
        get() = getValuesHandle.invoke(handle) as Any

}

fun Any.isClientboundUpdateAttributesPacket(): Boolean = WrapperClientboundUpdateAttributesPacket.packetClass.isInstance(this)
fun Any.asClientboundUpdateAttributesPacket(): WrapperClientboundUpdateAttributesPacket = WrapperClientboundUpdateAttributesPacket(this)
