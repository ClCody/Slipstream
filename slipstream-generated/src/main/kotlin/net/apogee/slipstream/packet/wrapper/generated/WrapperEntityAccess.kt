package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityAccess(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.entity.EntityAccess") }
        private val lookup = MethodHandles.lookup()

        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB")))
        }
        val blockPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val shouldBeSavedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldBeSaved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isAlwaysTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlwaysTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSelfAndPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelfAndPassengers", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getPassengersAndSelfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengersAndSelf", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUUID", MethodType.methodType(Class.forName("java.util.UUID")))
        }
    }

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    val boundingBox: WrapperAABB
        get() = WrapperAABB(getBoundingBoxHandle.invoke(handle))

    val blockPosition: WrapperBlockPos
        get() = WrapperBlockPos(blockPositionHandle.invoke(handle))

    val shouldBeSaved: Boolean
        get() = shouldBeSavedHandle.invoke(handle) as Boolean

    val alwaysTicking: Boolean
        get() = isAlwaysTickingHandle.invoke(handle) as Boolean

    val selfAndPassengers: Any
        get() = getSelfAndPassengersHandle.invoke(handle) as Any

    val passengersAndSelf: Any
        get() = getPassengersAndSelfHandle.invoke(handle) as Any

    val uUID: Any
        get() = getUUIDHandle.invoke(handle) as Any

}
