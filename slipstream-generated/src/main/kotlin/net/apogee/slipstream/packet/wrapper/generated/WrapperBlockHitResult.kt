package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockHitResult(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.BlockHitResult") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.phys.HitResult\$Type")))
        }
        val getDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val isInsideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInside", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBlockPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val withDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDirection", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.core.Direction")))
        }
        val withPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val type: Any
        get() = getTypeHandle.invoke(handle) as Any

    val direction: Any
        get() = getDirectionHandle.invoke(handle) as Any

    val inside: Boolean
        get() = isInsideHandle.invoke(handle) as Boolean

    val blockPos: WrapperBlockPos
        get() = WrapperBlockPos(getBlockPosHandle.invoke(handle))

    fun withDirection(arg0: Any): WrapperBlockHitResult {
        return WrapperBlockHitResult(withDirectionHandle.invoke(handle, arg0))
    }

    fun withPosition(arg0: WrapperBlockPos): WrapperBlockHitResult {
        return WrapperBlockHitResult(withPositionHandle.invoke(handle, arg0.handle))
    }

}
