package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAdvancementTree(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.AdvancementTree") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementNode"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val rootsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "roots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val nodesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nodes", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val listenerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("listener")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: WrapperResourceLocation): WrapperAdvancementNode {
        return WrapperAdvancementNode(getHandle.invoke(handle, arg0.handle))
    }

    val roots: Any
        get() = rootsHandle.invoke(handle) as Any

    val nodes: Any
        get() = nodesHandle.invoke(handle) as Any

    fun setListener(value: Any) {
        listenerSetterHandle.invoke(handle, value)
    }

}
