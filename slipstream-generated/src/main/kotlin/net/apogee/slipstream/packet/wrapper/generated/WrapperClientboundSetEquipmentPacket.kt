package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetEquipmentPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetEquipmentPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlots", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val sanitizeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sanitize")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val slots: Any
        get() = getSlotsHandle.invoke(handle) as Any

    val entity: Int
        get() = getEntityHandle.invoke(handle) as Int

    fun setSanitize(value: Boolean) {
        sanitizeSetterHandle.invoke(handle, value)
    }

}
