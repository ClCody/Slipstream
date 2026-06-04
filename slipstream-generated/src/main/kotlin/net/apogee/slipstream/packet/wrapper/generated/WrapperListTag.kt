package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperListTag(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.nbt.ListTag") }
        private val lookup = MethodHandles.lookup()

        val removeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "remove", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Int::class.javaPrimitiveType!!))
        }
        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Int::class.javaPrimitiveType!!))
        }
        val getShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShort", MethodType.methodType(Short::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInt", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFloat", MethodType.methodType(Float::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDouble", MethodType.methodType(Double::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val setHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "set", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.Tag")))
        }
        val acceptHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "accept", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult"), Class.forName("net.minecraft.nbt.StreamTagVisitor")))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.nbt.TagType")))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag")))
        }
        val getStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getString", MethodType.methodType(String::class.java, Int::class.javaPrimitiveType!!))
        }
        val getElementTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getElementType", MethodType.methodType(Byte::class.javaPrimitiveType!!))
        }
        val sizeInBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sizeInBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val setTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setTag", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.Tag")))
        }
        val addTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addTag", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.Tag")))
        }
        val getIntArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIntArray", MethodType.methodType(IntArray::class.java, Int::class.javaPrimitiveType!!))
        }
        val getLongArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLongArray", MethodType.methodType(Class.forName("[J"), Int::class.javaPrimitiveType!!))
        }
        val getListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getList", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag"), Int::class.javaPrimitiveType!!))
        }
        val getCompoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCompound", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Int::class.javaPrimitiveType!!))
        }
        val typeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("type")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun remove(arg0: Int): WrapperTag {
        return WrapperTag(removeHandle.invoke(handle, arg0))
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun get(arg0: Int): WrapperTag {
        return WrapperTag(getHandle.invoke(handle, arg0))
    }

    fun getShort(arg0: Int): Short {
        return getShortHandle.invoke(handle, arg0) as Short
    }

    fun getInt(arg0: Int): Int {
        return getIntHandle.invoke(handle, arg0) as Int
    }

    fun getFloat(arg0: Int): Float {
        return getFloatHandle.invoke(handle, arg0) as Float
    }

    fun getDouble(arg0: Int): Double {
        return getDoubleHandle.invoke(handle, arg0) as Double
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun set(arg0: Int, arg1: WrapperTag): WrapperTag {
        return WrapperTag(setHandle.invoke(handle, arg0, arg1.handle))
    }

    fun accept(arg0: WrapperStreamTagVisitor): Any {
        return acceptHandle.invoke(handle, arg0.handle) as Any
    }

    val id: Byte
        get() = getIdHandle.invoke(handle) as Byte

    val type: WrapperTagType
        get() = WrapperTagType(getTypeHandle.invoke(handle))

    val copy: WrapperListTag
        get() = WrapperListTag(copyHandle.invoke(handle))

    fun getString(arg0: Int): String {
        return getStringHandle.invoke(handle, arg0) as String
    }

    val elementType: Byte
        get() = getElementTypeHandle.invoke(handle) as Byte

    val sizeInBytes: Int
        get() = sizeInBytesHandle.invoke(handle) as Int

    fun setTag(arg0: Int, arg1: WrapperTag): Boolean {
        return setTagHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun addTag(arg0: Int, arg1: WrapperTag): Boolean {
        return addTagHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun getIntArray(arg0: Int): IntArray {
        return getIntArrayHandle.invoke(handle, arg0) as IntArray
    }

    fun getLongArray(arg0: Int): Any {
        return getLongArrayHandle.invoke(handle, arg0) as Any
    }

    fun getList(arg0: Int): WrapperListTag {
        return WrapperListTag(getListHandle.invoke(handle, arg0))
    }

    fun getCompound(arg0: Int): WrapperCompoundTag {
        return WrapperCompoundTag(getCompoundHandle.invoke(handle, arg0))
    }

    fun setType(value: Byte) {
        typeSetterHandle.invoke(handle, value)
    }

}
