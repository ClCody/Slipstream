package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundSeenAdvancementsPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket") }
        private val lookup = MethodHandles.lookup()

        val getActionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAction", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket\$Action")))
        }
        val getTabHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTab", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
    }

    val action: Any
        get() = getActionHandle.invoke(handle) as Any

    val tab: Any
        get() = getTabHandle.invoke(handle) as Any

}

fun Any.isServerboundSeenAdvancementsPacket(): Boolean = WrapperServerboundSeenAdvancementsPacket.packetClass.isInstance(this)
fun Any.asServerboundSeenAdvancementsPacket(): WrapperServerboundSeenAdvancementsPacket = WrapperServerboundSeenAdvancementsPacket(this)
