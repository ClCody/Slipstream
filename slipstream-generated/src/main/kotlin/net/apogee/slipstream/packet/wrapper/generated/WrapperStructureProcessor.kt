package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureProcessor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor") }
        private val lookup = MethodHandles.lookup()

        val processBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "processBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate\$StructureBlockInfo"), Class.forName("net.minecraft.world.level.LevelReader"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate\$StructureBlockInfo"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate\$StructureBlockInfo"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings")))
        }
        val finalizeProcessingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "finalizeProcessing", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.level.ServerLevelAccessor"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("java.util.List"), Class.forName("java.util.List"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings")))
        }
    }

    fun processBlock(arg0: WrapperLevelReader, arg1: WrapperBlockPos, arg2: WrapperBlockPos, arg3: WrapperStructureBlockInfo, arg4: WrapperStructureBlockInfo, arg5: WrapperStructurePlaceSettings): WrapperStructureBlockInfo {
        return WrapperStructureBlockInfo(processBlockHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle, arg5.handle))
    }

    fun finalizeProcessing(arg0: WrapperServerLevelAccessor, arg1: WrapperBlockPos, arg2: WrapperBlockPos, arg3: Any, arg4: Any, arg5: WrapperStructurePlaceSettings): Any {
        return finalizeProcessingHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3, arg4, arg5.handle) as Any
    }

}
