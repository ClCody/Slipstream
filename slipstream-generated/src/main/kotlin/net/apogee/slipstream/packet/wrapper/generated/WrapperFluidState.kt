package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperFluidState(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.material.FluidState") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val holderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "holder", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.level.material.Fluid")))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val getShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShape", MethodType.methodType(Class.forName("net.minecraft.world.phys.shapes.VoxelShape"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val createLegacyBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createLegacyBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getFlowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFlow", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val shouldRenderBackwardUpFaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRenderBackwardUpFace", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getExplosionResistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExplosionResistance", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSource", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isRandomlyTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRandomlyTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isSourceOfTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSourceOfType", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.Fluid")))
        }
        val getOwnHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOwnHeight", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getDripParticleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDripParticle", MethodType.methodType(Class.forName("net.minecraft.core.particles.ParticleOptions")))
        }
        val canBeReplacedWithHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeReplacedWith", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.material.Fluid"), Class.forName("net.minecraft.core.Direction")))
        }
        val getTagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTags", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAmount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHeight", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val holder: WrapperHolder
        get() = WrapperHolder(holderHandle.invoke(handle))

    val type: WrapperFluid
        get() = WrapperFluid(getTypeHandle.invoke(handle))

    fun `is`(arg0: WrapperTagKey): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getShape(arg0: WrapperBlockGetter, arg1: WrapperBlockPos): WrapperVoxelShape {
        return WrapperVoxelShape(getShapeHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val createLegacyBlock: WrapperBlockState
        get() = WrapperBlockState(createLegacyBlockHandle.invoke(handle))

    fun getFlow(arg0: WrapperBlockGetter, arg1: WrapperBlockPos): WrapperVec3 {
        return WrapperVec3(getFlowHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun shouldRenderBackwardUpFace(arg0: WrapperBlockGetter, arg1: WrapperBlockPos): Boolean {
        return shouldRenderBackwardUpFaceHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val explosionResistance: Float
        get() = getExplosionResistanceHandle.invoke(handle) as Float

    val source: Boolean
        get() = isSourceHandle.invoke(handle) as Boolean

    val randomlyTicking: Boolean
        get() = isRandomlyTickingHandle.invoke(handle) as Boolean

    fun isSourceOfType(arg0: WrapperFluid): Boolean {
        return isSourceOfTypeHandle.invoke(handle, arg0.handle) as Boolean
    }

    val ownHeight: Float
        get() = getOwnHeightHandle.invoke(handle) as Float

    val dripParticle: WrapperParticleOptions
        get() = WrapperParticleOptions(getDripParticleHandle.invoke(handle))

    fun canBeReplacedWith(arg0: WrapperBlockGetter, arg1: WrapperBlockPos, arg2: WrapperFluid, arg3: Any): Boolean {
        return canBeReplacedWithHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3) as Boolean
    }

    val tags: Any
        get() = getTagsHandle.invoke(handle) as Any

    val amount: Int
        get() = getAmountHandle.invoke(handle) as Int

    fun getHeight(arg0: WrapperBlockGetter, arg1: WrapperBlockPos): Float {
        return getHeightHandle.invoke(handle, arg0.handle, arg1.handle) as Float
    }

}
