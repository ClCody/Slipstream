package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMenuType(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.inventory.MenuType") }
        private val lookup = MethodHandles.lookup()

        val createHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "create", MethodType.methodType(Class.forName("net.minecraft.world.inventory.AbstractContainerMenu"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Inventory")))
        }
        val requiredFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requiredFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
    }

    fun create(arg0: Int, arg1: WrapperInventory): WrapperAbstractContainerMenu {
        return WrapperAbstractContainerMenu(createHandle.invoke(handle, arg0, arg1.handle))
    }

    val requiredFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(requiredFeaturesHandle.invoke(handle))

}
