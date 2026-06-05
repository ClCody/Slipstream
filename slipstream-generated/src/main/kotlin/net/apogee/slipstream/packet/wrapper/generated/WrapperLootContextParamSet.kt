package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLootContextParamSet(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParamSet") }
        private val lookup = MethodHandles.lookup()

        val getAllowedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllowed", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getRequiredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRequired", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val isAllowedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowed", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.storage.loot.parameters.LootContextParam")))
        }
    }

    val allowed: Any
        get() = getAllowedHandle.invoke(handle) as Any

    val required: Any
        get() = getRequiredHandle.invoke(handle) as Any

    fun isAllowed(arg0: WrapperLootContextParam): Boolean {
        return isAllowedHandle.invoke(handle, arg0.handle) as Boolean
    }

}
