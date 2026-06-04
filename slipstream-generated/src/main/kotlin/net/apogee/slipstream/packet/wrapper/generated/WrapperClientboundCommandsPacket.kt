package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundCommandsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundCommandsPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getRootHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRoot", MethodType.methodType(Class.forName("com.mojang.brigadier.tree.RootCommandNode"), Class.forName("net.minecraft.commands.CommandBuildContext")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    fun getRoot(arg0: Any): Any {
        return getRootHandle.invoke(handle, arg0) as Any
    }

}
