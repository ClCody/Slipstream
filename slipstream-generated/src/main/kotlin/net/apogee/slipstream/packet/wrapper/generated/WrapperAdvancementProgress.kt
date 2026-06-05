package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAdvancementProgress(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.AdvancementProgress") }
        private val lookup = MethodHandles.lookup()

        val compareToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "compareTo", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.advancements.AdvancementProgress")))
        }
        val isDoneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDone", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPercentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPercent", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getRemainingCriteriaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemainingCriteria", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getFirstProgressDateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFirstProgressDate", MethodType.methodType(Class.forName("java.time.Instant")))
        }
        val getCompletedCriteriaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCompletedCriteria", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getCriterionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCriterion", MethodType.methodType(Class.forName("net.minecraft.advancements.CriterionProgress"), String::class.java))
        }
        val getProgressTextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProgressText", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val grantProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "grantProgress", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val revokeProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "revokeProgress", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val hasProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasProgress", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val requirementsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("requirements")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun compareTo(arg0: WrapperAdvancementProgress): Int {
        return compareToHandle.invoke(handle, arg0.handle) as Int
    }

    val done: Boolean
        get() = isDoneHandle.invoke(handle) as Boolean

    val percent: Float
        get() = getPercentHandle.invoke(handle) as Float

    val remainingCriteria: Any
        get() = getRemainingCriteriaHandle.invoke(handle) as Any

    val firstProgressDate: Any
        get() = getFirstProgressDateHandle.invoke(handle) as Any

    val completedCriteria: Any
        get() = getCompletedCriteriaHandle.invoke(handle) as Any

    fun getCriterion(arg0: String): WrapperCriterionProgress {
        return WrapperCriterionProgress(getCriterionHandle.invoke(handle, arg0))
    }

    val progressText: WrapperComponent
        get() = WrapperComponent(getProgressTextHandle.invoke(handle))

    fun grantProgress(arg0: String): Boolean {
        return grantProgressHandle.invoke(handle, arg0) as Boolean
    }

    fun revokeProgress(arg0: String): Boolean {
        return revokeProgressHandle.invoke(handle, arg0) as Boolean
    }

    val progress: Boolean
        get() = hasProgressHandle.invoke(handle) as Boolean

    fun setRequirements(value: WrapperAdvancementRequirements) {
        requirementsSetterHandle.invoke(handle, value.handle)
    }

}
