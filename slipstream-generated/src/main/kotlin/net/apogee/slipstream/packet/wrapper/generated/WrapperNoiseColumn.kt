package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperNoiseColumn(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.NoiseColumn") }
        private val lookup = MethodHandles.lookup()

        val getBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState"), Int::class.javaPrimitiveType!!))
        }
    }

    fun getBlock(arg0: Int): WrapperBlockState {
        return WrapperBlockState(getBlockHandle.invoke(handle, arg0))
    }

}
