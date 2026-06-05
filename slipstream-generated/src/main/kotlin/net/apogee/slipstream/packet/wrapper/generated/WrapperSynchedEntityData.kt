package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSynchedEntityData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.syncher.SynchedEntityData") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.network.syncher.EntityDataAccessor")))
        }
        val isDirtyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDirty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.network.syncher.SynchedEntityData\$DataItem"), Class.forName("net.minecraft.network.syncher.EntityDataAccessor")))
        }
        val packAllHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packAll", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getNonDefaultValuesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNonDefaultValues", MethodType.methodType(Class.forName("java.util.List")))
        }
        val packDirtyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packDirty", MethodType.methodType(Class.forName("java.util.List")))
        }
        val isDirtySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isDirty")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: WrapperEntityDataAccessor): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    val dirty: Boolean
        get() = isDirtyHandle.invoke(handle) as Boolean

    fun getItem(arg0: WrapperEntityDataAccessor): WrapperDataItem {
        return WrapperDataItem(getItemHandle.invoke(handle, arg0.handle))
    }

    val packAll: Any
        get() = packAllHandle.invoke(handle) as Any

    val nonDefaultValues: Any
        get() = getNonDefaultValuesHandle.invoke(handle) as Any

    val packDirty: Any
        get() = packDirtyHandle.invoke(handle) as Any

    fun setIsDirty(value: Boolean) {
        isDirtySetterHandle.invoke(handle, value)
    }

}
