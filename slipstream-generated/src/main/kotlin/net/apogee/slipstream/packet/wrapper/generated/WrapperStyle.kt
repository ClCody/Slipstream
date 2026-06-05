package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStyle(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.Style") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withColor", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.ChatFormatting")))
        }
        val withClickEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withClickEvent", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.network.chat.ClickEvent")))
        }
        val withInsertionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withInsertion", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), String::class.java))
        }
        val isBoldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBold", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withFontHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withFont", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val isItalicHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isItalic", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withItalicHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withItalic", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("java.lang.Boolean")))
        }
        val getFontHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFont", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val withBoldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withBold", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("java.lang.Boolean")))
        }
        val withHoverEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withHoverEvent", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.network.chat.HoverEvent")))
        }
        val getColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getColor", MethodType.methodType(Class.forName("net.minecraft.network.chat.TextColor")))
        }
        val applyToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyTo", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.network.chat.Style")))
        }
        val withUnderlinedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withUnderlined", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("java.lang.Boolean")))
        }
        val applyLegacyFormatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyLegacyFormat", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.ChatFormatting")))
        }
        val applyFormatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyFormats", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("[Lnet.minecraft.ChatFormatting;")))
        }
        val isStrikethroughHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStrikethrough", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isObfuscatedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isObfuscated", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getClickEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClickEvent", MethodType.methodType(Class.forName("net.minecraft.network.chat.ClickEvent")))
        }
        val withStrikethroughHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withStrikethrough", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("java.lang.Boolean")))
        }
        val isUnderlinedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUnderlined", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getHoverEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHoverEvent", MethodType.methodType(Class.forName("net.minecraft.network.chat.HoverEvent")))
        }
        val applyFormatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "applyFormat", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("net.minecraft.ChatFormatting")))
        }
        val withObfuscatedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withObfuscated", MethodType.methodType(Class.forName("net.minecraft.network.chat.Style"), Class.forName("java.lang.Boolean")))
        }
        val getInsertionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInsertion", MethodType.methodType(String::class.java))
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun withColor(arg0: Any): WrapperStyle {
        return WrapperStyle(withColorHandle.invoke(handle, arg0))
    }

    fun withClickEvent(arg0: WrapperClickEvent): WrapperStyle {
        return WrapperStyle(withClickEventHandle.invoke(handle, arg0.handle))
    }

    fun withInsertion(arg0: String): WrapperStyle {
        return WrapperStyle(withInsertionHandle.invoke(handle, arg0))
    }

    val bold: Boolean
        get() = isBoldHandle.invoke(handle) as Boolean

    fun withFont(arg0: WrapperResourceLocation): WrapperStyle {
        return WrapperStyle(withFontHandle.invoke(handle, arg0.handle))
    }

    val italic: Boolean
        get() = isItalicHandle.invoke(handle) as Boolean

    fun withItalic(arg0: Any): WrapperStyle {
        return WrapperStyle(withItalicHandle.invoke(handle, arg0))
    }

    val font: WrapperResourceLocation
        get() = WrapperResourceLocation(getFontHandle.invoke(handle))

    fun withBold(arg0: Any): WrapperStyle {
        return WrapperStyle(withBoldHandle.invoke(handle, arg0))
    }

    fun withHoverEvent(arg0: WrapperHoverEvent): WrapperStyle {
        return WrapperStyle(withHoverEventHandle.invoke(handle, arg0.handle))
    }

    val color: WrapperTextColor
        get() = WrapperTextColor(getColorHandle.invoke(handle))

    fun applyTo(arg0: WrapperStyle): WrapperStyle {
        return WrapperStyle(applyToHandle.invoke(handle, arg0.handle))
    }

    fun withUnderlined(arg0: Any): WrapperStyle {
        return WrapperStyle(withUnderlinedHandle.invoke(handle, arg0))
    }

    fun applyLegacyFormat(arg0: Any): WrapperStyle {
        return WrapperStyle(applyLegacyFormatHandle.invoke(handle, arg0))
    }

    fun applyFormats(arg0: Any): WrapperStyle {
        return WrapperStyle(applyFormatsHandle.invoke(handle, arg0))
    }

    val strikethrough: Boolean
        get() = isStrikethroughHandle.invoke(handle) as Boolean

    val obfuscated: Boolean
        get() = isObfuscatedHandle.invoke(handle) as Boolean

    val clickEvent: WrapperClickEvent
        get() = WrapperClickEvent(getClickEventHandle.invoke(handle))

    fun withStrikethrough(arg0: Any): WrapperStyle {
        return WrapperStyle(withStrikethroughHandle.invoke(handle, arg0))
    }

    val underlined: Boolean
        get() = isUnderlinedHandle.invoke(handle) as Boolean

    val hoverEvent: WrapperHoverEvent
        get() = WrapperHoverEvent(getHoverEventHandle.invoke(handle))

    fun applyFormat(arg0: Any): WrapperStyle {
        return WrapperStyle(applyFormatHandle.invoke(handle, arg0))
    }

    fun withObfuscated(arg0: Any): WrapperStyle {
        return WrapperStyle(withObfuscatedHandle.invoke(handle, arg0))
    }

    val insertion: String
        get() = getInsertionHandle.invoke(handle) as String

}
