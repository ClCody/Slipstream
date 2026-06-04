package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMobSpawnCost(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.MobSpawnSettings\$MobSpawnCost") }
        private val lookup = MethodHandles.lookup()

        val energyBudgetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "energyBudget", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val chargeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "charge", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
    }

    val energyBudget: Double
        get() = energyBudgetHandle.invoke(handle) as Double

    val charge: Double
        get() = chargeHandle.invoke(handle) as Double

    fun copy(energyBudget: Double = this.energyBudget, charge: Double = this.charge): WrapperMobSpawnCost {
        return WrapperMobSpawnCost(constructorHandle.invoke(energyBudget, charge))
    }

}
