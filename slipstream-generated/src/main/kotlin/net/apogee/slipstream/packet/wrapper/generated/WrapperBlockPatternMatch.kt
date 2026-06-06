package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockPatternMatch(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.pattern.BlockPattern\$BlockPatternMatch") }
        private val lookup = MethodHandles.lookup()

        val getBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.pattern.BlockInWorld"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getDepthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDepth", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getFrontTopLeftHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFrontTopLeft", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getForwardsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getForwards", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getUpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUp", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWidthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWidth", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    fun getBlock(arg0: Int, arg1: Int, arg2: Int): WrapperBlockInWorld {
        return WrapperBlockInWorld(getBlockHandle.invoke(handle, arg0, arg1, arg2))
    }

    val depth: Int
        get() = getDepthHandle.invoke(handle) as Int

    val frontTopLeft: WrapperBlockPos
        get() = WrapperBlockPos(getFrontTopLeftHandle.invoke(handle))

    val forwards: Any
        get() = getForwardsHandle.invoke(handle) as Any

    val up: Any
        get() = getUpHandle.invoke(handle) as Any

    val height: Int
        get() = getHeightHandle.invoke(handle) as Int

    val width: Int
        get() = getWidthHandle.invoke(handle) as Int

}
