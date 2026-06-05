package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperEntity(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.Entity") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val positionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "position", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val isAliveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlive", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getId", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityType")))
        }
        val getSlotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSlot", MethodType.methodType(Class.forName("net.minecraft.world.entity.SlotAccess"), Int::class.javaPrimitiveType!!))
        }
        val pickHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pick", MethodType.methodType(Class.forName("net.minecraft.world.phys.HitResult"), Double::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val isHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "is", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val rotateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "rotate", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val levelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "level", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val isSupportedByHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSupportedBy", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos")))
        }
        val getDimensionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDimensions", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityDimensions"), Class.forName("net.minecraft.world.entity.Pose")))
        }
        val getEntityDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityData", MethodType.methodType(Class.forName("net.minecraft.network.syncher.SynchedEntityData")))
        }
        val getBukkitEntityRawHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitEntityRaw", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.entity.CraftEntity")))
        }
        val getBoundingBoxAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBoxAt", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getScoreboardNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboardName", MethodType.methodType(String::class.java))
        }
        val getBukkitSenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitSender", MethodType.methodType(Class.forName("org.bukkit.command.CommandSender"), Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val getBukkitYawHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitYaw", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val hasGlowingTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasGlowingTag", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTeamColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTeamColor", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPositionCodecHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPositionCodec", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.VecDeltaCodec")))
        }
        val isPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPassenger", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isChunkLoadedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isChunkLoaded", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getOriginVectorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOriginVector", MethodType.methodType(Class.forName("org.bukkit.util.Vector")))
        }
        val getOriginWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOriginWorld", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val getFireImmuneTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFireImmuneTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMaxAirSupplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxAirSupply", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isCollidingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isColliding", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getEyePositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEyePosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val isSpectatorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSpectator", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val distanceToSqrHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceToSqr", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val mayInteractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayInteract", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val canCollideWithHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canCollideWith", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val canBeCollidedWithHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeCollidedWith", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val chunkPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "chunkPosition", MethodType.methodType(Class.forName("net.minecraft.world.level.ChunkPos")))
        }
        val blockPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "blockPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBox", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB")))
        }
        val startRidingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "startRiding", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val onlyOpCanSetNbtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onlyOpCanSetNbt", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengers", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val isShiftKeyDownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShiftKeyDown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTeam", MethodType.methodType(Class.forName("net.minecraft.world.scores.PlayerTeam")))
        }
        val isVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVehicle", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isOnFireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOnFire", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasPoseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPose", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Pose")))
        }
        val isInLavaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInLava", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val addTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addTag", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val getPoseHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPose", MethodType.methodType(Class.forName("net.minecraft.world.entity.Pose")))
        }
        val getOnPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOnPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val isOnRailsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOnRails", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val maxUpStepHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "maxUpStep", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isFreeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFree", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val removeTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removeTag", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val isSwimmingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSwimming", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val isInWaterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWater", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEyeYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEyeY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getBlockZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val distanceToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "distanceTo", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getBlockXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isInWallHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWall", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val interactHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interact", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val isPickableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPickable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isPushableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPushable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInRainHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInRain", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isSilentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSilent", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGravityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGravity", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val isInLiquidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInLiquid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBbWidthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBbWidth", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getForwardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getForward", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val isAlliedToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlliedTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.scores.Team")))
        }
        val interactAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "interactAt", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.entity.player.Player"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.InteractionHand")))
        }
        val deflectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "deflection", MethodType.methodType(Class.forName("net.minecraft.world.entity.projectile.ProjectileDeflection"), Class.forName("net.minecraft.world.entity.projectile.Projectile")))
        }
        val isDiscreteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDiscrete", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRandomXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomX", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val teleportToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "teleportTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Class.forName("java.util.Set"), Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Class.forName("org.bukkit.event.player.PlayerTeleportEvent\$TeleportCause")))
        }
        val getRandomZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomZ", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val canFreezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canFreeze", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canSprintHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSprint", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBlockYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRandomYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandomY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val isTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isFreezingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFreezing", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLightLevelDependentMagicValueHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightLevelDependentMagicValue", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val `moonrise$isUpdatingSectionStatusHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isUpdatingSectionStatus", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$hasAnyPlayerPassengersHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$hasAnyPlayerPassengers", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasExactlyOnePlayerPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasExactlyOnePlayerPassenger", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSwimHighSpeedSplashSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSwimHighSpeedSplashSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val getBlockExplosionResistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockExplosionResistance", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Class.forName("net.minecraft.world.level.material.FluidState"), Float::class.javaPrimitiveType!!))
        }
        val fudgePositionAfterSizeChangeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fudgePositionAfterSizeChange", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.EntityDimensions")))
        }
        val updateFluidHeightAndDoFluidPushingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "updateFluidHeightAndDoFluidPushing", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey"), Double::class.javaPrimitiveType!!))
        }
        val isControlledByLocalInstanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isControlledByLocalInstance", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getDismountLocationForPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDismountLocationForPassenger", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getVisualRotationYInDegreesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVisualRotationYInDegrees", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getBlockPosBelowThatAffectsMyMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockPosBelowThatAffectsMyMovement", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getMoveStartZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMoveStartZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getMoveStartYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMoveStartY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val isCrouchingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCrouching", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getMoveVectorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMoveVector", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getPortalCooldownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPortalCooldown", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getMoveStartXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMoveStartX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getTicksFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicksFrozen", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isOnPortalCooldownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOnPortalCooldown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getOnPosLegacyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOnPosLegacy", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getSwimSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSwimSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val saveWithoutIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveWithoutId", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getAirSupplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAirSupply", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getInBlockStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getInBlockState", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getSoundSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSoundSource", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundSource")))
        }
        val isNoGravityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isNoGravity", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBlockStateOnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBlockStateOn", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.BlockState")))
        }
        val getUpVectorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUpVector", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val saveAsPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveAsPassenger", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.CompoundTag"), Boolean::class.javaPrimitiveType!!))
        }
        val getViewVectorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getViewVector", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val isInWaterOrRainHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWaterOrRain", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getViewYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getViewYRot", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val shouldRenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRender", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val isCollidableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCollidable", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val serializeEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "serializeEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getCustomNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCustomName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getViewXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getViewXRot", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val isSprintingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSprinting", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInvulnerableToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerableTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val getEyeHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEyeHeight", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isEyeInFluidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEyeInFluid", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val isInBubbleColumnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInBubbleColumn", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInWaterOrBubbleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWaterOrBubble", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isUnderWaterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUnderWater", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val dampensVibrationsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dampensVibrations", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getEncodeIdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEncodeId", MethodType.methodType(String::class.java))
        }
        val hasPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPassenger", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val showVehicleHealthHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "showVehicleHealth", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val lerpTargetXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getAttachmentsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAttachments", MethodType.methodType(Class.forName("net.minecraft.world.entity.EntityAttachments")))
        }
        val lerpTargetZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetZ", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val lerpTargetYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val lerpTargetXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getLookAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLookAngle", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getPickRadiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickRadius", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val lerpTargetYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lerpTargetY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getFirstPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFirstPassenger", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getRotationVectorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotationVector", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec2")))
        }
        val spawnAtLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spawnAtLocation", MethodType.methodType(Class.forName("net.minecraft.world.entity.item.ItemEntity"), Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getSharedFlagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSharedFlag", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val canControlVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canControlVehicle", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInvisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val changeDimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "changeDimension", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.portal.DimensionTransition")))
        }
        val isFullyFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFullyFrozen", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isCurrentlyGlowingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCurrentlyGlowing", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isVisuallyCrawlingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVisuallyCrawling", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPercentFrozenHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPercentFrozen", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val callPortalEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "callPortalEvent", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.event.CraftPortalEvent"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("org.bukkit.Location"), Class.forName("org.bukkit.event.player.PlayerTeleportEvent\$TeleportCause"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val shouldBlockExplodeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldBlockExplode", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion"), Class.forName("net.minecraft.world.level.BlockGetter"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.block.state.BlockState"), Float::class.javaPrimitiveType!!))
        }
        val isAttackableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAttackable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getStringUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStringUUID", MethodType.methodType(String::class.java))
        }
        val isPushedByFluidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPushedByFluid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canUsePortalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canUsePortal", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val killedEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "killedEntity", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val isInvisibleToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvisibleTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getMaxFallDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxFallDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isVisuallySwimmingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isVisuallySwimming", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isDescendingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDescending", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBbHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBbHeight", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val hasPermissionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPermissions", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isAlwaysTickingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAlwaysTicking", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getKnownMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnownMovement", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getWeaponItemHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWeaponItem", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val shouldShowNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldShowName", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getMotionDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMotionDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val broadcastToPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "broadcastToPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val acceptsFailureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsFailure", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFluidHeightHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidHeight", MethodType.methodType(Double::class.javaPrimitiveType!!, Class.forName("net.minecraft.tags.TagKey")))
        }
        val getLeashOffsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLeashOffset", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val getRootVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRootVehicle", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getRemovalReasonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemovalReason", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity\$RemovalReason")))
        }
        val isEffectiveAiHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEffectiveAi", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldInformAdminsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldInformAdmins", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldBeSavedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldBeSaved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val acceptsSuccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsSuccess", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasCustomNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasCustomName", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAddEntityPacketHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAddEntityPacket", MethodType.methodType(Class.forName("net.minecraft.network.protocol.Packet"), Class.forName("net.minecraft.server.level.ServerEntity")))
        }
        val getPickResultHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPickResult", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val ignoreExplosionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "ignoreExplosion", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Explosion")))
        }
        val isSteppingCarefullyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSteppingCarefully", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isSuppressingBounceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSuppressingBounce", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canCollideWithBukkitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canCollideWithBukkit", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val isCustomNameVisibleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCustomNameVisible", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getVehicleAttachmentPointHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVehicleAttachmentPoint", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val shouldRenderAtSqrDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRenderAtSqrDistance", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val adjustSpawnLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "adjustSpawnLocation", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getLightProbePositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLightProbePosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val canBeHitByProjectileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBeHitByProjectile", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getControllingPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getControllingPassenger", MethodType.methodType(Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val getPassengerRidingPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengerRidingPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getNearestViewDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNearestViewDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getHandHoldingItemAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHandHoldingItemAngle", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.item.Item")))
        }
        val canChangeDimensionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canChangeDimensions", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.world.level.Level")))
        }
        val getSwimSplashSound0Handle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSwimSplashSound0", MethodType.methodType(Class.forName("net.minecraft.sounds.SoundEvent")))
        }
        val dismountsUnderwaterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dismountsUnderwater", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPreciseBodyRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPreciseBodyRotation", MethodType.methodType(Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val touchingUnloadedChunkHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "touchingUnloadedChunk", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFluidJumpThresholdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFluidJumpThreshold", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getPassengersAndSelfHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPassengersAndSelf", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val hasIndirectPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasIndirectPassenger", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getControlledVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getControlledVehicle", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getSelfAndPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelfAndPassengers", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getCommandSenderWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommandSenderWorld", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val createCommandSourceStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createCommandSourceStack", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val getRopeHoldPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRopeHoldPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val displayFireAnimationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "displayFireAnimation", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTicksRequiredToFreezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTicksRequiredToFreeze", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val hasControllingPassengerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasControllingPassenger", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBoundingBoxForCullingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBoundingBoxForCulling", MethodType.methodType(Class.forName("net.minecraft.world.phys.AABB")))
        }
        val countPlayerPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "countPlayerPassengers", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val skipAttackInteractionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "skipAttackInteraction", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val isIgnoringBlockTriggersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isIgnoringBlockTriggers", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getRelativePortalPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRelativePortalPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.core.Direction\$Axis"), Class.forName("net.minecraft.BlockUtil\$FoundRectangle")))
        }
        val getIndirectPassengersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIndirectPassengers", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getPistonPushReactionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPistonPushReaction", MethodType.methodType(Class.forName("net.minecraft.world.level.material.PushReaction")))
        }
        val isPassengerOfSameVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPassengerOfSameVehicle", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity")))
        }
        val calculateViewVectorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "calculateViewVector", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val `moonrise$isHardCollidingHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isHardColliding", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getChunkStatusHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getChunkStatus", MethodType.methodType(Class.forName("net.minecraft.server.level.FullChunkStatus")))
        }
        val canSpawnSprintParticleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canSpawnSprintParticle", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val `moonrise$getSectionYHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSectionY", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getTrackedEntityHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getTrackedEntity", MethodType.methodType(Class.forName("net.minecraft.server.level.ChunkMap\$TrackedEntity")))
        }
        val getDimensionChangingDelayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDimensionChangingDelay", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRemainingFireTicksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRemainingFireTicks", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getSectionXHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSectionX", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getDefaultMaxAirSupplyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultMaxAirSupply", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val `moonrise$getSectionZHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getSectionZ", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isInvulnerableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerable", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getBukkitEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitEntity", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.entity.CraftEntity")))
        }
        val causeFallDamageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "causeFallDamage", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val damageSourcesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "damageSources", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSources")))
        }
        val getPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!))
        }
        val getTagsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTags", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getYHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getY", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getXRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getXRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getXHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getX", MethodType.methodType(Double::class.javaPrimitiveType!!))
        }
        val getUUIDHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUUID", MethodType.methodType(Class.forName("java.util.UUID")))
        }
        val getZHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getZ", MethodType.methodType(Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!))
        }
        val getYRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val onGroundHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onGround", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isInWaterRainOrBubbleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInWaterRainOrBubble", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getYHeadRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getYHeadRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val getDeltaMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDeltaMovement", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val trackingPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "trackingPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val getVehicleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getVehicle", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val mirrorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mirror", MethodType.methodType(Float::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.block.Mirror")))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val isRemovedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRemoved", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val fireImmuneHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fireImmune", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val closerThanHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "closerThan", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Double::class.javaPrimitiveType!!))
        }
        val getRandomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRandom", MethodType.methodType(Class.forName("net.minecraft.util.RandomSource")))
        }
        val preserveMotionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("preserveMotion")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawnReasonSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawnReason")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val collisionLoadChunksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("collisionLoadChunks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bukkitEntitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bukkitEntity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val idSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("id")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blocksBuildingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blocksBuilding")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val passengersSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("passengers")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val boardingCooldownSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("boardingCooldown")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val vehicleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("vehicle")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val levelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("level")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xoSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xo")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yoSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yo")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val zoSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("zo")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val positionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("position")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val blockPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("blockPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val deltaMovementSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("deltaMovement")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xRotSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xRot")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yRotOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yRotO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xRotOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xRotO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bbSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bb")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val onGroundSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("onGround")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val horizontalCollisionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("horizontalCollision")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val verticalCollisionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("verticalCollision")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val verticalCollisionBelowSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("verticalCollisionBelow")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val minorHorizontalCollisionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("minorHorizontalCollision")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hurtMarkedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hurtMarked")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val stuckSpeedMultiplierSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("stuckSpeedMultiplier")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val removalReasonSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("removalReason")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val walkDistOSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("walkDistO")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val walkDistSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("walkDist")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val moveDistSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("moveDist")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val flyDistSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("flyDist")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fallDistanceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fallDistance")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val nextStepSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nextStep")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val xOldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("xOld")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val yOldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("yOld")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val zOldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("zOld")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val noPhysicsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("noPhysics")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val remainingFireTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("remainingFireTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasTouchingWaterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasTouchingWater")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fluidHeightSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fluidHeight")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasEyeInWaterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasEyeInWater")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val invulnerableTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("invulnerableTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val firstTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("firstTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val levelCallbackSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("levelCallback")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val noCullingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("noCulling")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasImpulseSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasImpulse")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val portalProcessSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("portalProcess")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val portalCooldownSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("portalCooldown")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val invulnerableSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("invulnerable")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val uuidSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("uuid")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val stringUUIDSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("stringUUID")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasGlowingTagSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasGlowingTag")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pistonDeltasGameTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pistonDeltasGameTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val dimensionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("dimensions")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val eyeHeightSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("eyeHeight")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isInPowderSnowSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isInPowderSnow")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasInPowderSnowSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasInPowderSnow")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wasOnFireSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wasOnFire")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val mainSupportingBlockPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("mainSupportingBlockPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val onGroundNoBlocksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("onGroundNoBlocks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val crystalSoundIntensitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("crystalSoundIntensity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastCrystalSoundPlayTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastCrystalSoundPlayTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasVisualFireSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasVisualFire")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inBlockStateSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inBlockState")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val forceDropsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("forceDrops")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val persistSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("persist")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val visibleByDefaultSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("visibleByDefault")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val validSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("valid")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val inWorldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("inWorld")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val generationSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("generation")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxAirTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxAirTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val projectileSourceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("projectileSource")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastDamageCancelledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastDamageCancelled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val persistentInvisibilitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("persistentInvisibility")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastLavaContactSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastLavaContact")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pluginRemovedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pluginRemoved")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val activatedTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("activatedTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val numCollisionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("numCollisions")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fromNetherPortalSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fromNetherPortal")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val activatedImmunityTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("activatedImmunityTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isTemporarilyActiveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isTemporarilyActive")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawnedViaMobSpawnerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawnedViaMobSpawner")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val originSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("origin")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val originWorldSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("originWorld")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val freezeLockedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("freezeLocked")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val fixedPoseSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("fixedPose")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkStatusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkStatus")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sectionXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sectionX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sectionYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sectionY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sectionZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sectionZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val updatingSectionStatusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("updatingSectionStatus")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val trackedEntitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("trackedEntity")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val moveVectorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("moveVector")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val moveStartXSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("moveStartX")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val moveStartYSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("moveStartY")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val moveStartZSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("moveStartZ")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: WrapperComponent
        get() = WrapperComponent(getNameHandle.invoke(handle))

    val position: WrapperVec3
        get() = WrapperVec3(positionHandle.invoke(handle))

    val alive: Boolean
        get() = isAliveHandle.invoke(handle) as Boolean

    val id: Int
        get() = getIdHandle.invoke(handle) as Int

    fun save(arg0: WrapperCompoundTag): Boolean {
        return saveHandle.invoke(handle, arg0.handle) as Boolean
    }

    val type: WrapperEntityType
        get() = WrapperEntityType(getTypeHandle.invoke(handle))

    fun getSlot(arg0: Int): WrapperSlotAccess {
        return WrapperSlotAccess(getSlotHandle.invoke(handle, arg0))
    }

    fun pick(arg0: Double, arg1: Float, arg2: Boolean): WrapperHitResult {
        return WrapperHitResult(pickHandle.invoke(handle, arg0, arg1, arg2))
    }

    fun `is`(arg0: WrapperEntity): Boolean {
        return isHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun rotate(arg0: Any): Float {
        return rotateHandle.invoke(handle, arg0) as Float
    }

    val level: WrapperLevel
        get() = WrapperLevel(levelHandle.invoke(handle))

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    fun isSupportedBy(arg0: WrapperBlockPos): Boolean {
        return isSupportedByHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun getDimensions(arg0: Any): WrapperEntityDimensions {
        return WrapperEntityDimensions(getDimensionsHandle.invoke(handle, arg0))
    }

    val entityData: WrapperSynchedEntityData
        get() = WrapperSynchedEntityData(getEntityDataHandle.invoke(handle))

    val bukkitEntityRaw: Any
        get() = getBukkitEntityRawHandle.invoke(handle) as Any

    fun getBoundingBoxAt(arg0: Double, arg1: Double, arg2: Double): WrapperAABB {
        return WrapperAABB(getBoundingBoxAtHandle.invoke(handle, arg0, arg1, arg2))
    }

    val scoreboardName: String
        get() = getScoreboardNameHandle.invoke(handle) as String

    fun getBukkitSender(arg0: WrapperCommandSourceStack): Any {
        return getBukkitSenderHandle.invoke(handle, arg0.handle) as Any
    }

    val bukkitYaw: Float
        get() = getBukkitYawHandle.invoke(handle) as Float

    val glowingTag: Boolean
        get() = hasGlowingTagHandle.invoke(handle) as Boolean

    val teamColor: Int
        get() = getTeamColorHandle.invoke(handle) as Int

    val positionCodec: WrapperVecDeltaCodec
        get() = WrapperVecDeltaCodec(getPositionCodecHandle.invoke(handle))

    val passenger: Boolean
        get() = isPassengerHandle.invoke(handle) as Boolean

    val chunkLoaded: Boolean
        get() = isChunkLoadedHandle.invoke(handle) as Boolean

    val originVector: Any
        get() = getOriginVectorHandle.invoke(handle) as Any

    val originWorld: Any
        get() = getOriginWorldHandle.invoke(handle) as Any

    val fireImmuneTicks: Int
        get() = getFireImmuneTicksHandle.invoke(handle) as Int

    val maxAirSupply: Int
        get() = getMaxAirSupplyHandle.invoke(handle) as Int

    fun isColliding(arg0: WrapperBlockPos, arg1: WrapperBlockState): Boolean {
        return isCollidingHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val eyePosition: WrapperVec3
        get() = WrapperVec3(getEyePositionHandle.invoke(handle))

    val spectator: Boolean
        get() = isSpectatorHandle.invoke(handle) as Boolean

    fun distanceToSqr(arg0: WrapperEntity): Double {
        return distanceToSqrHandle.invoke(handle, arg0.handle) as Double
    }

    fun mayInteract(arg0: WrapperLevel, arg1: WrapperBlockPos): Boolean {
        return mayInteractHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun canCollideWith(arg0: WrapperEntity): Boolean {
        return canCollideWithHandle.invoke(handle, arg0.handle) as Boolean
    }

    val canBeCollidedWith: Boolean
        get() = canBeCollidedWithHandle.invoke(handle) as Boolean

    val chunkPosition: WrapperChunkPos
        get() = WrapperChunkPos(chunkPositionHandle.invoke(handle))

    val blockPosition: WrapperBlockPos
        get() = WrapperBlockPos(blockPositionHandle.invoke(handle))

    val boundingBox: WrapperAABB
        get() = WrapperAABB(getBoundingBoxHandle.invoke(handle))

    fun startRiding(arg0: WrapperEntity): Boolean {
        return startRidingHandle.invoke(handle, arg0.handle) as Boolean
    }

    val onlyOpCanSetNbt: Boolean
        get() = onlyOpCanSetNbtHandle.invoke(handle) as Boolean

    val passengers: Any
        get() = getPassengersHandle.invoke(handle) as Any

    val direction: Any
        get() = getDirectionHandle.invoke(handle) as Any

    val shiftKeyDown: Boolean
        get() = isShiftKeyDownHandle.invoke(handle) as Boolean

    val team: WrapperPlayerTeam
        get() = WrapperPlayerTeam(getTeamHandle.invoke(handle))

    val vehicle: Boolean
        get() = isVehicleHandle.invoke(handle) as Boolean

    val onFire: Boolean
        get() = isOnFireHandle.invoke(handle) as Boolean

    fun hasPose(arg0: Any): Boolean {
        return hasPoseHandle.invoke(handle, arg0) as Boolean
    }

    val inLava: Boolean
        get() = isInLavaHandle.invoke(handle) as Boolean

    fun addTag(arg0: String): Boolean {
        return addTagHandle.invoke(handle, arg0) as Boolean
    }

    val pose: Any
        get() = getPoseHandle.invoke(handle) as Any

    val onPos: WrapperBlockPos
        get() = WrapperBlockPos(getOnPosHandle.invoke(handle))

    val onRails: Boolean
        get() = isOnRailsHandle.invoke(handle) as Boolean

    val maxUpStep: Float
        get() = maxUpStepHandle.invoke(handle) as Float

    fun isFree(arg0: Double, arg1: Double, arg2: Double): Boolean {
        return isFreeHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun removeTag(arg0: String): Boolean {
        return removeTagHandle.invoke(handle, arg0) as Boolean
    }

    val swimming: Boolean
        get() = isSwimmingHandle.invoke(handle) as Boolean

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val inWater: Boolean
        get() = isInWaterHandle.invoke(handle) as Boolean

    val eyeY: Double
        get() = getEyeYHandle.invoke(handle) as Double

    val blockZ: Int
        get() = getBlockZHandle.invoke(handle) as Int

    fun distanceTo(arg0: WrapperEntity): Float {
        return distanceToHandle.invoke(handle, arg0.handle) as Float
    }

    val blockX: Int
        get() = getBlockXHandle.invoke(handle) as Int

    val inWall: Boolean
        get() = isInWallHandle.invoke(handle) as Boolean

    fun interact(arg0: WrapperPlayer, arg1: Any): Any {
        return interactHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    val pickable: Boolean
        get() = isPickableHandle.invoke(handle) as Boolean

    val pushable: Boolean
        get() = isPushableHandle.invoke(handle) as Boolean

    val inRain: Boolean
        get() = isInRainHandle.invoke(handle) as Boolean

    val silent: Boolean
        get() = isSilentHandle.invoke(handle) as Boolean

    val gravity: Double
        get() = getGravityHandle.invoke(handle) as Double

    val inLiquid: Boolean
        get() = isInLiquidHandle.invoke(handle) as Boolean

    val bbWidth: Float
        get() = getBbWidthHandle.invoke(handle) as Float

    val forward: WrapperVec3
        get() = WrapperVec3(getForwardHandle.invoke(handle))

    fun isAlliedTo(arg0: WrapperTeam): Boolean {
        return isAlliedToHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun interactAt(arg0: WrapperPlayer, arg1: WrapperVec3, arg2: Any): Any {
        return interactAtHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Any
    }

    fun deflection(arg0: WrapperProjectile): Any {
        return deflectionHandle.invoke(handle, arg0.handle) as Any
    }

    val discrete: Boolean
        get() = isDiscreteHandle.invoke(handle) as Boolean

    fun getRandomX(arg0: Double): Double {
        return getRandomXHandle.invoke(handle, arg0) as Double
    }

    fun teleportTo(arg0: WrapperServerLevel, arg1: Double, arg2: Double, arg3: Double, arg4: Any, arg5: Float, arg6: Float, arg7: Any): Boolean {
        return teleportToHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as Boolean
    }

    fun getRandomZ(arg0: Double): Double {
        return getRandomZHandle.invoke(handle, arg0) as Double
    }

    val canFreeze: Boolean
        get() = canFreezeHandle.invoke(handle) as Boolean

    val canSprint: Boolean
        get() = canSprintHandle.invoke(handle) as Boolean

    val blockY: Int
        get() = getBlockYHandle.invoke(handle) as Int

    val randomY: Double
        get() = getRandomYHandle.invoke(handle) as Double

    val ticking: Boolean
        get() = isTickingHandle.invoke(handle) as Boolean

    val freezing: Boolean
        get() = isFreezingHandle.invoke(handle) as Boolean

    val lightLevelDependentMagicValue: Float
        get() = getLightLevelDependentMagicValueHandle.invoke(handle) as Float

    val `moonrise$isUpdatingSectionStatus`: Boolean
        get() = `moonrise$isUpdatingSectionStatusHandle`.invoke(handle) as Boolean

    val `moonrise$hasAnyPlayerPassengers`: Boolean
        get() = `moonrise$hasAnyPlayerPassengersHandle`.invoke(handle) as Boolean

    val exactlyOnePlayerPassenger: Boolean
        get() = hasExactlyOnePlayerPassengerHandle.invoke(handle) as Boolean

    val swimHighSpeedSplashSound0: WrapperSoundEvent
        get() = WrapperSoundEvent(getSwimHighSpeedSplashSound0Handle.invoke(handle))

    fun getBlockExplosionResistance(arg0: WrapperExplosion, arg1: WrapperBlockGetter, arg2: WrapperBlockPos, arg3: WrapperBlockState, arg4: WrapperFluidState, arg5: Float): Float {
        return getBlockExplosionResistanceHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4.handle, arg5) as Float
    }

    fun fudgePositionAfterSizeChange(arg0: WrapperEntityDimensions): Boolean {
        return fudgePositionAfterSizeChangeHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun updateFluidHeightAndDoFluidPushing(arg0: WrapperTagKey, arg1: Double): Boolean {
        return updateFluidHeightAndDoFluidPushingHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val controlledByLocalInstance: Boolean
        get() = isControlledByLocalInstanceHandle.invoke(handle) as Boolean

    fun getDismountLocationForPassenger(arg0: WrapperLivingEntity): WrapperVec3 {
        return WrapperVec3(getDismountLocationForPassengerHandle.invoke(handle, arg0.handle))
    }

    val visualRotationYInDegrees: Float
        get() = getVisualRotationYInDegreesHandle.invoke(handle) as Float

    val blockPosBelowThatAffectsMyMovement: WrapperBlockPos
        get() = WrapperBlockPos(getBlockPosBelowThatAffectsMyMovementHandle.invoke(handle))

    val moveStartZ: Double
        get() = getMoveStartZHandle.invoke(handle) as Double

    val moveStartY: Double
        get() = getMoveStartYHandle.invoke(handle) as Double

    val crouching: Boolean
        get() = isCrouchingHandle.invoke(handle) as Boolean

    val moveVector: WrapperVec3
        get() = WrapperVec3(getMoveVectorHandle.invoke(handle))

    val portalCooldown: Int
        get() = getPortalCooldownHandle.invoke(handle) as Int

    val moveStartX: Double
        get() = getMoveStartXHandle.invoke(handle) as Double

    val ticksFrozen: Int
        get() = getTicksFrozenHandle.invoke(handle) as Int

    val onPortalCooldown: Boolean
        get() = isOnPortalCooldownHandle.invoke(handle) as Boolean

    val onPosLegacy: WrapperBlockPos
        get() = WrapperBlockPos(getOnPosLegacyHandle.invoke(handle))

    val swimSound0: WrapperSoundEvent
        get() = WrapperSoundEvent(getSwimSound0Handle.invoke(handle))

    fun saveWithoutId(arg0: WrapperCompoundTag): WrapperCompoundTag {
        return WrapperCompoundTag(saveWithoutIdHandle.invoke(handle, arg0.handle))
    }

    val airSupply: Int
        get() = getAirSupplyHandle.invoke(handle) as Int

    val inBlockState: WrapperBlockState
        get() = WrapperBlockState(getInBlockStateHandle.invoke(handle))

    val soundSource: Any
        get() = getSoundSourceHandle.invoke(handle) as Any

    val noGravity: Boolean
        get() = isNoGravityHandle.invoke(handle) as Boolean

    val blockStateOn: WrapperBlockState
        get() = WrapperBlockState(getBlockStateOnHandle.invoke(handle))

    fun getUpVector(arg0: Float): WrapperVec3 {
        return WrapperVec3(getUpVectorHandle.invoke(handle, arg0))
    }

    fun saveAsPassenger(arg0: WrapperCompoundTag, arg1: Boolean): Boolean {
        return saveAsPassengerHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun getViewVector(arg0: Float): WrapperVec3 {
        return WrapperVec3(getViewVectorHandle.invoke(handle, arg0))
    }

    val inWaterOrRain: Boolean
        get() = isInWaterOrRainHandle.invoke(handle) as Boolean

    fun getViewYRot(arg0: Float): Float {
        return getViewYRotHandle.invoke(handle, arg0) as Float
    }

    fun shouldRender(arg0: Double, arg1: Double, arg2: Double): Boolean {
        return shouldRenderHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun isCollidable(arg0: Boolean): Boolean {
        return isCollidableHandle.invoke(handle, arg0) as Boolean
    }

    fun serializeEntity(arg0: WrapperCompoundTag): Boolean {
        return serializeEntityHandle.invoke(handle, arg0.handle) as Boolean
    }

    val customName: WrapperComponent
        get() = WrapperComponent(getCustomNameHandle.invoke(handle))

    fun getViewXRot(arg0: Float): Float {
        return getViewXRotHandle.invoke(handle, arg0) as Float
    }

    val sprinting: Boolean
        get() = isSprintingHandle.invoke(handle) as Boolean

    fun isInvulnerableTo(arg0: WrapperDamageSource): Boolean {
        return isInvulnerableToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val eyeHeight: Float
        get() = getEyeHeightHandle.invoke(handle) as Float

    fun isEyeInFluid(arg0: WrapperTagKey): Boolean {
        return isEyeInFluidHandle.invoke(handle, arg0.handle) as Boolean
    }

    val inBubbleColumn: Boolean
        get() = isInBubbleColumnHandle.invoke(handle) as Boolean

    val inWaterOrBubble: Boolean
        get() = isInWaterOrBubbleHandle.invoke(handle) as Boolean

    val underWater: Boolean
        get() = isUnderWaterHandle.invoke(handle) as Boolean

    val dampensVibrations: Boolean
        get() = dampensVibrationsHandle.invoke(handle) as Boolean

    val encodeId: String
        get() = getEncodeIdHandle.invoke(handle) as String

    fun hasPassenger(arg0: WrapperEntity): Boolean {
        return hasPassengerHandle.invoke(handle, arg0.handle) as Boolean
    }

    val showVehicleHealth: Boolean
        get() = showVehicleHealthHandle.invoke(handle) as Boolean

    val lerpTargetX: Double
        get() = lerpTargetXHandle.invoke(handle) as Double

    val attachments: WrapperEntityAttachments
        get() = WrapperEntityAttachments(getAttachmentsHandle.invoke(handle))

    val lerpTargetZ: Double
        get() = lerpTargetZHandle.invoke(handle) as Double

    val lerpTargetYRot: Float
        get() = lerpTargetYRotHandle.invoke(handle) as Float

    val lerpTargetXRot: Float
        get() = lerpTargetXRotHandle.invoke(handle) as Float

    val lookAngle: WrapperVec3
        get() = WrapperVec3(getLookAngleHandle.invoke(handle))

    val pickRadius: Float
        get() = getPickRadiusHandle.invoke(handle) as Float

    val lerpTargetY: Double
        get() = lerpTargetYHandle.invoke(handle) as Double

    val firstPassenger: WrapperEntity
        get() = WrapperEntity(getFirstPassengerHandle.invoke(handle))

    val rotationVector: WrapperVec2
        get() = WrapperVec2(getRotationVectorHandle.invoke(handle))

    fun spawnAtLocation(arg0: WrapperItemStack): WrapperItemEntity {
        return WrapperItemEntity(spawnAtLocationHandle.invoke(handle, arg0.handle))
    }

    fun getSharedFlag(arg0: Int): Boolean {
        return getSharedFlagHandle.invoke(handle, arg0) as Boolean
    }

    val canControlVehicle: Boolean
        get() = canControlVehicleHandle.invoke(handle) as Boolean

    val invisible: Boolean
        get() = isInvisibleHandle.invoke(handle) as Boolean

    fun changeDimension(arg0: WrapperDimensionTransition): WrapperEntity {
        return WrapperEntity(changeDimensionHandle.invoke(handle, arg0.handle))
    }

    val fullyFrozen: Boolean
        get() = isFullyFrozenHandle.invoke(handle) as Boolean

    val currentlyGlowing: Boolean
        get() = isCurrentlyGlowingHandle.invoke(handle) as Boolean

    val visuallyCrawling: Boolean
        get() = isVisuallyCrawlingHandle.invoke(handle) as Boolean

    val percentFrozen: Float
        get() = getPercentFrozenHandle.invoke(handle) as Float

    fun callPortalEvent(arg0: WrapperEntity, arg1: Any, arg2: Any, arg3: Int, arg4: Int): Any {
        return callPortalEventHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4) as Any
    }

    fun shouldBlockExplode(arg0: WrapperExplosion, arg1: WrapperBlockGetter, arg2: WrapperBlockPos, arg3: WrapperBlockState, arg4: Float): Boolean {
        return shouldBlockExplodeHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3.handle, arg4) as Boolean
    }

    val attackable: Boolean
        get() = isAttackableHandle.invoke(handle) as Boolean

    val stringUUID: String
        get() = getStringUUIDHandle.invoke(handle) as String

    val pushedByFluid: Boolean
        get() = isPushedByFluidHandle.invoke(handle) as Boolean

    fun canUsePortal(arg0: Boolean): Boolean {
        return canUsePortalHandle.invoke(handle, arg0) as Boolean
    }

    fun killedEntity(arg0: WrapperServerLevel, arg1: WrapperLivingEntity): Boolean {
        return killedEntityHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    fun isInvisibleTo(arg0: WrapperPlayer): Boolean {
        return isInvisibleToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val maxFallDistance: Int
        get() = getMaxFallDistanceHandle.invoke(handle) as Int

    val visuallySwimming: Boolean
        get() = isVisuallySwimmingHandle.invoke(handle) as Boolean

    val descending: Boolean
        get() = isDescendingHandle.invoke(handle) as Boolean

    val bbHeight: Float
        get() = getBbHeightHandle.invoke(handle) as Float

    fun hasPermissions(arg0: Int): Boolean {
        return hasPermissionsHandle.invoke(handle, arg0) as Boolean
    }

    val alwaysTicking: Boolean
        get() = isAlwaysTickingHandle.invoke(handle) as Boolean

    val knownMovement: WrapperVec3
        get() = WrapperVec3(getKnownMovementHandle.invoke(handle))

    val weaponItem: WrapperItemStack
        get() = WrapperItemStack(getWeaponItemHandle.invoke(handle))

    val shouldShowName: Boolean
        get() = shouldShowNameHandle.invoke(handle) as Boolean

    val motionDirection: Any
        get() = getMotionDirectionHandle.invoke(handle) as Any

    fun broadcastToPlayer(arg0: WrapperServerPlayer): Boolean {
        return broadcastToPlayerHandle.invoke(handle, arg0.handle) as Boolean
    }

    val acceptsFailure: Boolean
        get() = acceptsFailureHandle.invoke(handle) as Boolean

    fun getFluidHeight(arg0: WrapperTagKey): Double {
        return getFluidHeightHandle.invoke(handle, arg0.handle) as Double
    }

    fun getLeashOffset(arg0: Float): WrapperVec3 {
        return WrapperVec3(getLeashOffsetHandle.invoke(handle, arg0))
    }

    val rootVehicle: WrapperEntity
        get() = WrapperEntity(getRootVehicleHandle.invoke(handle))

    val removalReason: Any
        get() = getRemovalReasonHandle.invoke(handle) as Any

    val effectiveAi: Boolean
        get() = isEffectiveAiHandle.invoke(handle) as Boolean

    val shouldInformAdmins: Boolean
        get() = shouldInformAdminsHandle.invoke(handle) as Boolean

    val shouldBeSaved: Boolean
        get() = shouldBeSavedHandle.invoke(handle) as Boolean

    val acceptsSuccess: Boolean
        get() = acceptsSuccessHandle.invoke(handle) as Boolean

    val hasCustomName: Boolean
        get() = hasCustomNameHandle.invoke(handle) as Boolean

    fun getAddEntityPacket(arg0: WrapperServerEntity): WrapperPacket {
        return WrapperPacket(getAddEntityPacketHandle.invoke(handle, arg0.handle))
    }

    val pickResult: WrapperItemStack
        get() = WrapperItemStack(getPickResultHandle.invoke(handle))

    fun ignoreExplosion(arg0: WrapperExplosion): Boolean {
        return ignoreExplosionHandle.invoke(handle, arg0.handle) as Boolean
    }

    val steppingCarefully: Boolean
        get() = isSteppingCarefullyHandle.invoke(handle) as Boolean

    val suppressingBounce: Boolean
        get() = isSuppressingBounceHandle.invoke(handle) as Boolean

    fun canCollideWithBukkit(arg0: WrapperEntity): Boolean {
        return canCollideWithBukkitHandle.invoke(handle, arg0.handle) as Boolean
    }

    val customNameVisible: Boolean
        get() = isCustomNameVisibleHandle.invoke(handle) as Boolean

    fun getVehicleAttachmentPoint(arg0: WrapperEntity): WrapperVec3 {
        return WrapperVec3(getVehicleAttachmentPointHandle.invoke(handle, arg0.handle))
    }

    fun shouldRenderAtSqrDistance(arg0: Double): Boolean {
        return shouldRenderAtSqrDistanceHandle.invoke(handle, arg0) as Boolean
    }

    fun adjustSpawnLocation(arg0: WrapperServerLevel, arg1: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(adjustSpawnLocationHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun getLightProbePosition(arg0: Float): WrapperVec3 {
        return WrapperVec3(getLightProbePositionHandle.invoke(handle, arg0))
    }

    val canBeHitByProjectile: Boolean
        get() = canBeHitByProjectileHandle.invoke(handle) as Boolean

    val controllingPassenger: WrapperLivingEntity
        get() = WrapperLivingEntity(getControllingPassengerHandle.invoke(handle))

    fun getPassengerRidingPosition(arg0: WrapperEntity): WrapperVec3 {
        return WrapperVec3(getPassengerRidingPositionHandle.invoke(handle, arg0.handle))
    }

    val nearestViewDirection: Any
        get() = getNearestViewDirectionHandle.invoke(handle) as Any

    fun getHandHoldingItemAngle(arg0: WrapperItem): WrapperVec3 {
        return WrapperVec3(getHandHoldingItemAngleHandle.invoke(handle, arg0.handle))
    }

    fun canChangeDimensions(arg0: WrapperLevel, arg1: WrapperLevel): Boolean {
        return canChangeDimensionsHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val swimSplashSound0: WrapperSoundEvent
        get() = WrapperSoundEvent(getSwimSplashSound0Handle.invoke(handle))

    val dismountsUnderwater: Boolean
        get() = dismountsUnderwaterHandle.invoke(handle) as Boolean

    fun getPreciseBodyRotation(arg0: Float): Float {
        return getPreciseBodyRotationHandle.invoke(handle, arg0) as Float
    }

    val touchingUnloadedChunk: Boolean
        get() = touchingUnloadedChunkHandle.invoke(handle) as Boolean

    val fluidJumpThreshold: Double
        get() = getFluidJumpThresholdHandle.invoke(handle) as Double

    val passengersAndSelf: Any
        get() = getPassengersAndSelfHandle.invoke(handle) as Any

    fun hasIndirectPassenger(arg0: WrapperEntity): Boolean {
        return hasIndirectPassengerHandle.invoke(handle, arg0.handle) as Boolean
    }

    val controlledVehicle: WrapperEntity
        get() = WrapperEntity(getControlledVehicleHandle.invoke(handle))

    val selfAndPassengers: Any
        get() = getSelfAndPassengersHandle.invoke(handle) as Any

    val commandSenderWorld: WrapperLevel
        get() = WrapperLevel(getCommandSenderWorldHandle.invoke(handle))

    val createCommandSourceStack: WrapperCommandSourceStack
        get() = WrapperCommandSourceStack(createCommandSourceStackHandle.invoke(handle))

    fun getRopeHoldPosition(arg0: Float): WrapperVec3 {
        return WrapperVec3(getRopeHoldPositionHandle.invoke(handle, arg0))
    }

    val displayFireAnimation: Boolean
        get() = displayFireAnimationHandle.invoke(handle) as Boolean

    val ticksRequiredToFreeze: Int
        get() = getTicksRequiredToFreezeHandle.invoke(handle) as Int

    val hasControllingPassenger: Boolean
        get() = hasControllingPassengerHandle.invoke(handle) as Boolean

    val boundingBoxForCulling: WrapperAABB
        get() = WrapperAABB(getBoundingBoxForCullingHandle.invoke(handle))

    val countPlayerPassengers: Int
        get() = countPlayerPassengersHandle.invoke(handle) as Int

    fun skipAttackInteraction(arg0: WrapperEntity): Boolean {
        return skipAttackInteractionHandle.invoke(handle, arg0.handle) as Boolean
    }

    val ignoringBlockTriggers: Boolean
        get() = isIgnoringBlockTriggersHandle.invoke(handle) as Boolean

    fun getRelativePortalPosition(arg0: Any, arg1: WrapperFoundRectangle): WrapperVec3 {
        return WrapperVec3(getRelativePortalPositionHandle.invoke(handle, arg0, arg1.handle))
    }

    val indirectPassengers: Any
        get() = getIndirectPassengersHandle.invoke(handle) as Any

    val pistonPushReaction: Any
        get() = getPistonPushReactionHandle.invoke(handle) as Any

    fun isPassengerOfSameVehicle(arg0: WrapperEntity): Boolean {
        return isPassengerOfSameVehicleHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun calculateViewVector(arg0: Float, arg1: Float): WrapperVec3 {
        return WrapperVec3(calculateViewVectorHandle.invoke(handle, arg0, arg1))
    }

    val `moonrise$isHardColliding`: Boolean
        get() = `moonrise$isHardCollidingHandle`.invoke(handle) as Boolean

    val `moonrise$getChunkStatus`: Any
        get() = `moonrise$getChunkStatusHandle`.invoke(handle) as Any

    val canSpawnSprintParticle: Boolean
        get() = canSpawnSprintParticleHandle.invoke(handle) as Boolean

    val `moonrise$getSectionY`: Int
        get() = `moonrise$getSectionYHandle`.invoke(handle) as Int

    val `moonrise$getTrackedEntity`: WrapperTrackedEntity
        get() = WrapperTrackedEntity(`moonrise$getTrackedEntityHandle`.invoke(handle))

    val dimensionChangingDelay: Int
        get() = getDimensionChangingDelayHandle.invoke(handle) as Int

    val remainingFireTicks: Int
        get() = getRemainingFireTicksHandle.invoke(handle) as Int

    val `moonrise$getSectionX`: Int
        get() = `moonrise$getSectionXHandle`.invoke(handle) as Int

    val defaultMaxAirSupply: Int
        get() = getDefaultMaxAirSupplyHandle.invoke(handle) as Int

    val `moonrise$getSectionZ`: Int
        get() = `moonrise$getSectionZHandle`.invoke(handle) as Int

    val invulnerable: Boolean
        get() = isInvulnerableHandle.invoke(handle) as Boolean

    val bukkitEntity: Any
        get() = getBukkitEntityHandle.invoke(handle) as Any

    fun causeFallDamage(arg0: Float, arg1: Float, arg2: WrapperDamageSource): Boolean {
        return causeFallDamageHandle.invoke(handle, arg0, arg1, arg2.handle) as Boolean
    }

    val damageSources: WrapperDamageSources
        get() = WrapperDamageSources(damageSourcesHandle.invoke(handle))

    fun getPosition(arg0: Float): WrapperVec3 {
        return WrapperVec3(getPositionHandle.invoke(handle, arg0))
    }

    val tags: Any
        get() = getTagsHandle.invoke(handle) as Any

    val y: Double
        get() = getYHandle.invoke(handle) as Double

    val xRot: Float
        get() = getXRotHandle.invoke(handle) as Float

    val x: Double
        get() = getXHandle.invoke(handle) as Double

    val uUID: Any
        get() = getUUIDHandle.invoke(handle) as Any

    fun getZ(arg0: Double): Double {
        return getZHandle.invoke(handle, arg0) as Double
    }

    val yRot: Float
        get() = getYRotHandle.invoke(handle) as Float

    val onGround: Boolean
        get() = onGroundHandle.invoke(handle) as Boolean

    val inWaterRainOrBubble: Boolean
        get() = isInWaterRainOrBubbleHandle.invoke(handle) as Boolean

    val yHeadRot: Float
        get() = getYHeadRotHandle.invoke(handle) as Float

    val deltaMovement: WrapperVec3
        get() = WrapperVec3(getDeltaMovementHandle.invoke(handle))

    val trackingPosition: WrapperVec3
        get() = WrapperVec3(trackingPositionHandle.invoke(handle))

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    val getVehicle: WrapperEntity
        get() = WrapperEntity(getVehicleHandle.invoke(handle))

    fun mirror(arg0: Any): Float {
        return mirrorHandle.invoke(handle, arg0) as Float
    }

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    val removed: Boolean
        get() = isRemovedHandle.invoke(handle) as Boolean

    val fireImmune: Boolean
        get() = fireImmuneHandle.invoke(handle) as Boolean

    fun closerThan(arg0: WrapperEntity, arg1: Double): Boolean {
        return closerThanHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val random: WrapperRandomSource
        get() = WrapperRandomSource(getRandomHandle.invoke(handle))

    fun setPreserveMotion(value: Boolean) {
        preserveMotionSetterHandle.invoke(handle, value)
    }

    fun setSpawnReason(value: Any) {
        spawnReasonSetterHandle.invoke(handle, value)
    }

    fun setCollisionLoadChunks(value: Boolean) {
        collisionLoadChunksSetterHandle.invoke(handle, value)
    }

    fun setBukkitEntity(value: Any) {
        bukkitEntitySetterHandle.invoke(handle, value)
    }

    fun setId(value: Int) {
        idSetterHandle.invoke(handle, value)
    }

    fun setBlocksBuilding(value: Boolean) {
        blocksBuildingSetterHandle.invoke(handle, value)
    }

    fun setPassengers(value: Any) {
        passengersSetterHandle.invoke(handle, value)
    }

    fun setBoardingCooldown(value: Int) {
        boardingCooldownSetterHandle.invoke(handle, value)
    }

    fun setVehicle(value: WrapperEntity) {
        vehicleSetterHandle.invoke(handle, value.handle)
    }

    fun setLevel(value: WrapperLevel) {
        levelSetterHandle.invoke(handle, value.handle)
    }

    fun setXo(value: Double) {
        xoSetterHandle.invoke(handle, value)
    }

    fun setYo(value: Double) {
        yoSetterHandle.invoke(handle, value)
    }

    fun setZo(value: Double) {
        zoSetterHandle.invoke(handle, value)
    }

    fun setPosition(value: WrapperVec3) {
        positionSetterHandle.invoke(handle, value.handle)
    }

    fun setBlockPosition(value: WrapperBlockPos) {
        blockPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setChunkPosition(value: WrapperChunkPos) {
        chunkPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setDeltaMovement(value: WrapperVec3) {
        deltaMovementSetterHandle.invoke(handle, value.handle)
    }

    fun setYRot(value: Float) {
        yRotSetterHandle.invoke(handle, value)
    }

    fun setXRot(value: Float) {
        xRotSetterHandle.invoke(handle, value)
    }

    fun setYRotO(value: Float) {
        yRotOSetterHandle.invoke(handle, value)
    }

    fun setXRotO(value: Float) {
        xRotOSetterHandle.invoke(handle, value)
    }

    fun setBb(value: WrapperAABB) {
        bbSetterHandle.invoke(handle, value.handle)
    }

    fun setOnGround(value: Boolean) {
        onGroundSetterHandle.invoke(handle, value)
    }

    fun setHorizontalCollision(value: Boolean) {
        horizontalCollisionSetterHandle.invoke(handle, value)
    }

    fun setVerticalCollision(value: Boolean) {
        verticalCollisionSetterHandle.invoke(handle, value)
    }

    fun setVerticalCollisionBelow(value: Boolean) {
        verticalCollisionBelowSetterHandle.invoke(handle, value)
    }

    fun setMinorHorizontalCollision(value: Boolean) {
        minorHorizontalCollisionSetterHandle.invoke(handle, value)
    }

    fun setHurtMarked(value: Boolean) {
        hurtMarkedSetterHandle.invoke(handle, value)
    }

    fun setStuckSpeedMultiplier(value: WrapperVec3) {
        stuckSpeedMultiplierSetterHandle.invoke(handle, value.handle)
    }

    fun setRemovalReason(value: Any) {
        removalReasonSetterHandle.invoke(handle, value)
    }

    fun setWalkDistO(value: Float) {
        walkDistOSetterHandle.invoke(handle, value)
    }

    fun setWalkDist(value: Float) {
        walkDistSetterHandle.invoke(handle, value)
    }

    fun setMoveDist(value: Float) {
        moveDistSetterHandle.invoke(handle, value)
    }

    fun setFlyDist(value: Float) {
        flyDistSetterHandle.invoke(handle, value)
    }

    fun setFallDistance(value: Float) {
        fallDistanceSetterHandle.invoke(handle, value)
    }

    fun setNextStep(value: Float) {
        nextStepSetterHandle.invoke(handle, value)
    }

    fun setXOld(value: Double) {
        xOldSetterHandle.invoke(handle, value)
    }

    fun setYOld(value: Double) {
        yOldSetterHandle.invoke(handle, value)
    }

    fun setZOld(value: Double) {
        zOldSetterHandle.invoke(handle, value)
    }

    fun setNoPhysics(value: Boolean) {
        noPhysicsSetterHandle.invoke(handle, value)
    }

    fun setTickCount(value: Int) {
        tickCountSetterHandle.invoke(handle, value)
    }

    fun setRemainingFireTicks(value: Int) {
        remainingFireTicksSetterHandle.invoke(handle, value)
    }

    fun setWasTouchingWater(value: Boolean) {
        wasTouchingWaterSetterHandle.invoke(handle, value)
    }

    fun setFluidHeight(value: Any) {
        fluidHeightSetterHandle.invoke(handle, value)
    }

    fun setWasEyeInWater(value: Boolean) {
        wasEyeInWaterSetterHandle.invoke(handle, value)
    }

    fun setInvulnerableTime(value: Int) {
        invulnerableTimeSetterHandle.invoke(handle, value)
    }

    fun setFirstTick(value: Boolean) {
        firstTickSetterHandle.invoke(handle, value)
    }

    fun setLevelCallback(value: Any) {
        levelCallbackSetterHandle.invoke(handle, value)
    }

    fun setNoCulling(value: Boolean) {
        noCullingSetterHandle.invoke(handle, value)
    }

    fun setHasImpulse(value: Boolean) {
        hasImpulseSetterHandle.invoke(handle, value)
    }

    fun setPortalProcess(value: Any) {
        portalProcessSetterHandle.invoke(handle, value)
    }

    fun setPortalCooldown(value: Int) {
        portalCooldownSetterHandle.invoke(handle, value)
    }

    fun setInvulnerable(value: Boolean) {
        invulnerableSetterHandle.invoke(handle, value)
    }

    fun setUuid(value: Any) {
        uuidSetterHandle.invoke(handle, value)
    }

    fun setStringUUID(value: String) {
        stringUUIDSetterHandle.invoke(handle, value)
    }

    fun setHasGlowingTag(value: Boolean) {
        hasGlowingTagSetterHandle.invoke(handle, value)
    }

    fun setPistonDeltasGameTime(value: Long) {
        pistonDeltasGameTimeSetterHandle.invoke(handle, value)
    }

    fun setDimensions(value: WrapperEntityDimensions) {
        dimensionsSetterHandle.invoke(handle, value.handle)
    }

    fun setEyeHeight(value: Float) {
        eyeHeightSetterHandle.invoke(handle, value)
    }

    fun setIsInPowderSnow(value: Boolean) {
        isInPowderSnowSetterHandle.invoke(handle, value)
    }

    fun setWasInPowderSnow(value: Boolean) {
        wasInPowderSnowSetterHandle.invoke(handle, value)
    }

    fun setWasOnFire(value: Boolean) {
        wasOnFireSetterHandle.invoke(handle, value)
    }

    fun setMainSupportingBlockPos(value: Any) {
        mainSupportingBlockPosSetterHandle.invoke(handle, value)
    }

    fun setOnGroundNoBlocks(value: Boolean) {
        onGroundNoBlocksSetterHandle.invoke(handle, value)
    }

    fun setCrystalSoundIntensity(value: Float) {
        crystalSoundIntensitySetterHandle.invoke(handle, value)
    }

    fun setLastCrystalSoundPlayTick(value: Int) {
        lastCrystalSoundPlayTickSetterHandle.invoke(handle, value)
    }

    fun setHasVisualFire(value: Boolean) {
        hasVisualFireSetterHandle.invoke(handle, value)
    }

    fun setInBlockState(value: WrapperBlockState) {
        inBlockStateSetterHandle.invoke(handle, value.handle)
    }

    fun setForceDrops(value: Boolean) {
        forceDropsSetterHandle.invoke(handle, value)
    }

    fun setPersist(value: Boolean) {
        persistSetterHandle.invoke(handle, value)
    }

    fun setVisibleByDefault(value: Boolean) {
        visibleByDefaultSetterHandle.invoke(handle, value)
    }

    fun setValid(value: Boolean) {
        validSetterHandle.invoke(handle, value)
    }

    fun setInWorld(value: Boolean) {
        inWorldSetterHandle.invoke(handle, value)
    }

    fun setGeneration(value: Boolean) {
        generationSetterHandle.invoke(handle, value)
    }

    fun setMaxAirTicks(value: Int) {
        maxAirTicksSetterHandle.invoke(handle, value)
    }

    fun setProjectileSource(value: Any) {
        projectileSourceSetterHandle.invoke(handle, value)
    }

    fun setLastDamageCancelled(value: Boolean) {
        lastDamageCancelledSetterHandle.invoke(handle, value)
    }

    fun setPersistentInvisibility(value: Boolean) {
        persistentInvisibilitySetterHandle.invoke(handle, value)
    }

    fun setLastLavaContact(value: WrapperBlockPos) {
        lastLavaContactSetterHandle.invoke(handle, value.handle)
    }

    fun setPluginRemoved(value: Boolean) {
        pluginRemovedSetterHandle.invoke(handle, value)
    }

    fun setActivatedTick(value: Long) {
        activatedTickSetterHandle.invoke(handle, value)
    }

    fun setNumCollisions(value: Int) {
        numCollisionsSetterHandle.invoke(handle, value)
    }

    fun setFromNetherPortal(value: Boolean) {
        fromNetherPortalSetterHandle.invoke(handle, value)
    }

    fun setActivatedImmunityTick(value: Long) {
        activatedImmunityTickSetterHandle.invoke(handle, value)
    }

    fun setIsTemporarilyActive(value: Boolean) {
        isTemporarilyActiveSetterHandle.invoke(handle, value)
    }

    fun setSpawnedViaMobSpawner(value: Boolean) {
        spawnedViaMobSpawnerSetterHandle.invoke(handle, value)
    }

    fun setOrigin(value: Any) {
        originSetterHandle.invoke(handle, value)
    }

    fun setOriginWorld(value: Any) {
        originWorldSetterHandle.invoke(handle, value)
    }

    fun setFreezeLocked(value: Boolean) {
        freezeLockedSetterHandle.invoke(handle, value)
    }

    fun setFixedPose(value: Boolean) {
        fixedPoseSetterHandle.invoke(handle, value)
    }

    fun setChunkStatus(value: Any) {
        chunkStatusSetterHandle.invoke(handle, value)
    }

    fun setSectionX(value: Int) {
        sectionXSetterHandle.invoke(handle, value)
    }

    fun setSectionY(value: Int) {
        sectionYSetterHandle.invoke(handle, value)
    }

    fun setSectionZ(value: Int) {
        sectionZSetterHandle.invoke(handle, value)
    }

    fun setUpdatingSectionStatus(value: Boolean) {
        updatingSectionStatusSetterHandle.invoke(handle, value)
    }

    fun setTrackedEntity(value: WrapperTrackedEntity) {
        trackedEntitySetterHandle.invoke(handle, value.handle)
    }

    fun setMoveVector(value: WrapperVec3) {
        moveVectorSetterHandle.invoke(handle, value.handle)
    }

    fun setMoveStartX(value: Double) {
        moveStartXSetterHandle.invoke(handle, value)
    }

    fun setMoveStartY(value: Double) {
        moveStartYSetterHandle.invoke(handle, value)
    }

    fun setMoveStartZ(value: Double) {
        moveStartZSetterHandle.invoke(handle, value)
    }

}
