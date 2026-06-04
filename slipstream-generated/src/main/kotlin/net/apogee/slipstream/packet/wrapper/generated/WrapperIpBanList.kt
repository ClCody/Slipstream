package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperIpBanList(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.players.IpBanList") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.server.players.IpBanListEntry"), Class.forName("java.net.SocketAddress")))
        }
        val isBannedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBanned", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
    }

    fun get(arg0: Any): WrapperIpBanListEntry {
        return WrapperIpBanListEntry(getHandle.invoke(handle, arg0))
    }

    fun isBanned(arg0: String): Boolean {
        return isBannedHandle.invoke(handle, arg0) as Boolean
    }

}
