package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCommands(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.commands.Commands") }
        private val lookup = MethodHandles.lookup()

        val getDispatcherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDispatcher", MethodType.methodType(Class.forName("com.mojang.brigadier.CommandDispatcher")))
        }
    }

    val dispatcher: Any
        get() = getDispatcherHandle.invoke(handle) as Any

}
