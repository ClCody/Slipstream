package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAdvancementRequirements(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.advancements.AdvancementRequirements") }
        private val lookup = MethodHandles.lookup()

        val requirementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requirements", MethodType.methodType(Class.forName("java.util.List")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("java.util.List")))
        }
    }

    val requirements: Any
        get() = requirementsHandle.invoke(handle) as Any

    fun copy(requirements: Any = this.requirements): WrapperAdvancementRequirements {
        return WrapperAdvancementRequirements(constructorHandle.invoke(requirements))
    }

}
