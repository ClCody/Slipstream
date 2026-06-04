package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundSetCommandMinecartPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSetCommandMinecartPacket") }
        private val lookup = MethodHandles.lookup()

        val isTrackOutputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTrackOutput", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCommandBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommandBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.BaseCommandBlock"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getCommandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommand", MethodType.methodType(String::class.java))
        }
    }

    val trackOutput: Boolean
        get() = isTrackOutputHandle.invoke(handle) as Boolean

    fun getCommandBlock(arg0: Any): Any {
        return getCommandBlockHandle.invoke(handle, arg0) as Any
    }

    val command: String
        get() = getCommandHandle.invoke(handle) as String

}

fun Any.isServerboundSetCommandMinecartPacket(): Boolean = WrapperServerboundSetCommandMinecartPacket.packetClass.isInstance(this)
fun Any.asServerboundSetCommandMinecartPacket(): WrapperServerboundSetCommandMinecartPacket = WrapperServerboundSetCommandMinecartPacket(this)
