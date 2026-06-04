package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAdvancementNode(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.AdvancementNode") }
        private val lookup = MethodHandles.lookup()

        val parentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "parent", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementNode")))
        }
        val rootHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "root", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementNode")))
        }
        val holderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holder", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementHolder")))
        }
        val childrenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "children", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val advancementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "advancement", MethodType.methodType(Class.forName("net.minecraft.advancements.Advancement")))
        }
    }

    val parent: WrapperAdvancementNode
        get() = WrapperAdvancementNode(parentHandle.invoke(handle))

    val root: WrapperAdvancementNode
        get() = WrapperAdvancementNode(rootHandle.invoke(handle))

    val holder: WrapperAdvancementHolder
        get() = WrapperAdvancementHolder(holderHandle.invoke(handle))

    val children: Any
        get() = childrenHandle.invoke(handle) as Any

    val advancement: WrapperAdvancement
        get() = WrapperAdvancement(advancementHandle.invoke(handle))

}
