package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperLivingEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.LivingEntity") }
        private val lookup = MethodHandles.lookup()

        val isAliveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlive", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.entity.SlotAccess"), Int::class.javaPrimitiveType!!))
        }
        val getAttributesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttributes", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.attributes.AttributeMap")))
        }
        val getAttributeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttribute", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.attributes.AttributeInstance"), Class.forName("net.minecraft.core.Holder")))
        }
        val getDimensionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDimensions", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityDimensions"), Class.forName("net.minecraft.world.entity.Pose")))
        }
        val isBlockingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBlocking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val addEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addEffect", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.effect.MobEffectInstance")))
        }
        val hasEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasEffect", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val canUseSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canUseSlot", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.EquipmentSlot")))
        }
        val getUseItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUseItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getSpeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpeed", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getScaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScale", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getBrainHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBrain", MethodType.methodType(Class.forName("net.minecraft.world.entity.ai.Brain")))
        }
        val canAttackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canAttack", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val isBabyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBaby", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getShieldBlockingDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getShieldBlockingDelay", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getAbsorptionAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAbsorptionAmount", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canBreatheUnderwaterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBreatheUnderwater", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldDropExperienceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldDropExperience", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getExpRewardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExpReward", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getDrinkingSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDrinkingSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getEatingSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEatingSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getHurtSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHurtSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent"), Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getLootTableSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLootTableSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getSoundVolumeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSoundVolume", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getArrowCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArrowCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getVoicePitchHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVoicePitch", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getStingerCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStingerCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDeathSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeathSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val canStandOnFluidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canStandOnFluid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.material.FluidState")))
        }
        val isSensitiveToWaterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSensitiveToWater", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasItemInSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasItemInSlot", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.EquipmentSlot")))
        }
        val getJumpBoostPowerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getJumpBoostPower", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getAttackAnimHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttackAnim", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val getTicksUsingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicksUsingItem", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRayTraceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRayTrace", MethodType.methodType(Class.forName("net.minecraft.world.phys.HitResult"), Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.ClipContext\$Fluid")))
        }
        val getAllSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllSlots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getFallFlyingTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFallFlyingTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val randomTeleportHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "randomTeleport", MethodType.methodType(Class.forName("java.util.Optional"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("org.bukkit.event.player.PlayerTeleportEvent\$TeleportCause")))
        }
        val doHurtTargetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "doHurtTarget", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getBedOrientationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBedOrientation", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val isHoldingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHolding", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.function.Predicate")))
        }
        val attackableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "attackable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val causeFallDamageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "causeFallDamage", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getItemInHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemInHand", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val getLootTableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLootTable", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val getYHeadRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYHeadRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getEatingSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEatingSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val lerpTargetXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val lerpTargetZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getMainHandItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMainHandItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val canUsePortalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canUsePortal", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val lerpTargetYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val lerpTargetYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getOffhandItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOffhandItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val lerpTargetXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getMaxFallDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxFallDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isCurrentlyGlowingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCurrentlyGlowing", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isVisuallySwimmingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVisuallySwimming", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldShowNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldShowName", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWeaponItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWeaponItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getBukkitYawHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitYaw", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getViewYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getViewYRot", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val isInvulnerableToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerableTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val isCollidableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCollidable", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val getHurtDirHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHurtDir", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val maxUpStepHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxUpStep", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val eatHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "eat", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.food.FoodProperties")))
        }
        val isSleepingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSleeping", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isPickableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPickable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInWallHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWall", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isPushableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPushable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getMainArmHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMainArm", MethodType.methodType(Class.forName("net.minecraft.world.entity.HumanoidArm")))
        }
        val canFreezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canFreeze", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canCollideWithBukkitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canCollideWithBukkit", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getPassengerRidingPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengerRidingPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getRelativePortalPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRelativePortalPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.Direction\$Axis"), Class.forName("net.minecraft.BlockUtil\$FoundRectangle")))
        }
        val getPreciseBodyRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPreciseBodyRotation", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val getBoundingBoxForCullingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBoxForCulling", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB")))
        }
        val getVisualRotationYInDegreesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisualRotationYInDegrees", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isSuppressingSlidingDownLadderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSuppressingSlidingDownLadder", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFluidFallingAdjustedMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidFallingAdjustedMovement", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Double::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val hasLineOfSightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLineOfSight", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getDeathSoundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeathSound", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getTargetEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTargetEntity", MethodType.methodType(Class.forName("net.minecraft.world.phys.EntityHitResult"), Int::class.javaPrimitiveType!!))
        }
        val getMaxHealthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxHealth", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getAttributeBaseValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttributeBaseValue", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val getBukkitLivingEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitLivingEntity", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.entity.CraftLivingEntity")))
        }
        val hasInfiniteMaterialsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasInfiniteMaterials", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getHealthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHealth", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEffect", MethodType.methodType(Class.forName("net.minecraft.world.effect.MobEffectInstance"), Class.forName("net.minecraft.core.Holder")))
        }
        val canAttackTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canAttackType", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.EntityType")))
        }
        val hasLandedInLiquidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasLandedInLiquid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLastHurtMobHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastHurtMob", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getSwimAmountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSwimAmount", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val getLastAttackerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastAttacker", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getMaxAbsorptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxAbsorption", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canBeSeenByAnyoneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeSeenByAnyone", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getNoActionTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNoActionTime", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getLastHurtByMobHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastHurtByMob", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val removeEffectHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeEffect", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val getAgeScaleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAgeScale", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canBeAffectedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeAffected", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.effect.MobEffectInstance")))
        }
        val getKillCreditHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKillCredit", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getArmorValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmorValue", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getCombatTrackerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCombatTracker", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.CombatTracker")))
        }
        val onClimbableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onClimbable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSleepingPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSleepingPos", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val isFallFlyingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFallFlying", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isUsingItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUsingItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getActiveEffectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getActiveEffects", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val removeAllEffectsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeAllEffects", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("org.bukkit.event.entity.EntityPotionEffectEvent\$Cause")))
        }
        val getAttributeValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttributeValue", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder")))
        }
        val isAutoSpinAttackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAutoSpinAttack", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canBeSeenAsEnemyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeSeenAsEnemy", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getItemBySlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemBySlot", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.entity.EquipmentSlot")))
        }
        val isDeadOrDyingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDeadOrDying", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canDisableShieldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canDisableShield", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getUsedItemHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUsedItemHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
        val getHandSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHandSlots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getArmorSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmorSlots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getDismountPosesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDismountPoses", MethodType.methodType(Class.forName("com.google.common.collect.ImmutableList")))
        }
        val getFallSoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFallSounds", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity\$Fallsounds")))
        }
        val getProjectileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProjectile", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val canTakeItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canTakeItem", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getLastHurtMobTimestampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastHurtMobTimestamp", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isInvertedHealAndHarmHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvertedHealAndHarm", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getActiveEffectsMapHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getActiveEffectsMap", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val getArmorCoverPercentageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmorCoverPercentage", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getEquipmentSlotForItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEquipmentSlotForItem", MethodType.methodType(Class.forName("net.minecraft.world.entity.EquipmentSlot"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getExperienceRewardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getExperienceReward", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getLastHurtByMobTimestampHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastHurtByMobTimestamp", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getVisibilityPercentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisibilityPercent", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val shouldDiscardFrictionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldDiscardFriction", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getArmorAndBodyArmorSlotsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getArmorAndBodyArmorSlots", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getUseItemRemainingTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUseItemRemainingTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val wasExperienceConsumedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "wasExperienceConsumed", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isDamageSourceBlockedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDamageSourceBlocked", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getLastClimbablePosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastClimbablePos", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val getLocalBoundsForPoseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocalBoundsForPose", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Class.forName("net.minecraft.world.entity.Pose")))
        }
        val isAffectedByPotionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAffectedByPotions", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val equipmentHasChangedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "equipmentHasChanged", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.item.ItemStack"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val removeEffectNoUpdateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeEffectNoUpdate", MethodType.methodType(Class.forName("net.minecraft.world.effect.MobEffectInstance"), Class.forName("net.minecraft.core.Holder"), Class.forName("org.bukkit.event.entity.EntityPotionEffectEvent\$Cause")))
        }
        val getLastDamageSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastDamageSource", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getFallDamageSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFallDamageSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent"), Int::class.javaPrimitiveType!!))
        }
        val activeLocationDependentEnchantmentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "activeLocationDependentEnchantments", MethodType.methodType(Class.forName("java.util.Map")))
        }
        val handleRelativeFrictionAndCalculateMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "handleRelativeFrictionAndCalculateMovement", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val combatTrackerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("combatTracker")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastBodyItemStackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastBodyItemStack")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val swingingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("swinging")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val discardFrictionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("discardFriction")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val swingingArmSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("swingingArm")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val swingTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("swingTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val removeArrowTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("removeArrowTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val removeStingerTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("removeStingerTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hurtTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hurtTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hurtDurationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hurtDuration")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val deathTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("deathTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val oAttackAnimSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("oAttackAnim")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val attackAnimSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("attackAnim")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val attackStrengthTickerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("attackStrengthTicker")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val invulnerableDurationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("invulnerableDuration")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yBodyRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yBodyRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yBodyRotOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yBodyRotO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yHeadRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yHeadRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yHeadRotOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yHeadRotO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtByPlayerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurtByPlayer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtByPlayerTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurtByPlayerTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val deadSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dead")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val noActionTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("noActionTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val oRunSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("oRun")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val runSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("run")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val animStepSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("animStep")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val animStepOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("animStepO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val rotOffsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("rotOffs")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val deathScoreSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("deathScore")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurt")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val jumpingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("jumping")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xxaSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xxa")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yyaSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yya")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val zzaSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("zza")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpStepsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpSteps")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpYRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpYRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpXRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpXRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpYHeadRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpYHeadRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lerpHeadStepsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lerpHeadSteps")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val effectsDirtySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("effectsDirty")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtByMobSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurtByMob")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtByMobTimestampSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurtByMobTimestamp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtMobSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurtMob")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastHurtMobTimestampSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastHurtMobTimestamp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val speedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("speed")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val noJumpDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("noJumpDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val absorptionAmountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("absorptionAmount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val useItemSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("useItem")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val useItemRemainingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("useItemRemaining")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fallFlyTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fallFlyTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastClimbablePosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastClimbablePos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastDamageSourceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastDamageSource")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastDamageStampSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastDamageStamp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val autoSpinAttackTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("autoSpinAttackTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val autoSpinAttackDmgSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("autoSpinAttackDmg")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val autoSpinAttackItemStackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("autoSpinAttackItemStack")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val swimAmountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("swimAmount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val swimAmountOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("swimAmountO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val brainSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("brain")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val skipDropExperienceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("skipDropExperience")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val appliedScaleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("appliedScale")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val expToDropSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("expToDrop")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dropsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("drops")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val collidesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("collides")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val collidableExemptionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("collidableExemptions")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bukkitPickUpLootSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bukkitPickUpLoot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val silentDeathSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("silentDeath")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val frictionStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("frictionState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isTickingEffectsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isTickingEffects")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val effectsToProcessSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("effectsToProcess")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val clearEquipmentSlotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("clearEquipmentSlots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val clearedEquipmentSlotsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("clearedEquipmentSlots")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastJumpTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastJumpTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val eatStartTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("eatStartTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val totalEatTimeTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("totalEatTimeTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val shieldBlockingDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("shieldBlockingDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val alive: Boolean
        get() = isAliveHandle.invoke(handle) as Boolean

    fun getSlot(arg0: Int): WrapperSlotAccess {
        return WrapperSlotAccess(getSlotHandle.invoke(handle, arg0))
    }

    val attributes: WrapperAttributeMap
        get() = WrapperAttributeMap(getAttributesHandle.invoke(handle))

    fun getAttribute(arg0: WrapperHolder): WrapperAttributeInstance {
        return WrapperAttributeInstance(getAttributeHandle.invoke(handle, arg0.handle))
    }

    fun getDimensions(arg0: Any): WrapperEntityDimensions {
        return WrapperEntityDimensions(getDimensionsHandle.invoke(handle, arg0))
    }

    val blocking: Boolean
        get() = isBlockingHandle.invoke(handle) as Boolean

    fun addEffect(arg0: WrapperMobEffectInstance): Boolean {
        return addEffectHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun hasEffect(arg0: WrapperHolder): Boolean {
        return hasEffectHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun canUseSlot(arg0: Any): Boolean {
        return canUseSlotHandle.invoke(handle, arg0) as Boolean
    }

    val useItem: WrapperItemStack
        get() = WrapperItemStack(getUseItemHandle.invoke(handle))

    val speed: Float
        get() = getSpeedHandle.invoke(handle) as Float

    val scale: Float
        get() = getScaleHandle.invoke(handle) as Float

    val brain: WrapperBrain
        get() = WrapperBrain(getBrainHandle.invoke(handle))

    fun canAttack(arg0: WrapperLivingEntity): Boolean {
        return canAttackHandle.invoke(handle, arg0.handle) as Boolean
    }

    val baby: Boolean
        get() = isBabyHandle.invoke(handle) as Boolean

    val shieldBlockingDelay: Int
        get() = getShieldBlockingDelayHandle.invoke(handle) as Int

    val absorptionAmount: Float
        get() = getAbsorptionAmountHandle.invoke(handle) as Float

    val canBreatheUnderwater: Boolean
        get() = canBreatheUnderwaterHandle.invoke(handle) as Boolean

    val shouldDropExperience: Boolean
        get() = shouldDropExperienceHandle.invoke(handle) as Boolean

    fun getExpReward(arg0: WrapperEntity): Int {
        return getExpRewardHandle.invoke(handle, arg0.handle) as Int
    }

    fun getDrinkingSound0(arg0: WrapperItemStack): WrapperSoundEvent {
        return WrapperSoundEvent(getDrinkingSound0Handle.invoke(handle, arg0.handle))
    }

    fun getEatingSound0(arg0: WrapperItemStack): WrapperSoundEvent {
        return WrapperSoundEvent(getEatingSound0Handle.invoke(handle, arg0.handle))
    }

    fun getHurtSound0(arg0: WrapperDamageSource): WrapperSoundEvent {
        return WrapperSoundEvent(getHurtSound0Handle.invoke(handle, arg0.handle))
    }

    val lootTableSeed: Long
        get() = getLootTableSeedHandle.invoke(handle) as Long

    val soundVolume: Float
        get() = getSoundVolumeHandle.invoke(handle) as Float

    val arrowCount: Int
        get() = getArrowCountHandle.invoke(handle) as Int

    val voicePitch: Float
        get() = getVoicePitchHandle.invoke(handle) as Float

    val stingerCount: Int
        get() = getStingerCountHandle.invoke(handle) as Int

    val deathSound0: WrapperSoundEvent
        get() = WrapperSoundEvent(getDeathSound0Handle.invoke(handle))

    fun canStandOnFluid(arg0: WrapperFluidState): Boolean {
        return canStandOnFluidHandle.invoke(handle, arg0.handle) as Boolean
    }

    val sensitiveToWater: Boolean
        get() = isSensitiveToWaterHandle.invoke(handle) as Boolean

    fun hasItemInSlot(arg0: Any): Boolean {
        return hasItemInSlotHandle.invoke(handle, arg0) as Boolean
    }

    val jumpBoostPower: Float
        get() = getJumpBoostPowerHandle.invoke(handle) as Float

    fun getAttackAnim(arg0: Float): Float {
        return getAttackAnimHandle.invoke(handle, arg0) as Float
    }

    val ticksUsingItem: Int
        get() = getTicksUsingItemHandle.invoke(handle) as Int

    fun getRayTrace(arg0: Int, arg1: Any): WrapperHitResult {
        return WrapperHitResult(getRayTraceHandle.invoke(handle, arg0, arg1))
    }

    val allSlots: Any
        get() = getAllSlotsHandle.invoke(handle) as Any

    val fallFlyingTicks: Int
        get() = getFallFlyingTicksHandle.invoke(handle) as Int

    fun randomTeleport(arg0: Double, arg1: Double, arg2: Double, arg3: Boolean, arg4: Any): Any {
        return randomTeleportHandle.invoke(handle, arg0, arg1, arg2, arg3, arg4) as Any
    }

    fun doHurtTarget(arg0: WrapperEntity): Boolean {
        return doHurtTargetHandle.invoke(handle, arg0.handle) as Boolean
    }

    val bedOrientation: Any
        get() = getBedOrientationHandle.invoke(handle) as Any

    fun isHolding(arg0: Any): Boolean {
        return isHoldingHandle.invoke(handle, arg0) as Boolean
    }

    val attackable: Boolean
        get() = attackableHandle.invoke(handle) as Boolean

    fun causeFallDamage(arg0: Float, arg1: Float, arg2: WrapperDamageSource): Boolean {
        return causeFallDamageHandle.invoke(handle, arg0, arg1, arg2.handle) as Boolean
    }

    fun getItemInHand(arg0: Any): WrapperItemStack {
        return WrapperItemStack(getItemInHandHandle.invoke(handle, arg0))
    }

    val lootTable: WrapperResourceKey
        get() = WrapperResourceKey(getLootTableHandle.invoke(handle))

    val yHeadRot: Float
        get() = getYHeadRotHandle.invoke(handle) as Float

    fun getEatingSound(arg0: WrapperItemStack): WrapperSoundEvent {
        return WrapperSoundEvent(getEatingSoundHandle.invoke(handle, arg0.handle))
    }

    val lerpTargetX: Double
        get() = lerpTargetXHandle.invoke(handle) as Double

    val lerpTargetZ: Double
        get() = lerpTargetZHandle.invoke(handle) as Double

    val mainHandItem: WrapperItemStack
        get() = WrapperItemStack(getMainHandItemHandle.invoke(handle))

    fun canUsePortal(arg0: Boolean): Boolean {
        return canUsePortalHandle.invoke(handle, arg0) as Boolean
    }

    val lerpTargetY: Double
        get() = lerpTargetYHandle.invoke(handle) as Double

    val lerpTargetYRot: Float
        get() = lerpTargetYRotHandle.invoke(handle) as Float

    val offhandItem: WrapperItemStack
        get() = WrapperItemStack(getOffhandItemHandle.invoke(handle))

    val lerpTargetXRot: Float
        get() = lerpTargetXRotHandle.invoke(handle) as Float

    val maxFallDistance: Int
        get() = getMaxFallDistanceHandle.invoke(handle) as Int

    val currentlyGlowing: Boolean
        get() = isCurrentlyGlowingHandle.invoke(handle) as Boolean

    val visuallySwimming: Boolean
        get() = isVisuallySwimmingHandle.invoke(handle) as Boolean

    val shouldShowName: Boolean
        get() = shouldShowNameHandle.invoke(handle) as Boolean

    val weaponItem: WrapperItemStack
        get() = WrapperItemStack(getWeaponItemHandle.invoke(handle))

    val bukkitYaw: Float
        get() = getBukkitYawHandle.invoke(handle) as Float

    fun getViewYRot(arg0: Float): Float {
        return getViewYRotHandle.invoke(handle, arg0) as Float
    }

    fun isInvulnerableTo(arg0: WrapperDamageSource): Boolean {
        return isInvulnerableToHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun isCollidable(arg0: Boolean): Boolean {
        return isCollidableHandle.invoke(handle, arg0) as Boolean
    }

    val hurtDir: Float
        get() = getHurtDirHandle.invoke(handle) as Float

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val maxUpStep: Float
        get() = maxUpStepHandle.invoke(handle) as Float

    fun eat(arg0: WrapperLevel, arg1: WrapperItemStack, arg2: WrapperFoodProperties): WrapperItemStack {
        return WrapperItemStack(eatHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle))
    }

    val sleeping: Boolean
        get() = isSleepingHandle.invoke(handle) as Boolean

    val pickable: Boolean
        get() = isPickableHandle.invoke(handle) as Boolean

    val inWall: Boolean
        get() = isInWallHandle.invoke(handle) as Boolean

    val pushable: Boolean
        get() = isPushableHandle.invoke(handle) as Boolean

    val mainArm: Any
        get() = getMainArmHandle.invoke(handle) as Any

    val canFreeze: Boolean
        get() = canFreezeHandle.invoke(handle) as Boolean

    fun canCollideWithBukkit(arg0: WrapperEntity): Boolean {
        return canCollideWithBukkitHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getPassengerRidingPosition(arg0: WrapperEntity): WrapperVec3 {
        return WrapperVec3(getPassengerRidingPositionHandle.invoke(handle, arg0.handle))
    }

    fun getRelativePortalPosition(arg0: Any, arg1: WrapperFoundRectangle): WrapperVec3 {
        return WrapperVec3(getRelativePortalPositionHandle.invoke(handle, arg0, arg1.handle))
    }

    fun getPreciseBodyRotation(arg0: Float): Float {
        return getPreciseBodyRotationHandle.invoke(handle, arg0) as Float
    }

    val boundingBoxForCulling: WrapperAABB
        get() = WrapperAABB(getBoundingBoxForCullingHandle.invoke(handle))

    val visualRotationYInDegrees: Float
        get() = getVisualRotationYInDegreesHandle.invoke(handle) as Float

    val suppressingSlidingDownLadder: Boolean
        get() = isSuppressingSlidingDownLadderHandle.invoke(handle) as Boolean

    fun getFluidFallingAdjustedMovement(arg0: Double, arg1: Boolean, arg2: WrapperVec3): WrapperVec3 {
        return WrapperVec3(getFluidFallingAdjustedMovementHandle.invoke(handle, arg0, arg1, arg2.handle))
    }

    fun hasLineOfSight(arg0: WrapperEntity): Boolean {
        return hasLineOfSightHandle.invoke(handle, arg0.handle) as Boolean
    }

    val deathSound: WrapperSoundEvent
        get() = WrapperSoundEvent(getDeathSoundHandle.invoke(handle))

    fun getTargetEntity(arg0: Int): WrapperEntityHitResult {
        return WrapperEntityHitResult(getTargetEntityHandle.invoke(handle, arg0))
    }

    val maxHealth: Float
        get() = getMaxHealthHandle.invoke(handle) as Float

    fun getAttributeBaseValue(arg0: WrapperHolder): Double {
        return getAttributeBaseValueHandle.invoke(handle, arg0.handle) as Double
    }

    val bukkitLivingEntity: Any
        get() = getBukkitLivingEntityHandle.invoke(handle) as Any

    val infiniteMaterials: Boolean
        get() = hasInfiniteMaterialsHandle.invoke(handle) as Boolean

    val health: Float
        get() = getHealthHandle.invoke(handle) as Float

    fun getEffect(arg0: WrapperHolder): WrapperMobEffectInstance {
        return WrapperMobEffectInstance(getEffectHandle.invoke(handle, arg0.handle))
    }

    fun canAttackType(arg0: WrapperEntityType): Boolean {
        return canAttackTypeHandle.invoke(handle, arg0.handle) as Boolean
    }

    val landedInLiquid: Boolean
        get() = hasLandedInLiquidHandle.invoke(handle) as Boolean

    val lastHurtMob: WrapperLivingEntity
        get() = WrapperLivingEntity(getLastHurtMobHandle.invoke(handle))

    fun getSwimAmount(arg0: Float): Float {
        return getSwimAmountHandle.invoke(handle, arg0) as Float
    }

    val lastAttacker: WrapperLivingEntity
        get() = WrapperLivingEntity(getLastAttackerHandle.invoke(handle))

    val maxAbsorption: Float
        get() = getMaxAbsorptionHandle.invoke(handle) as Float

    val canBeSeenByAnyone: Boolean
        get() = canBeSeenByAnyoneHandle.invoke(handle) as Boolean

    val noActionTime: Int
        get() = getNoActionTimeHandle.invoke(handle) as Int

    val lastHurtByMob: WrapperLivingEntity
        get() = WrapperLivingEntity(getLastHurtByMobHandle.invoke(handle))

    fun removeEffect(arg0: WrapperHolder): Boolean {
        return removeEffectHandle.invoke(handle, arg0.handle) as Boolean
    }

    val ageScale: Float
        get() = getAgeScaleHandle.invoke(handle) as Float

    fun canBeAffected(arg0: WrapperMobEffectInstance): Boolean {
        return canBeAffectedHandle.invoke(handle, arg0.handle) as Boolean
    }

    val killCredit: WrapperLivingEntity
        get() = WrapperLivingEntity(getKillCreditHandle.invoke(handle))

    val armorValue: Int
        get() = getArmorValueHandle.invoke(handle) as Int

    val combatTracker: WrapperCombatTracker
        get() = WrapperCombatTracker(getCombatTrackerHandle.invoke(handle))

    val onClimbable: Boolean
        get() = onClimbableHandle.invoke(handle) as Boolean

    val sleepingPos: Any
        get() = getSleepingPosHandle.invoke(handle) as Any

    val fallFlying: Boolean
        get() = isFallFlyingHandle.invoke(handle) as Boolean

    val usingItem: Boolean
        get() = isUsingItemHandle.invoke(handle) as Boolean

    val activeEffects: Any
        get() = getActiveEffectsHandle.invoke(handle) as Any

    fun removeAllEffects(arg0: Any): Boolean {
        return removeAllEffectsHandle.invoke(handle, arg0) as Boolean
    }

    fun getAttributeValue(arg0: WrapperHolder): Double {
        return getAttributeValueHandle.invoke(handle, arg0.handle) as Double
    }

    val autoSpinAttack: Boolean
        get() = isAutoSpinAttackHandle.invoke(handle) as Boolean

    val canBeSeenAsEnemy: Boolean
        get() = canBeSeenAsEnemyHandle.invoke(handle) as Boolean

    fun getItemBySlot(arg0: Any): WrapperItemStack {
        return WrapperItemStack(getItemBySlotHandle.invoke(handle, arg0))
    }

    val deadOrDying: Boolean
        get() = isDeadOrDyingHandle.invoke(handle) as Boolean

    val canDisableShield: Boolean
        get() = canDisableShieldHandle.invoke(handle) as Boolean

    val usedItemHand: Any
        get() = getUsedItemHandHandle.invoke(handle) as Any

    val handSlots: Any
        get() = getHandSlotsHandle.invoke(handle) as Any

    val armorSlots: Any
        get() = getArmorSlotsHandle.invoke(handle) as Any

    val dismountPoses: Any
        get() = getDismountPosesHandle.invoke(handle) as Any

    val fallSounds: WrapperFallsounds
        get() = WrapperFallsounds(getFallSoundsHandle.invoke(handle))

    fun getProjectile(arg0: WrapperItemStack): WrapperItemStack {
        return WrapperItemStack(getProjectileHandle.invoke(handle, arg0.handle))
    }

    fun canTakeItem(arg0: WrapperItemStack): Boolean {
        return canTakeItemHandle.invoke(handle, arg0.handle) as Boolean
    }

    val lastHurtMobTimestamp: Int
        get() = getLastHurtMobTimestampHandle.invoke(handle) as Int

    val invertedHealAndHarm: Boolean
        get() = isInvertedHealAndHarmHandle.invoke(handle) as Boolean

    val activeEffectsMap: Any
        get() = getActiveEffectsMapHandle.invoke(handle) as Any

    val armorCoverPercentage: Float
        get() = getArmorCoverPercentageHandle.invoke(handle) as Float

    fun getEquipmentSlotForItem(arg0: WrapperItemStack): Any {
        return getEquipmentSlotForItemHandle.invoke(handle, arg0.handle) as Any
    }

    fun getExperienceReward(arg0: WrapperServerLevel, arg1: WrapperEntity): Int {
        return getExperienceRewardHandle.invoke(handle, arg0.handle, arg1.handle) as Int
    }

    val lastHurtByMobTimestamp: Int
        get() = getLastHurtByMobTimestampHandle.invoke(handle) as Int

    fun getVisibilityPercent(arg0: WrapperEntity): Double {
        return getVisibilityPercentHandle.invoke(handle, arg0.handle) as Double
    }

    val shouldDiscardFriction: Boolean
        get() = shouldDiscardFrictionHandle.invoke(handle) as Boolean

    val armorAndBodyArmorSlots: Any
        get() = getArmorAndBodyArmorSlotsHandle.invoke(handle) as Any

    val useItemRemainingTicks: Int
        get() = getUseItemRemainingTicksHandle.invoke(handle) as Int

    val wasExperienceConsumed: Boolean
        get() = wasExperienceConsumedHandle.invoke(handle) as Boolean

    fun isDamageSourceBlocked(arg0: WrapperDamageSource): Boolean {
        return isDamageSourceBlockedHandle.invoke(handle, arg0.handle) as Boolean
    }

    val lastClimbablePos: Any
        get() = getLastClimbablePosHandle.invoke(handle) as Any

    fun getLocalBoundsForPose(arg0: Any): WrapperAABB {
        return WrapperAABB(getLocalBoundsForPoseHandle.invoke(handle, arg0))
    }

    val affectedByPotions: Boolean
        get() = isAffectedByPotionsHandle.invoke(handle) as Boolean

    fun equipmentHasChanged(arg0: WrapperItemStack, arg1: WrapperItemStack): Boolean {
        return equipmentHasChangedHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun removeEffectNoUpdate(arg0: WrapperHolder, arg1: Any): WrapperMobEffectInstance {
        return WrapperMobEffectInstance(removeEffectNoUpdateHandle.invoke(handle, arg0.handle, arg1))
    }

    val lastDamageSource: WrapperDamageSource
        get() = WrapperDamageSource(getLastDamageSourceHandle.invoke(handle))

    fun getFallDamageSound0(arg0: Int): WrapperSoundEvent {
        return WrapperSoundEvent(getFallDamageSound0Handle.invoke(handle, arg0))
    }

    val activeLocationDependentEnchantments: Any
        get() = activeLocationDependentEnchantmentsHandle.invoke(handle) as Any

    fun handleRelativeFrictionAndCalculateMovement(arg0: WrapperVec3, arg1: Float): WrapperVec3 {
        return WrapperVec3(handleRelativeFrictionAndCalculateMovementHandle.invoke(handle, arg0.handle, arg1))
    }

    fun setCombatTracker(value: WrapperCombatTracker) {
        combatTrackerSetterHandle.invoke(handle, value.handle)
    }

    fun setLastBodyItemStack(value: WrapperItemStack) {
        lastBodyItemStackSetterHandle.invoke(handle, value.handle)
    }

    fun setSwinging(value: Boolean) {
        swingingSetterHandle.invoke(handle, value)
    }

    fun setDiscardFriction(value: Boolean) {
        discardFrictionSetterHandle.invoke(handle, value)
    }

    fun setSwingingArm(value: Any) {
        swingingArmSetterHandle.invoke(handle, value)
    }

    fun setSwingTime(value: Int) {
        swingTimeSetterHandle.invoke(handle, value)
    }

    fun setRemoveArrowTime(value: Int) {
        removeArrowTimeSetterHandle.invoke(handle, value)
    }

    fun setRemoveStingerTime(value: Int) {
        removeStingerTimeSetterHandle.invoke(handle, value)
    }

    fun setHurtTime(value: Int) {
        hurtTimeSetterHandle.invoke(handle, value)
    }

    fun setHurtDuration(value: Int) {
        hurtDurationSetterHandle.invoke(handle, value)
    }

    fun setDeathTime(value: Int) {
        deathTimeSetterHandle.invoke(handle, value)
    }

    fun setOAttackAnim(value: Float) {
        oAttackAnimSetterHandle.invoke(handle, value)
    }

    fun setAttackAnim(value: Float) {
        attackAnimSetterHandle.invoke(handle, value)
    }

    fun setAttackStrengthTicker(value: Int) {
        attackStrengthTickerSetterHandle.invoke(handle, value)
    }

    fun setInvulnerableDuration(value: Int) {
        invulnerableDurationSetterHandle.invoke(handle, value)
    }

    fun setYBodyRot(value: Float) {
        yBodyRotSetterHandle.invoke(handle, value)
    }

    fun setYBodyRotO(value: Float) {
        yBodyRotOSetterHandle.invoke(handle, value)
    }

    fun setYHeadRot(value: Float) {
        yHeadRotSetterHandle.invoke(handle, value)
    }

    fun setYHeadRotO(value: Float) {
        yHeadRotOSetterHandle.invoke(handle, value)
    }

    fun setLastHurtByPlayer(value: WrapperPlayer) {
        lastHurtByPlayerSetterHandle.invoke(handle, value.handle)
    }

    fun setLastHurtByPlayerTime(value: Int) {
        lastHurtByPlayerTimeSetterHandle.invoke(handle, value)
    }

    fun setDead(value: Boolean) {
        deadSetterHandle.invoke(handle, value)
    }

    fun setNoActionTime(value: Int) {
        noActionTimeSetterHandle.invoke(handle, value)
    }

    fun setORun(value: Float) {
        oRunSetterHandle.invoke(handle, value)
    }

    fun setRun(value: Float) {
        runSetterHandle.invoke(handle, value)
    }

    fun setAnimStep(value: Float) {
        animStepSetterHandle.invoke(handle, value)
    }

    fun setAnimStepO(value: Float) {
        animStepOSetterHandle.invoke(handle, value)
    }

    fun setRotOffs(value: Float) {
        rotOffsSetterHandle.invoke(handle, value)
    }

    fun setDeathScore(value: Int) {
        deathScoreSetterHandle.invoke(handle, value)
    }

    fun setLastHurt(value: Float) {
        lastHurtSetterHandle.invoke(handle, value)
    }

    fun setJumping(value: Boolean) {
        jumpingSetterHandle.invoke(handle, value)
    }

    fun setXxa(value: Float) {
        xxaSetterHandle.invoke(handle, value)
    }

    fun setYya(value: Float) {
        yyaSetterHandle.invoke(handle, value)
    }

    fun setZza(value: Float) {
        zzaSetterHandle.invoke(handle, value)
    }

    fun setLerpSteps(value: Int) {
        lerpStepsSetterHandle.invoke(handle, value)
    }

    fun setLerpX(value: Double) {
        lerpXSetterHandle.invoke(handle, value)
    }

    fun setLerpY(value: Double) {
        lerpYSetterHandle.invoke(handle, value)
    }

    fun setLerpZ(value: Double) {
        lerpZSetterHandle.invoke(handle, value)
    }

    fun setLerpYRot(value: Double) {
        lerpYRotSetterHandle.invoke(handle, value)
    }

    fun setLerpXRot(value: Double) {
        lerpXRotSetterHandle.invoke(handle, value)
    }

    fun setLerpYHeadRot(value: Double) {
        lerpYHeadRotSetterHandle.invoke(handle, value)
    }

    fun setLerpHeadSteps(value: Int) {
        lerpHeadStepsSetterHandle.invoke(handle, value)
    }

    fun setEffectsDirty(value: Boolean) {
        effectsDirtySetterHandle.invoke(handle, value)
    }

    fun setLastHurtByMob(value: WrapperLivingEntity) {
        lastHurtByMobSetterHandle.invoke(handle, value.handle)
    }

    fun setLastHurtByMobTimestamp(value: Int) {
        lastHurtByMobTimestampSetterHandle.invoke(handle, value)
    }

    fun setLastHurtMob(value: WrapperLivingEntity) {
        lastHurtMobSetterHandle.invoke(handle, value.handle)
    }

    fun setLastHurtMobTimestamp(value: Int) {
        lastHurtMobTimestampSetterHandle.invoke(handle, value)
    }

    fun setSpeed(value: Float) {
        speedSetterHandle.invoke(handle, value)
    }

    fun setNoJumpDelay(value: Int) {
        noJumpDelaySetterHandle.invoke(handle, value)
    }

    fun setAbsorptionAmount(value: Float) {
        absorptionAmountSetterHandle.invoke(handle, value)
    }

    fun setUseItem(value: WrapperItemStack) {
        useItemSetterHandle.invoke(handle, value.handle)
    }

    fun setUseItemRemaining(value: Int) {
        useItemRemainingSetterHandle.invoke(handle, value)
    }

    fun setFallFlyTicks(value: Int) {
        fallFlyTicksSetterHandle.invoke(handle, value)
    }

    fun setLastPos(value: WrapperBlockPos) {
        lastPosSetterHandle.invoke(handle, value.handle)
    }

    fun setLastClimbablePos(value: Any) {
        lastClimbablePosSetterHandle.invoke(handle, value)
    }

    fun setLastDamageSource(value: WrapperDamageSource) {
        lastDamageSourceSetterHandle.invoke(handle, value.handle)
    }

    fun setLastDamageStamp(value: Long) {
        lastDamageStampSetterHandle.invoke(handle, value)
    }

    fun setAutoSpinAttackTicks(value: Int) {
        autoSpinAttackTicksSetterHandle.invoke(handle, value)
    }

    fun setAutoSpinAttackDmg(value: Float) {
        autoSpinAttackDmgSetterHandle.invoke(handle, value)
    }

    fun setAutoSpinAttackItemStack(value: WrapperItemStack) {
        autoSpinAttackItemStackSetterHandle.invoke(handle, value.handle)
    }

    fun setSwimAmount(value: Float) {
        swimAmountSetterHandle.invoke(handle, value)
    }

    fun setSwimAmountO(value: Float) {
        swimAmountOSetterHandle.invoke(handle, value)
    }

    fun setBrain(value: WrapperBrain) {
        brainSetterHandle.invoke(handle, value.handle)
    }

    fun setSkipDropExperience(value: Boolean) {
        skipDropExperienceSetterHandle.invoke(handle, value)
    }

    fun setAppliedScale(value: Float) {
        appliedScaleSetterHandle.invoke(handle, value)
    }

    fun setExpToDrop(value: Int) {
        expToDropSetterHandle.invoke(handle, value)
    }

    fun setDrops(value: Any) {
        dropsSetterHandle.invoke(handle, value)
    }

    fun setCollides(value: Boolean) {
        collidesSetterHandle.invoke(handle, value)
    }

    fun setCollidableExemptions(value: Any) {
        collidableExemptionsSetterHandle.invoke(handle, value)
    }

    fun setBukkitPickUpLoot(value: Boolean) {
        bukkitPickUpLootSetterHandle.invoke(handle, value)
    }

    fun setSilentDeath(value: Boolean) {
        silentDeathSetterHandle.invoke(handle, value)
    }

    fun setFrictionState(value: Any) {
        frictionStateSetterHandle.invoke(handle, value)
    }

    fun setIsTickingEffects(value: Boolean) {
        isTickingEffectsSetterHandle.invoke(handle, value)
    }

    fun setEffectsToProcess(value: Any) {
        effectsToProcessSetterHandle.invoke(handle, value)
    }

    fun setClearEquipmentSlots(value: Boolean) {
        clearEquipmentSlotsSetterHandle.invoke(handle, value)
    }

    fun setClearedEquipmentSlots(value: Any) {
        clearedEquipmentSlotsSetterHandle.invoke(handle, value)
    }

    fun setLastJumpTime(value: Long) {
        lastJumpTimeSetterHandle.invoke(handle, value)
    }

    fun setEatStartTime(value: Long) {
        eatStartTimeSetterHandle.invoke(handle, value)
    }

    fun setTotalEatTimeTicks(value: Int) {
        totalEatTimeTicksSetterHandle.invoke(handle, value)
    }

    fun setShieldBlockingDelay(value: Int) {
        shieldBlockingDelaySetterHandle.invoke(handle, value)
    }

}
