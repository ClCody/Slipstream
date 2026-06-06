package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperProperty(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.properties.Property") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val valueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "value", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.properties.Property\$Value"), Class.forName("java.lang.Comparable")))
        }
        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Class.forName("java.util.Optional"), String::class.java))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPossibleValuesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPossibleValues", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getValueClassHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValueClass", MethodType.methodType(Class.forName("java.lang.Class")))
        }
        val generateHashCodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "generateHashCode", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAllValuesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllValues", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val valueCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "valueCodec", MethodType.methodType(Class.forName("com.mojang.serialization.Codec")))
        }
        val getIdForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIdFor", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.lang.Comparable")))
        }
        val parseValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "parseValue", MethodType.methodType(Class.forName("com.mojang.serialization.DataResult"), Class.forName("com.mojang.serialization.DynamicOps"), Class.forName("net.minecraft.world.level.block.state.StateHolder"), Class.forName("java.lang.Object")))
        }
        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("com.mojang.serialization.Codec")))
        }
        val hashCodeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hashCode")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    fun value(arg0: Any): WrapperValue {
        return WrapperValue(valueHandle.invoke(handle, arg0))
    }

    fun getValue(arg0: String): Any {
        return getValueHandle.invoke(handle, arg0) as Any
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val possibleValues: Any
        get() = getPossibleValuesHandle.invoke(handle) as Any

    val valueClass: Any
        get() = getValueClassHandle.invoke(handle) as Any

    val generateHashCode: Int
        get() = generateHashCodeHandle.invoke(handle) as Int

    val allValues: Any
        get() = getAllValuesHandle.invoke(handle) as Any

    val valueCodec: Any
        get() = valueCodecHandle.invoke(handle) as Any

    fun getIdFor(arg0: Any): Int {
        return getIdForHandle.invoke(handle, arg0) as Int
    }

    fun parseValue(arg0: Any, arg1: WrapperStateHolder, arg2: Any): Any {
        return parseValueHandle.invoke(handle, arg0, arg1.handle, arg2) as Any
    }

    val codec: Any
        get() = codecHandle.invoke(handle) as Any

    fun setHashCode(value: Any) {
        hashCodeSetterHandle.invoke(handle, value)
    }

}
