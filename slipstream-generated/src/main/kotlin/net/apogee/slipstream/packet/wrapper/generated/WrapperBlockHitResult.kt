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
        val withDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withDirection", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.core.Direction")))
        }
        val getDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getBlockPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isInsideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInside", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val withPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val type: Any
        get() = getTypeHandle.invoke(handle) as Any

    fun withDirection(arg0: Any): WrapperBlockHitResult {
        return WrapperBlockHitResult(withDirectionHandle.invoke(handle, arg0))
    }

    val direction: Any
        get() = getDirectionHandle.invoke(handle) as Any

    val blockPos: WrapperBlockPos
        get() = WrapperBlockPos(getBlockPosHandle.invoke(handle))

    val inside: Boolean
        get() = isInsideHandle.invoke(handle) as Boolean

    fun withPosition(arg0: WrapperBlockPos): WrapperBlockHitResult {
        return WrapperBlockHitResult(withPositionHandle.invoke(handle, arg0.handle))
    }

}
