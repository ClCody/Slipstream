package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTag(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.nbt.Tag") }
        private val lookup = MethodHandles.lookup()

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
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag")))
        }
        val sizeInBytesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sizeInBytes", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAsStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAsString", MethodType.methodType(String::class.java))
        }
    }

    fun accept(arg0: WrapperStreamTagVisitor): Any {
        return acceptHandle.invoke(handle, arg0.handle) as Any
    }

    val id: Byte
        get() = getIdHandle.invoke(handle) as Byte

    val type: WrapperTagType
        get() = WrapperTagType(getTypeHandle.invoke(handle))

    val copy: WrapperTag
        get() = WrapperTag(copyHandle.invoke(handle))

    val sizeInBytes: Int
        get() = sizeInBytesHandle.invoke(handle) as Int

    val asString: String
        get() = getAsStringHandle.invoke(handle) as String

}
