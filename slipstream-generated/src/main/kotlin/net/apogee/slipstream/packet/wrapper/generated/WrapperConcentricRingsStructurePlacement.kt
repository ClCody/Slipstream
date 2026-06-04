package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperConcentricRingsStructurePlacement(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.placement.ConcentricRingsStructurePlacement") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.placement.StructurePlacementType")))
        }
        val countHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "count", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val spreadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spread", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val distanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val preferredBiomesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "preferredBiomes", MethodType.methodType(Class.forName("net.minecraft.core.HolderSet")))
        }
    }

    val type: WrapperStructurePlacementType
        get() = WrapperStructurePlacementType(typeHandle.invoke(handle))

    val count: Int
        get() = countHandle.invoke(handle) as Int

    val spread: Int
        get() = spreadHandle.invoke(handle) as Int

    val distance: Int
        get() = distanceHandle.invoke(handle) as Int

    val preferredBiomes: WrapperHolderSet
        get() = WrapperHolderSet(preferredBiomesHandle.invoke(handle))

}
