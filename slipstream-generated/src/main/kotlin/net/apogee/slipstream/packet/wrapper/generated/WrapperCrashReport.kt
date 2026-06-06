package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCrashReport(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.CrashReport") }
        private val lookup = MethodHandles.lookup()

        val getExceptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getException", MethodType.methodType(Class.forName("java.lang.Throwable")))
        }
        val getExceptionMessageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExceptionMessage", MethodType.methodType(String::class.java))
        }
        val getTitleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTitle", MethodType.methodType(String::class.java))
        }
        val getFriendlyReportHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFriendlyReport", MethodType.methodType(String::class.java, Class.forName("net.minecraft.ReportType")))
        }
        val getSystemReportHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSystemReport", MethodType.methodType(Class.forName("net.minecraft.SystemReport")))
        }
        val getSaveFileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSaveFile", MethodType.methodType(Class.forName("java.nio.file.Path")))
        }
        val getDetailsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDetails", MethodType.methodType(String::class.java))
        }
        val saveToFileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveToFile", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.nio.file.Path"), Class.forName("net.minecraft.ReportType"), Class.forName("java.util.List")))
        }
        val addCategoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addCategory", MethodType.methodType(Class.forName("net.minecraft.CrashReportCategory"), String::class.java, Int::class.javaPrimitiveType!!))
        }
        val saveFileSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("saveFile")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val trackingStackTraceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("trackingStackTrace")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val uncategorizedStackTraceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("uncategorizedStackTrace")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val exception: Any
        get() = getExceptionHandle.invoke(handle) as Any

    val exceptionMessage: String
        get() = getExceptionMessageHandle.invoke(handle) as String

    val title: String
        get() = getTitleHandle.invoke(handle) as String

    fun getFriendlyReport(arg0: WrapperReportType): String {
        return getFriendlyReportHandle.invoke(handle, arg0.handle) as String
    }

    val systemReport: WrapperSystemReport
        get() = WrapperSystemReport(getSystemReportHandle.invoke(handle))

    val saveFile: Any
        get() = getSaveFileHandle.invoke(handle) as Any

    val details: String
        get() = getDetailsHandle.invoke(handle) as String

    fun saveToFile(arg0: Any, arg1: WrapperReportType, arg2: Any): Boolean {
        return saveToFileHandle.invoke(handle, arg0, arg1.handle, arg2) as Boolean
    }

    fun addCategory(arg0: String, arg1: Int): WrapperCrashReportCategory {
        return WrapperCrashReportCategory(addCategoryHandle.invoke(handle, arg0, arg1))
    }

    fun setSaveFile(value: Any) {
        saveFileSetterHandle.invoke(handle, value)
    }

    fun setTrackingStackTrace(value: Boolean) {
        trackingStackTraceSetterHandle.invoke(handle, value)
    }

    fun setUncategorizedStackTrace(value: Any) {
        uncategorizedStackTraceSetterHandle.invoke(handle, value)
    }

}
