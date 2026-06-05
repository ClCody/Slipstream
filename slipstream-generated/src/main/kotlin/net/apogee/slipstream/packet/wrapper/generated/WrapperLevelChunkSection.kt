package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLevelChunkSection(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.chunk.LevelChunkSection") }
        private val lookup = MethodHandles.lookup()

        val getNoiseBiomeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoiseBiome", MethodType.methodType(Class.forName("net.minecraft.core.Holder"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val setBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getSerializedSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSerializedSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isRandomlyTickingBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRandomlyTickingBlocks", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isRandomlyTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRandomlyTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFluidStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidState", MethodType.methodType(Class.forName("net.minecraft.world.level.material.FluidState"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isRandomlyTickingFluidsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRandomlyTickingFluids", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getTickingBlockListHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getTickingBlockList", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.common.list.IBlockDataList")))
        }
        val getBiomesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBiomes", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainerRO")))
        }
        val hasOnlyAirHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasOnlyAir", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val maybeHasHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maybeHas", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
        val `moonrise$getSpecialCollidingBlocksHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSpecialCollidingBlocks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getStatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStates", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.PalettedContainer")))
        }
        val nonEmptyBlockCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nonEmptyBlockCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickingBlockCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickingBlockCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickingFluidCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickingFluidCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val biomesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("biomes")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val specialCollidingBlocksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("specialCollidingBlocks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getNoiseBiome(arg0: Int, arg1: Int, arg2: Int): WrapperHolder {
        return WrapperHolder(getNoiseBiomeHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun setBlockState(arg0: Int, arg1: Int, arg2: Int, arg3: WrapperBlockState): WrapperBlockState {
        return WrapperBlockState(setBlockStateHandle.invoke(handle, arg0, arg1, arg2, arg3.handle))
    }

    val serializedSize: Int
        get() = getSerializedSizeHandle.invoke(handle) as Int

    val randomlyTickingBlocks: Boolean
        get() = isRandomlyTickingBlocksHandle.invoke(handle) as Boolean

    fun getBlockState(arg0: Int, arg1: Int, arg2: Int): WrapperBlockState {
        return WrapperBlockState(getBlockStateHandle.invoke(handle, arg0, arg1, arg2))
    }

    val randomlyTicking: Boolean
        get() = isRandomlyTickingHandle.invoke(handle) as Boolean

    fun getFluidState(arg0: Int, arg1: Int, arg2: Int): WrapperFluidState {
        return WrapperFluidState(getFluidStateHandle.invoke(handle, arg0, arg1, arg2))
    }

    val randomlyTickingFluids: Boolean
        get() = isRandomlyTickingFluidsHandle.invoke(handle) as Boolean

    val `moonrise$getTickingBlockList`: Any
        get() = `moonrise$getTickingBlockListHandle`.invoke(handle) as Any

    val biomes: WrapperPalettedContainerRO
        get() = WrapperPalettedContainerRO(getBiomesHandle.invoke(handle))

    val onlyAir: Boolean
        get() = hasOnlyAirHandle.invoke(handle) as Boolean

    fun maybeHas(arg0: Any): Boolean {
        return maybeHasHandle.invoke(handle, arg0) as Boolean
    }

    val `moonrise$getSpecialCollidingBlocks`: Int
        get() = `moonrise$getSpecialCollidingBlocksHandle`.invoke(handle) as Int

    val states: WrapperPalettedContainer
        get() = WrapperPalettedContainer(getStatesHandle.invoke(handle))

    fun setNonEmptyBlockCount(value: Short) {
        nonEmptyBlockCountSetterHandle.invoke(handle, value)
    }

    fun setTickingBlockCount(value: Short) {
        tickingBlockCountSetterHandle.invoke(handle, value)
    }

    fun setTickingFluidCount(value: Short) {
        tickingFluidCountSetterHandle.invoke(handle, value)
    }

    fun setBiomes(value: WrapperPalettedContainer) {
        biomesSetterHandle.invoke(handle, value.handle)
    }

    fun setSpecialCollidingBlocks(value: Int) {
        specialCollidingBlocksSetterHandle.invoke(handle, value)
    }

}
