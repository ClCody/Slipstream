package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDensityFunction(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.DensityFunction") }
        private val lookup = MethodHandles.lookup()

        val absHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "abs", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val clampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clamp", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val computeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compute", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$FunctionContext")))
        }
        val maxValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxValue", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val squareHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "square", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val minValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "minValue", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val cubeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cube", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val mapAllHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mapAll", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction"), Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$Visitor")))
        }
        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("net.minecraft.util.KeyDispatchDataCodec")))
        }
        val squeezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "squeeze", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val halfNegativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "halfNegative", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
        val quarterNegativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "quarterNegative", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.DensityFunction")))
        }
    }

    val abs: WrapperDensityFunction
        get() = WrapperDensityFunction(absHandle.invoke(handle))

    fun clamp(arg0: Double, arg1: Double): WrapperDensityFunction {
        return WrapperDensityFunction(clampHandle.invoke(handle, arg0, arg1))
    }

    fun compute(arg0: WrapperFunctionContext): Double {
        return computeHandle.invoke(handle, arg0.handle) as Double
    }

    val maxValue: Double
        get() = maxValueHandle.invoke(handle) as Double

    val square: WrapperDensityFunction
        get() = WrapperDensityFunction(squareHandle.invoke(handle))

    val minValue: Double
        get() = minValueHandle.invoke(handle) as Double

    val cube: WrapperDensityFunction
        get() = WrapperDensityFunction(cubeHandle.invoke(handle))

    fun mapAll(arg0: WrapperVisitor): WrapperDensityFunction {
        return WrapperDensityFunction(mapAllHandle.invoke(handle, arg0.handle))
    }

    val codec: WrapperKeyDispatchDataCodec
        get() = WrapperKeyDispatchDataCodec(codecHandle.invoke(handle))

    val squeeze: WrapperDensityFunction
        get() = WrapperDensityFunction(squeezeHandle.invoke(handle))

    val halfNegative: WrapperDensityFunction
        get() = WrapperDensityFunction(halfNegativeHandle.invoke(handle))

    val quarterNegative: WrapperDensityFunction
        get() = WrapperDensityFunction(quarterNegativeHandle.invoke(handle))

}
