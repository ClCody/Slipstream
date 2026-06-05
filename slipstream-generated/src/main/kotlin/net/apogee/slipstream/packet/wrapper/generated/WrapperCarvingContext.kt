package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCarvingContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.carver.CarvingContext") }
        private val lookup = MethodHandles.lookup()

        val topMaterialHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "topMaterial", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("java.util.function.Function"), Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val randomStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "randomState", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.RandomState")))
        }
    }

    fun topMaterial(arg0: Any, arg1: WrapperChunkAccess, arg2: WrapperBlockPos, arg3: Boolean): Any {
        return topMaterialHandle.invoke(handle, arg0, arg1.handle, arg2.handle, arg3) as Any
    }

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    val randomState: WrapperRandomState
        get() = WrapperRandomState(randomStateHandle.invoke(handle))

}
