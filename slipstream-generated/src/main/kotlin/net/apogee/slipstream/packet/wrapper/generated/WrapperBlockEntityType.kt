package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockEntityType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.block.entity.BlockEntityType") }
        private val lookup = MethodHandles.lookup()

        val createHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "create", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntity"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val isValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getBlockEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockEntity", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntity"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val builtInRegistryHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "builtInRegistryHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference")))
        }
    }

    fun create(arg0: WrapperBlockPos, arg1: WrapperBlockState): WrapperBlockEntity {
        return WrapperBlockEntity(createHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun isValid(arg0: WrapperBlockState): Boolean {
        return isValidHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getBlockEntity(arg0: WrapperBlockGetter, arg1: WrapperBlockPos): WrapperBlockEntity {
        return WrapperBlockEntity(getBlockEntityHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val builtInRegistryHolder: WrapperReference
        get() = WrapperReference(builtInRegistryHolderHandle.invoke(handle))

}
