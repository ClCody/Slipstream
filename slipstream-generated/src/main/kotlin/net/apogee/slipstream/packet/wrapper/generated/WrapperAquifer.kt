package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAquifer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.Aquifer") }
        private val lookup = MethodHandles.lookup()

        val computeSubstanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "computeSubstance", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$FunctionContext"), Double::class.javaPrimitiveType!!))
        }
        val shouldScheduleFluidUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldScheduleFluidUpdate", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    fun computeSubstance(arg0: WrapperFunctionContext, arg1: Double): WrapperBlockState {
        return WrapperBlockState(computeSubstanceHandle.invoke(handle, arg0.handle, arg1))
    }

    val shouldScheduleFluidUpdate: Boolean
        get() = shouldScheduleFluidUpdateHandle.invoke(handle) as Boolean

}
