package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBrain(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.ai.Brain") }
        private val lookup = MethodHandles.lookup()

        val isActiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isActive", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.schedule.Activity")))
        }
        val getMemoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMemory", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType")))
        }
        val serializeStartHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "serializeStart", MethodType.methodType(Class.forName("com.mojang.serialization.DataResult"), Class.forName("com.mojang.serialization.DynamicOps")))
        }
        val checkMemoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "checkMemory", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType"), Class.forName("net.minecraft.world.entity.ai.memory.MemoryStatus")))
        }
        val isMemoryValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isMemoryValue", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType"), Class.forName("java.lang.Object")))
        }
        val getScheduleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSchedule", MethodType.methodType(Class.forName("net.minecraft.world.entity.schedule.Schedule")))
        }
        val getMemoriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMemories", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getMemoryInternalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMemoryInternal", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType")))
        }
        val getTimeUntilExpiryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTimeUntilExpiry", MethodType.methodType(Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType")))
        }
        val getActiveNonCoreActivityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getActiveNonCoreActivity", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getRunningBehaviorsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRunningBehaviors", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getActiveActivitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getActiveActivities", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val copyWithoutBehaviorsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copyWithoutBehaviors", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.Brain")))
        }
        val hasMemoryValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasMemoryValue", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.memory.MemoryModuleType")))
        }
        val scheduleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("schedule")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val coreActivitiesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("coreActivities")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val defaultActivitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("defaultActivity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastScheduleUpdateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastScheduleUpdate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun isActive(arg0: WrapperActivity): Boolean {
        return isActiveHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getMemory(arg0: WrapperMemoryModuleType): Any {
        return getMemoryHandle.invoke(handle, arg0.handle) as Any
    }

    fun serializeStart(arg0: Any): Any {
        return serializeStartHandle.invoke(handle, arg0) as Any
    }

    fun checkMemory(arg0: WrapperMemoryModuleType, arg1: Any): Boolean {
        return checkMemoryHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun isMemoryValue(arg0: WrapperMemoryModuleType, arg1: Any): Boolean {
        return isMemoryValueHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val schedule: WrapperSchedule
        get() = WrapperSchedule(getScheduleHandle.invoke(handle))

    val memories: Any
        get() = getMemoriesHandle.invoke(handle) as Any

    fun getMemoryInternal(arg0: WrapperMemoryModuleType): Any {
        return getMemoryInternalHandle.invoke(handle, arg0.handle) as Any
    }

    fun getTimeUntilExpiry(arg0: WrapperMemoryModuleType): Long {
        return getTimeUntilExpiryHandle.invoke(handle, arg0.handle) as Long
    }

    val activeNonCoreActivity: Any
        get() = getActiveNonCoreActivityHandle.invoke(handle) as Any

    val runningBehaviors: Any
        get() = getRunningBehaviorsHandle.invoke(handle) as Any

    val activeActivities: Any
        get() = getActiveActivitiesHandle.invoke(handle) as Any

    val copyWithoutBehaviors: WrapperBrain
        get() = WrapperBrain(copyWithoutBehaviorsHandle.invoke(handle))

    fun hasMemoryValue(arg0: WrapperMemoryModuleType): Boolean {
        return hasMemoryValueHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setSchedule(value: WrapperSchedule) {
        scheduleSetterHandle.invoke(handle, value.handle)
    }

    fun setCoreActivities(value: Any) {
        coreActivitiesSetterHandle.invoke(handle, value)
    }

    fun setDefaultActivity(value: WrapperActivity) {
        defaultActivitySetterHandle.invoke(handle, value.handle)
    }

    fun setLastScheduleUpdate(value: Long) {
        lastScheduleUpdateSetterHandle.invoke(handle, value)
    }

}
