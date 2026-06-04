package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerConnectionListener(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.network.ServerConnectionListener") }
        private val lookup = MethodHandles.lookup()

        val getConnectionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getConnections", MethodType.methodType(Class.forName("java.util.List")))
        }
        val startMemoryChannelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "startMemoryChannel", MethodType.methodType(Class.forName("java.net.SocketAddress")))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val runningSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("running")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val connections: Any
        get() = getConnectionsHandle.invoke(handle) as Any

    val startMemoryChannel: Any
        get() = startMemoryChannelHandle.invoke(handle) as Any

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    fun setRunning(value: Boolean) {
        runningSetterHandle.invoke(handle, value)
    }

}
