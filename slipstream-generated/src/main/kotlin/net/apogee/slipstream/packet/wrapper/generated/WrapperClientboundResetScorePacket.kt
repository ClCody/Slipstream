package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundResetScorePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundResetScorePacket") }
        private val lookup = MethodHandles.lookup()

        val ownerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "owner", MethodType.methodType(String::class.java))
        }
        val objectiveNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "objectiveName", MethodType.methodType(String::class.java))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, String::class.java))
        }
    }

    val owner: String
        get() = ownerHandle.invoke(handle) as String

    val objectiveName: String
        get() = objectiveNameHandle.invoke(handle) as String

    fun copy(owner: String = this.owner, objectiveName: String = this.objectiveName): WrapperClientboundResetScorePacket {
        return WrapperClientboundResetScorePacket(constructorHandle.invoke(owner, objectiveName))
    }

}
