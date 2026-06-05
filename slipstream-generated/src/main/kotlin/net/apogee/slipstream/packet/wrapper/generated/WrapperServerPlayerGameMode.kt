package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerPlayerGameMode(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ServerPlayerGameMode") }
        private val lookup = MethodHandles.lookup()

        val useItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "useItem", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val isSurvivalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSurvival", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGameModeForPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameModeForPlayer", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val changeGameModeForPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "changeGameModeForPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.GameType")))
        }
        val destroyBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "destroyBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getPreviousGameModeForPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPreviousGameModeForPlayer", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val useItemOnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "useItemOn", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.InteractionHand"), Class.forName("net.minecraft.world.phys.BlockHitResult")))
        }
        val isCreativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCreative", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val levelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("level")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val gameModeForPlayerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("gameModeForPlayer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val previousGameModeForPlayerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("previousGameModeForPlayer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isDestroyingBlockSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isDestroyingBlock")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val destroyProgressStartSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("destroyProgressStart")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val destroyPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("destroyPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val gameTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("gameTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasDelayedDestroySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasDelayedDestroy")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val delayedDestroyPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("delayedDestroyPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val delayedTickStartSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("delayedTickStart")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val captureSentBlockEntitiesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("captureSentBlockEntities")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val capturedBlockEntitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("capturedBlockEntity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val interactResultSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("interactResult")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val firedInteractSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("firedInteract")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val interactPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("interactPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val interactHandSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("interactHand")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val interactItemStackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("interactItemStack")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun useItem(arg0: WrapperServerPlayer, arg1: WrapperLevel, arg2: WrapperItemStack, arg3: Any): Any {
        return useItemHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3) as Any
    }

    val survival: Boolean
        get() = isSurvivalHandle.invoke(handle) as Boolean

    val gameModeForPlayer: Any
        get() = getGameModeForPlayerHandle.invoke(handle) as Any

    fun changeGameModeForPlayer(arg0: Any): Boolean {
        return changeGameModeForPlayerHandle.invoke(handle, arg0) as Boolean
    }

    fun destroyBlock(arg0: WrapperBlockPos): Boolean {
        return destroyBlockHandle.invoke(handle, arg0.handle) as Boolean
    }

    val previousGameModeForPlayer: Any
        get() = getPreviousGameModeForPlayerHandle.invoke(handle) as Any

    fun useItemOn(arg0: WrapperServerPlayer, arg1: WrapperLevel, arg2: WrapperItemStack, arg3: Any, arg4: WrapperBlockHitResult): Any {
        return useItemOnHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3, arg4.handle) as Any
    }

    val creative: Boolean
        get() = isCreativeHandle.invoke(handle) as Boolean

    fun setLevel(value: WrapperServerLevel) {
        levelSetterHandle.invoke(handle, value.handle)
    }

    fun setGameModeForPlayer(value: Any) {
        gameModeForPlayerSetterHandle.invoke(handle, value)
    }

    fun setPreviousGameModeForPlayer(value: Any) {
        previousGameModeForPlayerSetterHandle.invoke(handle, value)
    }

    fun setIsDestroyingBlock(value: Boolean) {
        isDestroyingBlockSetterHandle.invoke(handle, value)
    }

    fun setDestroyProgressStart(value: Int) {
        destroyProgressStartSetterHandle.invoke(handle, value)
    }

    fun setDestroyPos(value: WrapperBlockPos) {
        destroyPosSetterHandle.invoke(handle, value.handle)
    }

    fun setGameTicks(value: Int) {
        gameTicksSetterHandle.invoke(handle, value)
    }

    fun setHasDelayedDestroy(value: Boolean) {
        hasDelayedDestroySetterHandle.invoke(handle, value)
    }

    fun setDelayedDestroyPos(value: WrapperBlockPos) {
        delayedDestroyPosSetterHandle.invoke(handle, value.handle)
    }

    fun setDelayedTickStart(value: Int) {
        delayedTickStartSetterHandle.invoke(handle, value)
    }

    fun setLastSentState(value: Int) {
        lastSentStateSetterHandle.invoke(handle, value)
    }

    fun setCaptureSentBlockEntities(value: Boolean) {
        captureSentBlockEntitiesSetterHandle.invoke(handle, value)
    }

    fun setCapturedBlockEntity(value: Boolean) {
        capturedBlockEntitySetterHandle.invoke(handle, value)
    }

    fun setInteractResult(value: Boolean) {
        interactResultSetterHandle.invoke(handle, value)
    }

    fun setFiredInteract(value: Boolean) {
        firedInteractSetterHandle.invoke(handle, value)
    }

    fun setInteractPosition(value: WrapperBlockPos) {
        interactPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setInteractHand(value: Any) {
        interactHandSetterHandle.invoke(handle, value)
    }

    fun setInteractItemStack(value: WrapperItemStack) {
        interactItemStackSetterHandle.invoke(handle, value.handle)
    }

}
