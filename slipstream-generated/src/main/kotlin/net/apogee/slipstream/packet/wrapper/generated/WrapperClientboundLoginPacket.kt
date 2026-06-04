package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundLoginPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundLoginPacket") }
        private val lookup = MethodHandles.lookup()

        val playerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "playerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hardcoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hardcore", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val levelsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "levels", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val maxPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxPlayers", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val chunkRadiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunkRadius", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val simulationDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "simulationDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val reducedDebugInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reducedDebugInfo", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val showDeathScreenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "showDeathScreen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val doLimitedCraftingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "doLimitedCrafting", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val commonPlayerSpawnInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "commonPlayerSpawnInfo", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.CommonPlayerSpawnInfo")))
        }
        val enforcesSecureChatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enforcesSecureChat", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Set"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.protocol.game.CommonPlayerSpawnInfo"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val playerId: Int
        get() = playerIdHandle.invoke(handle) as Int

    val hardcore: Boolean
        get() = hardcoreHandle.invoke(handle) as Boolean

    val levels: Any
        get() = levelsHandle.invoke(handle) as Any

    val maxPlayers: Int
        get() = maxPlayersHandle.invoke(handle) as Int

    val chunkRadius: Int
        get() = chunkRadiusHandle.invoke(handle) as Int

    val simulationDistance: Int
        get() = simulationDistanceHandle.invoke(handle) as Int

    val reducedDebugInfo: Boolean
        get() = reducedDebugInfoHandle.invoke(handle) as Boolean

    val showDeathScreen: Boolean
        get() = showDeathScreenHandle.invoke(handle) as Boolean

    val doLimitedCrafting: Boolean
        get() = doLimitedCraftingHandle.invoke(handle) as Boolean

    val commonPlayerSpawnInfo: WrapperCommonPlayerSpawnInfo
        get() = WrapperCommonPlayerSpawnInfo(commonPlayerSpawnInfoHandle.invoke(handle))

    val enforcesSecureChat: Boolean
        get() = enforcesSecureChatHandle.invoke(handle) as Boolean

    fun copy(playerId: Int = this.playerId, hardcore: Boolean = this.hardcore, levels: Any = this.levels, maxPlayers: Int = this.maxPlayers, chunkRadius: Int = this.chunkRadius, simulationDistance: Int = this.simulationDistance, reducedDebugInfo: Boolean = this.reducedDebugInfo, showDeathScreen: Boolean = this.showDeathScreen, doLimitedCrafting: Boolean = this.doLimitedCrafting, commonPlayerSpawnInfo: WrapperCommonPlayerSpawnInfo = this.commonPlayerSpawnInfo, enforcesSecureChat: Boolean = this.enforcesSecureChat): WrapperClientboundLoginPacket {
        return WrapperClientboundLoginPacket(constructorHandle.invoke(playerId, hardcore, levels, maxPlayers, chunkRadius, simulationDistance, reducedDebugInfo, showDeathScreen, doLimitedCrafting, commonPlayerSpawnInfo.handle, enforcesSecureChat))
    }

}
