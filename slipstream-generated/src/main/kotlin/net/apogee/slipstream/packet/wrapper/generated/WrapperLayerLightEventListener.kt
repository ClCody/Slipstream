package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLayerLightEventListener(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.lighting.LayerLightEventListener") }
        private val lookup = MethodHandles.lookup()

        val getDataLayerDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDataLayerData", MethodType.methodType(Class.forName("net.minecraft.world.level.chunk.DataLayer"), Class.forName("net.minecraft.core.SectionPos")))
        }
        val getLightValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightValue", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    fun getDataLayerData(arg0: WrapperSectionPos): WrapperDataLayer {
        return WrapperDataLayer(getDataLayerDataHandle.invoke(handle, arg0.handle))
    }

    fun getLightValue(arg0: WrapperBlockPos): Int {
        return getLightValueHandle.invoke(handle, arg0.handle) as Int
    }

}
