package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundDebugSampleSubscriptionPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundDebugSampleSubscriptionPacket") }
        private val lookup = MethodHandles.lookup()

        val sampleTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sampleType", MethodType.methodType(Class.forName("net.minecraft.util.debugchart.RemoteDebugSampleType")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.util.debugchart.RemoteDebugSampleType")))
        }
    }

    val sampleType: Any
        get() = sampleTypeHandle.invoke(handle) as Any

    fun copy(sampleType: Any = this.sampleType): WrapperServerboundDebugSampleSubscriptionPacket {
        return WrapperServerboundDebugSampleSubscriptionPacket(constructorHandle.invoke(sampleType))
    }

}
