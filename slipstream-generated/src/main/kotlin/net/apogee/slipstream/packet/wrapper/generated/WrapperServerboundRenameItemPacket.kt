package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundRenameItemPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundRenameItemPacket") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

}

fun Any.isServerboundRenameItemPacket(): Boolean = WrapperServerboundRenameItemPacket.packetClass.isInstance(this)
fun Any.asServerboundRenameItemPacket(): WrapperServerboundRenameItemPacket = WrapperServerboundRenameItemPacket(this)
