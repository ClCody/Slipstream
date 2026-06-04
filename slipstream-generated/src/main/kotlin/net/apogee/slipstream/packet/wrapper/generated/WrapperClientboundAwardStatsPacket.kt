package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundAwardStatsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundAwardStatsPacket") }
        private val lookup = MethodHandles.lookup()

        val statsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stats", MethodType.methodType(Class.forName("it.unimi.dsi.fastutil.objects.Object2IntMap")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("it.unimi.dsi.fastutil.objects.Object2IntMap")))
        }
    }

    val stats: Any
        get() = statsHandle.invoke(handle) as Any

    fun copy(stats: Any = this.stats): WrapperClientboundAwardStatsPacket {
        return WrapperClientboundAwardStatsPacket(constructorHandle.invoke(stats))
    }

}
