package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPathTypeCache(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.pathfinder.PathTypeCache") }
        private val lookup = MethodHandles.lookup()

        val getOrComputeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCompute", MethodType.methodType(Class.forName("net.minecraft.world.level.pathfinder.PathType"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    fun getOrCompute(arg0: WrapperBlockGetter, arg1: WrapperBlockPos): Any {
        return getOrComputeHandle.invoke(handle, arg0.handle, arg1.handle) as Any
    }

}
