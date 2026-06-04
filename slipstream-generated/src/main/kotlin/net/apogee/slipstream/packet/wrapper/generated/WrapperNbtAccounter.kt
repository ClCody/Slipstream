package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNbtAccounter(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.nbt.NbtAccounter") }
        private val lookup = MethodHandles.lookup()

        val getUsageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUsage", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getDepthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDepth", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val usageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("usage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val depthSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("depth")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val usage: Long
        get() = getUsageHandle.invoke(handle) as Long

    val depth: Int
        get() = getDepthHandle.invoke(handle) as Int

    fun setUsage(value: Long) {
        usageSetterHandle.invoke(handle, value)
    }

    fun setDepth(value: Int) {
        depthSetterHandle.invoke(handle, value)
    }

}
