package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.chat.ComponentContents\$Type") }
        private val lookup = MethodHandles.lookup()

        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("com.mojang.serialization.MapCodec")))
        }
        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(String::class.java))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("com.mojang.serialization.MapCodec"), String::class.java))
        }
    }

    val codec: Any
        get() = codecHandle.invoke(handle) as Any

    val id: String
        get() = idHandle.invoke(handle) as String

    fun copy(codec: Any = this.codec, id: String = this.id): WrapperType {
        return WrapperType(constructorHandle.invoke(codec, id))
    }

}
