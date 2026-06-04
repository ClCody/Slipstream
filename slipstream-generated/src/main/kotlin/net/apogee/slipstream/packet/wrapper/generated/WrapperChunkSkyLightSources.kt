package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperChunkSkyLightSources(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.lighting.ChunkSkyLightSources") }
        private val lookup = MethodHandles.lookup()

        val updateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "update", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.BlockGetter"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getLowestSourceYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLowestSourceY", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getHighestLowestSourceYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHighestLowestSourceY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    fun update(arg0: WrapperBlockGetter, arg1: Int, arg2: Int, arg3: Int): Boolean {
        return updateHandle.invoke(handle, arg0.handle, arg1, arg2, arg3) as Boolean
    }

    fun getLowestSourceY(arg0: Int, arg1: Int): Int {
        return getLowestSourceYHandle.invoke(handle, arg0, arg1) as Int
    }

    val highestLowestSourceY: Int
        get() = getHighestLowestSourceYHandle.invoke(handle) as Int

}
