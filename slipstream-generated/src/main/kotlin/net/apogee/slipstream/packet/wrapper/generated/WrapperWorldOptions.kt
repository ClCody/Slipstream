package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWorldOptions(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.WorldOptions") }
        private val lookup = MethodHandles.lookup()

        val seedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "seed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val withBonusChestHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withBonusChest", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.WorldOptions"), Boolean::class.javaPrimitiveType!!))
        }
        val generateBonusChestHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "generateBonusChest", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withSeed", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.WorldOptions"), Class.forName("java.util.OptionalLong")))
        }
        val withStructuresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withStructures", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.WorldOptions"), Boolean::class.javaPrimitiveType!!))
        }
        val isOldCustomizedWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOldCustomizedWorld", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val generateStructuresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "generateStructures", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val seed: Long
        get() = seedHandle.invoke(handle) as Long

    fun withBonusChest(arg0: Boolean): WrapperWorldOptions {
        return WrapperWorldOptions(withBonusChestHandle.invoke(handle, arg0))
    }

    val generateBonusChest: Boolean
        get() = generateBonusChestHandle.invoke(handle) as Boolean

    fun withSeed(arg0: Any): WrapperWorldOptions {
        return WrapperWorldOptions(withSeedHandle.invoke(handle, arg0))
    }

    fun withStructures(arg0: Boolean): WrapperWorldOptions {
        return WrapperWorldOptions(withStructuresHandle.invoke(handle, arg0))
    }

    val oldCustomizedWorld: Boolean
        get() = isOldCustomizedWorldHandle.invoke(handle) as Boolean

    val generateStructures: Boolean
        get() = generateStructuresHandle.invoke(handle) as Boolean

}
