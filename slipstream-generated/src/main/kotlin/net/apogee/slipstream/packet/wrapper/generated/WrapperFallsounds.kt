package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFallsounds(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.LivingEntity\$Fallsounds") }
        private val lookup = MethodHandles.lookup()

        val smallHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "small", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val bigHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "big", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.sounds.SoundEvent"), Class.forName("net.minecraft.sounds.SoundEvent")))
        }
    }

    val small: WrapperSoundEvent
        get() = WrapperSoundEvent(smallHandle.invoke(handle))

    val big: WrapperSoundEvent
        get() = WrapperSoundEvent(bigHandle.invoke(handle))

    fun copy(small: WrapperSoundEvent = this.small, big: WrapperSoundEvent = this.big): WrapperFallsounds {
        return WrapperFallsounds(constructorHandle.invoke(small.handle, big.handle))
    }

}
