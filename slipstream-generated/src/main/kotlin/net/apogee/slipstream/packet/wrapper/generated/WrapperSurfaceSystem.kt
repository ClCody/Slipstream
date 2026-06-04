package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSurfaceSystem(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.SurfaceSystem") }
        private val lookup = MethodHandles.lookup()

        val topMaterialHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "topMaterial", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.level.levelgen.SurfaceRules\$RuleSource"), Class.forName("net.minecraft.world.level.levelgen.carver.CarvingContext"), Class.forName("java.util.function.Function"), Class.forName("net.minecraft.world.level.chunk.ChunkAccess"), Class.forName("net.minecraft.world.level.levelgen.NoiseChunk"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
    }

    fun topMaterial(arg0: WrapperRuleSource, arg1: WrapperCarvingContext, arg2: Any, arg3: WrapperChunkAccess, arg4: WrapperNoiseChunk, arg5: WrapperBlockPos, arg6: Boolean): Any {
        return topMaterialHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3.handle, arg4.handle, arg5.handle, arg6) as Any
    }

}
