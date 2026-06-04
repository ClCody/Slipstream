package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundSetDisplayObjectivePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetDisplayObjectivePacket") }
        private val lookup = MethodHandles.lookup()

        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.scores.DisplaySlot")))
        }
        val getObjectiveNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObjectiveName", MethodType.methodType(String::class.java))
        }
    }

    val slot: Any
        get() = getSlotHandle.invoke(handle) as Any

    val objectiveName: String
        get() = getObjectiveNameHandle.invoke(handle) as String

}

fun Any.isClientboundSetDisplayObjectivePacket(): Boolean = WrapperClientboundSetDisplayObjectivePacket.packetClass.isInstance(this)
fun Any.asClientboundSetDisplayObjectivePacket(): WrapperClientboundSetDisplayObjectivePacket = WrapperClientboundSetDisplayObjectivePacket(this)
