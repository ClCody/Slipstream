package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockGetter(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.BlockGetter") }
        private val lookup = MethodHandles.lookup()

        val getFluidIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockStatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStates", MethodType.methodType(Class.forName("java.util.stream.Stream"), Class.forName("net.minecraft.world.phys.AABB")))
        }
        val getBlockIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.block.Block"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val isBlockInLineHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBlockInLine", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.world.level.ClipBlockStateContext")))
        }
        val getBlockEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntity", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.entity.BlockEntityType")))
        }
        val clipDirectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clipDirect", MethodType.methodType(Class.forName("net.minecraft.world.phys.HitResult\$Type"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.phys.shapes.CollisionContext")))
        }
        val clipWithInteractionOverrideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clipWithInteractionOverride", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getBlockStateIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockFloorHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockFloorHeight", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getFluidStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidState", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getMaxLightLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxLightLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getLightEmissionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightEmission", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val clipHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clip", MethodType.methodType(Class.forName("net.minecraft.world.phys.BlockHitResult"), Class.forName("net.minecraft.world.level.ClipContext"), Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    fun getFluidIfLoaded(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidIfLoadedHandle.invoke(handle, arg0.handle))
    }

    fun getBlockStates(arg0: WrapperAABB): Any {
        return getBlockStatesHandle.invoke(handle, arg0.handle) as Any
    }

    fun getBlockIfLoaded(arg0: WrapperBlockPos): WrapperBlock {
        return WrapperBlock(getBlockIfLoadedHandle.invoke(handle, arg0.handle))
    }

    fun isBlockInLine(arg0: WrapperClipBlockStateContext): WrapperBlockHitResult {
        return WrapperBlockHitResult(isBlockInLineHandle.invoke(handle, arg0.handle))
    }

    fun getBlockEntity(arg0: WrapperBlockPos, arg1: WrapperBlockEntityType): Any {
        return getBlockEntityHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

    fun clipDirect(arg0: WrapperVec3, arg1: WrapperVec3, arg2: WrapperBlockPos, arg3: WrapperBlockState, arg4: WrapperCollisionContext): Any {
        return clipDirectHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle) as Any
    }

    fun clipWithInteractionOverride(arg0: WrapperVec3, arg1: WrapperVec3, arg2: WrapperBlockPos, arg3: WrapperVoxelShape, arg4: WrapperBlockState): WrapperBlockHitResult {
        return WrapperBlockHitResult(clipWithInteractionOverrideHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle))
    }

    fun getBlockStateIfLoaded(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateIfLoadedHandle.invoke(handle, arg0.handle))
    }

    fun getBlockFloorHeight(arg0: WrapperBlockPos): Double {
        return getBlockFloorHeightHandle.invoke(handle, arg0.handle) as Double
    }

    fun getBlockState(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateHandle.invoke(handle, arg0.handle))
    }

    fun getFluidState(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidStateHandle.invoke(handle, arg0.handle))
    }

    val maxLightLevel: Int
        get() = getMaxLightLevelHandle.invoke(handle) as Int

    fun getLightEmission(arg0: WrapperBlockPos): Int {
        return getLightEmissionHandle.invoke(handle, arg0.handle) as Int
    }

    fun clip(arg0: WrapperClipContext, arg1: WrapperBlockPos): WrapperBlockHitResult {
        return WrapperBlockHitResult(clipHandle.invoke(handle, arg0.handle, arg1.handle))
    }

}
