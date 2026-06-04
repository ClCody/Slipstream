package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerAdvancementManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.ServerAdvancementManager") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementHolder"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val treeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tree", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementTree")))
        }
        val getAllAdvancementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllAdvancements", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val advancementsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("advancements")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val treeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tree")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: WrapperResourceLocation): WrapperAdvancementHolder {
        return WrapperAdvancementHolder(getHandle.invoke(handle, arg0.handle))
    }

    val tree: WrapperAdvancementTree
        get() = WrapperAdvancementTree(treeHandle.invoke(handle))

    val allAdvancements: Any
        get() = getAllAdvancementsHandle.invoke(handle) as Any

    fun setAdvancements(value: Any) {
        advancementsSetterHandle.invoke(handle, value)
    }

    fun setTree(value: WrapperAdvancementTree) {
        treeSetterHandle.invoke(handle, value.handle)
    }

}
