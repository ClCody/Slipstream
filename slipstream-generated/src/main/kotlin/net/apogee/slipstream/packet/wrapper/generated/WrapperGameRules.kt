package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperGameRules(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.GameRules") }
        private val lookup = MethodHandles.lookup()

        val getBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoolean", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.GameRules\$Key")))
        }
        val getIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInt", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.GameRules\$Key")))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
        }
        val createTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getRuleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRule", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules\$Value"), Class.forName("net.minecraft.world.level.GameRules\$Key")))
        }
    }

    fun getBoolean(arg0: WrapperKey): Boolean {
        return getBooleanHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getInt(arg0: WrapperKey): Int {
        return getIntHandle.invoke(handle, arg0.handle) as Int
    }

    val copy: WrapperGameRules
        get() = WrapperGameRules(copyHandle.invoke(handle))

    val createTag: WrapperCompoundTag
        get() = WrapperCompoundTag(createTagHandle.invoke(handle))

    fun getRule(arg0: WrapperKey): WrapperValue {
        return WrapperValue(getRuleHandle.invoke(handle, arg0.handle))
    }

}
