package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.gameevent.GameEvent\$Context") }
        private val lookup = MethodHandles.lookup()

        val sourceEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sourceEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val affectedStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "affectedState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
    }

    val sourceEntity: WrapperEntity
        get() = WrapperEntity(sourceEntityHandle.invoke(handle))

    val affectedState: WrapperBlockState
        get() = WrapperBlockState(affectedStateHandle.invoke(handle))

    fun copy(sourceEntity: WrapperEntity = this.sourceEntity, affectedState: WrapperBlockState = this.affectedState): WrapperContext {
        return WrapperContext(constructorHandle.invoke(sourceEntity.handle, affectedState.handle))
    }

}
