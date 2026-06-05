package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMobSpawnSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.biome.MobSpawnSettings") }
        private val lookup = MethodHandles.lookup()

        val getMobsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMobs", MethodType.methodType(Class.forName("net.minecraft.util.random.WeightedRandomList"), Class.forName("net.minecraft.world.entity.MobCategory")))
        }
        val getCreatureProbabilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCreatureProbability", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getMobSpawnCostHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMobSpawnCost", MethodType.methodType(Class.forName("net.minecraft.world.level.biome.MobSpawnSettings\$MobSpawnCost"), Class.forName("net.minecraft.world.entity.EntityType")))
        }
    }

    fun getMobs(arg0: Any): WrapperWeightedRandomList {
        return WrapperWeightedRandomList(getMobsHandle.invoke(handle, arg0))
    }

    val creatureProbability: Float
        get() = getCreatureProbabilityHandle.invoke(handle) as Float

    fun getMobSpawnCost(arg0: WrapperEntityType): WrapperMobSpawnCost {
        return WrapperMobSpawnCost(getMobSpawnCostHandle.invoke(handle, arg0.handle))
    }

}
