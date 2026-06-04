package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPalettedContainerRO(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.PalettedContainerRO") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val packHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pack", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainerRO\$PackedData"), Class.forName("net.minecraft.core.IdMap"), Class.forName("net.minecraft.world.level.chunk.PalettedContainer\$Strategy")))
        }
        val recreateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "recreate", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainer")))
        }
        val getSerializedSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSerializedSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val maybeHasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maybeHas", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
    }

    fun get(arg0: Int, arg1: Int, arg2: Int): Any {
        return getHandle.invoke(handle, arg0, arg1, arg2) as Any
    }

    fun pack(arg0: WrapperIdMap, arg1: WrapperStrategy): WrapperPackedData {
        return WrapperPackedData(packHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val recreate: WrapperPalettedContainer
        get() = WrapperPalettedContainer(recreateHandle.invoke(handle))

    val serializedSize: Int
        get() = getSerializedSizeHandle.invoke(handle) as Int

    fun maybeHas(arg0: Any): Boolean {
        return maybeHasHandle.invoke(handle, arg0) as Boolean
    }

}
