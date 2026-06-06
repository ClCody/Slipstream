package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCustomBossEvent(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.bossevents.CustomBossEvent") }
        private val lookup = MethodHandles.lookup()

        val getValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getMaxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMax", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBukkitEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitEntity", MethodType.methodType(Class.forName("org.bukkit.boss.KeyedBossBar")))
        }
        val setPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setPlayers", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Collection")))
        }
        val getTextIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTextId", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val valueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("value")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("max")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bossBarSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bossBar")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val value: Int
        get() = getValueHandle.invoke(handle) as Int

    fun save(arg0: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle))
    }

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val max: Int
        get() = getMaxHandle.invoke(handle) as Int

    val bukkitEntity: Any
        get() = getBukkitEntityHandle.invoke(handle) as Any

    fun setPlayers(arg0: Any): Boolean {
        return setPlayersHandle.invoke(handle, arg0) as Boolean
    }

    val textId: WrapperResourceLocation
        get() = WrapperResourceLocation(getTextIdHandle.invoke(handle))

    fun setValue(value: Int) {
        valueSetterHandle.invoke(handle, value)
    }

    fun setMax(value: Int) {
        maxSetterHandle.invoke(handle, value)
    }

    fun setBossBar(value: Any) {
        bossBarSetterHandle.invoke(handle, value)
    }

}
