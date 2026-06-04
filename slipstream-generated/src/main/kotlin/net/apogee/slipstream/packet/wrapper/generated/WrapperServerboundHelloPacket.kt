package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundHelloPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ServerboundHelloPacket") }
        private val lookup = MethodHandles.lookup()

        val nameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "name", MethodType.methodType(String::class.java))
        }
        val profileIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "profileId", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("java.util.UUID")))
        }
    }

    val name: String
        get() = nameHandle.invoke(handle) as String

    val profileId: Any
        get() = profileIdHandle.invoke(handle) as Any

    fun copy(name: String = this.name, profileId: Any = this.profileId): WrapperServerboundHelloPacket {
        return WrapperServerboundHelloPacket(constructorHandle.invoke(name, profileId))
    }

}
