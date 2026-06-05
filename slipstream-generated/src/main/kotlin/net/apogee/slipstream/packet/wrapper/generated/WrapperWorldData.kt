package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWorldData(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.storage.WorldData") }
        private val lookup = MethodHandles.lookup()

        val getVersionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVersion", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getLevelNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelName", MethodType.methodType(String::class.java))
        }
        val enabledFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enabledFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val createTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.RegistryAccess"), Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val wasModdedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "wasModded", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val isDifficultyLockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDifficultyLocked", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
        val isHardcoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHardcore", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGameRulesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameRules", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
        }
        val isDebugWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDebugWorld", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val overworldDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overworldData", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.ServerLevelData")))
        }
        val getStorageVersionNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStorageVersionName", MethodType.methodType(String::class.java, Int::class.javaPrimitiveType!!))
        }
        val getKnownServerBrandsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnownServerBrands", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getRemovedFeatureFlagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemovedFeatureFlags", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getDataConfigurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDataConfiguration", MethodType.methodType(Class.forName("net.minecraft.world.level.WorldDataConfiguration")))
        }
        val worldGenSettingsLifecycleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "worldGenSettingsLifecycle", MethodType.methodType(Class.forName("com.mojang.serialization.Lifecycle")))
        }
        val getLoadedPlayerTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLoadedPlayerTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val isAllowCommandsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowCommands", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLevelSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevelSettings", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings")))
        }
        val getCustomBossEventsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCustomBossEvents", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val worldGenOptionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "worldGenOptions", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.WorldOptions")))
        }
        val endDragonFightDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "endDragonFightData", MethodType.methodType(Class.forName("net.minecraft.world.level.dimension.end.EndDragonFight\$Data")))
        }
        val isFlatWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlatWorld", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val version: Int
        get() = getVersionHandle.invoke(handle) as Int

    val levelName: String
        get() = getLevelNameHandle.invoke(handle) as String

    val enabledFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(enabledFeaturesHandle.invoke(handle))

    fun createTag(arg0: WrapperRegistryAccess, arg1: WrapperCompoundTag): WrapperCompoundTag {
        return WrapperCompoundTag(createTagHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val wasModded: Boolean
        get() = wasModdedHandle.invoke(handle) as Boolean

    val gameType: Any
        get() = getGameTypeHandle.invoke(handle) as Any

    val difficultyLocked: Boolean
        get() = isDifficultyLockedHandle.invoke(handle) as Boolean

    val difficulty: Any
        get() = getDifficultyHandle.invoke(handle) as Any

    val hardcore: Boolean
        get() = isHardcoreHandle.invoke(handle) as Boolean

    val gameRules: WrapperGameRules
        get() = WrapperGameRules(getGameRulesHandle.invoke(handle))

    val debugWorld: Boolean
        get() = isDebugWorldHandle.invoke(handle) as Boolean

    val overworldData: WrapperServerLevelData
        get() = WrapperServerLevelData(overworldDataHandle.invoke(handle))

    fun getStorageVersionName(arg0: Int): String {
        return getStorageVersionNameHandle.invoke(handle, arg0) as String
    }

    val knownServerBrands: Any
        get() = getKnownServerBrandsHandle.invoke(handle) as Any

    val removedFeatureFlags: Any
        get() = getRemovedFeatureFlagsHandle.invoke(handle) as Any

    val dataConfiguration: WrapperWorldDataConfiguration
        get() = WrapperWorldDataConfiguration(getDataConfigurationHandle.invoke(handle))

    val worldGenSettingsLifecycle: Any
        get() = worldGenSettingsLifecycleHandle.invoke(handle) as Any

    val loadedPlayerTag: WrapperCompoundTag
        get() = WrapperCompoundTag(getLoadedPlayerTagHandle.invoke(handle))

    val allowCommands: Boolean
        get() = isAllowCommandsHandle.invoke(handle) as Boolean

    val levelSettings: WrapperLevelSettings
        get() = WrapperLevelSettings(getLevelSettingsHandle.invoke(handle))

    val customBossEvents: WrapperCompoundTag
        get() = WrapperCompoundTag(getCustomBossEventsHandle.invoke(handle))

    val worldGenOptions: WrapperWorldOptions
        get() = WrapperWorldOptions(worldGenOptionsHandle.invoke(handle))

    val endDragonFightData: WrapperData
        get() = WrapperData(endDragonFightDataHandle.invoke(handle))

    val flatWorld: Boolean
        get() = isFlatWorldHandle.invoke(handle) as Boolean

}
