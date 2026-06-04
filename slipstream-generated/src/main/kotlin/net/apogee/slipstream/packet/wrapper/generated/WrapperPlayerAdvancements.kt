package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlayerAdvancements(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.PlayerAdvancements") }
        private val lookup = MethodHandles.lookup()

        val revokeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "revoke", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.advancements.AdvancementHolder"), String::class.java))
        }
        val awardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "award", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.advancements.AdvancementHolder"), String::class.java))
        }
        val getOrStartProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrStartProgress", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementProgress"), Class.forName("net.minecraft.advancements.AdvancementHolder")))
        }
        val treeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tree")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("player")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSelectedTabSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSelectedTab")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isFirstPacketSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isFirstPacket")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun revoke(arg0: WrapperAdvancementHolder, arg1: String): Boolean {
        return revokeHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun award(arg0: WrapperAdvancementHolder, arg1: String): Boolean {
        return awardHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun getOrStartProgress(arg0: WrapperAdvancementHolder): WrapperAdvancementProgress {
        return WrapperAdvancementProgress(getOrStartProgressHandle.invoke(handle, arg0.handle))
    }

    fun setTree(value: WrapperAdvancementTree) {
        treeSetterHandle.invoke(handle, value.handle)
    }

    fun setPlayer(value: WrapperServerPlayer) {
        playerSetterHandle.invoke(handle, value.handle)
    }

    fun setLastSelectedTab(value: WrapperAdvancementHolder) {
        lastSelectedTabSetterHandle.invoke(handle, value.handle)
    }

    fun setIsFirstPacket(value: Boolean) {
        isFirstPacketSetterHandle.invoke(handle, value)
    }

}
