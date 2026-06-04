package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPaletteResize(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.PaletteResize") }
        private val lookup = MethodHandles.lookup()

        val onResizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onResize", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
    }

    fun onResize(arg0: Int, arg1: Any): Int {
        return onResizeHandle.invoke(handle, arg0, arg1) as Int
    }

}
