package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundMerchantOffersPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundMerchantOffersPacket") }
        private val lookup = MethodHandles.lookup()

        val getOffersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOffers", MethodType.methodType(Class.forName("net.minecraft.world.item.trading.MerchantOffers")))
        }
        val getVillagerLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVillagerLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getVillagerXpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVillagerXp", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val offers: Any
        get() = getOffersHandle.invoke(handle) as Any

    val villagerLevel: Int
        get() = getVillagerLevelHandle.invoke(handle) as Int

    val villagerXp: Int
        get() = getVillagerXpHandle.invoke(handle) as Int

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

}

fun Any.isClientboundMerchantOffersPacket(): Boolean = WrapperClientboundMerchantOffersPacket.packetClass.isInstance(this)
fun Any.asClientboundMerchantOffersPacket(): WrapperClientboundMerchantOffersPacket = WrapperClientboundMerchantOffersPacket(this)
