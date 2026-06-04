package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundGameProfilePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.login.ClientboundGameProfilePacket") }
        private val lookup = MethodHandles.lookup()

        val gameProfileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gameProfile", MethodType.methodType(Class.forName("com.mojang.authlib.GameProfile")))
        }
        val strictErrorHandlingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "strictErrorHandling", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("com.mojang.authlib.GameProfile"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val gameProfile: Any
        get() = gameProfileHandle.invoke(handle) as Any

    val strictErrorHandling: Boolean
        get() = strictErrorHandlingHandle.invoke(handle) as Boolean

    fun copy(gameProfile: Any = this.gameProfile, strictErrorHandling: Boolean = this.strictErrorHandling): WrapperClientboundGameProfilePacket {
        return WrapperClientboundGameProfilePacket(constructorHandle.invoke(gameProfile, strictErrorHandling))
    }

}
