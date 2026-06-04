package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDisconnectionDetails(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.DisconnectionDetails") }
        private val lookup = MethodHandles.lookup()

        val reasonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reason", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val reportHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "report", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val bugReportLinkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "bugReportLink", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component"), Class.forName("java.util.Optional"), Class.forName("java.util.Optional")))
        }
    }

    val reason: WrapperComponent
        get() = WrapperComponent(reasonHandle.invoke(handle))

    val report: Any
        get() = reportHandle.invoke(handle) as Any

    val bugReportLink: Any
        get() = bugReportLinkHandle.invoke(handle) as Any

    fun copy(reason: WrapperComponent = this.reason, report: Any = this.report, bugReportLink: Any = this.bugReportLink): WrapperDisconnectionDetails {
        return WrapperDisconnectionDetails(constructorHandle.invoke(reason.handle, report, bugReportLink))
    }

}
