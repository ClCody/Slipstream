package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDimensionDataStorage(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.DimensionDataStorage") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.SavedData"), Class.forName("net.minecraft.world.level.saveddata.SavedData\$Factory"), String::class.java))
        }
        val computeIfAbsentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "computeIfAbsent", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.SavedData"), Class.forName("net.minecraft.world.level.saveddata.SavedData\$Factory"), String::class.java))
        }
        val readTagFromDiskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readTagFromDisk", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), String::class.java, Class.forName("net.minecraft.util.datafix.DataFixTypes"), Int::class.javaPrimitiveType!!))
        }
    }

    fun get(arg0: WrapperFactory, arg1: String): WrapperSavedData {
        return WrapperSavedData(getHandle.invoke(handle, arg0.handle, arg1))
    }

    fun computeIfAbsent(arg0: WrapperFactory, arg1: String): WrapperSavedData {
        return WrapperSavedData(computeIfAbsentHandle.invoke(handle, arg0.handle, arg1))
    }

    fun readTagFromDisk(arg0: String, arg1: Any, arg2: Int): WrapperCompoundTag {
        return WrapperCompoundTag(readTagFromDiskHandle.invoke(handle, arg0, arg1, arg2))
    }

}
