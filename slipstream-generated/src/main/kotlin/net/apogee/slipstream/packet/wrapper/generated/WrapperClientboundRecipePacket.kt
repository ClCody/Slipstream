package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundRecipePacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundRecipePacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getState", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.ClientboundRecipePacket\$State")))
        }
        val getRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipes", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getHighlightsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHighlights", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getBookSettingsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBookSettings", MethodType.methodType(Class.forName("net.minecraft.stats.RecipeBookSettings")))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val state: Any
        get() = getStateHandle.invoke(handle) as Any

    val recipes: Any
        get() = getRecipesHandle.invoke(handle) as Any

    val highlights: Any
        get() = getHighlightsHandle.invoke(handle) as Any

    val bookSettings: WrapperRecipeBookSettings
        get() = WrapperRecipeBookSettings(getBookSettingsHandle.invoke(handle))

}
