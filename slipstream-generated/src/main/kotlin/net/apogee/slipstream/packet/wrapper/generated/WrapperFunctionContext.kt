package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFunctionContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.DensityFunction\$FunctionContext") }
        private val lookup = MethodHandles.lookup()

        val blockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val blockYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val blockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBlenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlender", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.blending.Blender")))
        }
    }

    val blockZ: Int
        get() = blockZHandle.invoke(handle) as Int

    val blockY: Int
        get() = blockYHandle.invoke(handle) as Int

    val blockX: Int
        get() = blockXHandle.invoke(handle) as Int

    val blender: WrapperBlender
        get() = WrapperBlender(getBlenderHandle.invoke(handle))

}
