package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundPlayerLookAtPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerLookAtPacket") }
        private val lookup = MethodHandles.lookup()

        val getPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getFromAnchorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFromAnchor", MethodType.methodType(Class.forName("net.minecraft.commands.arguments.EntityAnchorArgument\$Anchor")))
        }
    }

    fun getPosition(arg0: Any): Any {
        return getPositionHandle.invoke(handle, arg0) as Any
    }

    val fromAnchor: Any
        get() = getFromAnchorHandle.invoke(handle) as Any

}

fun Any.isClientboundPlayerLookAtPacket(): Boolean = WrapperClientboundPlayerLookAtPacket.packetClass.isInstance(this)
fun Any.asClientboundPlayerLookAtPacket(): WrapperClientboundPlayerLookAtPacket = WrapperClientboundPlayerLookAtPacket(this)
