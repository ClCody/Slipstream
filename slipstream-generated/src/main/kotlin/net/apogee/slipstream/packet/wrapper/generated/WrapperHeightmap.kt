package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHeightmap(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.Heightmap") }
        private val lookup = MethodHandles.lookup()

        val updateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "update", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getRawDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRawData", MethodType.methodType(Class.forName("[J")))
        }
        val getHighestTakenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHighestTaken", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getFirstAvailableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFirstAvailable", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
    }

    fun update(arg0: Int, arg1: Int, arg2: Int, arg3: WrapperBlockState): Boolean {
        return updateHandle.invoke(handle, arg0, arg1, arg2, arg3.handle) as Boolean
    }

    val rawData: Any
        get() = getRawDataHandle.invoke(handle) as Any

    fun getHighestTaken(arg0: Int, arg1: Int): Int {
        return getHighestTakenHandle.invoke(handle, arg0, arg1) as Int
    }

    fun getFirstAvailable(arg0: Int, arg1: Int): Int {
        return getFirstAvailableHandle.invoke(handle, arg0, arg1) as Int
    }

}
