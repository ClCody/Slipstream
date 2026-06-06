package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMutableComponent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.MutableComponent") }
        private val lookup = MethodHandles.lookup()

        val appendHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "append", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), String::class.java))
        }
        val getContentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContents", MethodType.methodType(Class.forName("net.minecraft.network.chat.ComponentContents")))
        }
        val setStyleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setStyle", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Class.forName("net.minecraft.network.chat.Style")))
        }
        val withColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withColor", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Int::class.javaPrimitiveType!!))
        }
        val getSiblingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSiblings", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getVisualOrderTextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisualOrderText", MethodType.methodType(Class.forName("net.minecraft.util.FormattedCharSequence")))
        }
        val getStyleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStyle", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style")))
        }
        val withStyleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withStyle", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Class.forName("java.util.function.UnaryOperator")))
        }
        val visualOrderTextSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("visualOrderText")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val decomposedWithSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("decomposedWith")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun append(arg0: String): WrapperMutableComponent {
        return WrapperMutableComponent(appendHandle.invoke(handle, arg0))
    }

    val contents: WrapperComponentContents
        get() = WrapperComponentContents(getContentsHandle.invoke(handle))

    fun setStyle(arg0: WrapperStyle): WrapperMutableComponent {
        return WrapperMutableComponent(setStyleHandle.invoke(handle, arg0.handle))
    }

    fun withColor(arg0: Int): WrapperMutableComponent {
        return WrapperMutableComponent(withColorHandle.invoke(handle, arg0))
    }

    val siblings: Any
        get() = getSiblingsHandle.invoke(handle) as Any

    val visualOrderText: WrapperFormattedCharSequence
        get() = WrapperFormattedCharSequence(getVisualOrderTextHandle.invoke(handle))

    val style: WrapperStyle
        get() = WrapperStyle(getStyleHandle.invoke(handle))

    fun withStyle(arg0: Any): WrapperMutableComponent {
        return WrapperMutableComponent(withStyleHandle.invoke(handle, arg0))
    }

    fun setVisualOrderText(value: WrapperFormattedCharSequence) {
        visualOrderTextSetterHandle.invoke(handle, value.handle)
    }

    fun setDecomposedWith(value: Any) {
        decomposedWithSetterHandle.invoke(handle, value)
    }

}
