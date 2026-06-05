package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPositionalRandomFactory(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.PositionalRandomFactory") }
        private val lookup = MethodHandles.lookup()

        val atHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "at", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val fromSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fromSeed", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource"), Long::class.javaPrimitiveType!!))
        }
        val fromHashOfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fromHashOf", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    fun at(arg0: WrapperBlockPos): WrapperRandomSource {
        return WrapperRandomSource(atHandle.invoke(handle, arg0.handle))
    }

    fun fromSeed(arg0: Long): WrapperRandomSource {
        return WrapperRandomSource(fromSeedHandle.invoke(handle, arg0))
    }

    fun fromHashOf(arg0: WrapperResourceLocation): WrapperRandomSource {
        return WrapperRandomSource(fromHashOfHandle.invoke(handle, arg0.handle))
    }

}
