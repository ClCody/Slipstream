package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ServerEntity") }
        private val lookup = MethodHandles.lookup()

        val getLastSentYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastSentYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getPositionBaseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPositionBase", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getLastSentXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastSentXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getLastSentMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastSentMovement", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getLastSentYHeadRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastSentYHeadRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val lastSentYRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentYRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentXRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentXRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentYHeadRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentYHeadRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentMovementSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentMovement")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val teleportDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("teleportDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastPassengersSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastPassengers")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasRidingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasRiding")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasOnGroundSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasOnGround")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val trackedDataValuesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("trackedDataValues")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val forceStateResyncSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("forceStateResync")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val lastSentYRot: Float
        get() = getLastSentYRotHandle.invoke(handle) as Float

    val positionBase: WrapperVec3
        get() = WrapperVec3(getPositionBaseHandle.invoke(handle))

    val lastSentXRot: Float
        get() = getLastSentXRotHandle.invoke(handle) as Float

    val lastSentMovement: WrapperVec3
        get() = WrapperVec3(getLastSentMovementHandle.invoke(handle))

    val lastSentYHeadRot: Float
        get() = getLastSentYHeadRotHandle.invoke(handle) as Float

    fun setLastSentYRot(value: Int) {
        lastSentYRotSetterHandle.invoke(handle, value)
    }

    fun setLastSentXRot(value: Int) {
        lastSentXRotSetterHandle.invoke(handle, value)
    }

    fun setLastSentYHeadRot(value: Int) {
        lastSentYHeadRotSetterHandle.invoke(handle, value)
    }

    fun setLastSentMovement(value: WrapperVec3) {
        lastSentMovementSetterHandle.invoke(handle, value.handle)
    }

    fun setTickCount(value: Int) {
        tickCountSetterHandle.invoke(handle, value)
    }

    fun setTeleportDelay(value: Int) {
        teleportDelaySetterHandle.invoke(handle, value)
    }

    fun setLastPassengers(value: Any) {
        lastPassengersSetterHandle.invoke(handle, value)
    }

    fun setWasRiding(value: Boolean) {
        wasRidingSetterHandle.invoke(handle, value)
    }

    fun setWasOnGround(value: Boolean) {
        wasOnGroundSetterHandle.invoke(handle, value)
    }

    fun setTrackedDataValues(value: Any) {
        trackedDataValuesSetterHandle.invoke(handle, value)
    }

    fun setForceStateResync(value: Boolean) {
        forceStateResyncSetterHandle.invoke(handle, value)
    }

}
