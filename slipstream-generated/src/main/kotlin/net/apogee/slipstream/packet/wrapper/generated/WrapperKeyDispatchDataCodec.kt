package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperKeyDispatchDataCodec(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.KeyDispatchDataCodec") }
        private val lookup = MethodHandles.lookup()

        val codecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "codec", MethodType.methodType(Class.forName("com.mojang.serialization.MapCodec")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("com.mojang.serialization.MapCodec")))
        }
    }

    val codec: Any
        get() = codecHandle.invoke(handle) as Any

    fun copy(codec: Any = this.codec): WrapperKeyDispatchDataCodec {
        return WrapperKeyDispatchDataCodec(constructorHandle.invoke(codec))
    }

}
