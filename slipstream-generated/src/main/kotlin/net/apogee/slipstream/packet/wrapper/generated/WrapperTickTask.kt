package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTickTask(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.TickTask") }
        private val lookup = MethodHandles.lookup()

        val getTickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTick", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val tick: Int
        get() = getTickHandle.invoke(handle) as Int

}
