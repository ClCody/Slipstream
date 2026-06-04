package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperGlobalPos(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.GlobalPos") }
        private val lookup = MethodHandles.lookup()

        val dimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dimension", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val posHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val dimension: WrapperResourceKey
        get() = WrapperResourceKey(dimensionHandle.invoke(handle))

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(posHandle.invoke(handle))

    fun copy(dimension: WrapperResourceKey = this.dimension, pos: WrapperBlockPos = this.pos): WrapperGlobalPos {
        return WrapperGlobalPos(constructorHandle.invoke(dimension.handle, pos.handle))
    }

}
