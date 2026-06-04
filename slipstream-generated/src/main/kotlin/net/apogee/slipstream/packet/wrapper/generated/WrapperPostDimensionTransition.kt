package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPostDimensionTransition(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.portal.DimensionTransition\$PostDimensionTransition") }
        private val lookup = MethodHandles.lookup()

        val thenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "then", MethodType.methodType(Class.forName("net.minecraft.world.level.portal.DimensionTransition\$PostDimensionTransition"), Class.forName("net.minecraft.world.level.portal.DimensionTransition\$PostDimensionTransition")))
        }
    }

    fun then(arg0: WrapperPostDimensionTransition): WrapperPostDimensionTransition {
        return WrapperPostDimensionTransition(thenHandle.invoke(handle, arg0.handle))
    }

}
