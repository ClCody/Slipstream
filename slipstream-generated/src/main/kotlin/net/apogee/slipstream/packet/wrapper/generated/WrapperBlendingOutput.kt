package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlendingOutput(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.blending.Blender\$BlendingOutput") }
        private val lookup = MethodHandles.lookup()

        val alphaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "alpha", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val blendingOffsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blendingOffset", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
    }

    val alpha: Double
        get() = alphaHandle.invoke(handle) as Double

    val blendingOffset: Double
        get() = blendingOffsetHandle.invoke(handle) as Double

    fun copy(alpha: Double = this.alpha, blendingOffset: Double = this.blendingOffset): WrapperBlendingOutput {
        return WrapperBlendingOutput(constructorHandle.invoke(alpha, blendingOffset))
    }

}
