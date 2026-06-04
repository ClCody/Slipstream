package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDataPackConfig(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.DataPackConfig") }
        private val lookup = MethodHandles.lookup()

        val getDisabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisabled", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEnabled", MethodType.methodType(Class.forName("java.util.List")))
        }
    }

    val disabled: Any
        get() = getDisabledHandle.invoke(handle) as Any

    val enabled: Any
        get() = getEnabledHandle.invoke(handle) as Any

}
