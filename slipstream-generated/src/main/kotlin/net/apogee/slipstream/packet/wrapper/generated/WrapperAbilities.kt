package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAbilities(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.player.Abilities") }
        private val lookup = MethodHandles.lookup()

        val getFlyingSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFlyingSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getWalkingSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWalkingSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val invulnerableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("invulnerable")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val flyingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("flying")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val mayflySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("mayfly")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val instabuildSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("instabuild")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val mayBuildSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("mayBuild")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val flyingSpeedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("flyingSpeed")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val walkingSpeedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("walkingSpeed")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val flyingSpeed: Float
        get() = getFlyingSpeedHandle.invoke(handle) as Float

    val walkingSpeed: Float
        get() = getWalkingSpeedHandle.invoke(handle) as Float

    fun setInvulnerable(value: Boolean) {
        invulnerableSetterHandle.invoke(handle, value)
    }

    fun setFlying(value: Boolean) {
        flyingSetterHandle.invoke(handle, value)
    }

    fun setMayfly(value: Boolean) {
        mayflySetterHandle.invoke(handle, value)
    }

    fun setInstabuild(value: Boolean) {
        instabuildSetterHandle.invoke(handle, value)
    }

    fun setMayBuild(value: Boolean) {
        mayBuildSetterHandle.invoke(handle, value)
    }

    fun setFlyingSpeed(value: Float) {
        flyingSpeedSetterHandle.invoke(handle, value)
    }

    fun setWalkingSpeed(value: Float) {
        walkingSpeedSetterHandle.invoke(handle, value)
    }

}
