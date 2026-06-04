package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperVisitor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$Visitor") }
        private val lookup = MethodHandles.lookup()

        val applyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "apply", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val visitNoiseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitNoise", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$NoiseHolder"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$NoiseHolder")))
        }
    }

    fun apply(arg0: WrapperDensityFunction): WrapperDensityFunction {
        return WrapperDensityFunction(applyHandle.invoke(handle, arg0.handle))
    }

    fun visitNoise(arg0: WrapperNoiseHolder): WrapperNoiseHolder {
        return WrapperNoiseHolder(visitNoiseHandle.invoke(handle, arg0.handle))
    }

}
