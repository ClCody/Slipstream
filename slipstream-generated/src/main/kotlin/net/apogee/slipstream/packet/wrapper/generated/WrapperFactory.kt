package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFactory(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.Palette\$Factory") }
        private val lookup = MethodHandles.lookup()

        val createHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "create", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.Palette"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.IdMap"), Class.forName("net.minecraft.world.level.chunk.PaletteResize"), Class.forName("java.util.List")))
        }
    }

    fun create(arg0: Int, arg1: WrapperIdMap, arg2: WrapperPaletteResize, arg3: Any): WrapperPalette {
        return WrapperPalette(createHandle.invoke(handle, arg0, arg1.handle, arg2.handle, arg3))
    }

}
