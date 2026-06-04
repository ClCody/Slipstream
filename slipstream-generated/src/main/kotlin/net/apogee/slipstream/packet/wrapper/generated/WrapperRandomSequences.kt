package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRandomSequences(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.RandomSequences") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val clearHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clear", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val saltSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("salt")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val includeWorldSeedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("includeWorldSeed")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val includeSequenceIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("includeSequenceId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: WrapperResourceLocation): WrapperRandomSource {
        return WrapperRandomSource(getHandle.invoke(handle, arg0.handle))
    }

    val clear: Int
        get() = clearHandle.invoke(handle) as Int

    fun save(arg0: WrapperCompoundTag, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun setSalt(value: Int) {
        saltSetterHandle.invoke(handle, value)
    }

    fun setIncludeWorldSeed(value: Boolean) {
        includeWorldSeedSetterHandle.invoke(handle, value)
    }

    fun setIncludeSequenceId(value: Boolean) {
        includeSequenceIdSetterHandle.invoke(handle, value)
    }

}
