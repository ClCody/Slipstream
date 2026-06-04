package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCommandStorage(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.CommandStorage") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val keysHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "keys", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
    }

    fun get(arg0: WrapperResourceLocation): WrapperCompoundTag {
        return WrapperCompoundTag(getHandle.invoke(handle, arg0.handle))
    }

    val keys: Any
        get() = keysHandle.invoke(handle) as Any

}
