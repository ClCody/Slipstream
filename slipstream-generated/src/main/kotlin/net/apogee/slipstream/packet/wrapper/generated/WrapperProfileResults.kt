package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperProfileResults(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.profiling.ProfileResults") }
        private val lookup = MethodHandles.lookup()

        val getProfilerResultsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfilerResults", MethodType.methodType(String::class.java))
        }
        val saveResultsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveResults", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.nio.file.Path")))
        }
        val getStartTimeTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStartTimeTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getEndTimeNanoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEndTimeNano", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getStartTimeNanoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStartTimeNano", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getTickDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickDuration", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getNanoDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNanoDuration", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getEndTimeTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEndTimeTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getTimesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTimes", MethodType.methodType(Class.forName("java.util.List"), String::class.java))
        }
    }

    val profilerResults: String
        get() = getProfilerResultsHandle.invoke(handle) as String

    fun saveResults(arg0: Any): Boolean {
        return saveResultsHandle.invoke(handle, arg0) as Boolean
    }

    val startTimeTicks: Int
        get() = getStartTimeTicksHandle.invoke(handle) as Int

    val endTimeNano: Long
        get() = getEndTimeNanoHandle.invoke(handle) as Long

    val startTimeNano: Long
        get() = getStartTimeNanoHandle.invoke(handle) as Long

    val tickDuration: Int
        get() = getTickDurationHandle.invoke(handle) as Int

    val nanoDuration: Long
        get() = getNanoDurationHandle.invoke(handle) as Long

    val endTimeTicks: Int
        get() = getEndTimeTicksHandle.invoke(handle) as Int

    fun getTimes(arg0: String): Any {
        return getTimesHandle.invoke(handle, arg0) as Any
    }

}
