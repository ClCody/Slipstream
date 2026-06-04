package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSelectAdvancementsTabPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSelectAdvancementsTabPacket") }
        private val lookup = MethodHandles.lookup()

        val getTabHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTab", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val tab: Any
        get() = getTabHandle.invoke(handle) as Any

}

fun Any.isClientboundSelectAdvancementsTabPacket(): Boolean = WrapperClientboundSelectAdvancementsTabPacket.packetClass.isInstance(this)
fun Any.asClientboundSelectAdvancementsTabPacket(): WrapperClientboundSelectAdvancementsTabPacket = WrapperClientboundSelectAdvancementsTabPacket(this)
