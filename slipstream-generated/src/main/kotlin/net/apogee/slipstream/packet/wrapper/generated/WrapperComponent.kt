package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperComponent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.Component") }
        private val lookup = MethodHandles.lookup()

        val iteratorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "iterator", MethodType.methodType(Class.forName("java.util.Iterator")))
        }
        val streamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stream", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val containsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "contains", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.Component")))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent")))
        }
        val visitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visit", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.network.chat.FormattedText\$ContentConsumer")))
        }
        val getStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getString", MethodType.methodType(String::class.java))
        }
        val getContentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContents", MethodType.methodType(Class.forName("net.minecraft.network.chat.ComponentContents")))
        }
        val getVisualOrderTextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisualOrderText", MethodType.methodType(Class.forName("net.minecraft.util.FormattedCharSequence")))
        }
        val getSiblingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSiblings", MethodType.methodType(Class.forName("java.util.List")))
        }
        val tryCollapseToStringHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryCollapseToString", MethodType.methodType(String::class.java))
        }
        val getStyleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStyle", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style")))
        }
        val toFlatListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "toFlatList", MethodType.methodType(Class.forName("java.util.List")))
        }
        val plainCopyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "plainCopy", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent")))
        }
    }

    val iterator: Any
        get() = iteratorHandle.invoke(handle) as Any

    val stream: Any
        get() = streamHandle.invoke(handle) as Any

    fun contains(arg0: WrapperComponent): Boolean {
        return containsHandle.invoke(handle, arg0.handle) as Boolean
    }

    val copy: WrapperMutableComponent
        get() = WrapperMutableComponent(copyHandle.invoke(handle))

    fun visit(arg0: WrapperContentConsumer): Any {
        return visitHandle.invoke(handle, arg0.handle) as Any
    }

    val string: String
        get() = getStringHandle.invoke(handle) as String

    val contents: WrapperComponentContents
        get() = WrapperComponentContents(getContentsHandle.invoke(handle))

    val visualOrderText: WrapperFormattedCharSequence
        get() = WrapperFormattedCharSequence(getVisualOrderTextHandle.invoke(handle))

    val siblings: Any
        get() = getSiblingsHandle.invoke(handle) as Any

    val tryCollapseToString: String
        get() = tryCollapseToStringHandle.invoke(handle) as String

    val style: WrapperStyle
        get() = WrapperStyle(getStyleHandle.invoke(handle))

    val toFlatList: Any
        get() = toFlatListHandle.invoke(handle) as Any

    val plainCopy: WrapperMutableComponent
        get() = WrapperMutableComponent(plainCopyHandle.invoke(handle))

}
