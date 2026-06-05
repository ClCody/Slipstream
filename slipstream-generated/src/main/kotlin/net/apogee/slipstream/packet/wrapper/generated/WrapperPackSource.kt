package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPackSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.repository.PackSource") }
        private val lookup = MethodHandles.lookup()

        val shouldAddAutomaticallyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldAddAutomatically", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val decorateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "decorate", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.network.chat.Component")))
        }
    }

    val shouldAddAutomatically: Boolean
        get() = shouldAddAutomaticallyHandle.invoke(handle) as Boolean

    fun decorate(arg0: WrapperComponent): WrapperComponent {
        return WrapperComponent(decorateHandle.invoke(handle, arg0.handle))
    }

}
