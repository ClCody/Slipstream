package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.ReloadableServerRegistries\$Holder") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen")))
        }
        val lookupHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lookup", MethodType.methodType(Class.forName("net.minecraft.core.HolderGetter\$Provider")))
        }
        val getKeysHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKeys", MethodType.methodType(Class.forName("java.util.Collection"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getLootTableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLootTable", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.loot.LootTable"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
    }

    val get: Any
        get() = getHandle.invoke(handle) as Any

    val lookup: WrapperProvider
        get() = WrapperProvider(lookupHandle.invoke(handle))

    fun getKeys(arg0: WrapperResourceKey): Any {
        return getKeysHandle.invoke(handle, arg0.handle) as Any
    }

    fun getLootTable(arg0: WrapperResourceKey): WrapperLootTable {
        return WrapperLootTable(getLootTableHandle.invoke(handle, arg0.handle))
    }

}
