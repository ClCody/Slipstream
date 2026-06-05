package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockInWorld(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.state.pattern.BlockInWorld") }
        private val lookup = MethodHandles.lookup()

        val getStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.world.level.LevelReader")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntity")))
        }
        val stateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("state")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val entitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("entity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cachedEntitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cachedEntity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val state: WrapperBlockState
        get() = WrapperBlockState(getStateHandle.invoke(handle))

    val level: WrapperLevelReader
        get() = WrapperLevelReader(getLevelHandle.invoke(handle))

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(getPosHandle.invoke(handle))

    val entity: WrapperBlockEntity
        get() = WrapperBlockEntity(getEntityHandle.invoke(handle))

    fun setState(value: WrapperBlockState) {
        stateSetterHandle.invoke(handle, value.handle)
    }

    fun setEntity(value: WrapperBlockEntity) {
        entitySetterHandle.invoke(handle, value.handle)
    }

    fun setCachedEntity(value: Boolean) {
        cachedEntitySetterHandle.invoke(handle, value)
    }

}
