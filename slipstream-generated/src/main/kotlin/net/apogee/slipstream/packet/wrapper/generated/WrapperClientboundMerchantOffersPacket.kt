package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperClientboundMerchantOffersPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundMerchantOffersPacket") }
        private val lookup = MethodHandles.lookup()

        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getContainerIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getContainerId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getVillagerLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVillagerLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getVillagerXpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVillagerXp", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val showProgressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "showProgress", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getOffersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOffers", MethodType.methodType(Class.forName("net.minecraft.world.item.trading.MerchantOffers")))
        }
        val canRestockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canRestock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val containerId: Int
        get() = getContainerIdHandle.invoke(handle) as Int

    val villagerLevel: Int
        get() = getVillagerLevelHandle.invoke(handle) as Int

    val villagerXp: Int
        get() = getVillagerXpHandle.invoke(handle) as Int

    val showProgress: Boolean
        get() = showProgressHandle.invoke(handle) as Boolean

    val offers: WrapperMerchantOffers
        get() = WrapperMerchantOffers(getOffersHandle.invoke(handle))

    val canRestock: Boolean
        get() = canRestockHandle.invoke(handle) as Boolean

}
