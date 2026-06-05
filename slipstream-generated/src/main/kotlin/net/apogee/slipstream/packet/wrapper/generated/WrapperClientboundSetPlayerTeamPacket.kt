package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetPlayerTeamPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getParametersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParameters", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getPlayerActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket\$Action")))
        }
        val getTeamActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTeamAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket\$Action")))
        }
        val getPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayers", MethodType.methodType(Class.forName("java.util.Collection")))
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val parameters: Any
        get() = getParametersHandle.invoke(handle) as Any

    val playerAction: Any
        get() = getPlayerActionHandle.invoke(handle) as Any

    val teamAction: Any
        get() = getTeamActionHandle.invoke(handle) as Any

    val players: Any
        get() = getPlayersHandle.invoke(handle) as Any

}
