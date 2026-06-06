package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperScoreHolder(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.ScoreHolder") }
        private val lookup = MethodHandles.lookup()

        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getFeedbackDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFeedbackDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getScoreboardNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboardName", MethodType.methodType(String::class.java))
        }
    }

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val feedbackDisplayName: WrapperComponent
        get() = WrapperComponent(getFeedbackDisplayNameHandle.invoke(handle))

    val scoreboardName: String
        get() = getScoreboardNameHandle.invoke(handle) as String

}
