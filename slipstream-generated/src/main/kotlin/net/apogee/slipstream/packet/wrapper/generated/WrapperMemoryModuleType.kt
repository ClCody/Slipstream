package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMemoryModuleType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType") }
        private val lookup = MethodHandles.lookup()

        val getCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCodec", MethodType.methodType(Class.forName("java.util.Optional")))
        }
    }

    val codec: Any
        get() = getCodecHandle.invoke(handle) as Any

}
