package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCriterionProgress(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.CriterionProgress") }
        private val lookup = MethodHandles.lookup()

        val isDoneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDone", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getObtainedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObtained", MethodType.methodType(Class.forName("java.time.Instant")))
        }
        val obtainedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("obtained")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val done: Boolean
        get() = isDoneHandle.invoke(handle) as Boolean

    val obtained: Any
        get() = getObtainedHandle.invoke(handle) as Any

    fun setObtained(value: Any) {
        obtainedSetterHandle.invoke(handle, value)
    }

}
