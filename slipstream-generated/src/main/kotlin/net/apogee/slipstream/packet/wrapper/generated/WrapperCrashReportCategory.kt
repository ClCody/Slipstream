package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCrashReportCategory(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.CrashReportCategory") }
        private val lookup = MethodHandles.lookup()

        val fillInStackTraceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fillInStackTrace", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getStacktraceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStacktrace", MethodType.methodType(Class.forName("[Ljava.lang.StackTraceElement;")))
        }
        val validateStackTraceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "validateStackTrace", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.lang.StackTraceElement"), Class.forName("java.lang.StackTraceElement")))
        }
        val setDetailHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setDetail", MethodType.methodType(Class.forName("net.minecraft.CrashReportCategory"), String::class.java, Class.forName("java.lang.Object")))
        }
        val stackTraceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("stackTrace")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun fillInStackTrace(arg0: Int): Int {
        return fillInStackTraceHandle.invoke(handle, arg0) as Int
    }

    val stacktrace: Any
        get() = getStacktraceHandle.invoke(handle) as Any

    fun validateStackTrace(arg0: Any, arg1: Any): Boolean {
        return validateStackTraceHandle.invoke(handle, arg0, arg1) as Boolean
    }

    fun setDetail(arg0: String, arg1: Any): WrapperCrashReportCategory {
        return WrapperCrashReportCategory(setDetailHandle.invoke(handle, arg0, arg1))
    }

    fun setStackTrace(value: Any) {
        stackTraceSetterHandle.invoke(handle, value)
    }

}
