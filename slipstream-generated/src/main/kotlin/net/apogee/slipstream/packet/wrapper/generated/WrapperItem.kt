package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItem(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.Item") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val useHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "use", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResultHolder"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val getTooltipImageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTooltipImage", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val isBarVisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBarVisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val finishUsingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "finishUsingItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getBarWidthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBarWidth", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getBarColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBarColor", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getUseDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUseDuration", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getUseAnimationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUseAnimation", MethodType.methodType(Class.forName("net.minecraft.world.item.UseAnim"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val useOnReleaseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "useOnRelease", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getBreakingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBreakingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val isEnchantableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEnchantable", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getDrinkingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDrinkingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getEatingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEatingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val canAttackBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canAttackBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val isValidRepairItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValidRepairItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getDefaultInstanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultInstance", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getDefaultMaxStackSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultMaxStackSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAttackDamageBonusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttackDamageBonus", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getCraftingRemainingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCraftingRemainingItem", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
        val hasCraftingRemainingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasCraftingRemainingItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEnchantmentValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEnchantmentValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val canFitInsideContainerItemsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canFitInsideContainerItems", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val requiredFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requiredFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val getDescriptionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescriptionId", MethodType.methodType(String::class.java, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getDescriptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescription", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val asItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asItem", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
        val hurtEnemyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurtEnemy", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val useOnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "useOn", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.item.context.UseOnContext")))
        }
        val mineBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mineBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val isFoilHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFoil", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getDefaultAttributeModifiersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultAttributeModifiers", MethodType.methodType(Class.forName("net.minecraft.world.item.component.ItemAttributeModifiers")))
        }
        val interactLivingEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interactLivingEntity", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val overrideOtherStackedOnMeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overrideOtherStackedOnMe", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.inventory.Slot"), Class.forName("net.minecraft.world.inventory.ClickAction"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.entity.SlotAccess")))
        }
        val isCorrectToolForDropsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCorrectToolForDrops", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val overrideStackedOnOtherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overrideStackedOnOther", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.inventory.Slot"), Class.forName("net.minecraft.world.inventory.ClickAction"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getDestroySpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDestroySpeed", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val isComplexHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isComplex", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val componentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "components", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val builtInRegistryHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "builtInRegistryHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder\$Reference")))
        }
        val descriptionIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("descriptionId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun getName(arg0: WrapperItemStack): WrapperComponent {
        return WrapperComponent(getNameHandle.invoke(handle, arg0.handle))
    }

    fun use(arg0: WrapperLevel, arg1: WrapperPlayer, arg2: Any): WrapperInteractionResultHolder {
        return WrapperInteractionResultHolder(useHandle.invoke(handle, arg0.handle, arg1.handle, arg2))
    }

    fun getTooltipImage(arg0: WrapperItemStack): Any {
        return getTooltipImageHandle.invoke(handle, arg0.handle) as Any
    }

    fun isBarVisible(arg0: WrapperItemStack): Boolean {
        return isBarVisibleHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun finishUsingItem(arg0: WrapperItemStack, arg1: WrapperLevel, arg2: WrapperLivingEntity): WrapperItemStack {
        return WrapperItemStack(finishUsingItemHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    fun getBarWidth(arg0: WrapperItemStack): Int {
        return getBarWidthHandle.invoke(handle, arg0.handle) as Int
    }

    fun getBarColor(arg0: WrapperItemStack): Int {
        return getBarColorHandle.invoke(handle, arg0.handle) as Int
    }

    fun getUseDuration(arg0: WrapperItemStack, arg1: WrapperLivingEntity): Int {
        return getUseDurationHandle.invoke(handle, arg0.handle, arg1.handle) as Int
    }

    fun getUseAnimation(arg0: WrapperItemStack): Any {
        return getUseAnimationHandle.invoke(handle, arg0.handle) as Any
    }

    fun useOnRelease(arg0: WrapperItemStack): Boolean {
        return useOnReleaseHandle.invoke(handle, arg0.handle) as Boolean
    }

    val breakingSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getBreakingSoundHandle.invoke(handle))

    fun isEnchantable(arg0: WrapperItemStack): Boolean {
        return isEnchantableHandle.invoke(handle, arg0.handle) as Boolean
    }

    val drinkingSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getDrinkingSoundHandle.invoke(handle))

    val eatingSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getEatingSoundHandle.invoke(handle))

    fun canAttackBlock(arg0: WrapperBlockState, arg1: WrapperLevel, arg2: WrapperBlockPos, arg3: WrapperPlayer): Boolean {
        return canAttackBlockHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle) as Boolean
    }

    fun isValidRepairItem(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return isValidRepairItemHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val defaultInstance: WrapperItemStack
        get() = WrapperItemStack(getDefaultInstanceHandle.invoke(handle))

    val defaultMaxStackSize: Int
        get() = getDefaultMaxStackSizeHandle.invoke(handle) as Int

    fun getAttackDamageBonus(arg0: WrapperEntity, arg1: Float, arg2: WrapperDamageSource): Float {
        return getAttackDamageBonusHandle.invoke(handle, arg0.handle, arg1, arg2.handle) as Float
    }

    val craftingRemainingItem: WrapperItem
        get() = WrapperItem(getCraftingRemainingItemHandle.invoke(handle))

    val hasCraftingRemainingItem: Boolean
        get() = hasCraftingRemainingItemHandle.invoke(handle) as Boolean

    val enchantmentValue: Int
        get() = getEnchantmentValueHandle.invoke(handle) as Int

    val canFitInsideContainerItems: Boolean
        get() = canFitInsideContainerItemsHandle.invoke(handle) as Boolean

    val requiredFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(requiredFeaturesHandle.invoke(handle))

    fun getDescriptionId(arg0: WrapperItemStack): String {
        return getDescriptionIdHandle.invoke(handle, arg0.handle) as String
    }

    val description: WrapperComponent
        get() = WrapperComponent(getDescriptionHandle.invoke(handle))

    val asItem: WrapperItem
        get() = WrapperItem(asItemHandle.invoke(handle))

    fun hurtEnemy(arg0: WrapperItemStack, arg1: WrapperLivingEntity, arg2: WrapperLivingEntity): Boolean {
        return hurtEnemyHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Boolean
    }

    fun useOn(arg0: WrapperUseOnContext): Any {
        return useOnHandle.invoke(handle, arg0.handle) as Any
    }

    fun mineBlock(arg0: WrapperItemStack, arg1: WrapperLevel, arg2: WrapperBlockState, arg3: WrapperBlockPos, arg4: WrapperLivingEntity): Boolean {
        return mineBlockHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle) as Boolean
    }

    fun isFoil(arg0: WrapperItemStack): Boolean {
        return isFoilHandle.invoke(handle, arg0.handle) as Boolean
    }

    val defaultAttributeModifiers: WrapperItemAttributeModifiers
        get() = WrapperItemAttributeModifiers(getDefaultAttributeModifiersHandle.invoke(handle))

    fun interactLivingEntity(arg0: WrapperItemStack, arg1: WrapperPlayer, arg2: WrapperLivingEntity, arg3: Any): Any {
        return interactLivingEntityHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3) as Any
    }

    fun overrideOtherStackedOnMe(arg0: WrapperItemStack, arg1: WrapperItemStack, arg2: WrapperSlot, arg3: Any, arg4: WrapperPlayer, arg5: WrapperSlotAccess): Boolean {
        return overrideOtherStackedOnMeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3, arg4.handle, arg5.handle) as Boolean
    }

    fun isCorrectToolForDrops(arg0: WrapperItemStack, arg1: WrapperBlockState): Boolean {
        return isCorrectToolForDropsHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun overrideStackedOnOther(arg0: WrapperItemStack, arg1: WrapperSlot, arg2: Any, arg3: WrapperPlayer): Boolean {
        return overrideStackedOnOtherHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3.handle) as Boolean
    }

    fun getDestroySpeed(arg0: WrapperItemStack, arg1: WrapperBlockState): Float {
        return getDestroySpeedHandle.invoke(handle, arg0.handle, arg1.handle) as Float
    }

    val complex: Boolean
        get() = isComplexHandle.invoke(handle) as Boolean

    val components: WrapperDataComponentMap
        get() = WrapperDataComponentMap(componentsHandle.invoke(handle))

    val builtInRegistryHolder: WrapperReference
        get() = WrapperReference(builtInRegistryHolderHandle.invoke(handle))

    fun setDescriptionId(value: String) {
        descriptionIdSetterHandle.invoke(handle, value)
    }

}
