package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperGameProfileCache(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.players.GameProfileCache") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.UUID")))
        }
        val loadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "load", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getProfileIfCachedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfileIfCached", MethodType.methodType(Class.forName("com.mojang.authlib.GameProfile"), String::class.java))
        }
        val getAsyncHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAsync", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), String::class.java))
        }
        val executorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("executor")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: Any): Any {
        return getHandle.invoke(handle, arg0) as Any
    }

    val load: Any
        get() = loadHandle.invoke(handle) as Any

    fun getProfileIfCached(arg0: String): Any {
        return getProfileIfCachedHandle.invoke(handle, arg0) as Any
    }

    fun getAsync(arg0: String): Any {
        return getAsyncHandle.invoke(handle, arg0) as Any
    }

    fun setExecutor(value: Any) {
        executorSetterHandle.invoke(handle, value)
    }

}
