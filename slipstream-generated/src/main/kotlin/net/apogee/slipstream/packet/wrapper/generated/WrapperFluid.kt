package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFluid(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.material.Fluid") }
        private val lookup = MethodHandles.lookup()

        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val getShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShape", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBucketHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBucket", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
        val getOwnHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwnHeight", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.FluidState")))
        }
        val getTickDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickDelay", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.LevelReader")))
        }
        val getPickupSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickupSound", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getStateDefinitionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateDefinition", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.StateDefinition")))
        }
        val defaultFluidStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "defaultFluidState", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState")))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val builtInRegistryHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "builtInRegistryHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference")))
        }
        val getAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmount", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.FluidState")))
        }
        val isSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSource", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.FluidState")))
        }
        val isSameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSame", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.Fluid")))
        }
        val defaultFluidStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("defaultFluidState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun `is`(arg0: WrapperTagKey): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getShape(arg0: WrapperFluidState, arg1: WrapperBlockGetter, arg2: WrapperBlockPos): WrapperVoxelShape {
        return WrapperVoxelShape(getShapeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    val bucket: WrapperItem
        get() = WrapperItem(getBucketHandle.invoke(handle))

    fun getOwnHeight(arg0: WrapperFluidState): Float {
        return getOwnHeightHandle.invoke(handle, arg0.handle) as Float
    }

    fun getTickDelay(arg0: WrapperLevelReader): Int {
        return getTickDelayHandle.invoke(handle, arg0.handle) as Int
    }

    val pickupSound: Any
        get() = getPickupSoundHandle.invoke(handle) as Any

    val stateDefinition: WrapperStateDefinition
        get() = WrapperStateDefinition(getStateDefinitionHandle.invoke(handle))

    val defaultFluidState: WrapperFluidState
        get() = WrapperFluidState(defaultFluidStateHandle.invoke(handle))

    fun getHeight(arg0: WrapperFluidState, arg1: WrapperBlockGetter, arg2: WrapperBlockPos): Float {
        return getHeightHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Float
    }

    val builtInRegistryHolder: WrapperReference
        get() = WrapperReference(builtInRegistryHolderHandle.invoke(handle))

    fun getAmount(arg0: WrapperFluidState): Int {
        return getAmountHandle.invoke(handle, arg0.handle) as Int
    }

    fun isSource(arg0: WrapperFluidState): Boolean {
        return isSourceHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isSame(arg0: WrapperFluid): Boolean {
        return isSameHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setDefaultFluidState(value: WrapperFluidState) {
        defaultFluidStateSetterHandle.invoke(handle, value.handle)
    }

}
