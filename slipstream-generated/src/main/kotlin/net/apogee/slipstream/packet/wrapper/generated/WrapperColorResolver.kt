package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperColorResolver(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ColorResolver") }
        private val lookup = MethodHandles.lookup()

        val getColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getColor", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.biome.Biome"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
    }

    fun getColor(arg0: WrapperBiome, arg1: Double, arg2: Double): Int {
        return getColorHandle.invoke(handle, arg0.handle, arg1, arg2) as Int
    }

}
