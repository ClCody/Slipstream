package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerLevelData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.ServerLevelData") }
        private val lookup = MethodHandles.lookup()

        val getLevelNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelName", MethodType.methodType(String::class.java))
        }
        val getWorldBorderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldBorder", MethodType.methodType(Class.forName("net.minecraft.world.level.border.WorldBorder\$Settings")))
        }
        val getClearWeatherTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClearWeatherTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val getScheduledEventsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScheduledEvents", MethodType.methodType(Class.forName("net.minecraft.world.level.timers.TimerQueue")))
        }
        val getThunderTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getThunderTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRainTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRainTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWanderingTraderIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWanderingTraderId", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val getWanderingTraderSpawnChanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWanderingTraderSpawnChance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWanderingTraderSpawnDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWanderingTraderSpawnDelay", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isInitializedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInitialized", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isAllowCommandsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowCommands", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val levelName: String
        get() = getLevelNameHandle.invoke(handle) as String

    val worldBorder: WrapperSettings
        get() = WrapperSettings(getWorldBorderHandle.invoke(handle))

    val clearWeatherTime: Int
        get() = getClearWeatherTimeHandle.invoke(handle) as Int

    val gameType: Any
        get() = getGameTypeHandle.invoke(handle) as Any

    val scheduledEvents: WrapperTimerQueue
        get() = WrapperTimerQueue(getScheduledEventsHandle.invoke(handle))

    val thunderTime: Int
        get() = getThunderTimeHandle.invoke(handle) as Int

    val rainTime: Int
        get() = getRainTimeHandle.invoke(handle) as Int

    val wanderingTraderId: Any
        get() = getWanderingTraderIdHandle.invoke(handle) as Any

    val wanderingTraderSpawnChance: Int
        get() = getWanderingTraderSpawnChanceHandle.invoke(handle) as Int

    val wanderingTraderSpawnDelay: Int
        get() = getWanderingTraderSpawnDelayHandle.invoke(handle) as Int

    val initialized: Boolean
        get() = isInitializedHandle.invoke(handle) as Boolean

    val allowCommands: Boolean
        get() = isAllowCommandsHandle.invoke(handle) as Boolean

}
