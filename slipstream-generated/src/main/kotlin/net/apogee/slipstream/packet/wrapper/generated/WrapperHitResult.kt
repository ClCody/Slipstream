package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperHitResult(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.HitResult") }
        private val lookup = MethodHandles.lookup()

        val getLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocation", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.phys.HitResult\$Type")))
        }
        val distanceToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceTo", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
    }

    val location: WrapperVec3
        get() = WrapperVec3(getLocationHandle.invoke(handle))

    val type: Any
        get() = getTypeHandle.invoke(handle) as Any

    fun distanceTo(arg0: WrapperEntity): Double {
        return distanceToHandle.invoke(handle, arg0.handle) as Double
    }

}
