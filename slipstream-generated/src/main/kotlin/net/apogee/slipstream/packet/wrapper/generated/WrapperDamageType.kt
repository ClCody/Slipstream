package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDamageType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.damagesource.DamageType") }
        private val lookup = MethodHandles.lookup()

        val msgIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "msgId", MethodType.methodType(String::class.java))
        }
        val scalingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scaling", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageScaling")))
        }
        val exhaustionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "exhaustion", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val effectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "effects", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageEffects")))
        }
        val deathMessageTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "deathMessageType", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DeathMessageType")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("net.minecraft.world.damagesource.DamageScaling"), Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageEffects"), Class.forName("net.minecraft.world.damagesource.DeathMessageType")))
        }
    }

    val msgId: String
        get() = msgIdHandle.invoke(handle) as String

    val scaling: Any
        get() = scalingHandle.invoke(handle) as Any

    val exhaustion: Float
        get() = exhaustionHandle.invoke(handle) as Float

    val effects: Any
        get() = effectsHandle.invoke(handle) as Any

    val deathMessageType: Any
        get() = deathMessageTypeHandle.invoke(handle) as Any

    fun copy(msgId: String = this.msgId, scaling: Any = this.scaling, exhaustion: Float = this.exhaustion, effects: Any = this.effects, deathMessageType: Any = this.deathMessageType): WrapperDamageType {
        return WrapperDamageType(constructorHandle.invoke(msgId, scaling, exhaustion, effects, deathMessageType))
    }

}
