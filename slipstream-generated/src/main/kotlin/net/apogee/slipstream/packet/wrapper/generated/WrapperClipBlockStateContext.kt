package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClipBlockStateContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ClipBlockStateContext") }
        private val lookup = MethodHandles.lookup()

        val getFromHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFrom", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val isTargetBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTargetBlock", MethodType.methodType(Class.forName("java.util.function.Predicate")))
        }
        val getToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTo", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
    }

    val from: WrapperVec3
        get() = WrapperVec3(getFromHandle.invoke(handle))

    val targetBlock: Any
        get() = isTargetBlockHandle.invoke(handle) as Any

    val to: WrapperVec3
        get() = WrapperVec3(getToHandle.invoke(handle))

}
