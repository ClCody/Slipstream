package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPalette(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.Palette") }
        private val lookup = MethodHandles.lookup()

        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.Palette")))
        }
        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSerializedSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSerializedSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val valueForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "valueFor", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!))
        }
        val idForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "idFor", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val maybeHasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maybeHas", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
    }

    val copy: WrapperPalette
        get() = WrapperPalette(copyHandle.invoke(handle))

    val size: Int
        get() = getSizeHandle.invoke(handle) as Int

    val serializedSize: Int
        get() = getSerializedSizeHandle.invoke(handle) as Int

    fun valueFor(arg0: Int): Any {
        return valueForHandle.invoke(handle, arg0) as Any
    }

    fun idFor(arg0: Any): Int {
        return idForHandle.invoke(handle, arg0) as Int
    }

    fun maybeHas(arg0: Any): Boolean {
        return maybeHasHandle.invoke(handle, arg0) as Boolean
    }

}
