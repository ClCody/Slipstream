package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTimerQueue(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.timers.TimerQueue") }
        private val lookup = MethodHandles.lookup()

        val removeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "remove", MethodType.methodType(Int::class.javaPrimitiveType!!, String::class.java))
        }
        val storeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "store", MethodType.methodType(Class.forName("net.minecraft.nbt.ListTag")))
        }
        val getEventsIdsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEventsIds", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val sequentialIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sequentialId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun remove(arg0: String): Int {
        return removeHandle.invoke(handle, arg0) as Int
    }

    val store: WrapperListTag
        get() = WrapperListTag(storeHandle.invoke(handle))

    val eventsIds: Any
        get() = getEventsIdsHandle.invoke(handle) as Any

    fun setSequentialId(value: Any) {
        sequentialIdSetterHandle.invoke(handle, value)
    }

}
