package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundRegistryDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.configuration.ClientboundRegistryDataPacket") }
        private val lookup = MethodHandles.lookup()

        val registryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registry", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val entriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entries", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("java.util.List")))
        }
    }

    val registry: WrapperResourceKey
        get() = WrapperResourceKey(registryHandle.invoke(handle))

    val entries: Any
        get() = entriesHandle.invoke(handle) as Any

    fun copy(registry: WrapperResourceKey = this.registry, entries: Any = this.entries): WrapperClientboundRegistryDataPacket {
        return WrapperClientboundRegistryDataPacket(constructorHandle.invoke(registry.handle, entries))
    }

}
