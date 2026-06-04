package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureBlockInfo(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate\$StructureBlockInfo") }
        private val lookup = MethodHandles.lookup()

        val posHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val stateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "state", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val nbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nbt", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.nbt.CompoundTag")))
        }
    }

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(posHandle.invoke(handle))

    val state: WrapperBlockState
        get() = WrapperBlockState(stateHandle.invoke(handle))

    val nbt: WrapperCompoundTag
        get() = WrapperCompoundTag(nbtHandle.invoke(handle))

    fun copy(pos: WrapperBlockPos = this.pos, state: WrapperBlockState = this.state, nbt: WrapperCompoundTag = this.nbt): WrapperStructureBlockInfo {
        return WrapperStructureBlockInfo(constructorHandle.invoke(pos.handle, state.handle, nbt.handle))
    }

}
