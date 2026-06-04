package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCommonPlayerSpawnInfo(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.CommonPlayerSpawnInfo") }
        private val lookup = MethodHandles.lookup()

        val dimensionTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimensionType", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val dimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimension", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val seedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "seed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val gameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val previousGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "previousGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val isDebugHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDebug", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isFlatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlat", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val lastDeathLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lastDeathLocation", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val portalCooldownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "portalCooldown", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.resources.ResourceKey"), Long::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.GameType"), Class.forName("net.minecraft.world.level.GameType"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Optional"), Int::class.javaPrimitiveType!!))
        }
    }

    val dimensionType: WrapperHolder
        get() = WrapperHolder(dimensionTypeHandle.invoke(handle))

    val dimension: WrapperResourceKey
        get() = WrapperResourceKey(dimensionHandle.invoke(handle))

    val seed: Long
        get() = seedHandle.invoke(handle) as Long

    val gameType: Any
        get() = gameTypeHandle.invoke(handle) as Any

    val previousGameType: Any
        get() = previousGameTypeHandle.invoke(handle) as Any

    val isDebug: Boolean
        get() = isDebugHandle.invoke(handle) as Boolean

    val isFlat: Boolean
        get() = isFlatHandle.invoke(handle) as Boolean

    val lastDeathLocation: Any
        get() = lastDeathLocationHandle.invoke(handle) as Any

    val portalCooldown: Int
        get() = portalCooldownHandle.invoke(handle) as Int

    fun copy(dimensionType: WrapperHolder = this.dimensionType, dimension: WrapperResourceKey = this.dimension, seed: Long = this.seed, gameType: Any = this.gameType, previousGameType: Any = this.previousGameType, isDebug: Boolean = this.isDebug, isFlat: Boolean = this.isFlat, lastDeathLocation: Any = this.lastDeathLocation, portalCooldown: Int = this.portalCooldown): WrapperCommonPlayerSpawnInfo {
        return WrapperCommonPlayerSpawnInfo(constructorHandle.invoke(dimensionType.handle, dimension.handle, seed, gameType, previousGameType, isDebug, isFlat, lastDeathLocation, portalCooldown))
    }

}
