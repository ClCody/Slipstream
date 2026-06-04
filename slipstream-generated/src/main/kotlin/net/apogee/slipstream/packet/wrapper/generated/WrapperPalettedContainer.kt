package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPalettedContainer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.PalettedContainer") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainer")))
        }
        val getAndSetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAndSet", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val packHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pack", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainerRO\$PackedData"), Class.forName("net.minecraft.core.IdMap"), Class.forName("net.minecraft.world.level.chunk.PalettedContainer\$Strategy")))
        }
        val getAndSetUncheckedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAndSetUnchecked", MethodType.methodType(Class.forName("java.lang.Object"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val recreateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "recreate", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainer")))
        }
        val getSerializedSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSerializedSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val onResizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onResize", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("java.lang.Object")))
        }
        val maybeHasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maybeHas", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
        val dataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("data")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: Int): Any {
        return getHandle.invoke(handle, arg0) as Any
    }

    val copy: WrapperPalettedContainer
        get() = WrapperPalettedContainer(copyHandle.invoke(handle))

    fun getAndSet(arg0: Int, arg1: Int, arg2: Int, arg3: Any): Any {
        return getAndSetHandle.invoke(handle, arg0, arg1, arg2, arg3) as Any
    }

    fun pack(arg0: WrapperIdMap, arg1: WrapperStrategy): WrapperPackedData {
        return WrapperPackedData(packHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun getAndSetUnchecked(arg0: Int, arg1: Int, arg2: Int, arg3: Any): Any {
        return getAndSetUncheckedHandle.invoke(handle, arg0, arg1, arg2, arg3) as Any
    }

    val recreate: WrapperPalettedContainer
        get() = WrapperPalettedContainer(recreateHandle.invoke(handle))

    val serializedSize: Int
        get() = getSerializedSizeHandle.invoke(handle) as Int

    fun onResize(arg0: Int, arg1: Any): Int {
        return onResizeHandle.invoke(handle, arg0, arg1) as Int
    }

    fun maybeHas(arg0: Any): Boolean {
        return maybeHasHandle.invoke(handle, arg0) as Boolean
    }

    fun setData(value: Any) {
        dataSetterHandle.invoke(handle, value)
    }

}
