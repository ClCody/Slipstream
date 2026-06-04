package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPlayerInfoUpdatePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val entriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entries", MethodType.methodType(Class.forName("java.util.List")))
        }
        val actionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "actions", MethodType.methodType(Class.forName("java.util.EnumSet")))
        }
        val newEntriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "newEntries", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val entries: Any
        get() = entriesHandle.invoke(handle) as Any

    val actions: Any
        get() = actionsHandle.invoke(handle) as Any

    val newEntries: Any
        get() = newEntriesHandle.invoke(handle) as Any

}
