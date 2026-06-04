package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundTeleportToEntityPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundTeleportToEntityPacket") }
        private val lookup = MethodHandles.lookup()

        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.server.level.ServerLevel")))
        }
    }

    fun getEntity(arg0: Any): Any {
        return getEntityHandle.invoke(handle, arg0) as Any
    }

}

fun Any.isServerboundTeleportToEntityPacket(): Boolean = WrapperServerboundTeleportToEntityPacket.packetClass.isInstance(this)
fun Any.asServerboundTeleportToEntityPacket(): WrapperServerboundTeleportToEntityPacket = WrapperServerboundTeleportToEntityPacket(this)
