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
        val gameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val difficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "difficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
        val hardcoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hardcore", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val levelNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "levelName", MethodType.methodType(String::class.java))
        }
        val withDataConfigurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDataConfiguration", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings"), Class.forName("net.minecraft.world.level.WorldDataConfiguration")))
        }
        val withGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings"), Class.forName("net.minecraft.world.level.GameType")))
        }
        val allowCommandsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "allowCommands", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelSettings"), Class.forName("net.minecraft.world.Difficulty")))
        }
        val getDataConfigurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDataConfiguration", MethodType.methodType(Class.forName("net.minecraft.world.level.WorldDataConfiguration")))
        }
        val gameRulesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "gameRules", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
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

    val gameType: Any
        get() = gameTypeHandle.invoke(handle) as Any

    val difficulty: Any
        get() = difficultyHandle.invoke(handle) as Any

    val hardcore: Boolean
        get() = hardcoreHandle.invoke(handle) as Boolean

    val levelName: String
        get() = levelNameHandle.invoke(handle) as String

    fun withDataConfiguration(arg0: WrapperWorldDataConfiguration): WrapperLevelSettings {
        return WrapperLevelSettings(withDataConfigurationHandle.invoke(handle, arg0.handle))
    }

    fun withGameType(arg0: Any): WrapperLevelSettings {
        return WrapperLevelSettings(withGameTypeHandle.invoke(handle, arg0))
    }

    val allowCommands: Boolean
        get() = allowCommandsHandle.invoke(handle) as Boolean

    fun withDifficulty(arg0: Any): WrapperLevelSettings {
        return WrapperLevelSettings(withDifficultyHandle.invoke(handle, arg0))
    }

    val dataConfiguration: WrapperWorldDataConfiguration
        get() = WrapperWorldDataConfiguration(getDataConfigurationHandle.invoke(handle))

    val gameRules: WrapperGameRules
        get() = WrapperGameRules(gameRulesHandle.invoke(handle))

    fun setLevelName(value: String) {
        levelNameSetterHandle.invoke(handle, value)
    }

    fun setHardcore(value: Boolean) {
        hardcoreSetterHandle.invoke(handle, value)
    }

}
