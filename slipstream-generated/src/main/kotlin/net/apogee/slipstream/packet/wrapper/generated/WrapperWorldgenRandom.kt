package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWorldgenRandom(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.WorldgenRandom") }
        private val lookup = MethodHandles.lookup()

        val nextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "next", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val forkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fork", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource")))
        }
        val forkPositionalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forkPositional", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.PositionalRandomFactory")))
        }
        val setDecorationSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setDecorationSeed", MethodType.methodType(Long::class.javaPrimitiveType!!, Long::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val countSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("count")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun next(arg0: Int): Int {
        return nextHandle.invoke(handle, arg0) as Int
    }

    val count: Int
        get() = getCountHandle.invoke(handle) as Int

    val fork: WrapperRandomSource
        get() = WrapperRandomSource(forkHandle.invoke(handle))

    val forkPositional: WrapperPositionalRandomFactory
        get() = WrapperPositionalRandomFactory(forkPositionalHandle.invoke(handle))

    fun setDecorationSeed(arg0: Long, arg1: Int, arg2: Int): Long {
        return setDecorationSeedHandle.invoke(handle, arg0, arg1, arg2) as Long
    }

    fun setCount(value: Int) {
        countSetterHandle.invoke(handle, value)
    }

}
