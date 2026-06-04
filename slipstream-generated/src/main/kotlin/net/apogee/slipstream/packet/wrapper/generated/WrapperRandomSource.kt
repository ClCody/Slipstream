package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRandomSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.RandomSource") }
        private val lookup = MethodHandles.lookup()

        val nextDoubleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextDouble", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val nextIntHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextInt", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val nextLongHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextLong", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val nextBooleanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextBoolean", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val nextFloatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextFloat", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val nextGaussianHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextGaussian", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val forkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fork", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource")))
        }
        val triangleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "triangle", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val forkPositionalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forkPositional", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.PositionalRandomFactory")))
        }
        val nextIntBetweenInclusiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextIntBetweenInclusive", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    val nextDouble: Double
        get() = nextDoubleHandle.invoke(handle) as Double

    fun nextInt(arg0: Int): Int {
        return nextIntHandle.invoke(handle, arg0) as Int
    }

    val nextLong: Long
        get() = nextLongHandle.invoke(handle) as Long

    val nextBoolean: Boolean
        get() = nextBooleanHandle.invoke(handle) as Boolean

    val nextFloat: Float
        get() = nextFloatHandle.invoke(handle) as Float

    val nextGaussian: Double
        get() = nextGaussianHandle.invoke(handle) as Double

    val fork: WrapperRandomSource
        get() = WrapperRandomSource(forkHandle.invoke(handle))

    fun triangle(arg0: Double, arg1: Double): Double {
        return triangleHandle.invoke(handle, arg0, arg1) as Double
    }

    val forkPositional: WrapperPositionalRandomFactory
        get() = WrapperPositionalRandomFactory(forkPositionalHandle.invoke(handle))

    fun nextIntBetweenInclusive(arg0: Int, arg1: Int): Int {
        return nextIntBetweenInclusiveHandle.invoke(handle, arg0, arg1) as Int
    }

}
