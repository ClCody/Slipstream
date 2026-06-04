package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCollisionContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.phys.shapes.CollisionContext") }
        private val lookup = MethodHandles.lookup()

        val isHoldingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHoldingItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.Item")))
        }
        val canStandOnFluidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canStandOnFluid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.world.level.material.FluidState")))
        }
        val isDescendingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDescending", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isAboveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAbove", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
    }

    fun isHoldingItem(arg0: WrapperItem): Boolean {
        return isHoldingItemHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun canStandOnFluid(arg0: WrapperFluidState, arg1: WrapperFluidState): Boolean {
        return canStandOnFluidHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val descending: Boolean
        get() = isDescendingHandle.invoke(handle) as Boolean

    fun isAbove(arg0: WrapperVoxelShape, arg1: WrapperBlockPos, arg2: Boolean): Boolean {
        return isAboveHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Boolean
    }

}
