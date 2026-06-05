package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCustomBossEvents(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.bossevents.CustomBossEvents") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.server.bossevents.CustomBossEvent"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val createHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "create", MethodType.methodType(Class.forName("net.minecraft.server.bossevents.CustomBossEvent"), Class.forName("net.minecraft.resources.ResourceLocation"), Class.forName("net.minecraft.network.chat.Component")))
        }
        val getEventsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEvents", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIds", MethodType.methodType(Class.forName("java.util.Collection")))
        }
    }

    fun get(arg0: WrapperResourceLocation): WrapperCustomBossEvent {
        return WrapperCustomBossEvent(getHandle.invoke(handle, arg0.handle))
    }

    fun save(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle))
    }

    fun create(arg0: WrapperResourceLocation, arg1: WrapperComponent): WrapperCustomBossEvent {
        return WrapperCustomBossEvent(createHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val events: Any
        get() = getEventsHandle.invoke(handle) as Any

    val ids: Any
        get() = getIdsHandle.invoke(handle) as Any

}
