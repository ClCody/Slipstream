package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStreamCodec(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.codec.StreamCodec") }
        private val lookup = MethodHandles.lookup()

        val dispatchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dispatch", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec"), Class.forName("java.util.function.Function"), Class.forName("java.util.function.Function")))
        }
        val castHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cast", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec")))
        }
        val applyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "apply", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec"), Class.forName("net.minecraft.network.codec.StreamCodec\$CodecOperation")))
        }
        val mapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "map", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec"), Class.forName("java.util.function.Function"), Class.forName("java.util.function.Function")))
        }
        val mapStreamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mapStream", MethodType.methodType(Class.forName("net.minecraft.network.codec.StreamCodec"), Class.forName("java.util.function.Function")))
        }
    }

    fun dispatch(arg0: Any, arg1: Any): WrapperStreamCodec {
        return WrapperStreamCodec(dispatchHandle.invoke(handle, arg0, arg1))
    }

    val cast: WrapperStreamCodec
        get() = WrapperStreamCodec(castHandle.invoke(handle))

    fun apply(arg0: WrapperCodecOperation): WrapperStreamCodec {
        return WrapperStreamCodec(applyHandle.invoke(handle, arg0.handle))
    }

    fun map(arg0: Any, arg1: Any): WrapperStreamCodec {
        return WrapperStreamCodec(mapHandle.invoke(handle, arg0, arg1))
    }

    fun mapStream(arg0: Any): WrapperStreamCodec {
        return WrapperStreamCodec(mapStreamHandle.invoke(handle, arg0))
    }

}
