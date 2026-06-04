package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRuleSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.SurfaceRules\$RuleSource") }
        private val lookup = MethodHandles.lookup()

        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("net.minecraft.util.KeyDispatchDataCodec")))
        }
    }

    val codec: WrapperKeyDispatchDataCodec
        get() = WrapperKeyDispatchDataCodec(codecHandle.invoke(handle))

}
