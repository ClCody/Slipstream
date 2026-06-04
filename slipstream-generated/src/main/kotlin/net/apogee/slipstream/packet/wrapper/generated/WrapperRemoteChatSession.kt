package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperRemoteChatSession(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.RemoteChatSession") }
        private val lookup = MethodHandles.lookup()

        val sessionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sessionId", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val profilePublicKeyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "profilePublicKey", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.ProfilePublicKey")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.UUID"), Class.forName("net.minecraft.world.entity.player.ProfilePublicKey")))
        }
    }

    val sessionId: Any
        get() = sessionIdHandle.invoke(handle) as Any

    val profilePublicKey: WrapperProfilePublicKey
        get() = WrapperProfilePublicKey(profilePublicKeyHandle.invoke(handle))

    fun copy(sessionId: Any = this.sessionId, profilePublicKey: WrapperProfilePublicKey = this.profilePublicKey): WrapperRemoteChatSession {
        return WrapperRemoteChatSession(constructorHandle.invoke(sessionId, profilePublicKey.handle))
    }

}
