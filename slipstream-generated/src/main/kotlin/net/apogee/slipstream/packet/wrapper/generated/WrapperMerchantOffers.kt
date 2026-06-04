package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMerchantOffers(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.trading.MerchantOffers") }
        private val lookup = MethodHandles.lookup()

        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.item.trading.MerchantOffers")))
        }
        val getRecipeForHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeFor", MethodType.methodType(Class.forName("net.minecraft.world.item.trading.MerchantOffer"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
    }

    val copy: WrapperMerchantOffers
        get() = WrapperMerchantOffers(copyHandle.invoke(handle))

    fun getRecipeFor(arg0: WrapperItemStack, arg1: WrapperItemStack, arg2: Int): WrapperMerchantOffer {
        return WrapperMerchantOffer(getRecipeForHandle.invoke(handle, arg0.handle, arg1.handle, arg2))
    }

}
