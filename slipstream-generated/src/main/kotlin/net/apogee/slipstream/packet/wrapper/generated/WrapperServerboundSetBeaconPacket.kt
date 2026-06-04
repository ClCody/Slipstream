package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSetBeaconPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSetBeaconPacket") }
        private val lookup = MethodHandles.lookup()

        val primaryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "primary", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val secondaryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "secondary", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.Optional"), Class.forName("java.util.Optional")))
        }
    }

    val primary: Any
        get() = primaryHandle.invoke(handle) as Any

    val secondary: Any
        get() = secondaryHandle.invoke(handle) as Any

    fun copy(primary: Any = this.primary, secondary: Any = this.secondary): WrapperServerboundSetBeaconPacket {
        return WrapperServerboundSetBeaconPacket(constructorHandle.invoke(primary, secondary))
    }

}
