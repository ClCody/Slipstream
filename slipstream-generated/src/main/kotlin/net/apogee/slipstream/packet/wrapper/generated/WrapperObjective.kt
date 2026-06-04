package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperObjective(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.Objective") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val numberFormatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "numberFormat", MethodType.methodType(Class.forName("net.minecraft.network.chat.numbers.NumberFormat")))
        }
        val getRenderTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRenderType", MethodType.methodType(Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria\$RenderType")))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.world.scores.Scoreboard")))
        }
        val getFormattedDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFormattedDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val numberFormatOrDefaultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "numberFormatOrDefault", MethodType.methodType(Class.forName("net.minecraft.network.chat.numbers.NumberFormat"), Class.forName("net.minecraft.network.chat.numbers.NumberFormat")))
        }
        val getCriteriaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCriteria", MethodType.methodType(Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria")))
        }
        val displayAutoUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "displayAutoUpdate", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val displayNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("displayName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val formattedDisplayNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("formattedDisplayName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val renderTypeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("renderType")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val displayAutoUpdateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("displayAutoUpdate")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val numberFormatSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("numberFormat")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val numberFormat: WrapperNumberFormat
        get() = WrapperNumberFormat(numberFormatHandle.invoke(handle))

    val renderType: Any
        get() = getRenderTypeHandle.invoke(handle) as Any

    val scoreboard: WrapperScoreboard
        get() = WrapperScoreboard(getScoreboardHandle.invoke(handle))

    val formattedDisplayName: WrapperComponent
        get() = WrapperComponent(getFormattedDisplayNameHandle.invoke(handle))

    fun numberFormatOrDefault(arg0: WrapperNumberFormat): WrapperNumberFormat {
        return WrapperNumberFormat(numberFormatOrDefaultHandle.invoke(handle, arg0.handle))
    }

    val criteria: WrapperObjectiveCriteria
        get() = WrapperObjectiveCriteria(getCriteriaHandle.invoke(handle))

    val displayAutoUpdate: Boolean
        get() = displayAutoUpdateHandle.invoke(handle) as Boolean

    fun setDisplayName(value: WrapperComponent) {
        displayNameSetterHandle.invoke(handle, value.handle)
    }

    fun setFormattedDisplayName(value: WrapperComponent) {
        formattedDisplayNameSetterHandle.invoke(handle, value.handle)
    }

    fun setRenderType(value: Any) {
        renderTypeSetterHandle.invoke(handle, value)
    }

    fun setDisplayAutoUpdate(value: Boolean) {
        displayAutoUpdateSetterHandle.invoke(handle, value)
    }

    fun setNumberFormat(value: WrapperNumberFormat) {
        numberFormatSetterHandle.invoke(handle, value.handle)
    }

}
