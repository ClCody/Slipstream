package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLootParams(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.loot.LootParams") }
        private val lookup = MethodHandles.lookup()

        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getLuckHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLuck", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getParamOrNullHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParamOrNull", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParam")))
        }
        val getOptionalParameterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOptionalParameter", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParam")))
        }
        val hasParamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasParam", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParam")))
        }
        val getParameterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getParameter", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParam")))
        }
    }

    val level: WrapperServerLevel
        get() = WrapperServerLevel(getLevelHandle.invoke(handle))

    val luck: Float
        get() = getLuckHandle.invoke(handle) as Float

    fun getParamOrNull(arg0: WrapperLootContextParam): Any {
        return getParamOrNullHandle.invoke(handle, arg0.handle) as Any
    }

    fun getOptionalParameter(arg0: WrapperLootContextParam): Any {
        return getOptionalParameterHandle.invoke(handle, arg0.handle) as Any
    }

    fun hasParam(arg0: WrapperLootContextParam): Boolean {
        return hasParamHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getParameter(arg0: WrapperLootContextParam): Any {
        return getParameterHandle.invoke(handle, arg0.handle) as Any
    }

}
