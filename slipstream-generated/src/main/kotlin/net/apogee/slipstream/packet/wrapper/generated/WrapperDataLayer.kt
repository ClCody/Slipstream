package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataLayer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.DataLayer") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.DataLayer")))
        }
        val getDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getData", MethodType.methodType(ByteArray::class.java))
        }
        val isDefinitelyHomogenousHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDefinitelyHomogenous", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isDefinitelyFilledWithHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDefinitelyFilledWith", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val layerToStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "layerToString", MethodType.methodType(String::class.java, Int::class.javaPrimitiveType!!))
        }
        val dataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("data")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val defaultValueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("defaultValue")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: Int, arg1: Int, arg2: Int): Int {
        return getHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val copy: WrapperDataLayer
        get() = WrapperDataLayer(copyHandle.invoke(handle))

    val data: ByteArray
        get() = getDataHandle.invoke(handle) as ByteArray

    val definitelyHomogenous: Boolean
        get() = isDefinitelyHomogenousHandle.invoke(handle) as Boolean

    fun isDefinitelyFilledWith(arg0: Int): Boolean {
        return isDefinitelyFilledWithHandle.invoke(handle, arg0) as Boolean
    }

    fun layerToString(arg0: Int): String {
        return layerToStringHandle.invoke(handle, arg0) as String
    }

    fun setData(value: ByteArray) {
        dataSetterHandle.invoke(handle, value)
    }

    fun setDefaultValue(value: Int) {
        defaultValueSetterHandle.invoke(handle, value)
    }

}
