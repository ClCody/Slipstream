package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperWitherSkull(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.projectile.WitherSkull") }
        private val lookup = MethodHandles.lookup()

        val isOnFireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOnFire", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val getBlockExplosionResistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockExplosionResistance", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.material.FluidState"), Float::class.javaPrimitiveType!!))
        }
        val isDangerousHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDangerous", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val onFire: Boolean
        get() = isOnFireHandle.invoke(handle) as Boolean

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun getBlockExplosionResistance(arg0: WrapperExplosion, arg1: WrapperBlockGetter, arg2: WrapperBlockPos, arg3: WrapperBlockState, arg4: WrapperFluidState, arg5: Float): Float {
        return getBlockExplosionResistanceHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle, arg5) as Float
    }

    val dangerous: Boolean
        get() = isDangerousHandle.invoke(handle) as Boolean

}
