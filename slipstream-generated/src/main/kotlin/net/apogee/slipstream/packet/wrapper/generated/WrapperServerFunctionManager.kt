package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerFunctionManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.ServerFunctionManager") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTag", MethodType.methodType(Class.forName("java.util.Collection"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getTagNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTagNames", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getGameLoopSenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameLoopSender", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val getFunctionNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFunctionNames", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getDispatcherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDispatcher", MethodType.methodType(Class.forName("com.mojang.brigadier.CommandDispatcher")))
        }
        val tickingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticking")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val postReloadSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("postReload")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val librarySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("library")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: WrapperResourceLocation): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    fun getTag(arg0: WrapperResourceLocation): Any {
        return getTagHandle.invoke(handle, arg0.handle) as Any
    }

    val tagNames: Any
        get() = getTagNamesHandle.invoke(handle) as Any

    val gameLoopSender: WrapperCommandSourceStack
        get() = WrapperCommandSourceStack(getGameLoopSenderHandle.invoke(handle))

    val functionNames: Any
        get() = getFunctionNamesHandle.invoke(handle) as Any

    val dispatcher: Any
        get() = getDispatcherHandle.invoke(handle) as Any

    fun setTicking(value: Any) {
        tickingSetterHandle.invoke(handle, value)
    }

    fun setPostReload(value: Boolean) {
        postReloadSetterHandle.invoke(handle, value)
    }

    fun setLibrary(value: Any) {
        librarySetterHandle.invoke(handle, value)
    }

}
