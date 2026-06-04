package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundResourcePackPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ServerboundResourcePackPacket") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val actionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "action", MethodType.methodType(Class.forName("net.minecraft.network.protocol.common.ServerboundResourcePackPacket\$Action")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.UUID"), Class.forName("net.minecraft.network.protocol.common.ServerboundResourcePackPacket\$Action")))
        }
    }

    val id: Any
        get() = idHandle.invoke(handle) as Any

    val action: Any
        get() = actionHandle.invoke(handle) as Any

    fun copy(id: Any = this.id, action: Any = this.action): WrapperServerboundResourcePackPacket {
        return WrapperServerboundResourcePackPacket(constructorHandle.invoke(id, action))
    }

}
