package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerStatus(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.status.ServerStatus") }
        private val lookup = MethodHandles.lookup()

        val descriptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "description", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val playersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "players", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val versionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "version", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val faviconHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "favicon", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val enforcesSecureChatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enforcesSecureChat", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.network.chat.Component"), Class.forName("java.util.Optional"), Class.forName("java.util.Optional"), Class.forName("java.util.Optional"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val description: WrapperComponent
        get() = WrapperComponent(descriptionHandle.invoke(handle))

    val players: Any
        get() = playersHandle.invoke(handle) as Any

    val version: Any
        get() = versionHandle.invoke(handle) as Any

    val favicon: Any
        get() = faviconHandle.invoke(handle) as Any

    val enforcesSecureChat: Boolean
        get() = enforcesSecureChatHandle.invoke(handle) as Boolean

    fun copy(description: WrapperComponent = this.description, players: Any = this.players, version: Any = this.version, favicon: Any = this.favicon, enforcesSecureChat: Boolean = this.enforcesSecureChat): WrapperServerStatus {
        return WrapperServerStatus(constructorHandle.invoke(description.handle, players, version, favicon, enforcesSecureChat))
    }

}
