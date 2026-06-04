package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTextFilter(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.network.TextFilter") }
        private val lookup = MethodHandles.lookup()

        val processStreamMessageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "processStreamMessage", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), String::class.java))
        }
        val processMessageBundleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "processMessageBundle", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("java.util.List")))
        }
    }

    fun processStreamMessage(arg0: String): Any {
        return processStreamMessageHandle.invoke(handle, arg0) as Any
    }

    fun processMessageBundle(arg0: Any): Any {
        return processMessageBundleHandle.invoke(handle, arg0) as Any
    }

}
