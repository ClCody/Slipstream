package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCompoundTag(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.nbt.CompoundTag") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), String::class.java))
        }
        val putHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "put", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), String::class.java, Class.forName("net.minecraft.nbt.Tag")))
        }
        val getBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoolean", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val getByteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getByte", MethodType.methodType(Byte::class.javaPrimitiveType!!, String::class.java))
        }
        val getShortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShort", MethodType.methodType(Short::class.javaPrimitiveType!!, String::class.java))
        }
        val getIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInt", MethodType.methodType(Int::class.javaPrimitiveType!!, String::class.java))
        }
        val getLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLong", MethodType.methodType(Long::class.javaPrimitiveType!!, String::class.java))
        }
        val getFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFloat", MethodType.methodType(Float::class.javaPrimitiveType!!, String::class.java))
        }
        val getDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDouble", MethodType.methodType(Double::class.javaPrimitiveType!!, String::class.java))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java, Int::class.javaPrimitiveType!!))
        }
        val mergeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "merge", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag")))
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
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getString", MethodType.methodType(String::class.java, String::class.java))
        }
        val sizeInBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sizeInBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCompoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCompound", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), String::class.java))
        }
        val getLongArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLongArray", MethodType.methodType(Class.forName("[J"), String::class.java))
        }
        val getIntArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIntArray", MethodType.methodType(IntArray::class.java, String::class.java))
        }
        val getByteArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getByteArray", MethodType.methodType(ByteArray::class.java, String::class.java))
        }
        val hasUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasUUID", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val getAllKeysHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllKeys", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getTagTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTagType", MethodType.methodType(Byte::class.javaPrimitiveType!!, String::class.java))
        }
        val getUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUUID", MethodType.methodType(Class.forName("java.util.UUID"), String::class.java))
        }
        val getListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getList", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag"), String::class.java, Int::class.javaPrimitiveType!!))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun get(arg0: String): WrapperTag {
        return WrapperTag(getHandle.invoke(handle, arg0))
    }

    fun put(arg0: String, arg1: WrapperTag): WrapperTag {
        return WrapperTag(putHandle.invoke(handle, arg0, arg1.handle))
    }

    fun getBoolean(arg0: String): Boolean {
        return getBooleanHandle.invoke(handle, arg0) as Boolean
    }

    fun getByte(arg0: String): Byte {
        return getByteHandle.invoke(handle, arg0) as Byte
    }

    fun getShort(arg0: String): Short {
        return getShortHandle.invoke(handle, arg0) as Short
    }

    fun getInt(arg0: String): Int {
        return getIntHandle.invoke(handle, arg0) as Int
    }

    fun getLong(arg0: String): Long {
        return getLongHandle.invoke(handle, arg0) as Long
    }

    fun getFloat(arg0: String): Float {
        return getFloatHandle.invoke(handle, arg0) as Float
    }

    fun getDouble(arg0: String): Double {
        return getDoubleHandle.invoke(handle, arg0) as Double
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun contains(arg0: String, arg1: Int): Boolean {
        return containsHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun merge(arg0: WrapperCompoundTag): WrapperCompoundTag {
        return WrapperCompoundTag(mergeHandle.invoke(handle, arg0.handle))
    }

    fun accept(arg0: WrapperStreamTagVisitor): Any {
        return acceptHandle.invoke(handle, arg0.handle) as Any
    }

    val id: Byte
        get() = getIdHandle.invoke(handle) as Byte

    val type: WrapperTagType
        get() = WrapperTagType(getTypeHandle.invoke(handle))

    val copy: WrapperCompoundTag
        get() = WrapperCompoundTag(copyHandle.invoke(handle))

    fun getString(arg0: String): String {
        return getStringHandle.invoke(handle, arg0) as String
    }

    val sizeInBytes: Int
        get() = sizeInBytesHandle.invoke(handle) as Int

    fun getCompound(arg0: String): WrapperCompoundTag {
        return WrapperCompoundTag(getCompoundHandle.invoke(handle, arg0))
    }

    fun getLongArray(arg0: String): Any {
        return getLongArrayHandle.invoke(handle, arg0) as Any
    }

    fun getIntArray(arg0: String): IntArray {
        return getIntArrayHandle.invoke(handle, arg0) as IntArray
    }

    fun getByteArray(arg0: String): ByteArray {
        return getByteArrayHandle.invoke(handle, arg0) as ByteArray
    }

    fun hasUUID(arg0: String): Boolean {
        return hasUUIDHandle.invoke(handle, arg0) as Boolean
    }

    val allKeys: Any
        get() = getAllKeysHandle.invoke(handle) as Any

    fun getTagType(arg0: String): Byte {
        return getTagTypeHandle.invoke(handle, arg0) as Byte
    }

    fun getUUID(arg0: String): Any {
        return getUUIDHandle.invoke(handle, arg0) as Any
    }

    fun getList(arg0: String, arg1: Int): WrapperListTag {
        return WrapperListTag(getListHandle.invoke(handle, arg0, arg1))
    }

}
