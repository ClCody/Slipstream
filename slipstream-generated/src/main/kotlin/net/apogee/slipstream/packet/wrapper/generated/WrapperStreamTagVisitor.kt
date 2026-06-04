package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStreamTagVisitor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.nbt.StreamTagVisitor") }
        private val lookup = MethodHandles.lookup()

        val visitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visit", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult"), Long::class.javaPrimitiveType!!))
        }
        val visitEndHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitEnd", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult")))
        }
        val visitListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitList", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult"), Class.forName("net.minecraft.nbt.TagType"), Int::class.javaPrimitiveType!!))
        }
        val visitEntryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitEntry", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$EntryResult"), Class.forName("net.minecraft.nbt.TagType"), String::class.java))
        }
        val visitElementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitElement", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$EntryResult"), Class.forName("net.minecraft.nbt.TagType"), Int::class.javaPrimitiveType!!))
        }
        val visitRootEntryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitRootEntry", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult"), Class.forName("net.minecraft.nbt.TagType")))
        }
        val visitContainerEndHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitContainerEnd", MethodType.methodType(Class.forName("net.minecraft.nbt.StreamTagVisitor\$ValueResult")))
        }
    }

    fun visit(arg0: Long): Any {
        return visitHandle.invoke(handle, arg0) as Any
    }

    val visitEnd: Any
        get() = visitEndHandle.invoke(handle) as Any

    fun visitList(arg0: WrapperTagType, arg1: Int): Any {
        return visitListHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun visitEntry(arg0: WrapperTagType, arg1: String): Any {
        return visitEntryHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun visitElement(arg0: WrapperTagType, arg1: Int): Any {
        return visitElementHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun visitRootEntry(arg0: WrapperTagType): Any {
        return visitRootEntryHandle.invoke(handle, arg0.handle) as Any
    }

    val visitContainerEnd: Any
        get() = visitContainerEndHandle.invoke(handle) as Any

}
