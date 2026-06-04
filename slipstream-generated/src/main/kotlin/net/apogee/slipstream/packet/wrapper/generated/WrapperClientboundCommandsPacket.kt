package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundCommandsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundCommandsPacket") }
        private val lookup = MethodHandles.lookup()

        val getRootHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRoot", MethodType.methodType(Class.forName("com.mojang.brigadier.tree.RootCommandNode"), Class.forName("net.minecraft.commands.CommandBuildContext")))
        }
    }

    fun getRoot(arg0: Any): Any {
        return getRootHandle.invoke(handle, arg0) as Any
    }

}

fun Any.isClientboundCommandsPacket(): Boolean = WrapperClientboundCommandsPacket.packetClass.isInstance(this)
fun Any.asClientboundCommandsPacket(): WrapperClientboundCommandsPacket = WrapperClientboundCommandsPacket(this)
