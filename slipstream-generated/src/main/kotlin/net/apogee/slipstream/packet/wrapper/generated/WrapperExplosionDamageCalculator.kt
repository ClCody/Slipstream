package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperExplosionDamageCalculator(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ExplosionDamageCalculator") }
        private val lookup = MethodHandles.lookup()

        val shouldBlockExplodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldBlockExplode", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Float::class.javaPrimitiveType!!))
        }
        val shouldDamageEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldDamageEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getEntityDamageAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityDamageAmount", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getKnockbackMultiplierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnockbackMultiplier", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getBlockExplosionResistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockExplosionResistance", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.material.FluidState")))
        }
    }

    fun shouldBlockExplode(arg0: WrapperExplosion, arg1: WrapperBlockGetter, arg2: WrapperBlockPos, arg3: WrapperBlockState, arg4: Float): Boolean {
        return shouldBlockExplodeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4) as Boolean
    }

    fun shouldDamageEntity(arg0: WrapperExplosion, arg1: WrapperEntity): Boolean {
        return shouldDamageEntityHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun getEntityDamageAmount(arg0: WrapperExplosion, arg1: WrapperEntity): Float {
        return getEntityDamageAmountHandle.invoke(handle, arg0.handle, arg1.handle) as Float
    }

    fun getKnockbackMultiplier(arg0: WrapperEntity): Float {
        return getKnockbackMultiplierHandle.invoke(handle, arg0.handle) as Float
    }

    fun getBlockExplosionResistance(arg0: WrapperExplosion, arg1: WrapperBlockGetter, arg2: WrapperBlockPos, arg3: WrapperBlockState, arg4: WrapperFluidState): Any {
        return getBlockExplosionResistanceHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle) as Any
    }

}
