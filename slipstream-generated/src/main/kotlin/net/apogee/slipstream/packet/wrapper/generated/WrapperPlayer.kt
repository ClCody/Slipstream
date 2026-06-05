package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlayer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.player.Player") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.entity.SlotAccess"), Int::class.javaPrimitiveType!!))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getScoreboardNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboardName", MethodType.methodType(String::class.java))
        }
        val getFireImmuneTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFireImmuneTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isSpectatorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSpectator", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.world.scores.Scoreboard")))
        }
        val getGameProfileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameProfile", MethodType.methodType(Class.forName("com.mojang.authlib.GameProfile")))
        }
        val isSwimmingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSwimming", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val getMainArmHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMainArm", MethodType.methodType(Class.forName("net.minecraft.world.entity.HumanoidArm")))
        }
        val canSprintHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSprint", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val openMenuHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "openMenu", MethodType.methodType(Class.forName("java.util.OptionalInt"), Class.forName("net.minecraft.world.MenuProvider")))
        }
        val addItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getScoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScore", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val canUseSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canUseSlot", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.EquipmentSlot")))
        }
        val interactOnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interactOn", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val isHurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getLuckHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLuck", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isScopingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isScoping", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val awardRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "awardRecipes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection")))
        }
        val resetRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "resetRecipes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection")))
        }
        val getSoundSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSoundSource", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundSource")))
        }
        val isInvulnerableToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerableTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val isPushedByFluidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPushedByFluid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val killedEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "killedEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val isAlwaysTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlwaysTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWeaponItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWeaponItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val shouldShowNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldShowName", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isLocalPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLocalPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldBeSavedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldBeSaved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEnchantmentSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEnchantmentSeed", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getInventoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInventory", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.Inventory")))
        }
        val getDeathSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeathSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val canHarmPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canHarmPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val startSleepInBedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "startSleepInBed", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Either"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val canBeHitByProjectileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeHitByProjectile", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRopeHoldPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRopeHoldPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val releaseRightShoulderEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "releaseRightShoulderEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getShoulderEntityLeftHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShoulderEntityLeft", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val releaseLeftShoulderEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "releaseLeftShoulderEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getShoulderEntityRightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShoulderEntityRight", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getLastDeathLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastDeathLocation", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getAbsorptionAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAbsorptionAmount", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getXpNeededForNextLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXpNeededForNextLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getWardenSpawnTrackerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWardenSpawnTracker", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val isTextFilteringEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTextFilteringEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val blockActionRestrictedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockActionRestricted", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.GameType")))
        }
        val tryToStartFallFlyingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tryToStartFallFlying", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canUseGameMasterBlocksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canUseGameMasterBlocks", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isSecondaryUseActiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSecondaryUseActive", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDefaultDimensionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultDimensions", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityDimensions"), Class.forName("net.minecraft.world.entity.Pose")))
        }
        val getEnderChestInventoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEnderChestInventory", MethodType.methodType(Class.forName("net.minecraft.world.inventory.PlayerEnderChestContainer")))
        }
        val setEntityOnShoulderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setEntityOnShoulder", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val entityInteractionRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "entityInteractionRange", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val canInteractWithBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canInteractWithBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Double::class.javaPrimitiveType!!))
        }
        val canInteractWithEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canInteractWithEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Double::class.javaPrimitiveType!!))
        }
        val isSleepingLongEnoughHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSleepingLongEnough", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAttackStrengthScaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttackStrengthScale", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val hasCorrectToolForDropsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasCorrectToolForDrops", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val hasInfiniteMaterialsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasInfiniteMaterials", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val blockInteractionRangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockInteractionRange", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getDimensionChangingDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDimensionChangingDelay", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getBukkitEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitEntity", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.entity.CraftHumanEntity")))
        }
        val causeFallDamageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "causeFallDamage", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getAbilitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAbilities", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.Abilities")))
        }
        val getDestroySpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDestroySpeed", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getCurrentItemAttackStrengthDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCurrentItemAttackStrengthDelay", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isIgnoringFallDamageFromCurrentImpulseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isIgnoringFallDamageFromCurrentImpulse", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val dropHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "drop", MethodType.methodType(Class.forName("net.minecraft.world.entity.item.ItemEntity"), Class.forName("net.minecraft.world.item.ItemStack"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val getHurtDirHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHurtDir", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canEatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canEat", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val eatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "eat", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.food.FoodProperties")))
        }
        val mayBuildHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayBuild", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isCreativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCreative", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getItemBySlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemBySlot", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.EquipmentSlot")))
        }
        val canBeSeenAsEnemyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeSeenAsEnemy", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val mayUseItemAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayUseItemAt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Direction"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getProjectileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProjectile", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getSleepTimerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSleepTimer", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hasContainerOpenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasContainerOpen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFoodDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFoodData", MethodType.methodType(Class.forName("net.minecraft.world.food.FoodData")))
        }
        val isAffectedByFluidsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAffectedByFluids", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCooldownsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCooldowns", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemCooldowns")))
        }
        val getFallSoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFallSounds", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity\$Fallsounds")))
        }
        val isModelPartShownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isModelPartShown", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.PlayerModelPart")))
        }
        val getDismountPosesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDismountPoses", MethodType.methodType(Class.forName("com.google.common.collect.ImmutableList")))
        }
        val getHandSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHandSlots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getArmorSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmorSlots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val isReducedDebugInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReducedDebugInfo", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canTakeItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canTakeItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val timeEntitySatOnShoulderSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("timeEntitySatOnShoulder")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val enderChestInventorySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("enderChestInventory")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val containerMenuSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("containerMenu")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val foodDataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("foodData")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val jumpTriggerTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("jumpTriggerTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val oBobSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("oBob")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bobSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bob")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val takeXpDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("takeXpDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xCloakOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xCloakO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yCloakOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yCloakO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val zCloakOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("zCloakO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xCloakSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xCloak")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yCloakSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yCloak")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val zCloakSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("zCloak")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sleepCounterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sleepCounter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasUnderwaterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasUnderwater")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val experienceLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("experienceLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val totalExperienceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("totalExperience")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val experienceProgressSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("experienceProgress")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val enchantmentSeedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("enchantmentSeed")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastLevelUpTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastLevelUpTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val gameProfileSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("gameProfile")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val reducedDebugInfoSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("reducedDebugInfo")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastItemInMainHandSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastItemInMainHand")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastDeathLocationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastDeathLocation")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fishingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fishing")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hurtDirSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hurtDir")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val currentImpulseImpactPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("currentImpulseImpactPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val currentExplosionCauseSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("currentExplosionCause")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ignoreFallDamageFromCurrentImpulseSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ignoreFallDamageFromCurrentImpulse")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val currentImpulseContextResetGraceTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("currentImpulseContextResetGraceTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val affectsSpawningSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("affectsSpawning")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val flyingFallDamageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("flyingFallDamage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fauxSleepingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fauxSleeping")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val oldLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("oldLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: WrapperComponent
        get() = WrapperComponent(getNameHandle.invoke(handle))

    fun getSlot(arg0: Int): WrapperSlotAccess {
        return WrapperSlotAccess(getSlotHandle.invoke(handle, arg0))
    }

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val scoreboardName: String
        get() = getScoreboardNameHandle.invoke(handle) as String

    val fireImmuneTicks: Int
        get() = getFireImmuneTicksHandle.invoke(handle) as Int

    val spectator: Boolean
        get() = isSpectatorHandle.invoke(handle) as Boolean

    val scoreboard: WrapperScoreboard
        get() = WrapperScoreboard(getScoreboardHandle.invoke(handle))

    val gameProfile: Any
        get() = getGameProfileHandle.invoke(handle) as Any

    val swimming: Boolean
        get() = isSwimmingHandle.invoke(handle) as Boolean

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val mainArm: Any
        get() = getMainArmHandle.invoke(handle) as Any

    val canSprint: Boolean
        get() = canSprintHandle.invoke(handle) as Boolean

    fun openMenu(arg0: WrapperMenuProvider): Any {
        return openMenuHandle.invoke(handle, arg0.handle) as Any
    }

    fun addItem(arg0: WrapperItemStack): Boolean {
        return addItemHandle.invoke(handle, arg0.handle) as Boolean
    }

    val score: Int
        get() = getScoreHandle.invoke(handle) as Int

    fun canUseSlot(arg0: Any): Boolean {
        return canUseSlotHandle.invoke(handle, arg0) as Boolean
    }

    fun interactOn(arg0: WrapperEntity, arg1: Any): Any {
        return interactOnHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    val hurt: Boolean
        get() = isHurtHandle.invoke(handle) as Boolean

    val speed: Float
        get() = getSpeedHandle.invoke(handle) as Float

    val luck: Float
        get() = getLuckHandle.invoke(handle) as Float

    val scoping: Boolean
        get() = isScopingHandle.invoke(handle) as Boolean

    fun awardRecipes(arg0: Any): Int {
        return awardRecipesHandle.invoke(handle, arg0) as Int
    }

    fun resetRecipes(arg0: Any): Int {
        return resetRecipesHandle.invoke(handle, arg0) as Int
    }

    val soundSource: Any
        get() = getSoundSourceHandle.invoke(handle) as Any

    fun isInvulnerableTo(arg0: WrapperDamageSource): Boolean {
        return isInvulnerableToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val pushedByFluid: Boolean
        get() = isPushedByFluidHandle.invoke(handle) as Boolean

    fun killedEntity(arg0: WrapperServerLevel, arg1: WrapperLivingEntity): Boolean {
        return killedEntityHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val alwaysTicking: Boolean
        get() = isAlwaysTickingHandle.invoke(handle) as Boolean

    val weaponItem: WrapperItemStack
        get() = WrapperItemStack(getWeaponItemHandle.invoke(handle))

    val shouldShowName: Boolean
        get() = shouldShowNameHandle.invoke(handle) as Boolean

    val localPlayer: Boolean
        get() = isLocalPlayerHandle.invoke(handle) as Boolean

    val shouldBeSaved: Boolean
        get() = shouldBeSavedHandle.invoke(handle) as Boolean

    val enchantmentSeed: Int
        get() = getEnchantmentSeedHandle.invoke(handle) as Int

    val inventory: WrapperInventory
        get() = WrapperInventory(getInventoryHandle.invoke(handle))

    val deathSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getDeathSoundHandle.invoke(handle))

    fun canHarmPlayer(arg0: WrapperPlayer): Boolean {
        return canHarmPlayerHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun startSleepInBed(arg0: WrapperBlockPos): Any {
        return startSleepInBedHandle.invoke(handle, arg0.handle) as Any
    }

    val canBeHitByProjectile: Boolean
        get() = canBeHitByProjectileHandle.invoke(handle) as Boolean

    fun getRopeHoldPosition(arg0: Float): WrapperVec3 {
        return WrapperVec3(getRopeHoldPositionHandle.invoke(handle, arg0))
    }

    val releaseRightShoulderEntity: WrapperEntity
        get() = WrapperEntity(releaseRightShoulderEntityHandle.invoke(handle))

    val shoulderEntityLeft: WrapperCompoundTag
        get() = WrapperCompoundTag(getShoulderEntityLeftHandle.invoke(handle))

    val releaseLeftShoulderEntity: WrapperEntity
        get() = WrapperEntity(releaseLeftShoulderEntityHandle.invoke(handle))

    val shoulderEntityRight: WrapperCompoundTag
        get() = WrapperCompoundTag(getShoulderEntityRightHandle.invoke(handle))

    val lastDeathLocation: Any
        get() = getLastDeathLocationHandle.invoke(handle) as Any

    val absorptionAmount: Float
        get() = getAbsorptionAmountHandle.invoke(handle) as Float

    val xpNeededForNextLevel: Int
        get() = getXpNeededForNextLevelHandle.invoke(handle) as Int

    val wardenSpawnTracker: Any
        get() = getWardenSpawnTrackerHandle.invoke(handle) as Any

    val textFilteringEnabled: Boolean
        get() = isTextFilteringEnabledHandle.invoke(handle) as Boolean

    fun blockActionRestricted(arg0: WrapperLevel, arg1: WrapperBlockPos, arg2: Any): Boolean {
        return blockActionRestrictedHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Boolean
    }

    val tryToStartFallFlying: Boolean
        get() = tryToStartFallFlyingHandle.invoke(handle) as Boolean

    val canUseGameMasterBlocks: Boolean
        get() = canUseGameMasterBlocksHandle.invoke(handle) as Boolean

    val secondaryUseActive: Boolean
        get() = isSecondaryUseActiveHandle.invoke(handle) as Boolean

    fun getDefaultDimensions(arg0: Any): WrapperEntityDimensions {
        return WrapperEntityDimensions(getDefaultDimensionsHandle.invoke(handle, arg0))
    }

    val enderChestInventory: WrapperPlayerEnderChestContainer
        get() = WrapperPlayerEnderChestContainer(getEnderChestInventoryHandle.invoke(handle))

    fun setEntityOnShoulder(arg0: WrapperCompoundTag): Boolean {
        return setEntityOnShoulderHandle.invoke(handle, arg0.handle) as Boolean
    }

    val entityInteractionRange: Double
        get() = entityInteractionRangeHandle.invoke(handle) as Double

    fun canInteractWithBlock(arg0: WrapperBlockPos, arg1: Double): Boolean {
        return canInteractWithBlockHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun canInteractWithEntity(arg0: WrapperEntity, arg1: Double): Boolean {
        return canInteractWithEntityHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val sleepingLongEnough: Boolean
        get() = isSleepingLongEnoughHandle.invoke(handle) as Boolean

    fun getAttackStrengthScale(arg0: Float): Float {
        return getAttackStrengthScaleHandle.invoke(handle, arg0) as Float
    }

    fun hasCorrectToolForDrops(arg0: WrapperBlockState): Boolean {
        return hasCorrectToolForDropsHandle.invoke(handle, arg0.handle) as Boolean
    }

    val infiniteMaterials: Boolean
        get() = hasInfiniteMaterialsHandle.invoke(handle) as Boolean

    val blockInteractionRange: Double
        get() = blockInteractionRangeHandle.invoke(handle) as Double

    val dimensionChangingDelay: Int
        get() = getDimensionChangingDelayHandle.invoke(handle) as Int

    val bukkitEntity: Any
        get() = getBukkitEntityHandle.invoke(handle) as Any

    fun causeFallDamage(arg0: Float, arg1: Float, arg2: WrapperDamageSource): Boolean {
        return causeFallDamageHandle.invoke(handle, arg0, arg1, arg2.handle) as Boolean
    }

    val abilities: WrapperAbilities
        get() = WrapperAbilities(getAbilitiesHandle.invoke(handle))

    fun getDestroySpeed(arg0: WrapperBlockState): Float {
        return getDestroySpeedHandle.invoke(handle, arg0.handle) as Float
    }

    val currentItemAttackStrengthDelay: Float
        get() = getCurrentItemAttackStrengthDelayHandle.invoke(handle) as Float

    val ignoringFallDamageFromCurrentImpulse: Boolean
        get() = isIgnoringFallDamageFromCurrentImpulseHandle.invoke(handle) as Boolean

    fun drop(arg0: WrapperItemStack, arg1: Boolean, arg2: Boolean): WrapperItemEntity {
        return WrapperItemEntity(dropHandle.invoke(handle, arg0.handle, arg1, arg2))
    }

    val hurtDir: Float
        get() = getHurtDirHandle.invoke(handle) as Float

    fun canEat(arg0: Boolean): Boolean {
        return canEatHandle.invoke(handle, arg0) as Boolean
    }

    fun eat(arg0: WrapperLevel, arg1: WrapperItemStack, arg2: WrapperFoodProperties): WrapperItemStack {
        return WrapperItemStack(eatHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    val mayBuild: Boolean
        get() = mayBuildHandle.invoke(handle) as Boolean

    val creative: Boolean
        get() = isCreativeHandle.invoke(handle) as Boolean

    fun getItemBySlot(arg0: Any): WrapperItemStack {
        return WrapperItemStack(getItemBySlotHandle.invoke(handle, arg0))
    }

    val canBeSeenAsEnemy: Boolean
        get() = canBeSeenAsEnemyHandle.invoke(handle) as Boolean

    fun mayUseItemAt(arg0: WrapperBlockPos, arg1: Any, arg2: WrapperItemStack): Boolean {
        return mayUseItemAtHandle.invoke(handle, arg0.handle, arg1, arg2.handle) as Boolean
    }

    fun getProjectile(arg0: WrapperItemStack): WrapperItemStack {
        return WrapperItemStack(getProjectileHandle.invoke(handle, arg0.handle))
    }

    val sleepTimer: Int
        get() = getSleepTimerHandle.invoke(handle) as Int

    val containerOpen: Boolean
        get() = hasContainerOpenHandle.invoke(handle) as Boolean

    val foodData: WrapperFoodData
        get() = WrapperFoodData(getFoodDataHandle.invoke(handle))

    val affectedByFluids: Boolean
        get() = isAffectedByFluidsHandle.invoke(handle) as Boolean

    val cooldowns: WrapperItemCooldowns
        get() = WrapperItemCooldowns(getCooldownsHandle.invoke(handle))

    val fallSounds: WrapperFallsounds
        get() = WrapperFallsounds(getFallSoundsHandle.invoke(handle))

    fun isModelPartShown(arg0: Any): Boolean {
        return isModelPartShownHandle.invoke(handle, arg0) as Boolean
    }

    val dismountPoses: Any
        get() = getDismountPosesHandle.invoke(handle) as Any

    val handSlots: Any
        get() = getHandSlotsHandle.invoke(handle) as Any

    val armorSlots: Any
        get() = getArmorSlotsHandle.invoke(handle) as Any

    val reducedDebugInfo: Boolean
        get() = isReducedDebugInfoHandle.invoke(handle) as Boolean

    fun canTakeItem(arg0: WrapperItemStack): Boolean {
        return canTakeItemHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun setTimeEntitySatOnShoulder(value: Long) {
        timeEntitySatOnShoulderSetterHandle.invoke(handle, value)
    }

    fun setEnderChestInventory(value: WrapperPlayerEnderChestContainer) {
        enderChestInventorySetterHandle.invoke(handle, value.handle)
    }

    fun setContainerMenu(value: WrapperAbstractContainerMenu) {
        containerMenuSetterHandle.invoke(handle, value.handle)
    }

    fun setFoodData(value: WrapperFoodData) {
        foodDataSetterHandle.invoke(handle, value.handle)
    }

    fun setJumpTriggerTime(value: Int) {
        jumpTriggerTimeSetterHandle.invoke(handle, value)
    }

    fun setOBob(value: Float) {
        oBobSetterHandle.invoke(handle, value)
    }

    fun setBob(value: Float) {
        bobSetterHandle.invoke(handle, value)
    }

    fun setTakeXpDelay(value: Int) {
        takeXpDelaySetterHandle.invoke(handle, value)
    }

    fun setXCloakO(value: Double) {
        xCloakOSetterHandle.invoke(handle, value)
    }

    fun setYCloakO(value: Double) {
        yCloakOSetterHandle.invoke(handle, value)
    }

    fun setZCloakO(value: Double) {
        zCloakOSetterHandle.invoke(handle, value)
    }

    fun setXCloak(value: Double) {
        xCloakSetterHandle.invoke(handle, value)
    }

    fun setYCloak(value: Double) {
        yCloakSetterHandle.invoke(handle, value)
    }

    fun setZCloak(value: Double) {
        zCloakSetterHandle.invoke(handle, value)
    }

    fun setSleepCounter(value: Int) {
        sleepCounterSetterHandle.invoke(handle, value)
    }

    fun setWasUnderwater(value: Boolean) {
        wasUnderwaterSetterHandle.invoke(handle, value)
    }

    fun setExperienceLevel(value: Int) {
        experienceLevelSetterHandle.invoke(handle, value)
    }

    fun setTotalExperience(value: Int) {
        totalExperienceSetterHandle.invoke(handle, value)
    }

    fun setExperienceProgress(value: Float) {
        experienceProgressSetterHandle.invoke(handle, value)
    }

    fun setEnchantmentSeed(value: Int) {
        enchantmentSeedSetterHandle.invoke(handle, value)
    }

    fun setLastLevelUpTime(value: Int) {
        lastLevelUpTimeSetterHandle.invoke(handle, value)
    }

    fun setGameProfile(value: Any) {
        gameProfileSetterHandle.invoke(handle, value)
    }

    fun setReducedDebugInfo(value: Boolean) {
        reducedDebugInfoSetterHandle.invoke(handle, value)
    }

    fun setLastItemInMainHand(value: WrapperItemStack) {
        lastItemInMainHandSetterHandle.invoke(handle, value.handle)
    }

    fun setLastDeathLocation(value: Any) {
        lastDeathLocationSetterHandle.invoke(handle, value)
    }

    fun setFishing(value: Any) {
        fishingSetterHandle.invoke(handle, value)
    }

    fun setHurtDir(value: Float) {
        hurtDirSetterHandle.invoke(handle, value)
    }

    fun setCurrentImpulseImpactPos(value: WrapperVec3) {
        currentImpulseImpactPosSetterHandle.invoke(handle, value.handle)
    }

    fun setCurrentExplosionCause(value: WrapperEntity) {
        currentExplosionCauseSetterHandle.invoke(handle, value.handle)
    }

    fun setIgnoreFallDamageFromCurrentImpulse(value: Boolean) {
        ignoreFallDamageFromCurrentImpulseSetterHandle.invoke(handle, value)
    }

    fun setCurrentImpulseContextResetGraceTime(value: Int) {
        currentImpulseContextResetGraceTimeSetterHandle.invoke(handle, value)
    }

    fun setAffectsSpawning(value: Boolean) {
        affectsSpawningSetterHandle.invoke(handle, value)
    }

    fun setFlyingFallDamage(value: Any) {
        flyingFallDamageSetterHandle.invoke(handle, value)
    }

    fun setFauxSleeping(value: Boolean) {
        fauxSleepingSetterHandle.invoke(handle, value)
    }

    fun setOldLevel(value: Int) {
        oldLevelSetterHandle.invoke(handle, value)
    }

}
