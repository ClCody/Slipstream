package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPosition(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.Position") }
        private val lookup = MethodHandles.lookup()

        val xHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "x", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val zHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "z", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val yHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "y", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
    }

    val x: Double
        get() = xHandle.invoke(handle) as Double

    val z: Double
        get() = zHandle.invoke(handle) as Double

    val y: Double
        get() = yHandle.invoke(handle) as Double

}
