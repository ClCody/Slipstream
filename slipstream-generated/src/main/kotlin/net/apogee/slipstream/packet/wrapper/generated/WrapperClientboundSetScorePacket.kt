package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundSetScorePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundSetScorePacket") }
        private val lookup = MethodHandles.lookup()

        val ownerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "owner", MethodType.methodType(String::class.java))
        }
        val objectiveNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "objectiveName", MethodType.methodType(String::class.java))
        }
        val scoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "score", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val displayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "display", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val numberFormatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "numberFormat", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, String::class.java, Int::class.javaPrimitiveType!!, Class.forName("java.util.Optional"), Class.forName("java.util.Optional")))
        }
    }

    val owner: String
        get() = ownerHandle.invoke(handle) as String

    val objectiveName: String
        get() = objectiveNameHandle.invoke(handle) as String

    val score: Int
        get() = scoreHandle.invoke(handle) as Int

    val display: Any
        get() = displayHandle.invoke(handle) as Any

    val numberFormat: Any
        get() = numberFormatHandle.invoke(handle) as Any

    fun copy(owner: String = this.owner, objectiveName: String = this.objectiveName, score: Int = this.score, display: Any = this.display, numberFormat: Any = this.numberFormat): WrapperClientboundSetScorePacket {
        return WrapperClientboundSetScorePacket(constructorHandle.invoke(owner, objectiveName, score, display, numberFormat))
    }

}
