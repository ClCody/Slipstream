package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPlayerLookAtPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerLookAtPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getFromAnchorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFromAnchor", MethodType.methodType(Class.forName("net.minecraft.commands.arguments.EntityAnchorArgument\$Anchor")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    fun getPosition(arg0: WrapperLevel): WrapperVec3 {
        return WrapperVec3(getPositionHandle.invoke(handle, arg0.handle))
    }

    val fromAnchor: Any
        get() = getFromAnchorHandle.invoke(handle) as Any

}
