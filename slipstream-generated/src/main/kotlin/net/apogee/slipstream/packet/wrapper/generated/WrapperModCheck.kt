package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperModCheck(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.util.ModCheck") }
        private val lookup = MethodHandles.lookup()

        val confidenceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "confidence", MethodType.methodType(Class.forName("net.minecraft.util.ModCheck\$Confidence")))
        }
        val descriptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "description", MethodType.methodType(String::class.java))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.util.ModCheck\$Confidence"), String::class.java))
        }
    }

    val confidence: Any
        get() = confidenceHandle.invoke(handle) as Any

    val description: String
        get() = descriptionHandle.invoke(handle) as String

    fun copy(confidence: Any = this.confidence, description: String = this.description): WrapperModCheck {
        return WrapperModCheck(constructorHandle.invoke(confidence, description))
    }

}
