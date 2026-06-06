package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperItemStack(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.ItemStack") }
        private val lookup = MethodHandles.lookup()

        val removeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "remove", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType")))
        }
        val updateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "update", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType"), Class.forName("java.lang.Object"), Class.forName("java.util.function.UnaryOperator")))
        }
        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val splitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "split", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val setHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "set", MethodType.methodType(Class.forName("java.lang.Object"), Class.forName("net.minecraft.core.component.DataComponentType"), Class.forName("java.lang.Object")))
        }
        val getCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val copyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copy", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Boolean::class.javaPrimitiveType!!))
        }
        val useHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "use", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResultHolder"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItem", MethodType.methodType(Class.forName("net.minecraft.world.item.Item")))
        }
        val getMaxStackSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxStackSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getComponentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getComponents", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val getTooltipImageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTooltipImage", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val copyAndClearHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copyAndClear", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getItemHolderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemHolder", MethodType.methodType(Class.forName("net.minecraft.core.Holder")))
        }
        val isBarVisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBarVisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val finishUsingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "finishUsingItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getBarWidthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBarWidth", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBarColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBarColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isDamageableItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDamageableItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val transmuteCopyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "transmuteCopy", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.ItemLike"), Int::class.javaPrimitiveType!!))
        }
        val copyWithCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "copyWithCount", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!))
        }
        val isItemEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isItemEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val getMaxDamageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxDamage", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saveOptionalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveOptional", MethodType.methodType(Class.forName("net.minecraft.nbt.Tag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val getDamageValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDamageValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isStackableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStackable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getUseDurationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUseDuration", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getUseAnimationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUseAnimation", MethodType.methodType(Class.forName("net.minecraft.world.item.UseAnim")))
        }
        val useOnReleaseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "useOnRelease", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val asBukkitMirrorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asBukkitMirror", MethodType.methodType(Class.forName("org.bukkit.inventory.ItemStack")))
        }
        val getTooltipLinesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTooltipLines", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.item.Item\$TooltipContext"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.item.TooltipFlag")))
        }
        val getBreakingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBreakingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getEnchantmentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEnchantments", MethodType.methodType(Class.forName("net.minecraft.world.item.enchantment.ItemEnchantments")))
        }
        val getHoverNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHoverName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val isEnchantableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEnchantable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val consumeAndReturnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "consumeAndReturn", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getDrinkingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDrinkingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getBukkitStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitStack", MethodType.methodType(Class.forName("org.bukkit.inventory.ItemStack")))
        }
        val getEatingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEatingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val isEnchantedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEnchanted", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canBeHurtByHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeHurtBy", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getDescriptionIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDescriptionId", MethodType.methodType(String::class.java))
        }
        val getRarityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRarity", MethodType.methodType(Class.forName("net.minecraft.world.item.Rarity")))
        }
        val hurtEnemyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurtEnemy", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val useOnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "useOn", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.item.context.UseOnContext")))
        }
        val getPopTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPopTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isDamagedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDamaged", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFrameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFrame", MethodType.methodType(Class.forName("net.minecraft.world.entity.decoration.ItemFrame")))
        }
        val hasFoilHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasFoil", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isFramedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFramed", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canBreakBlockInAdventureModeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBreakBlockInAdventureMode", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.pattern.BlockInWorld")))
        }
        val canPlaceOnBlockInAdventureModeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canPlaceOnBlockInAdventureMode", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.pattern.BlockInWorld")))
        }
        val interactLivingEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interactLivingEntity", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val hurtAndConvertOnBreakHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurtAndConvertOnBreak", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ItemLike"), Class.forName("net.minecraft.world.entity.LivingEntity"), Class.forName("net.minecraft.world.entity.EquipmentSlot")))
        }
        val overrideOtherStackedOnMeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overrideOtherStackedOnMe", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.inventory.Slot"), Class.forName("net.minecraft.world.inventory.ClickAction"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.entity.SlotAccess")))
        }
        val isCorrectToolForDropsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCorrectToolForDrops", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val overrideStackedOnOtherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overrideStackedOnOther", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.inventory.Slot"), Class.forName("net.minecraft.world.inventory.ClickAction"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getEntityRepresentationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityRepresentation", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getDestroySpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDestroySpeed", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getComponentsPatchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getComponentsPatch", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentPatch")))
        }
        val getPrototypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPrototype", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val asBukkitCopyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "asBukkitCopy", MethodType.methodType(Class.forName("org.bukkit.inventory.ItemStack")))
        }
        val getTagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTags", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val countSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("count")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val popTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("popTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val itemSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("item")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val componentsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("components")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val entityRepresentationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("entityRepresentation")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bukkitStackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bukkitStack")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun remove(arg0: WrapperDataComponentType): Any {
        return removeHandle.invoke(handle, arg0.handle) as Any
    }

    fun update(arg0: WrapperDataComponentType, arg1: Any, arg2: Any): Any {
        return updateHandle.invoke(handle, arg0.handle, arg1, arg2) as Any
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun split(arg0: Int): WrapperItemStack {
        return WrapperItemStack(splitHandle.invoke(handle, arg0))
    }

    fun set(arg0: WrapperDataComponentType, arg1: Any): Any {
        return setHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    val count: Int
        get() = getCountHandle.invoke(handle) as Int

    fun save(arg0: WrapperProvider): WrapperTag {
        return WrapperTag(saveHandle.invoke(handle, arg0.handle))
    }

    fun copy(arg0: Boolean): WrapperItemStack {
        return WrapperItemStack(copyHandle.invoke(handle, arg0))
    }

    fun use(arg0: WrapperLevel, arg1: WrapperPlayer, arg2: Any): WrapperInteractionResultHolder {
        return WrapperInteractionResultHolder(useHandle.invoke(handle, arg0.handle, arg1.handle, arg2))
    }

    fun `is`(arg0: WrapperHolder): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val item: WrapperItem
        get() = WrapperItem(getItemHandle.invoke(handle))

    val maxStackSize: Int
        get() = getMaxStackSizeHandle.invoke(handle) as Int

    val components: WrapperDataComponentMap
        get() = WrapperDataComponentMap(getComponentsHandle.invoke(handle))

    val tooltipImage: Any
        get() = getTooltipImageHandle.invoke(handle) as Any

    val copyAndClear: WrapperItemStack
        get() = WrapperItemStack(copyAndClearHandle.invoke(handle))

    val itemHolder: WrapperHolder
        get() = WrapperHolder(getItemHolderHandle.invoke(handle))

    val barVisible: Boolean
        get() = isBarVisibleHandle.invoke(handle) as Boolean

    fun finishUsingItem(arg0: WrapperLevel, arg1: WrapperLivingEntity): WrapperItemStack {
        return WrapperItemStack(finishUsingItemHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val barWidth: Int
        get() = getBarWidthHandle.invoke(handle) as Int

    val barColor: Int
        get() = getBarColorHandle.invoke(handle) as Int

    val damageableItem: Boolean
        get() = isDamageableItemHandle.invoke(handle) as Boolean

    fun transmuteCopy(arg0: WrapperItemLike, arg1: Int): WrapperItemStack {
        return WrapperItemStack(transmuteCopyHandle.invoke(handle, arg0.handle, arg1))
    }

    fun copyWithCount(arg0: Int): WrapperItemStack {
        return WrapperItemStack(copyWithCountHandle.invoke(handle, arg0))
    }

    fun isItemEnabled(arg0: WrapperFeatureFlagSet): Boolean {
        return isItemEnabledHandle.invoke(handle, arg0.handle) as Boolean
    }

    val maxDamage: Int
        get() = getMaxDamageHandle.invoke(handle) as Int

    fun saveOptional(arg0: WrapperProvider): WrapperTag {
        return WrapperTag(saveOptionalHandle.invoke(handle, arg0.handle))
    }

    val damageValue: Int
        get() = getDamageValueHandle.invoke(handle) as Int

    val stackable: Boolean
        get() = isStackableHandle.invoke(handle) as Boolean

    fun getUseDuration(arg0: WrapperLivingEntity): Int {
        return getUseDurationHandle.invoke(handle, arg0.handle) as Int
    }

    val useAnimation: Any
        get() = getUseAnimationHandle.invoke(handle) as Any

    val useOnRelease: Boolean
        get() = useOnReleaseHandle.invoke(handle) as Boolean

    val asBukkitMirror: Any
        get() = asBukkitMirrorHandle.invoke(handle) as Any

    fun getTooltipLines(arg0: WrapperTooltipContext, arg1: WrapperPlayer, arg2: WrapperTooltipFlag): Any {
        return getTooltipLinesHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Any
    }

    val breakingSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getBreakingSoundHandle.invoke(handle))

    val enchantments: WrapperItemEnchantments
        get() = WrapperItemEnchantments(getEnchantmentsHandle.invoke(handle))

    val hoverName: WrapperComponent
        get() = WrapperComponent(getHoverNameHandle.invoke(handle))

    val enchantable: Boolean
        get() = isEnchantableHandle.invoke(handle) as Boolean

    fun consumeAndReturn(arg0: Int, arg1: WrapperLivingEntity): WrapperItemStack {
        return WrapperItemStack(consumeAndReturnHandle.invoke(handle, arg0, arg1.handle))
    }

    val drinkingSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getDrinkingSoundHandle.invoke(handle))

    val bukkitStack: Any
        get() = getBukkitStackHandle.invoke(handle) as Any

    val eatingSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getEatingSoundHandle.invoke(handle))

    val enchanted: Boolean
        get() = isEnchantedHandle.invoke(handle) as Boolean

    fun canBeHurtBy(arg0: WrapperDamageSource): Boolean {
        return canBeHurtByHandle.invoke(handle, arg0.handle) as Boolean
    }

    val descriptionId: String
        get() = getDescriptionIdHandle.invoke(handle) as String

    val rarity: Any
        get() = getRarityHandle.invoke(handle) as Any

    fun hurtEnemy(arg0: WrapperLivingEntity, arg1: WrapperPlayer): Boolean {
        return hurtEnemyHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun useOn(arg0: WrapperUseOnContext): Any {
        return useOnHandle.invoke(handle, arg0.handle) as Any
    }

    val popTime: Int
        get() = getPopTimeHandle.invoke(handle) as Int

    val damaged: Boolean
        get() = isDamagedHandle.invoke(handle) as Boolean

    val frame: WrapperItemFrame
        get() = WrapperItemFrame(getFrameHandle.invoke(handle))

    val foil: Boolean
        get() = hasFoilHandle.invoke(handle) as Boolean

    val framed: Boolean
        get() = isFramedHandle.invoke(handle) as Boolean

    fun canBreakBlockInAdventureMode(arg0: WrapperBlockInWorld): Boolean {
        return canBreakBlockInAdventureModeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun canPlaceOnBlockInAdventureMode(arg0: WrapperBlockInWorld): Boolean {
        return canPlaceOnBlockInAdventureModeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun interactLivingEntity(arg0: WrapperPlayer, arg1: WrapperLivingEntity, arg2: Any): Any {
        return interactLivingEntityHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Any
    }

    fun hurtAndConvertOnBreak(arg0: Int, arg1: WrapperItemLike, arg2: WrapperLivingEntity, arg3: Any): WrapperItemStack {
        return WrapperItemStack(hurtAndConvertOnBreakHandle.invoke(handle, arg0, arg1.handle, arg2.handle, arg3))
    }

    fun overrideOtherStackedOnMe(arg0: WrapperItemStack, arg1: WrapperSlot, arg2: Any, arg3: WrapperPlayer, arg4: WrapperSlotAccess): Boolean {
        return overrideOtherStackedOnMeHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3.handle, arg4.handle) as Boolean
    }

    fun isCorrectToolForDrops(arg0: WrapperBlockState): Boolean {
        return isCorrectToolForDropsHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun overrideStackedOnOther(arg0: WrapperSlot, arg1: Any, arg2: WrapperPlayer): Boolean {
        return overrideStackedOnOtherHandle.invoke(handle, arg0.handle, arg1, arg2.handle) as Boolean
    }

    val entityRepresentation: WrapperEntity
        get() = WrapperEntity(getEntityRepresentationHandle.invoke(handle))

    fun getDestroySpeed(arg0: WrapperBlockState): Float {
        return getDestroySpeedHandle.invoke(handle, arg0.handle) as Float
    }

    val componentsPatch: WrapperDataComponentPatch
        get() = WrapperDataComponentPatch(getComponentsPatchHandle.invoke(handle))

    val prototype: WrapperDataComponentMap
        get() = WrapperDataComponentMap(getPrototypeHandle.invoke(handle))

    val asBukkitCopy: Any
        get() = asBukkitCopyHandle.invoke(handle) as Any

    val tags: Any
        get() = getTagsHandle.invoke(handle) as Any

    fun setCount(value: Int) {
        countSetterHandle.invoke(handle, value)
    }

    fun setPopTime(value: Int) {
        popTimeSetterHandle.invoke(handle, value)
    }

    fun setItem(value: WrapperItem) {
        itemSetterHandle.invoke(handle, value.handle)
    }

    fun setComponents(value: Any) {
        componentsSetterHandle.invoke(handle, value)
    }

    fun setEntityRepresentation(value: WrapperEntity) {
        entityRepresentationSetterHandle.invoke(handle, value.handle)
    }

    fun setBukkitStack(value: Any) {
        bukkitStackSetterHandle.invoke(handle, value)
    }

}
