package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientInformation(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ClientInformation") }
        private val lookup = MethodHandles.lookup()

        val languageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "language", MethodType.methodType(String::class.java))
        }
        val viewDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "viewDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val chatVisibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chatVisibility", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.ChatVisiblity")))
        }
        val chatColorsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chatColors", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val modelCustomisationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "modelCustomisation", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val mainHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mainHand", MethodType.methodType(Class.forName("net.minecraft.world.entity.HumanoidArm")))
        }
        val textFilteringEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "textFilteringEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val allowsListingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "allowsListing", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.ChatVisiblity"), Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.HumanoidArm"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
    }

    val language: String
        get() = languageHandle.invoke(handle) as String

    val viewDistance: Int
        get() = viewDistanceHandle.invoke(handle) as Int

    val chatVisibility: Any
        get() = chatVisibilityHandle.invoke(handle) as Any

    val chatColors: Boolean
        get() = chatColorsHandle.invoke(handle) as Boolean

    val modelCustomisation: Int
        get() = modelCustomisationHandle.invoke(handle) as Int

    val mainHand: Any
        get() = mainHandHandle.invoke(handle) as Any

    val textFilteringEnabled: Boolean
        get() = textFilteringEnabledHandle.invoke(handle) as Boolean

    val allowsListing: Boolean
        get() = allowsListingHandle.invoke(handle) as Boolean

    fun copy(language: String = this.language, viewDistance: Int = this.viewDistance, chatVisibility: Any = this.chatVisibility, chatColors: Boolean = this.chatColors, modelCustomisation: Int = this.modelCustomisation, mainHand: Any = this.mainHand, textFilteringEnabled: Boolean = this.textFilteringEnabled, allowsListing: Boolean = this.allowsListing): WrapperClientInformation {
        return WrapperClientInformation(constructorHandle.invoke(language, viewDistance, chatVisibility, chatColors, modelCustomisation, mainHand, textFilteringEnabled, allowsListing))
    }

}
