package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMerchantOffer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.trading.MerchantOffer") }
        private val lookup = MethodHandles.lookup()

        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.item.trading.MerchantOffer")))
        }
        val takeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "take", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResult", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val satisfiedByHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "satisfiedBy", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val asBukkitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asBukkit", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.inventory.CraftMerchantRecipe")))
        }
        val getSpecialPriceDiffHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpecialPriceDiff", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val assembleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "assemble", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val needsRestockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "needsRestock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getItemCostBHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemCostB", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val shouldRewardExpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRewardExp", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isOutOfStockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOutOfStock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBaseCostAHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBaseCostA", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getPriceMultiplierHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPriceMultiplier", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getItemCostAHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemCostA", MethodType.methodType(Class.forName("net.minecraft.world.item.trading.ItemCost")))
        }
        val getCostBHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCostB", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getUsesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUses", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDemandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDemand", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getXpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXp", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCostAHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCostA", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getMaxUsesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxUses", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val baseCostASetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("baseCostA")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val costBSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("costB")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val usesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("uses")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxUsesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxUses")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val rewardExpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("rewardExp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val specialPriceDiffSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("specialPriceDiff")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val demandSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("demand")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val priceMultiplierSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("priceMultiplier")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ignoreDiscountsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ignoreDiscounts")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bukkitHandleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bukkitHandle")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val copy: WrapperMerchantOffer
        get() = WrapperMerchantOffer(copyHandle.invoke(handle))

    fun take(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return takeHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val result: WrapperItemStack
        get() = WrapperItemStack(getResultHandle.invoke(handle))

    fun satisfiedBy(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return satisfiedByHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val asBukkit: Any
        get() = asBukkitHandle.invoke(handle) as Any

    val specialPriceDiff: Int
        get() = getSpecialPriceDiffHandle.invoke(handle) as Int

    val assemble: WrapperItemStack
        get() = WrapperItemStack(assembleHandle.invoke(handle))

    val needsRestock: Boolean
        get() = needsRestockHandle.invoke(handle) as Boolean

    val itemCostB: Any
        get() = getItemCostBHandle.invoke(handle) as Any

    val shouldRewardExp: Boolean
        get() = shouldRewardExpHandle.invoke(handle) as Boolean

    val outOfStock: Boolean
        get() = isOutOfStockHandle.invoke(handle) as Boolean

    val baseCostA: WrapperItemStack
        get() = WrapperItemStack(getBaseCostAHandle.invoke(handle))

    val priceMultiplier: Float
        get() = getPriceMultiplierHandle.invoke(handle) as Float

    val itemCostA: WrapperItemCost
        get() = WrapperItemCost(getItemCostAHandle.invoke(handle))

    val costB: WrapperItemStack
        get() = WrapperItemStack(getCostBHandle.invoke(handle))

    val uses: Int
        get() = getUsesHandle.invoke(handle) as Int

    val demand: Int
        get() = getDemandHandle.invoke(handle) as Int

    val xp: Int
        get() = getXpHandle.invoke(handle) as Int

    val costA: WrapperItemStack
        get() = WrapperItemStack(getCostAHandle.invoke(handle))

    val maxUses: Int
        get() = getMaxUsesHandle.invoke(handle) as Int

    fun setBaseCostA(value: WrapperItemCost) {
        baseCostASetterHandle.invoke(handle, value.handle)
    }

    fun setCostB(value: Any) {
        costBSetterHandle.invoke(handle, value)
    }

    fun setUses(value: Int) {
        usesSetterHandle.invoke(handle, value)
    }

    fun setMaxUses(value: Int) {
        maxUsesSetterHandle.invoke(handle, value)
    }

    fun setRewardExp(value: Boolean) {
        rewardExpSetterHandle.invoke(handle, value)
    }

    fun setSpecialPriceDiff(value: Int) {
        specialPriceDiffSetterHandle.invoke(handle, value)
    }

    fun setDemand(value: Int) {
        demandSetterHandle.invoke(handle, value)
    }

    fun setPriceMultiplier(value: Float) {
        priceMultiplierSetterHandle.invoke(handle, value)
    }

    fun setXp(value: Int) {
        xpSetterHandle.invoke(handle, value)
    }

    fun setIgnoreDiscounts(value: Boolean) {
        ignoreDiscountsSetterHandle.invoke(handle, value)
    }

    fun setBukkitHandle(value: Any) {
        bukkitHandleSetterHandle.invoke(handle, value)
    }

}
