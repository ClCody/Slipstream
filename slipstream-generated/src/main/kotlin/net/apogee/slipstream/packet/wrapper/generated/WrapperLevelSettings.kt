package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelSettings(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.LevelSettings") }
        private val lookup = MethodHandles.lookup()

        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings")))
        }
        val gameRulesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gameRules", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
        }
        val allowCommandsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "allowCommands", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings"), Class.forName("net.minecraft.world.Difficulty")))
        }
        val withGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings"), Class.forName("net.minecraft.world.level.GameType")))
        }
        val withDataConfigurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDataConfiguration", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings"), Class.forName("net.minecraft.world.level.WorldDataConfiguration")))
        }
        val getDataConfigurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDataConfiguration", MethodType.methodType(Class.forName("net.minecraft.world.level.WorldDataConfiguration")))
        }
        val gameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val difficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "difficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
        val levelNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "levelName", MethodType.methodType(String::class.java))
        }
        val hardcoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hardcore", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val levelNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("levelName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hardcoreSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hardcore")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val copy: WrapperLevelSettings
        get() = WrapperLevelSettings(copyHandle.invoke(handle))

    val gameRules: WrapperGameRules
        get() = WrapperGameRules(gameRulesHandle.invoke(handle))

    val allowCommands: Boolean
        get() = allowCommandsHandle.invoke(handle) as Boolean

    fun withDifficulty(arg0: Any): WrapperLevelSettings {
        return WrapperLevelSettings(withDifficultyHandle.invoke(handle, arg0))
    }

    fun withGameType(arg0: Any): WrapperLevelSettings {
        return WrapperLevelSettings(withGameTypeHandle.invoke(handle, arg0))
    }

    fun withDataConfiguration(arg0: WrapperWorldDataConfiguration): WrapperLevelSettings {
        return WrapperLevelSettings(withDataConfigurationHandle.invoke(handle, arg0.handle))
    }

    val dataConfiguration: WrapperWorldDataConfiguration
        get() = WrapperWorldDataConfiguration(getDataConfigurationHandle.invoke(handle))

    val gameType: Any
        get() = gameTypeHandle.invoke(handle) as Any

    val difficulty: Any
        get() = difficultyHandle.invoke(handle) as Any

    val levelName: String
        get() = levelNameHandle.invoke(handle) as String

    val hardcore: Boolean
        get() = hardcoreHandle.invoke(handle) as Boolean

    fun setLevelName(value: String) {
        levelNameSetterHandle.invoke(handle, value)
    }

    fun setHardcore(value: Boolean) {
        hardcoreSetterHandle.invoke(handle, value)
    }

}
