package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundDebugSamplePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundDebugSamplePacket") }
        private val lookup = MethodHandles.lookup()

        val sampleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sample", MethodType.methodType(Class.forName("[J")))
        }
        val debugSampleTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "debugSampleType", MethodType.methodType(Class.forName("net.minecraft.util.debugchart.RemoteDebugSampleType")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("[J"), Class.forName("net.minecraft.util.debugchart.RemoteDebugSampleType")))
        }
    }

    val sample: Any
        get() = sampleHandle.invoke(handle) as Any

    val debugSampleType: Any
        get() = debugSampleTypeHandle.invoke(handle) as Any

    fun copy(sample: Any = this.sample, debugSampleType: Any = this.debugSampleType): WrapperClientboundDebugSamplePacket {
        return WrapperClientboundDebugSamplePacket(constructorHandle.invoke(sample, debugSampleType))
    }

}
