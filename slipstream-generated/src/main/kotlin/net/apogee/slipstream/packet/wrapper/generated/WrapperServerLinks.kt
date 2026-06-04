package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerLinks(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.ServerLinks") }
        private val lookup = MethodHandles.lookup()

        val entriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entries", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List")))
        }
    }

    val entries: Any
        get() = entriesHandle.invoke(handle) as Any

    fun copy(entries: Any = this.entries): WrapperServerLinks {
        return WrapperServerLinks(constructorHandle.invoke(entries))
    }

}
