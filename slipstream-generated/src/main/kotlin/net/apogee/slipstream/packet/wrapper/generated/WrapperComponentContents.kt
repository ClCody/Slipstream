package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperComponentContents(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.ComponentContents") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.chat.ComponentContents\$Type")))
        }
        val resolveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "resolve", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.world.entity.Entity"), Int::class.javaPrimitiveType!!))
        }
        val visitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visit", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.network.chat.FormattedText\$ContentConsumer")))
        }
    }

    val type: WrapperType
        get() = WrapperType(typeHandle.invoke(handle))

    fun resolve(arg0: WrapperCommandSourceStack, arg1: WrapperEntity, arg2: Int): WrapperMutableComponent {
        return WrapperMutableComponent(resolveHandle.invoke(handle, arg0.handle, arg1.handle, arg2))
    }

    fun visit(arg0: WrapperContentConsumer): Any {
        return visitHandle.invoke(handle, arg0.handle) as Any
    }

}
