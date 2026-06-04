package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlock(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.Block") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.MutableComponent")))
        }
        val hasDynamicShapeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasDynamicShape", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val playerWillDestroyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "playerWillDestroy", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getCloneItemStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCloneItemStack", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.LevelReader"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getFrictionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFriction", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getSpeedFactorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpeedFactor", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getJumpFactorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getJumpFactor", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val dropFromExplosionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dropFromExplosion", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion")))
        }
        val getStateDefinitionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateDefinition", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.StateDefinition")))
        }
        val withPropertiesOfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPropertiesOf", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val defaultBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "defaultBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val builtInRegistryHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "builtInRegistryHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference")))
        }
        val getStateForPlacementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStateForPlacement", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.item.context.BlockPlaceContext")))
        }
        val isPossibleToRespawnInThisHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPossibleToRespawnInThis", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getExplosionResistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExplosionResistance", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getTimingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTiming", MethodType.methodType(Class.forName("co.aikar.timings.Timing")))
        }
        val getExpDropHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExpDrop", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.item.ItemStack"), Boolean::class.javaPrimitiveType!!))
        }
        val asItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asItem", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
        val isDestroyableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDestroyable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDescriptionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescriptionId", MethodType.methodType(String::class.java))
        }
        val defaultBlockStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("defaultBlockState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val timingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("timing")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val descriptionIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("descriptionId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val itemSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("item")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: WrapperMutableComponent
        get() = WrapperMutableComponent(getNameHandle.invoke(handle))

    val dynamicShape: Boolean
        get() = hasDynamicShapeHandle.invoke(handle) as Boolean

    fun playerWillDestroy(arg0: WrapperLevel, arg1: WrapperBlockPos, arg2: WrapperBlockState, arg3: WrapperPlayer): WrapperBlockState {
        return WrapperBlockState(playerWillDestroyHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle))
    }

    fun getCloneItemStack(arg0: WrapperLevelReader, arg1: WrapperBlockPos, arg2: WrapperBlockState): WrapperItemStack {
        return WrapperItemStack(getCloneItemStackHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    val friction: Float
        get() = getFrictionHandle.invoke(handle) as Float

    val speedFactor: Float
        get() = getSpeedFactorHandle.invoke(handle) as Float

    val jumpFactor: Float
        get() = getJumpFactorHandle.invoke(handle) as Float

    fun dropFromExplosion(arg0: WrapperExplosion): Boolean {
        return dropFromExplosionHandle.invoke(handle, arg0.handle) as Boolean
    }

    val stateDefinition: WrapperStateDefinition
        get() = WrapperStateDefinition(getStateDefinitionHandle.invoke(handle))

    fun withPropertiesOf(arg0: WrapperBlockState): WrapperBlockState {
        return WrapperBlockState(withPropertiesOfHandle.invoke(handle, arg0.handle))
    }

    val defaultBlockState: WrapperBlockState
        get() = WrapperBlockState(defaultBlockStateHandle.invoke(handle))

    val builtInRegistryHolder: WrapperReference
        get() = WrapperReference(builtInRegistryHolderHandle.invoke(handle))

    fun getStateForPlacement(arg0: WrapperBlockPlaceContext): WrapperBlockState {
        return WrapperBlockState(getStateForPlacementHandle.invoke(handle, arg0.handle))
    }

    fun isPossibleToRespawnInThis(arg0: WrapperBlockState): Boolean {
        return isPossibleToRespawnInThisHandle.invoke(handle, arg0.handle) as Boolean
    }

    val explosionResistance: Float
        get() = getExplosionResistanceHandle.invoke(handle) as Float

    val timing: Any
        get() = getTimingHandle.invoke(handle) as Any

    fun getExpDrop(arg0: WrapperBlockState, arg1: WrapperServerLevel, arg2: WrapperBlockPos, arg3: WrapperItemStack, arg4: Boolean): Int {
        return getExpDropHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4) as Int
    }

    val asItem: WrapperItem
        get() = WrapperItem(asItemHandle.invoke(handle))

    val destroyable: Boolean
        get() = isDestroyableHandle.invoke(handle) as Boolean

    val descriptionId: String
        get() = getDescriptionIdHandle.invoke(handle) as String

    fun setDefaultBlockState(value: WrapperBlockState) {
        defaultBlockStateSetterHandle.invoke(handle, value.handle)
    }

    fun setTiming(value: Any) {
        timingSetterHandle.invoke(handle, value)
    }

    fun setDescriptionId(value: String) {
        descriptionIdSetterHandle.invoke(handle, value)
    }

    fun setItem(value: WrapperItem) {
        itemSetterHandle.invoke(handle, value.handle)
    }

}
