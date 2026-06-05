package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClipContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ClipContext") }
        private val lookup = MethodHandles.lookup()

        val getFromHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFrom", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getBlockShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockShape", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getFluidShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidShape", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTo", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
    }

    val from: WrapperVec3
        get() = WrapperVec3(getFromHandle.invoke(handle))

    fun getBlockShape(arg0: WrapperBlockState, arg1: WrapperBlockGetter, arg2: WrapperBlockPos): WrapperVoxelShape {
        return WrapperVoxelShape(getBlockShapeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    fun getFluidShape(arg0: WrapperFluidState, arg1: WrapperBlockGetter, arg2: WrapperBlockPos): WrapperVoxelShape {
        return WrapperVoxelShape(getFluidShapeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    val to: WrapperVec3
        get() = WrapperVec3(getToHandle.invoke(handle))

}
