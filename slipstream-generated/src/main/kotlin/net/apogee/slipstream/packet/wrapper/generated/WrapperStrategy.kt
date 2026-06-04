package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStrategy(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.PalettedContainer\$Strategy") }
        private val lookup = MethodHandles.lookup()

        val sizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "size", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getIndexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIndex", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getConfigurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getConfiguration", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainer\$Configuration"), Class.forName("net.minecraft.core.IdMap"), Int::class.javaPrimitiveType!!))
        }
    }

    val size: Int
        get() = sizeHandle.invoke(handle) as Int

    fun getIndex(arg0: Int, arg1: Int, arg2: Int): Int {
        return getIndexHandle.invoke(handle, arg0, arg1, arg2) as Int
    }

    fun getConfiguration(arg0: WrapperIdMap, arg1: Int): WrapperConfiguration {
        return WrapperConfiguration(getConfigurationHandle.invoke(handle, arg0.handle, arg1))
    }

}
