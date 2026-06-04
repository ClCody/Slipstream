package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperAttributeModifier(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.ai.attributes.AttributeModifier") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val amountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "amount", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val operationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "operation", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.attributes.AttributeModifier\$Operation")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.resources.ResourceLocation"), Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.ai.attributes.AttributeModifier\$Operation")))
        }
    }

    val id: WrapperResourceLocation
        get() = WrapperResourceLocation(idHandle.invoke(handle))

    val amount: Double
        get() = amountHandle.invoke(handle) as Double

    val operation: Any
        get() = operationHandle.invoke(handle) as Any

    fun copy(id: WrapperResourceLocation = this.id, amount: Double = this.amount, operation: Any = this.operation): WrapperAttributeModifier {
        return WrapperAttributeModifier(constructorHandle.invoke(id.handle, amount, operation))
    }

}
