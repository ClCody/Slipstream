package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataItem(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.syncher.SynchedEntityData\$DataItem") }
        private val lookup = MethodHandles.lookup()

        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Class.forName("net.minecraft.network.syncher.SynchedEntityData\$DataValue")))
        }
        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Class.forName("java.lang.Object")))
        }
        val getAccessorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAccessor", MethodType.methodType(Class.forName("net.minecraft.network.syncher.EntityDataAccessor")))
        }
        val isDirtyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDirty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isSetToDefaultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSetToDefault", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val valueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("value")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dirtySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dirty")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val value: WrapperDataValue
        get() = WrapperDataValue(valueHandle.invoke(handle))

    val getValue: Any
        get() = getValueHandle.invoke(handle) as Any

    val accessor: WrapperEntityDataAccessor
        get() = WrapperEntityDataAccessor(getAccessorHandle.invoke(handle))

    val dirty: Boolean
        get() = isDirtyHandle.invoke(handle) as Boolean

    val setToDefault: Boolean
        get() = isSetToDefaultHandle.invoke(handle) as Boolean

    fun setValue(value: Any) {
        valueSetterHandle.invoke(handle, value)
    }

    fun setDirty(value: Boolean) {
        dirtySetterHandle.invoke(handle, value)
    }

}
