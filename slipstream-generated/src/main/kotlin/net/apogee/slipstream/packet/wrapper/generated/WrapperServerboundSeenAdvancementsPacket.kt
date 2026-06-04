package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSeenAdvancementsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getTabHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTab", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket\$Action")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val tab: WrapperResourceLocation
        get() = WrapperResourceLocation(getTabHandle.invoke(handle))

    val action: Any
        get() = getActionHandle.invoke(handle) as Any

}
