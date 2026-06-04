package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSavedData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.saveddata.SavedData") }
        private val lookup = MethodHandles.lookup()

        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val isDirtyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDirty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val dirtySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dirty")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun save(arg0: WrapperCompoundTag, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val dirty: Boolean
        get() = isDirtyHandle.invoke(handle) as Boolean

    fun setDirty(value: Boolean) {
        dirtySetterHandle.invoke(handle, value)
    }

}
