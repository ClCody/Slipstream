package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetEquipmentPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetEquipmentPacket") }
        private val lookup = MethodHandles.lookup()

        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlots", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val entity: Int
        get() = getEntityHandle.invoke(handle) as Int

    val slots: Any
        get() = getSlotsHandle.invoke(handle) as Any

}

fun Any.isClientboundSetEquipmentPacket(): Boolean = WrapperClientboundSetEquipmentPacket.packetClass.isInstance(this)
fun Any.asClientboundSetEquipmentPacket(): WrapperClientboundSetEquipmentPacket = WrapperClientboundSetEquipmentPacket(this)
