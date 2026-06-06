package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperTooltipContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.Item\$TooltipContext") }
        private val lookup = MethodHandles.lookup()

        val registriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registries", MethodType.methodType(Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val mapDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mapData", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.maps.MapItemSavedData"), Class.forName("net.minecraft.world.level.saveddata.maps.MapId")))
        }
        val tickRateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickRate", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
    }

    val registries: WrapperProvider
        get() = WrapperProvider(registriesHandle.invoke(handle))

    fun mapData(arg0: WrapperMapId): WrapperMapItemSavedData {
        return WrapperMapItemSavedData(mapDataHandle.invoke(handle, arg0.handle))
    }

    val tickRate: Float
        get() = tickRateHandle.invoke(handle) as Float

}
