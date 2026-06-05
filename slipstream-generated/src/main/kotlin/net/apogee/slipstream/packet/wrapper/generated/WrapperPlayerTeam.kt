package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlayerTeam(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.PlayerTeam") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.world.scores.Scoreboard")))
        }
        val canSeeFriendlyInvisiblesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSeeFriendlyInvisibles", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDeathMessageVisibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeathMessageVisibility", MethodType.methodType(Class.forName("net.minecraft.world.scores.Team\$Visibility")))
        }
        val isAllowFriendlyFireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowFriendlyFire", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFormattedDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFormattedDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent")))
        }
        val getNameTagVisibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNameTagVisibility", MethodType.methodType(Class.forName("net.minecraft.world.scores.Team\$Visibility")))
        }
        val getColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getColor", MethodType.methodType(Class.forName("net.minecraft.ChatFormatting")))
        }
        val getPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayers", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getCollisionRuleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCollisionRule", MethodType.methodType(Class.forName("net.minecraft.world.scores.Team\$CollisionRule")))
        }
        val getPlayerSuffixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerSuffix", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getFormattedNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFormattedName", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Class.forName("net.minecraft.network.chat.Component")))
        }
        val packOptionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "packOptions", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPlayerPrefixHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerPrefix", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val displayNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("displayName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerPrefixSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("playerPrefix")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerSuffixSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("playerSuffix")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val allowFriendlyFireSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("allowFriendlyFire")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val seeFriendlyInvisiblesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("seeFriendlyInvisibles")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val nameTagVisibilitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nameTagVisibility")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val deathMessageVisibilitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("deathMessageVisibility")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val colorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("color")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val collisionRuleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("collisionRule")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val scoreboard: WrapperScoreboard
        get() = WrapperScoreboard(getScoreboardHandle.invoke(handle))

    val canSeeFriendlyInvisibles: Boolean
        get() = canSeeFriendlyInvisiblesHandle.invoke(handle) as Boolean

    val deathMessageVisibility: Any
        get() = getDeathMessageVisibilityHandle.invoke(handle) as Any

    val allowFriendlyFire: Boolean
        get() = isAllowFriendlyFireHandle.invoke(handle) as Boolean

    val formattedDisplayName: WrapperMutableComponent
        get() = WrapperMutableComponent(getFormattedDisplayNameHandle.invoke(handle))

    val nameTagVisibility: Any
        get() = getNameTagVisibilityHandle.invoke(handle) as Any

    val color: Any
        get() = getColorHandle.invoke(handle) as Any

    val players: Any
        get() = getPlayersHandle.invoke(handle) as Any

    val collisionRule: Any
        get() = getCollisionRuleHandle.invoke(handle) as Any

    val playerSuffix: WrapperComponent
        get() = WrapperComponent(getPlayerSuffixHandle.invoke(handle))

    fun getFormattedName(arg0: WrapperComponent): WrapperMutableComponent {
        return WrapperMutableComponent(getFormattedNameHandle.invoke(handle, arg0.handle))
    }

    val packOptions: Int
        get() = packOptionsHandle.invoke(handle) as Int

    val playerPrefix: WrapperComponent
        get() = WrapperComponent(getPlayerPrefixHandle.invoke(handle))

    fun setDisplayName(value: WrapperComponent) {
        displayNameSetterHandle.invoke(handle, value.handle)
    }

    fun setPlayerPrefix(value: WrapperComponent) {
        playerPrefixSetterHandle.invoke(handle, value.handle)
    }

    fun setPlayerSuffix(value: WrapperComponent) {
        playerSuffixSetterHandle.invoke(handle, value.handle)
    }

    fun setAllowFriendlyFire(value: Boolean) {
        allowFriendlyFireSetterHandle.invoke(handle, value)
    }

    fun setSeeFriendlyInvisibles(value: Boolean) {
        seeFriendlyInvisiblesSetterHandle.invoke(handle, value)
    }

    fun setNameTagVisibility(value: Any) {
        nameTagVisibilitySetterHandle.invoke(handle, value)
    }

    fun setDeathMessageVisibility(value: Any) {
        deathMessageVisibilitySetterHandle.invoke(handle, value)
    }

    fun setColor(value: Any) {
        colorSetterHandle.invoke(handle, value)
    }

    fun setCollisionRule(value: Any) {
        collisionRuleSetterHandle.invoke(handle, value)
    }

}
