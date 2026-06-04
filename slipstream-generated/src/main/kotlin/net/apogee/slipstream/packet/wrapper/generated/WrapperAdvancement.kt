package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAdvancement(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.Advancement") }
        private val lookup = MethodHandles.lookup()

        val parentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "parent", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val displayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "display", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val rewardsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "rewards", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementRewards")))
        }
        val criteriaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "criteria", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val requirementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requirements", MethodType.methodType(Class.forName("net.minecraft.advancements.AdvancementRequirements")))
        }
        val sendsTelemetryEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sendsTelemetryEvent", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val nameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "name", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.Optional"), Class.forName("java.util.Optional"), Class.forName("net.minecraft.advancements.AdvancementRewards"), Class.forName("java.util.Map"), Class.forName("net.minecraft.advancements.AdvancementRequirements"), Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Optional")))
        }
    }

    val parent: Any
        get() = parentHandle.invoke(handle) as Any

    val display: Any
        get() = displayHandle.invoke(handle) as Any

    val rewards: WrapperAdvancementRewards
        get() = WrapperAdvancementRewards(rewardsHandle.invoke(handle))

    val criteria: Any
        get() = criteriaHandle.invoke(handle) as Any

    val requirements: WrapperAdvancementRequirements
        get() = WrapperAdvancementRequirements(requirementsHandle.invoke(handle))

    val sendsTelemetryEvent: Boolean
        get() = sendsTelemetryEventHandle.invoke(handle) as Boolean

    val name: Any
        get() = nameHandle.invoke(handle) as Any

    fun copy(parent: Any = this.parent, display: Any = this.display, rewards: WrapperAdvancementRewards = this.rewards, criteria: Any = this.criteria, requirements: WrapperAdvancementRequirements = this.requirements, sendsTelemetryEvent: Boolean = this.sendsTelemetryEvent, name: Any = this.name): WrapperAdvancement {
        return WrapperAdvancement(constructorHandle.invoke(parent, display, rewards.handle, criteria, requirements.handle, sendsTelemetryEvent, name))
    }

}
