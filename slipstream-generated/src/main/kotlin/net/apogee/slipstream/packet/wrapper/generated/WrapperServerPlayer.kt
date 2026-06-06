package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerPlayer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.level.ServerPlayer") }
        private val lookup = MethodHandles.lookup()

        val isSpectatorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSpectator", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val allowsListingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "allowsListing", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isImmobileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isImmobile", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCameraHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCamera", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val openMenuHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "openMenu", MethodType.methodType(Class.forName("java.util.OptionalInt"), Class.forName("net.minecraft.world.MenuProvider")))
        }
        val getStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStats", MethodType.methodType(Class.forName("net.minecraft.stats.ServerStatsCounter")))
        }
        val getIpAddressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIpAddress", MethodType.methodType(String::class.java))
        }
        val getRecipeBookHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeBook", MethodType.methodType(Class.forName("net.minecraft.stats.ServerRecipeBook")))
        }
        val hasDisconnectedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasDisconnected", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLastSectionPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastSectionPos", MethodType.methodType(Class.forName("net.minecraft.core.SectionPos")))
        }
        val getTextFilterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTextFilter", MethodType.methodType(Class.forName("net.minecraft.server.network.TextFilter")))
        }
        val resetRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "resetRecipes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection")))
        }
        val getChatVisibilityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChatVisibility", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.ChatVisiblity")))
        }
        val getLastActionTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastActionTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val awardRecipesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "awardRecipes", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("java.util.Collection")))
        }
        val canChatInColorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canChatInColor", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAdvancementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAdvancements", MethodType.methodType(Class.forName("net.minecraft.server.PlayerAdvancements")))
        }
        val teleportToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "teleportTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel"), Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Double::class.javaPrimitiveType!!, Class.forName("java.util.Set"), Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!))
        }
        val `moonrise$getViewDistanceHolderHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getViewDistanceHolder", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.player.RegionizedPlayerChunkLoader\$ViewDistanceHolder")))
        }
        val callPortalEventHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "callPortalEvent", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.event.CraftPortalEvent"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("org.bukkit.Location"), Class.forName("org.bukkit.event.player.PlayerTeleportEvent\$TeleportCause"), Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val broadcastToPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "broadcastToPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getKnownMovementHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKnownMovement", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getPlayerTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getPlayerWeatherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerWeather", MethodType.methodType(Class.forName("org.bukkit.WeatherType")))
        }
        val setGameModeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setGameMode", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.GameType")))
        }
        val getBukkitEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitEntity", MethodType.methodType(Class.forName("org.bukkit.craftbukkit.entity.CraftPlayer")))
        }
        val findRespawnPositionAndUseSpawnBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findRespawnPositionAndUseSpawnBlock", MethodType.methodType(Class.forName("net.minecraft.world.level.portal.DimensionTransition"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.portal.DimensionTransition\$PostDimensionTransition"), Class.forName("org.bukkit.event.player.PlayerRespawnEvent\$RespawnReason")))
        }
        val getChatSessionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChatSession", MethodType.methodType(Class.forName("net.minecraft.network.chat.RemoteChatSession")))
        }
        val getSpawnPointHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnPoint", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getRespawnPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRespawnPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getRespawnAngleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRespawnAngle", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val canHarmPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canHarmPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val isRespawnForcedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRespawnForced", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val setRespawnPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "setRespawnPosition", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.core.BlockPos"), Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("com.destroystokyo.paper.event.player.PlayerSetSpawnEvent\$Cause")))
        }
        val startSleepInBedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "startSleepInBed", MethodType.methodType(Class.forName("com.mojang.datafixers.util.Either"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!))
        }
        val adjustSpawnLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "adjustSpawnLocation", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val isCreativeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCreative", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val startRidingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "startRiding", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity"), Boolean::class.javaPrimitiveType!!))
        }
        val serverLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "serverLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val mayInteractHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mayInteract", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level"), Class.forName("net.minecraft.core.BlockPos")))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.world.scores.Scoreboard")))
        }
        val isInvulnerableToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInvulnerableTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val changeDimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "changeDimension", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.level.portal.DimensionTransition")))
        }
        val hurtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hurt", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.damagesource.DamageSource"), Float::class.javaPrimitiveType!!))
        }
        val dropHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "drop", MethodType.methodType(Class.forName("net.minecraft.world.entity.item.ItemEntity"), Class.forName("net.minecraft.world.item.ItemStack"), Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val clientInformationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "clientInformation", MethodType.methodType(Class.forName("net.minecraft.server.level.ClientInformation")))
        }
        val getRaidOmenPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRaidOmenPosition", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val shouldFilterMessageToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldFilterMessageTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val isTextFilteringEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTextFilteringEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getWardenSpawnTrackerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWardenSpawnTracker", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val `moonrise$getChunkLoaderHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$getChunkLoader", MethodType.methodType(Class.forName("ca.spottedleaf.moonrise.patches.chunk_system.player.RegionizedPlayerChunkLoader\$PlayerChunkLoaderData")))
        }
        val `moonrise$isRealPlayerHandle`: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "moonrise\$isRealPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isChangingDimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isChangingDimension", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTabListDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTabListDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val requestedViewDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "requestedViewDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRespawnDimensionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRespawnDimension", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val nextContainerCounterHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "nextContainerCounter", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val createCommonSpawnInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createCommonSpawnInfo", MethodType.methodType(Class.forName("net.minecraft.network.protocol.game.CommonPlayerSpawnInfo"), Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getChunkTrackingViewHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChunkTrackingView", MethodType.methodType(Class.forName("net.minecraft.server.level.ChunkTrackingView")))
        }
        val lastSaveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSave")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val connectionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("connection")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastRecordedHealthAndAbsorptionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastRecordedHealthAndAbsorption")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastRecordedFoodLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastRecordedFoodLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastRecordedAirLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastRecordedAirLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastRecordedArmorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastRecordedArmor")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastRecordedLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastRecordedLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastRecordedExperienceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastRecordedExperience")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentHealthSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentHealth")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentFoodSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentFood")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastFoodSaturationZeroSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastFoodSaturationZero")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSentExpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSentExp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawnInvulnerableTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawnInvulnerableTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chatVisibilitySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chatVisibility")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val canChatColorSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("canChatColor")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastActionTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastActionTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cameraSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("camera")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isChangingDimensionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isChangingDimension")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val seenCreditsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("seenCredits")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val levitationStartPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("levitationStartPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val levitationStartTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("levitationStartTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val disconnectedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("disconnected")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val requestedViewDistanceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("requestedViewDistance")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val languageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("language")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val `adventure$localeSetterHandle`: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("adventure\$locale")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val startingToFallPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("startingToFallPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val enteredNetherPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("enteredNetherPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val enteredLavaOnVehiclePositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("enteredLavaOnVehiclePosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastSectionPosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastSectionPos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkTrackingViewSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkTrackingView")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnDimensionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnDimension")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnForcedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnForced")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val respawnAngleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("respawnAngle")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val textFilteringEnabledSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("textFilteringEnabled")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val allowsListingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("allowsListing")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val spawnExtraParticlesOnFallSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("spawnExtraParticlesOnFall")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wardenSpawnTrackerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wardenSpawnTracker")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val raidOmenPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("raidOmenPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastKnownClientMovementSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastKnownClientMovement")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chatSessionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chatSession")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val containerCounterSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("containerCounter")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val wonGameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("wonGame")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val containerUpdateDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("containerUpdateDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val loginTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("loginTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val patrolSpawnDelaySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("patrolSpawnDelay")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val queueHealthUpdatePacketSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("queueHealthUpdatePacket")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val queuedHealthUpdatePacketSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("queuedHealthUpdatePacket")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val transferCookieConnectionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("transferCookieConnection")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val displayNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("displayName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val `adventure$displayNameSetterHandle`: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("adventure\$displayName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val listNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("listName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val compassTargetSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("compassTarget")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val newExpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("newExp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val newLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("newLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val newTotalExpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("newTotalExp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val keepLevelSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("keepLevel")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxHealthCacheSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxHealthCache")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val joiningSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("joining")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sentListPacketSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sentListPacket")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val supressTrackerForLoginSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("supressTrackerForLogin")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isRealPlayerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isRealPlayer")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerNaturallySpawnedEventSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("playerNaturallySpawnedEvent")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val clientBrandNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("clientBrandName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val quitReasonSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("quitReason")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkLoaderSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkLoader")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val timeOffsetSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("timeOffset")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val relativeTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("relativeTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val weatherSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("weather")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pluginRainPositionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pluginRainPosition")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pluginRainPositionPreviousSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pluginRainPositionPrevious")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val spectator: Boolean
        get() = isSpectatorHandle.invoke(handle) as Boolean

    val allowsListing: Boolean
        get() = allowsListingHandle.invoke(handle) as Boolean

    val immobile: Boolean
        get() = isImmobileHandle.invoke(handle) as Boolean

    val camera: WrapperEntity
        get() = WrapperEntity(getCameraHandle.invoke(handle))

    fun openMenu(arg0: WrapperMenuProvider): Any {
        return openMenuHandle.invoke(handle, arg0.handle) as Any
    }

    val stats: WrapperServerStatsCounter
        get() = WrapperServerStatsCounter(getStatsHandle.invoke(handle))

    val ipAddress: String
        get() = getIpAddressHandle.invoke(handle) as String

    val recipeBook: WrapperServerRecipeBook
        get() = WrapperServerRecipeBook(getRecipeBookHandle.invoke(handle))

    val disconnected: Boolean
        get() = hasDisconnectedHandle.invoke(handle) as Boolean

    val lastSectionPos: WrapperSectionPos
        get() = WrapperSectionPos(getLastSectionPosHandle.invoke(handle))

    val textFilter: WrapperTextFilter
        get() = WrapperTextFilter(getTextFilterHandle.invoke(handle))

    fun resetRecipes(arg0: Any): Int {
        return resetRecipesHandle.invoke(handle, arg0) as Int
    }

    val chatVisibility: Any
        get() = getChatVisibilityHandle.invoke(handle) as Any

    val lastActionTime: Long
        get() = getLastActionTimeHandle.invoke(handle) as Long

    fun awardRecipes(arg0: Any): Int {
        return awardRecipesHandle.invoke(handle, arg0) as Int
    }

    val canChatInColor: Boolean
        get() = canChatInColorHandle.invoke(handle) as Boolean

    val advancements: WrapperPlayerAdvancements
        get() = WrapperPlayerAdvancements(getAdvancementsHandle.invoke(handle))

    fun teleportTo(arg0: WrapperServerLevel, arg1: Double, arg2: Double, arg3: Double, arg4: Any, arg5: Float, arg6: Float): Boolean {
        return teleportToHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4, arg5, arg6) as Boolean
    }

    val `moonrise$getViewDistanceHolder`: Any
        get() = `moonrise$getViewDistanceHolderHandle`.invoke(handle) as Any

    fun callPortalEvent(arg0: WrapperEntity, arg1: Any, arg2: Any, arg3: Int, arg4: Int): Any {
        return callPortalEventHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4) as Any
    }

    fun broadcastToPlayer(arg0: WrapperServerPlayer): Boolean {
        return broadcastToPlayerHandle.invoke(handle, arg0.handle) as Boolean
    }

    val knownMovement: WrapperVec3
        get() = WrapperVec3(getKnownMovementHandle.invoke(handle))

    val playerTime: Long
        get() = getPlayerTimeHandle.invoke(handle) as Long

    val playerWeather: Any
        get() = getPlayerWeatherHandle.invoke(handle) as Any

    fun setGameMode(arg0: Any): Boolean {
        return setGameModeHandle.invoke(handle, arg0) as Boolean
    }

    val bukkitEntity: Any
        get() = getBukkitEntityHandle.invoke(handle) as Any

    fun findRespawnPositionAndUseSpawnBlock(arg0: Boolean, arg1: WrapperPostDimensionTransition, arg2: Any): WrapperDimensionTransition {
        return WrapperDimensionTransition(findRespawnPositionAndUseSpawnBlockHandle.invoke(handle, arg0, arg1.handle, arg2))
    }

    val chatSession: WrapperRemoteChatSession
        get() = WrapperRemoteChatSession(getChatSessionHandle.invoke(handle))

    fun getSpawnPoint(arg0: WrapperServerLevel): WrapperBlockPos {
        return WrapperBlockPos(getSpawnPointHandle.invoke(handle, arg0.handle))
    }

    val respawnPosition: WrapperBlockPos
        get() = WrapperBlockPos(getRespawnPositionHandle.invoke(handle))

    val respawnAngle: Float
        get() = getRespawnAngleHandle.invoke(handle) as Float

    fun canHarmPlayer(arg0: WrapperPlayer): Boolean {
        return canHarmPlayerHandle.invoke(handle, arg0.handle) as Boolean
    }

    val respawnForced: Boolean
        get() = isRespawnForcedHandle.invoke(handle) as Boolean

    fun setRespawnPosition(arg0: WrapperResourceKey, arg1: WrapperBlockPos, arg2: Float, arg3: Boolean, arg4: Boolean, arg5: Any): Boolean {
        return setRespawnPositionHandle.invoke(handle, arg0.handle, arg1.handle, arg2, arg3, arg4, arg5) as Boolean
    }

    fun startSleepInBed(arg0: WrapperBlockPos, arg1: Boolean): Any {
        return startSleepInBedHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun adjustSpawnLocation(arg0: WrapperServerLevel, arg1: WrapperBlockPos): WrapperBlockPos {
        return WrapperBlockPos(adjustSpawnLocationHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val creative: Boolean
        get() = isCreativeHandle.invoke(handle) as Boolean

    fun startRiding(arg0: WrapperEntity, arg1: Boolean): Boolean {
        return startRidingHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    val serverLevel: WrapperServerLevel
        get() = WrapperServerLevel(serverLevelHandle.invoke(handle))

    fun mayInteract(arg0: WrapperLevel, arg1: WrapperBlockPos): Boolean {
        return mayInteractHandle.invoke(handle, arg0.handle, arg1.handle) as Boolean
    }

    val scoreboard: WrapperScoreboard
        get() = WrapperScoreboard(getScoreboardHandle.invoke(handle))

    fun isInvulnerableTo(arg0: WrapperDamageSource): Boolean {
        return isInvulnerableToHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun changeDimension(arg0: WrapperDimensionTransition): WrapperEntity {
        return WrapperEntity(changeDimensionHandle.invoke(handle, arg0.handle))
    }

    fun hurt(arg0: WrapperDamageSource, arg1: Float): Boolean {
        return hurtHandle.invoke(handle, arg0.handle, arg1) as Boolean
    }

    fun drop(arg0: WrapperItemStack, arg1: Boolean, arg2: Boolean): WrapperItemEntity {
        return WrapperItemEntity(dropHandle.invoke(handle, arg0.handle, arg1, arg2))
    }

    val clientInformation: WrapperClientInformation
        get() = WrapperClientInformation(clientInformationHandle.invoke(handle))

    val raidOmenPosition: WrapperBlockPos
        get() = WrapperBlockPos(getRaidOmenPositionHandle.invoke(handle))

    fun shouldFilterMessageTo(arg0: WrapperServerPlayer): Boolean {
        return shouldFilterMessageToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val textFilteringEnabled: Boolean
        get() = isTextFilteringEnabledHandle.invoke(handle) as Boolean

    val wardenSpawnTracker: Any
        get() = getWardenSpawnTrackerHandle.invoke(handle) as Any

    val `moonrise$getChunkLoader`: Any
        get() = `moonrise$getChunkLoaderHandle`.invoke(handle) as Any

    val `moonrise$isRealPlayer`: Boolean
        get() = `moonrise$isRealPlayerHandle`.invoke(handle) as Boolean

    val changingDimension: Boolean
        get() = isChangingDimensionHandle.invoke(handle) as Boolean

    val tabListDisplayName: WrapperComponent
        get() = WrapperComponent(getTabListDisplayNameHandle.invoke(handle))

    val requestedViewDistance: Int
        get() = requestedViewDistanceHandle.invoke(handle) as Int

    val respawnDimension: WrapperResourceKey
        get() = WrapperResourceKey(getRespawnDimensionHandle.invoke(handle))

    val nextContainerCounter: Int
        get() = nextContainerCounterHandle.invoke(handle) as Int

    fun createCommonSpawnInfo(arg0: WrapperServerLevel): WrapperCommonPlayerSpawnInfo {
        return WrapperCommonPlayerSpawnInfo(createCommonSpawnInfoHandle.invoke(handle, arg0.handle))
    }

    val chunkTrackingView: WrapperChunkTrackingView
        get() = WrapperChunkTrackingView(getChunkTrackingViewHandle.invoke(handle))

    fun setLastSave(value: Long) {
        lastSaveSetterHandle.invoke(handle, value)
    }

    fun setConnection(value: Any) {
        connectionSetterHandle.invoke(handle, value)
    }

    fun setLastRecordedHealthAndAbsorption(value: Float) {
        lastRecordedHealthAndAbsorptionSetterHandle.invoke(handle, value)
    }

    fun setLastRecordedFoodLevel(value: Int) {
        lastRecordedFoodLevelSetterHandle.invoke(handle, value)
    }

    fun setLastRecordedAirLevel(value: Int) {
        lastRecordedAirLevelSetterHandle.invoke(handle, value)
    }

    fun setLastRecordedArmor(value: Int) {
        lastRecordedArmorSetterHandle.invoke(handle, value)
    }

    fun setLastRecordedLevel(value: Int) {
        lastRecordedLevelSetterHandle.invoke(handle, value)
    }

    fun setLastRecordedExperience(value: Int) {
        lastRecordedExperienceSetterHandle.invoke(handle, value)
    }

    fun setLastSentHealth(value: Float) {
        lastSentHealthSetterHandle.invoke(handle, value)
    }

    fun setLastSentFood(value: Int) {
        lastSentFoodSetterHandle.invoke(handle, value)
    }

    fun setLastFoodSaturationZero(value: Boolean) {
        lastFoodSaturationZeroSetterHandle.invoke(handle, value)
    }

    fun setLastSentExp(value: Int) {
        lastSentExpSetterHandle.invoke(handle, value)
    }

    fun setSpawnInvulnerableTime(value: Int) {
        spawnInvulnerableTimeSetterHandle.invoke(handle, value)
    }

    fun setChatVisibility(value: Any) {
        chatVisibilitySetterHandle.invoke(handle, value)
    }

    fun setCanChatColor(value: Boolean) {
        canChatColorSetterHandle.invoke(handle, value)
    }

    fun setLastActionTime(value: Long) {
        lastActionTimeSetterHandle.invoke(handle, value)
    }

    fun setCamera(value: WrapperEntity) {
        cameraSetterHandle.invoke(handle, value.handle)
    }

    fun setIsChangingDimension(value: Boolean) {
        isChangingDimensionSetterHandle.invoke(handle, value)
    }

    fun setSeenCredits(value: Boolean) {
        seenCreditsSetterHandle.invoke(handle, value)
    }

    fun setLevitationStartPos(value: WrapperVec3) {
        levitationStartPosSetterHandle.invoke(handle, value.handle)
    }

    fun setLevitationStartTime(value: Int) {
        levitationStartTimeSetterHandle.invoke(handle, value)
    }

    fun setDisconnected(value: Boolean) {
        disconnectedSetterHandle.invoke(handle, value)
    }

    fun setRequestedViewDistance(value: Int) {
        requestedViewDistanceSetterHandle.invoke(handle, value)
    }

    fun setLanguage(value: String) {
        languageSetterHandle.invoke(handle, value)
    }

    fun `setAdventure$locale`(value: Any) {
        `adventure$localeSetterHandle`.invoke(handle, value)
    }

    fun setStartingToFallPosition(value: WrapperVec3) {
        startingToFallPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setEnteredNetherPosition(value: WrapperVec3) {
        enteredNetherPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setEnteredLavaOnVehiclePosition(value: WrapperVec3) {
        enteredLavaOnVehiclePositionSetterHandle.invoke(handle, value.handle)
    }

    fun setLastSectionPos(value: WrapperSectionPos) {
        lastSectionPosSetterHandle.invoke(handle, value.handle)
    }

    fun setChunkTrackingView(value: WrapperChunkTrackingView) {
        chunkTrackingViewSetterHandle.invoke(handle, value.handle)
    }

    fun setRespawnDimension(value: WrapperResourceKey) {
        respawnDimensionSetterHandle.invoke(handle, value.handle)
    }

    fun setRespawnPosition(value: WrapperBlockPos) {
        respawnPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setRespawnForced(value: Boolean) {
        respawnForcedSetterHandle.invoke(handle, value)
    }

    fun setRespawnAngle(value: Float) {
        respawnAngleSetterHandle.invoke(handle, value)
    }

    fun setTextFilteringEnabled(value: Boolean) {
        textFilteringEnabledSetterHandle.invoke(handle, value)
    }

    fun setAllowsListing(value: Boolean) {
        allowsListingSetterHandle.invoke(handle, value)
    }

    fun setSpawnExtraParticlesOnFall(value: Boolean) {
        spawnExtraParticlesOnFallSetterHandle.invoke(handle, value)
    }

    fun setWardenSpawnTracker(value: Any) {
        wardenSpawnTrackerSetterHandle.invoke(handle, value)
    }

    fun setRaidOmenPosition(value: WrapperBlockPos) {
        raidOmenPositionSetterHandle.invoke(handle, value.handle)
    }

    fun setLastKnownClientMovement(value: WrapperVec3) {
        lastKnownClientMovementSetterHandle.invoke(handle, value.handle)
    }

    fun setChatSession(value: WrapperRemoteChatSession) {
        chatSessionSetterHandle.invoke(handle, value.handle)
    }

    fun setContainerCounter(value: Int) {
        containerCounterSetterHandle.invoke(handle, value)
    }

    fun setWonGame(value: Boolean) {
        wonGameSetterHandle.invoke(handle, value)
    }

    fun setContainerUpdateDelay(value: Int) {
        containerUpdateDelaySetterHandle.invoke(handle, value)
    }

    fun setLoginTime(value: Long) {
        loginTimeSetterHandle.invoke(handle, value)
    }

    fun setPatrolSpawnDelay(value: Int) {
        patrolSpawnDelaySetterHandle.invoke(handle, value)
    }

    fun setQueueHealthUpdatePacket(value: Boolean) {
        queueHealthUpdatePacketSetterHandle.invoke(handle, value)
    }

    fun setQueuedHealthUpdatePacket(value: WrapperClientboundSetHealthPacket) {
        queuedHealthUpdatePacketSetterHandle.invoke(handle, value.handle)
    }

    fun setTransferCookieConnection(value: Any) {
        transferCookieConnectionSetterHandle.invoke(handle, value)
    }

    fun setDisplayName(value: String) {
        displayNameSetterHandle.invoke(handle, value)
    }

    fun `setAdventure$displayName`(value: Any) {
        `adventure$displayNameSetterHandle`.invoke(handle, value)
    }

    fun setListName(value: WrapperComponent) {
        listNameSetterHandle.invoke(handle, value.handle)
    }

    fun setCompassTarget(value: Any) {
        compassTargetSetterHandle.invoke(handle, value)
    }

    fun setNewExp(value: Int) {
        newExpSetterHandle.invoke(handle, value)
    }

    fun setNewLevel(value: Int) {
        newLevelSetterHandle.invoke(handle, value)
    }

    fun setNewTotalExp(value: Int) {
        newTotalExpSetterHandle.invoke(handle, value)
    }

    fun setKeepLevel(value: Boolean) {
        keepLevelSetterHandle.invoke(handle, value)
    }

    fun setMaxHealthCache(value: Double) {
        maxHealthCacheSetterHandle.invoke(handle, value)
    }

    fun setJoining(value: Boolean) {
        joiningSetterHandle.invoke(handle, value)
    }

    fun setSentListPacket(value: Boolean) {
        sentListPacketSetterHandle.invoke(handle, value)
    }

    fun setSupressTrackerForLogin(value: Boolean) {
        supressTrackerForLoginSetterHandle.invoke(handle, value)
    }

    fun setIsRealPlayer(value: Boolean) {
        isRealPlayerSetterHandle.invoke(handle, value)
    }

    fun setPlayerNaturallySpawnedEvent(value: Any) {
        playerNaturallySpawnedEventSetterHandle.invoke(handle, value)
    }

    fun setClientBrandName(value: String) {
        clientBrandNameSetterHandle.invoke(handle, value)
    }

    fun setQuitReason(value: Any) {
        quitReasonSetterHandle.invoke(handle, value)
    }

    fun setChunkLoader(value: Any) {
        chunkLoaderSetterHandle.invoke(handle, value)
    }

    fun setTimeOffset(value: Long) {
        timeOffsetSetterHandle.invoke(handle, value)
    }

    fun setRelativeTime(value: Boolean) {
        relativeTimeSetterHandle.invoke(handle, value)
    }

    fun setWeather(value: Any) {
        weatherSetterHandle.invoke(handle, value)
    }

    fun setPluginRainPosition(value: Float) {
        pluginRainPositionSetterHandle.invoke(handle, value)
    }

    fun setPluginRainPositionPrevious(value: Float) {
        pluginRainPositionPreviousSetterHandle.invoke(handle, value)
    }

}
