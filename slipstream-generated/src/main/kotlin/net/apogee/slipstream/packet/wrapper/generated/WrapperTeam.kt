package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTeam(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.Team") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val getColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getColor", MethodType.methodType(Class.forName("net.minecraft.ChatFormatting")))
        }
        val getCollisionRuleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCollisionRule", MethodType.methodType(Class.forName("net.minecraft.world.scores.Team\$CollisionRule")))
        }
        val isAllowFriendlyFireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowFriendlyFire", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getNameTagVisibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNameTagVisibility", MethodType.methodType(Class.forName("net.minecraft.world.scores.Team\$Visibility")))
        }
        val isAlliedToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlliedTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.scores.Team")))
        }
        val canSeeFriendlyInvisiblesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSeeFriendlyInvisibles", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFormattedNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFormattedName", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent"), Class.forName("net.minecraft.network.chat.Component")))
        }
        val getPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayers", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getDeathMessageVisibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeathMessageVisibility", MethodType.methodType(Class.forName("net.minecraft.world.scores.Team\$Visibility")))
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val color: Any
        get() = getColorHandle.invoke(handle) as Any

    val collisionRule: Any
        get() = getCollisionRuleHandle.invoke(handle) as Any

    val allowFriendlyFire: Boolean
        get() = isAllowFriendlyFireHandle.invoke(handle) as Boolean

    val nameTagVisibility: Any
        get() = getNameTagVisibilityHandle.invoke(handle) as Any

    fun isAlliedTo(arg0: WrapperTeam): Boolean {
        return isAlliedToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val canSeeFriendlyInvisibles: Boolean
        get() = canSeeFriendlyInvisiblesHandle.invoke(handle) as Boolean

    fun getFormattedName(arg0: WrapperComponent): WrapperMutableComponent {
        return WrapperMutableComponent(getFormattedNameHandle.invoke(handle, arg0.handle))
    }

    val players: Any
        get() = getPlayersHandle.invoke(handle) as Any

    val deathMessageVisibility: Any
        get() = getDeathMessageVisibilityHandle.invoke(handle) as Any

}
