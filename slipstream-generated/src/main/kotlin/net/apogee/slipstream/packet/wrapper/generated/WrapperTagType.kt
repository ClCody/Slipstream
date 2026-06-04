package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTagType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.nbt.TagType") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val loadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "load", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Class.forName("java.io.DataInput"), Class.forName("net.minecraft.nbt.NbtAccounter")))
        }
        val parseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "parse", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult"), Class.forName("java.io.DataInput"), Class.forName("net.minecraft.nbt.StreamTagVisitor"), Class.forName("net.minecraft.nbt.NbtAccounter")))
        }
        val isValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValue", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPrettyNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPrettyName", MethodType.methodType(String::class.java))
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    fun load(arg0: Any, arg1: WrapperNbtAccounter): WrapperTag {
        return WrapperTag(loadHandle.invoke(handle, arg0, arg1.handle))
    }

    fun parse(arg0: Any, arg1: WrapperStreamTagVisitor, arg2: WrapperNbtAccounter): Any {
        return parseHandle.invoke(handle, arg0, arg1.handle, arg2.handle) as Any
    }

    val value: Boolean
        get() = isValueHandle.invoke(handle) as Boolean

    val prettyName: String
        get() = getPrettyNameHandle.invoke(handle) as String

}
