package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPacketType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.PacketType") }
        private val lookup = MethodHandles.lookup()

        val flowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "flow", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketFlow")))
        }
        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.protocol.PacketFlow"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val flow: Any
        get() = flowHandle.invoke(handle) as Any

    val id: WrapperResourceLocation
        get() = WrapperResourceLocation(idHandle.invoke(handle))

    fun copy(flow: Any = this.flow, id: WrapperResourceLocation = this.id): WrapperPacketType {
        return WrapperPacketType(constructorHandle.invoke(flow, id.handle))
    }

}
