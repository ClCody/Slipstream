package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundPlayerInfoRemovePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerInfoRemovePacket") }
        private val lookup = MethodHandles.lookup()

        val profileIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "profileIds", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List")))
        }
    }

    val profileIds: Any
        get() = profileIdsHandle.invoke(handle) as Any

    fun copy(profileIds: Any = this.profileIds): WrapperClientboundPlayerInfoRemovePacket {
        return WrapperClientboundPlayerInfoRemovePacket(constructorHandle.invoke(profileIds))
    }

}
