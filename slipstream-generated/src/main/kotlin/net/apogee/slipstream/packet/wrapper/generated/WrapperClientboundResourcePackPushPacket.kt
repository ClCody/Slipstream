package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundResourcePackPushPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val urlHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "url", MethodType.methodType(String::class.java))
        }
        val hashHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hash", MethodType.methodType(String::class.java))
        }
        val requiredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "required", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val promptHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "prompt", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.UUID"), String::class.java, String::class.java, Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Optional")))
        }
    }

    val id: Any
        get() = idHandle.invoke(handle) as Any

    val url: String
        get() = urlHandle.invoke(handle) as String

    val hash: String
        get() = hashHandle.invoke(handle) as String

    val required: Boolean
        get() = requiredHandle.invoke(handle) as Boolean

    val prompt: Any
        get() = promptHandle.invoke(handle) as Any

    fun copy(id: Any = this.id, url: String = this.url, hash: String = this.hash, required: Boolean = this.required, prompt: Any = this.prompt): WrapperClientboundResourcePackPushPacket {
        return WrapperClientboundResourcePackPushPacket(constructorHandle.invoke(id, url, hash, required, prompt))
    }

}
