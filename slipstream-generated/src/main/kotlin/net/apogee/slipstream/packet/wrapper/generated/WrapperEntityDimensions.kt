package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntityDimensions(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.EntityDimensions") }
        private val lookup = MethodHandles.lookup()

        val widthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "width", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val heightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "height", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val eyeHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "eyeHeight", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val attachmentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "attachments", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityAttachments")))
        }
        val fixedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fixed", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.EntityAttachments"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val width: Float
        get() = widthHandle.invoke(handle) as Float

    val height: Float
        get() = heightHandle.invoke(handle) as Float

    val eyeHeight: Float
        get() = eyeHeightHandle.invoke(handle) as Float

    val attachments: WrapperEntityAttachments
        get() = WrapperEntityAttachments(attachmentsHandle.invoke(handle))

    val fixed: Boolean
        get() = fixedHandle.invoke(handle) as Boolean

    fun copy(width: Float = this.width, height: Float = this.height, eyeHeight: Float = this.eyeHeight, attachments: WrapperEntityAttachments = this.attachments, fixed: Boolean = this.fixed): WrapperEntityDimensions {
        return WrapperEntityDimensions(constructorHandle.invoke(width, height, eyeHeight, attachments.handle, fixed))
    }

}
