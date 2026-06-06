package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelChunk(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.LevelChunk") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getFluidIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val `moonrise$getBlockHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBlockStateIfLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateIfLoaded", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBlockEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntities", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getBlockEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntity", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntity"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getFluidStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidState", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val setBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val getFullStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFullStatus", MethodType.methodType(Class.forName("net.minecraft.server.level.FullChunkStatus")))
        }
        val getFluidTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.TickContainerAccess")))
        }
        val getBlockTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockTicks", MethodType.methodType(Class.forName("net.minecraft.world.ticks.TickContainerAccess")))
        }
        val getInhabitedTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInhabitedTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val isUnsavedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUnsaved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPersistedStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPersistedStatus", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.status.ChunkStatus")))
        }
        val getBlockStateFinalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateFinal", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getBlockEntityNbtForSavingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntityNbtForSaving", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getTicksForSerializationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicksForSerialization", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.ChunkAccess\$TicksToSave")))
        }
        val getListenerRegistryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getListenerRegistry", MethodType.methodType(Class.forName("net.minecraft.world.level.gameevent.GameEventListenerRegistry"), Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getChunkAndHolderHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getChunkAndHolder", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerChunkCache\$ChunkAndHolder")))
        }
        val `moonrise$isPostProcessingDoneHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isPostProcessingDone", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val loadedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("loaded")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fullStatusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fullStatus")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val postLoadSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("postLoad")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val mustNotSaveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("mustNotSave")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val needsDecorationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("needsDecoration")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val loadedTicketLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("loadedTicketLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val postProcessingDoneSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("postProcessingDone")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkAndHolderSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkAndHolder")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    val level: WrapperLevel
        get() = WrapperLevel(getLevelHandle.invoke(handle))

    fun getBlockState(arg0: Int, arg1: Int, arg2: Int): WrapperBlockState {
        return WrapperBlockState(getBlockStateHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getFluidIfLoaded(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidIfLoadedHandle.invoke(handle, arg0.handle))
    }

    fun `moonrise$getBlock`(arg0: Int, arg1: Int, arg2: Int): WrapperBlockState {
        return WrapperBlockState(`moonrise$getBlockHandle`.invoke(handle, arg0, arg1, arg2))
    }

    fun getBlockStateIfLoaded(arg0: WrapperBlockPos): WrapperBlockState {
        return WrapperBlockState(getBlockStateIfLoadedHandle.invoke(handle, arg0.handle))
    }

    val blockEntities: Any
        get() = getBlockEntitiesHandle.invoke(handle) as Any

    fun getBlockEntity(arg0: WrapperBlockPos): WrapperBlockEntity {
        return WrapperBlockEntity(getBlockEntityHandle.invoke(handle, arg0.handle))
    }

    fun getFluidState(arg0: WrapperBlockPos): WrapperFluidState {
        return WrapperFluidState(getFluidStateHandle.invoke(handle, arg0.handle))
    }

    fun setBlockState(arg0: WrapperBlockPos, arg1: WrapperBlockState, arg2: Boolean, arg3: Boolean): WrapperBlockState {
        return WrapperBlockState(setBlockStateHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3))
    }

    val fullStatus: Any
        get() = getFullStatusHandle.invoke(handle) as Any

    val fluidTicks: Any
        get() = getFluidTicksHandle.invoke(handle) as Any

    val blockTicks: Any
        get() = getBlockTicksHandle.invoke(handle) as Any

    val inhabitedTime: Long
        get() = getInhabitedTimeHandle.invoke(handle) as Long

    val unsaved: Boolean
        get() = isUnsavedHandle.invoke(handle) as Boolean

    val persistedStatus: WrapperChunkStatus
        get() = WrapperChunkStatus(getPersistedStatusHandle.invoke(handle))

    fun getBlockStateFinal(arg0: Int, arg1: Int, arg2: Int): WrapperBlockState {
        return WrapperBlockState(getBlockStateFinalHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun getBlockEntityNbtForSaving(arg0: WrapperBlockPos, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(getBlockEntityNbtForSavingHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val ticksForSerialization: WrapperTicksToSave
        get() = WrapperTicksToSave(getTicksForSerializationHandle.invoke(handle))

    fun getListenerRegistry(arg0: Int): WrapperGameEventListenerRegistry {
        return WrapperGameEventListenerRegistry(getListenerRegistryHandle.invoke(handle, arg0))
    }

    val `moonrise$getChunkAndHolder`: WrapperChunkAndHolder
        get() = WrapperChunkAndHolder(`moonrise$getChunkAndHolderHandle`.invoke(handle))

    val `moonrise$isPostProcessingDone`: Boolean
        get() = `moonrise$isPostProcessingDoneHandle`.invoke(handle) as Boolean

    fun setLoaded(value: Boolean) {
        loadedSetterHandle.invoke(handle, value)
    }

    fun setFullStatus(value: Any) {
        fullStatusSetterHandle.invoke(handle, value)
    }

    fun setPostLoad(value: Any) {
        postLoadSetterHandle.invoke(handle, value)
    }

    fun setMustNotSave(value: Boolean) {
        mustNotSaveSetterHandle.invoke(handle, value)
    }

    fun setNeedsDecoration(value: Boolean) {
        needsDecorationSetterHandle.invoke(handle, value)
    }

    fun setLoadedTicketLevel(value: Boolean) {
        loadedTicketLevelSetterHandle.invoke(handle, value)
    }

    fun setPostProcessingDone(value: Boolean) {
        postProcessingDoneSetterHandle.invoke(handle, value)
    }

    fun setChunkAndHolder(value: WrapperChunkAndHolder) {
        chunkAndHolderSetterHandle.invoke(handle, value.handle)
    }

}
