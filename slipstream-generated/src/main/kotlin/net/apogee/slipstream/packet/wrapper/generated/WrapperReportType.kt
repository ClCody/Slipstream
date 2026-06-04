package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperReportType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.ReportType") }
        private val lookup = MethodHandles.lookup()

        val headerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "header", MethodType.methodType(String::class.java))
        }
        val nuggetsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nuggets", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("java.util.List")))
        }
    }

    val header: String
        get() = headerHandle.invoke(handle) as String

    val nuggets: Any
        get() = nuggetsHandle.invoke(handle) as Any

    fun copy(header: String = this.header, nuggets: Any = this.nuggets): WrapperReportType {
        return WrapperReportType(constructorHandle.invoke(header, nuggets))
    }

}
