package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCombatTracker(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.damagesource.CombatTracker") }
        private val lookup = MethodHandles.lookup()

        val getDeathMessageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeathMessage", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getCombatDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCombatDuration", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val lastDamageTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastDamageTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val combatStartTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("combatStartTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val combatEndTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("combatEndTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inCombatSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inCombat")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val takingDamageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("takingDamage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val deathMessage: WrapperComponent
        get() = WrapperComponent(getDeathMessageHandle.invoke(handle))

    val combatDuration: Int
        get() = getCombatDurationHandle.invoke(handle) as Int

    fun setLastDamageTime(value: Int) {
        lastDamageTimeSetterHandle.invoke(handle, value)
    }

    fun setCombatStartTime(value: Int) {
        combatStartTimeSetterHandle.invoke(handle, value)
    }

    fun setCombatEndTime(value: Int) {
        combatEndTimeSetterHandle.invoke(handle, value)
    }

    fun setInCombat(value: Boolean) {
        inCombatSetterHandle.invoke(handle, value)
    }

    fun setTakingDamage(value: Boolean) {
        takingDamageSetterHandle.invoke(handle, value)
    }

}
