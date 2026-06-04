package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperMinecraftServer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.MinecraftServer") }
        private val lookup = MethodHandles.lookup()

        val getPortHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPort", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getFileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFile", MethodType.methodType(Class.forName("java.nio.file.Path"), String::class.java))
        }
        val isShutdownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShutdown", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val pollTaskHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pollTask", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.resources.ResourceKey")))
        }
        val isRunningHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRunning", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isStoppedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isStopped", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val motdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "motd", MethodType.methodType(Class.forName("net.kyori.adventure.text.Component")))
        }
        val isHardcoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isHardcore", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val createTextFilterForPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createTextFilterForPlayer", MethodType.methodType(Class.forName("net.minecraft.server.network.TextFilter"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val createGameModeForPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createGameModeForPlayer", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayerGameMode"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getAllLevelsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllLevels", MethodType.methodType(Class.forName("java.lang.Iterable")))
        }
        val getModdedStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getModdedStatus", MethodType.methodType(Class.forName("net.minecraft.util.ModCheck")))
        }
        val getServerModNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServerModName", MethodType.methodType(String::class.java))
        }
        val fillSystemReportHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fillSystemReport", MethodType.methodType(Class.forName("net.minecraft.SystemReport"), Class.forName("net.minecraft.SystemReport")))
        }
        val getConnectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getConnection", MethodType.methodType(Class.forName("net.minecraft.server.network.ServerConnectionListener")))
        }
        val getServerDirectoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServerDirectory", MethodType.methodType(Class.forName("java.nio.file.Path")))
        }
        val wrapRunnableHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "wrapRunnable", MethodType.methodType(Class.forName("net.minecraft.server.TickTask"), Class.forName("java.lang.Runnable")))
        }
        val getProfileCacheHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfileCache", MethodType.methodType(Class.forName("net.minecraft.server.players.GameProfileCache")))
        }
        val saveAllChunksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveAllChunks", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val saveEverythingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "saveEverything", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!))
        }
        val usesAuthenticationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "usesAuthentication", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hidesOnlinePlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hidesOnlinePlayers", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getMaxPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxPlayers", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isFlightAllowedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isFlightAllowed", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val publishServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "publishServer", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.GameType"), Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val getServerVersionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServerVersion", MethodType.methodType(String::class.java))
        }
        val isSpawningMonstersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSpawningMonsters", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTickCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRunningThreadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRunningThread", MethodType.methodType(Class.forName("java.lang.Thread")))
        }
        val reloadResourcesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reloadResources", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("java.util.Collection"), Class.forName("io.papermc.paper.event.server.ServerResourcesReloadedEvent\$Cause")))
        }
        val getFunctionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFunctions", MethodType.methodType(Class.forName("net.minecraft.server.ServerFunctionManager")))
        }
        val repliesToStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "repliesToStatus", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isEpollEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEpollEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPlayerNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerNames", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
        val getSessionServiceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSessionService", MethodType.methodType(Class.forName("com.mojang.authlib.minecraft.MinecraftSessionService")))
        }
        val getNextTickTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNextTickTime", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val isLevelEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isLevelEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level")))
        }
        val getPackRepositoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPackRepository", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.PackRepository")))
        }
        val isRecordingMetricsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isRecordingMetrics", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCommandStorageHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommandStorage", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.CommandStorage")))
        }
        val getWorldPathHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldPath", MethodType.methodType(Class.forName("java.nio.file.Path"), Class.forName("net.minecraft.world.level.storage.LevelResource")))
        }
        val isSameThreadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSameThread", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getTickTimesNanosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTickTimesNanos", MethodType.methodType(Class.forName("[J")))
        }
        val getResourceManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getResourceManager", MethodType.methodType(Class.forName("net.minecraft.server.packs.resources.ResourceManager")))
        }
        val isEnforceWhitelistHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEnforceWhitelist", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isCurrentlySavingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCurrentlySaving", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val stopTimeProfilerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stopTimeProfiler", MethodType.methodType(Class.forName("net.minecraft.util.profiling.ProfileResults")))
        }
        val getChatDecoratorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChatDecorator", MethodType.methodType(Class.forName("net.minecraft.network.chat.ChatDecorator")))
        }
        val acceptsTransfersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsTransfers", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val serverLinksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "serverLinks", MethodType.methodType(Class.forName("net.minecraft.server.ServerLinks")))
        }
        val getWorldDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldData", MethodType.methodType(Class.forName("net.minecraft.world.level.storage.WorldData")))
        }
        val isSingleplayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSingleplayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getFixerUpperHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFixerUpper", MethodType.methodType(Class.forName("com.mojang.datafixers.DataFixer")))
        }
        val isSpawningAnimalsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSpawningAnimals", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isPublishedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPublished", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val areNpcsEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "areNpcsEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getGameRulesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getGameRules", MethodType.methodType(Class.forName("net.minecraft.world.level.GameRules")))
        }
        val getCompressionThresholdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCompressionThreshold", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isDebuggingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDebugging", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess\$Frozen")))
        }
        val acceptsSuccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsSuccess", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldInformAdminsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldInformAdmins", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val acceptsFailureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsFailure", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val overworldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "overworld", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getProfilerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfiler", MethodType.methodType(Class.forName("net.minecraft.util.profiling.ProfilerFiller")))
        }
        val tickRateManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "tickRateManager", MethodType.methodType(Class.forName("net.minecraft.server.ServerTickRateManager")))
        }
        val potionBrewingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "potionBrewing", MethodType.methodType(Class.forName("net.minecraft.world.item.alchemy.PotionBrewing")))
        }
        val getRecipeManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeManager", MethodType.methodType(Class.forName("net.minecraft.world.item.crafting.RecipeManager")))
        }
        val getScoreboardHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScoreboard", MethodType.methodType(Class.forName("net.minecraft.server.ServerScoreboard")))
        }
        val reloadableRegistriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "reloadableRegistries", MethodType.methodType(Class.forName("net.minecraft.server.ReloadableServerRegistries\$Holder")))
        }
        val registriesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registries", MethodType.methodType(Class.forName("net.minecraft.core.LayeredRegistryAccess")))
        }
        val getCommandsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommands", MethodType.methodType(Class.forName("net.minecraft.commands.Commands")))
        }
        val getPlayerCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getScaledTrackingDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getScaledTrackingDistance", MethodType.methodType(Int::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val isTickTimeLoggingEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTickTimeLoggingEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAverageTickTimeNanosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAverageTickTimeNanos", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getWorldScreenshotFileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWorldScreenshotFile", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val enforceSecureProfileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enforceSecureProfile", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldRconBroadcastHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldRconBroadcast", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val createCommandSourceStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createCommandSourceStack", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val getMaxChainedNeighborUpdatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxChainedNeighborUpdates", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSpawnRadiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnRadius", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val isPvpAllowedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPvpAllowed", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isDedicatedServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDedicatedServer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getAdvancementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAdvancements", MethodType.methodType(Class.forName("net.minecraft.server.ServerAdvancementManager")))
        }
        val getDefaultGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDefaultGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val getForcedGameTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getForcedGameType", MethodType.methodType(Class.forName("net.minecraft.world.level.GameType")))
        }
        val logIPsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "logIPs", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val isUnderSpawnProtectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUnderSpawnProtection", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getCustomBossEventsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCustomBossEvents", MethodType.methodType(Class.forName("net.minecraft.server.bossevents.CustomBossEvents")))
        }
        val getAbsoluteMaxWorldSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAbsoluteMaxWorldSize", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isCommandBlockEnabledHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isCommandBlockEnabled", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getProfilePermissionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfilePermissions", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
        val forceSynchronousWritesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "forceSynchronousWrites", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getStructureManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStructureManager", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager")))
        }
        val isReadyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isReady", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPlayerListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerList", MethodType.methodType(Class.forName("net.minecraft.server.players.PlayerList")))
        }
        val getFunctionCompilationLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFunctionCompilationLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getOperatorUserPermissionLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOperatorUserPermissionLevel", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getRateLimitPacketsPerSecondHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRateLimitPacketsPerSecond", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getProfileKeySignatureValidatorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfileKeySignatureValidator", MethodType.methodType(Class.forName("net.minecraft.util.SignatureValidator")))
        }
        val isDemoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isDemo", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val hasStoppedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasStopped", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLocalIpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLocalIp", MethodType.methodType(String::class.java))
        }
        val levelKeysHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "levelKeys", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val isPausedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPaused", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getProxyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProxy", MethodType.methodType(Class.forName("java.net.Proxy")))
        }
        val getKeyPairHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getKeyPair", MethodType.methodType(Class.forName("java.security.KeyPair")))
        }
        val getMotdHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMotd", MethodType.methodType(String::class.java))
        }
        val getStatusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStatus", MethodType.methodType(Class.forName("net.minecraft.network.protocol.status.ServerStatus")))
        }
        val hasGuiHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasGui", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSpawnProtectionRadiusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSpawnProtectionRadius", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isResourcePackRequiredHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isResourcePackRequired", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPreventProxyConnectionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPreventProxyConnections", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPlayerIdleTimeoutHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerIdleTimeout", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isSingleplayerOwnerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSingleplayerOwner", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
        val fillServerSystemReportHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fillServerSystemReport", MethodType.methodType(Class.forName("net.minecraft.SystemReport"), Class.forName("net.minecraft.SystemReport")))
        }
        val isTimeProfilerRunningHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTimeProfilerRunning", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getSingleplayerProfileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSingleplayerProfile", MethodType.methodType(Class.forName("com.mojang.authlib.GameProfile")))
        }
        val getCurrentSmoothedTickTimeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCurrentSmoothedTickTime", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val scheduleExecutablesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "scheduleExecutables", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getProfileRepositoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getProfileRepository", MethodType.methodType(Class.forName("com.mojang.authlib.GameProfileRepository")))
        }
        val getServerResourcePackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServerResourcePack", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val storageSourceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("storageSource")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val metricsRecorderSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("metricsRecorder")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val profilerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("profiler")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val onMetricsRecordingStoppedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("onMetricsRecordingStopped")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val onMetricsRecordingFinishedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("onMetricsRecordingFinished")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val willStartRecordingMetricsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("willStartRecordingMetrics")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val debugCommandProfilerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("debugCommandProfiler")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val debugCommandProfilerDelayStartSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("debugCommandProfilerDelayStart")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val connectionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("connection")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val statusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("status")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val statusIconSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("statusIcon")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val localIpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("localIp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val portSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("port")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val levelsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("levels")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerListSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("playerList")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val runningSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("running")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isRestartingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isRestarting")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val stoppedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("stopped")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val tickCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("tickCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val ticksUntilAutosaveSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("ticksUntilAutosave")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val onlineModeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("onlineMode")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val preventProxyConnectionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("preventProxyConnections")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val pvpSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("pvp")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val allowFlightSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("allowFlight")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val motdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("motd")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val playerIdleTimeoutSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("playerIdleTimeout")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val aggregatedTickTimesNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("aggregatedTickTimesNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val keyPairSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("keyPair")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val singleplayerProfileSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("singleplayerProfile")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isDemoSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isDemo")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isReadySetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isReady")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastOverloadWarningNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastOverloadWarningNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastServerStatusSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastServerStatus")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastTickNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastTickNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val taskExecutionStartNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("taskExecutionStartNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val idleTimeNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("idleTimeNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val nextTickTimeNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("nextTickTimeNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val delayedTasksMaxNextTickTimeNanosSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("delayedTasksMaxNextTickTimeNanos")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val mayHaveDelayedTasksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("mayHaveDelayedTasks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val commandStorageSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("commandStorage")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val enforceWhitelistSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("enforceWhitelist")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val smoothedTickTimeMillisSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("smoothedTickTimeMillis")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val serverIdSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("serverId")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val resourcesSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("resources")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val worldDataSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("worldData")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val potionBrewingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("potionBrewing")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isSavingSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isSaving")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val serverSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("server")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val optionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("options")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val consoleSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("console")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val processQueueSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("processQueue")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val autosavePeriodSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("autosavePeriod")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val forceTicksSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("forceTicks")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isIteratingOverLevelsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isIteratingOverLevels")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val shutdownThreadSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("shutdownThread")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val abnormalExitSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("abnormalExit")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val chunkSystemCrashSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("chunkSystemCrash")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastMidTickExecuteSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastMidTickExecute")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastMidTickExecuteFailureSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastMidTickExecuteFailure")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasStoppedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasStopped")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasLoggedStopSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasLoggedStop")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val hasFullyShutdownSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("hasFullyShutdown")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastTickSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastTick")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val catchupTimeSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("catchupTime")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val isOversleepSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("isOversleep")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val port: Int
        get() = getPortHandle.invoke(handle) as Int

    fun getFile(arg0: String): Any {
        return getFileHandle.invoke(handle, arg0) as Any
    }

    val shutdown: Boolean
        get() = isShutdownHandle.invoke(handle) as Boolean

    val pollTask: Boolean
        get() = pollTaskHandle.invoke(handle) as Boolean

    fun getLevel(arg0: WrapperResourceKey): WrapperServerLevel {
        return WrapperServerLevel(getLevelHandle.invoke(handle, arg0.handle))
    }

    val running: Boolean
        get() = isRunningHandle.invoke(handle) as Boolean

    val stopped: Boolean
        get() = isStoppedHandle.invoke(handle) as Boolean

    val motd: Any
        get() = motdHandle.invoke(handle) as Any

    val hardcore: Boolean
        get() = isHardcoreHandle.invoke(handle) as Boolean

    fun createTextFilterForPlayer(arg0: WrapperServerPlayer): WrapperTextFilter {
        return WrapperTextFilter(createTextFilterForPlayerHandle.invoke(handle, arg0.handle))
    }

    fun createGameModeForPlayer(arg0: WrapperServerPlayer): WrapperServerPlayerGameMode {
        return WrapperServerPlayerGameMode(createGameModeForPlayerHandle.invoke(handle, arg0.handle))
    }

    val allLevels: Any
        get() = getAllLevelsHandle.invoke(handle) as Any

    val moddedStatus: WrapperModCheck
        get() = WrapperModCheck(getModdedStatusHandle.invoke(handle))

    val serverModName: String
        get() = getServerModNameHandle.invoke(handle) as String

    fun fillSystemReport(arg0: WrapperSystemReport): WrapperSystemReport {
        return WrapperSystemReport(fillSystemReportHandle.invoke(handle, arg0.handle))
    }

    val connection: WrapperServerConnectionListener
        get() = WrapperServerConnectionListener(getConnectionHandle.invoke(handle))

    val serverDirectory: Any
        get() = getServerDirectoryHandle.invoke(handle) as Any

    fun wrapRunnable(arg0: Any): WrapperTickTask {
        return WrapperTickTask(wrapRunnableHandle.invoke(handle, arg0))
    }

    val profileCache: WrapperGameProfileCache
        get() = WrapperGameProfileCache(getProfileCacheHandle.invoke(handle))

    fun saveAllChunks(arg0: Boolean, arg1: Boolean, arg2: Boolean): Boolean {
        return saveAllChunksHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    fun saveEverything(arg0: Boolean, arg1: Boolean, arg2: Boolean): Boolean {
        return saveEverythingHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    val usesAuthentication: Boolean
        get() = usesAuthenticationHandle.invoke(handle) as Boolean

    val hidesOnlinePlayers: Boolean
        get() = hidesOnlinePlayersHandle.invoke(handle) as Boolean

    val maxPlayers: Int
        get() = getMaxPlayersHandle.invoke(handle) as Int

    val flightAllowed: Boolean
        get() = isFlightAllowedHandle.invoke(handle) as Boolean

    fun publishServer(arg0: Any, arg1: Boolean, arg2: Int): Boolean {
        return publishServerHandle.invoke(handle, arg0, arg1, arg2) as Boolean
    }

    val serverVersion: String
        get() = getServerVersionHandle.invoke(handle) as String

    val spawningMonsters: Boolean
        get() = isSpawningMonstersHandle.invoke(handle) as Boolean

    val tickCount: Int
        get() = getTickCountHandle.invoke(handle) as Int

    val runningThread: Any
        get() = getRunningThreadHandle.invoke(handle) as Any

    fun reloadResources(arg0: Any, arg1: Any): Any {
        return reloadResourcesHandle.invoke(handle, arg0, arg1) as Any
    }

    val functions: WrapperServerFunctionManager
        get() = WrapperServerFunctionManager(getFunctionsHandle.invoke(handle))

    val repliesToStatus: Boolean
        get() = repliesToStatusHandle.invoke(handle) as Boolean

    val epollEnabled: Boolean
        get() = isEpollEnabledHandle.invoke(handle) as Boolean

    val playerNames: Any
        get() = getPlayerNamesHandle.invoke(handle) as Any

    val sessionService: Any
        get() = getSessionServiceHandle.invoke(handle) as Any

    val nextTickTime: Long
        get() = getNextTickTimeHandle.invoke(handle) as Long

    fun isLevelEnabled(arg0: WrapperLevel): Boolean {
        return isLevelEnabledHandle.invoke(handle, arg0.handle) as Boolean
    }

    val packRepository: WrapperPackRepository
        get() = WrapperPackRepository(getPackRepositoryHandle.invoke(handle))

    val recordingMetrics: Boolean
        get() = isRecordingMetricsHandle.invoke(handle) as Boolean

    val commandStorage: WrapperCommandStorage
        get() = WrapperCommandStorage(getCommandStorageHandle.invoke(handle))

    fun getWorldPath(arg0: WrapperLevelResource): Any {
        return getWorldPathHandle.invoke(handle, arg0.handle) as Any
    }

    val sameThread: Boolean
        get() = isSameThreadHandle.invoke(handle) as Boolean

    val tickTimesNanos: Any
        get() = getTickTimesNanosHandle.invoke(handle) as Any

    val resourceManager: WrapperResourceManager
        get() = WrapperResourceManager(getResourceManagerHandle.invoke(handle))

    val enforceWhitelist: Boolean
        get() = isEnforceWhitelistHandle.invoke(handle) as Boolean

    val currentlySaving: Boolean
        get() = isCurrentlySavingHandle.invoke(handle) as Boolean

    val stopTimeProfiler: WrapperProfileResults
        get() = WrapperProfileResults(stopTimeProfilerHandle.invoke(handle))

    val chatDecorator: WrapperChatDecorator
        get() = WrapperChatDecorator(getChatDecoratorHandle.invoke(handle))

    val acceptsTransfers: Boolean
        get() = acceptsTransfersHandle.invoke(handle) as Boolean

    val serverLinks: WrapperServerLinks
        get() = WrapperServerLinks(serverLinksHandle.invoke(handle))

    val worldData: WrapperWorldData
        get() = WrapperWorldData(getWorldDataHandle.invoke(handle))

    val singleplayer: Boolean
        get() = isSingleplayerHandle.invoke(handle) as Boolean

    val fixerUpper: Any
        get() = getFixerUpperHandle.invoke(handle) as Any

    val spawningAnimals: Boolean
        get() = isSpawningAnimalsHandle.invoke(handle) as Boolean

    val published: Boolean
        get() = isPublishedHandle.invoke(handle) as Boolean

    val areNpcsEnabled: Boolean
        get() = areNpcsEnabledHandle.invoke(handle) as Boolean

    val gameRules: WrapperGameRules
        get() = WrapperGameRules(getGameRulesHandle.invoke(handle))

    val compressionThreshold: Int
        get() = getCompressionThresholdHandle.invoke(handle) as Int

    val debugging: Boolean
        get() = isDebuggingHandle.invoke(handle) as Boolean

    val registryAccess: Any
        get() = registryAccessHandle.invoke(handle) as Any

    val acceptsSuccess: Boolean
        get() = acceptsSuccessHandle.invoke(handle) as Boolean

    val shouldInformAdmins: Boolean
        get() = shouldInformAdminsHandle.invoke(handle) as Boolean

    val acceptsFailure: Boolean
        get() = acceptsFailureHandle.invoke(handle) as Boolean

    val overworld: WrapperServerLevel
        get() = WrapperServerLevel(overworldHandle.invoke(handle))

    val profiler: Any
        get() = getProfilerHandle.invoke(handle) as Any

    val tickRateManager: WrapperServerTickRateManager
        get() = WrapperServerTickRateManager(tickRateManagerHandle.invoke(handle))

    val potionBrewing: WrapperPotionBrewing
        get() = WrapperPotionBrewing(potionBrewingHandle.invoke(handle))

    val recipeManager: WrapperRecipeManager
        get() = WrapperRecipeManager(getRecipeManagerHandle.invoke(handle))

    val scoreboard: WrapperServerScoreboard
        get() = WrapperServerScoreboard(getScoreboardHandle.invoke(handle))

    val reloadableRegistries: WrapperHolder
        get() = WrapperHolder(reloadableRegistriesHandle.invoke(handle))

    val registries: WrapperLayeredRegistryAccess
        get() = WrapperLayeredRegistryAccess(registriesHandle.invoke(handle))

    val commands: WrapperCommands
        get() = WrapperCommands(getCommandsHandle.invoke(handle))

    val playerCount: Int
        get() = getPlayerCountHandle.invoke(handle) as Int

    fun getScaledTrackingDistance(arg0: Int): Int {
        return getScaledTrackingDistanceHandle.invoke(handle, arg0) as Int
    }

    val tickTimeLoggingEnabled: Boolean
        get() = isTickTimeLoggingEnabledHandle.invoke(handle) as Boolean

    val averageTickTimeNanos: Long
        get() = getAverageTickTimeNanosHandle.invoke(handle) as Long

    val worldScreenshotFile: Any
        get() = getWorldScreenshotFileHandle.invoke(handle) as Any

    val enforceSecureProfile: Boolean
        get() = enforceSecureProfileHandle.invoke(handle) as Boolean

    val shouldRconBroadcast: Boolean
        get() = shouldRconBroadcastHandle.invoke(handle) as Boolean

    val createCommandSourceStack: WrapperCommandSourceStack
        get() = WrapperCommandSourceStack(createCommandSourceStackHandle.invoke(handle))

    val maxChainedNeighborUpdates: Int
        get() = getMaxChainedNeighborUpdatesHandle.invoke(handle) as Int

    fun getSpawnRadius(arg0: WrapperServerLevel): Int {
        return getSpawnRadiusHandle.invoke(handle, arg0.handle) as Int
    }

    val pvpAllowed: Boolean
        get() = isPvpAllowedHandle.invoke(handle) as Boolean

    val dedicatedServer: Boolean
        get() = isDedicatedServerHandle.invoke(handle) as Boolean

    val advancements: WrapperServerAdvancementManager
        get() = WrapperServerAdvancementManager(getAdvancementsHandle.invoke(handle))

    val defaultGameType: Any
        get() = getDefaultGameTypeHandle.invoke(handle) as Any

    val forcedGameType: Any
        get() = getForcedGameTypeHandle.invoke(handle) as Any

    val logIPs: Boolean
        get() = logIPsHandle.invoke(handle) as Boolean

    fun isUnderSpawnProtection(arg0: WrapperServerLevel, arg1: WrapperBlockPos, arg2: WrapperPlayer): Boolean {
        return isUnderSpawnProtectionHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle) as Boolean
    }

    val customBossEvents: WrapperCustomBossEvents
        get() = WrapperCustomBossEvents(getCustomBossEventsHandle.invoke(handle))

    val absoluteMaxWorldSize: Int
        get() = getAbsoluteMaxWorldSizeHandle.invoke(handle) as Int

    val commandBlockEnabled: Boolean
        get() = isCommandBlockEnabledHandle.invoke(handle) as Boolean

    fun getProfilePermissions(arg0: Any): Int {
        return getProfilePermissionsHandle.invoke(handle, arg0) as Int
    }

    val forceSynchronousWrites: Boolean
        get() = forceSynchronousWritesHandle.invoke(handle) as Boolean

    val structureManager: WrapperStructureTemplateManager
        get() = WrapperStructureTemplateManager(getStructureManagerHandle.invoke(handle))

    val ready: Boolean
        get() = isReadyHandle.invoke(handle) as Boolean

    val playerList: WrapperPlayerList
        get() = WrapperPlayerList(getPlayerListHandle.invoke(handle))

    val functionCompilationLevel: Int
        get() = getFunctionCompilationLevelHandle.invoke(handle) as Int

    val operatorUserPermissionLevel: Int
        get() = getOperatorUserPermissionLevelHandle.invoke(handle) as Int

    val rateLimitPacketsPerSecond: Int
        get() = getRateLimitPacketsPerSecondHandle.invoke(handle) as Int

    val profileKeySignatureValidator: WrapperSignatureValidator
        get() = WrapperSignatureValidator(getProfileKeySignatureValidatorHandle.invoke(handle))

    val demo: Boolean
        get() = isDemoHandle.invoke(handle) as Boolean

    val hasStopped: Boolean
        get() = hasStoppedHandle.invoke(handle) as Boolean

    val localIp: String
        get() = getLocalIpHandle.invoke(handle) as String

    val levelKeys: Any
        get() = levelKeysHandle.invoke(handle) as Any

    val paused: Boolean
        get() = isPausedHandle.invoke(handle) as Boolean

    val proxy: Any
        get() = getProxyHandle.invoke(handle) as Any

    val keyPair: Any
        get() = getKeyPairHandle.invoke(handle) as Any

    val getMotd: String
        get() = getMotdHandle.invoke(handle) as String

    val status: WrapperServerStatus
        get() = WrapperServerStatus(getStatusHandle.invoke(handle))

    val gui: Boolean
        get() = hasGuiHandle.invoke(handle) as Boolean

    val spawnProtectionRadius: Int
        get() = getSpawnProtectionRadiusHandle.invoke(handle) as Int

    val resourcePackRequired: Boolean
        get() = isResourcePackRequiredHandle.invoke(handle) as Boolean

    val preventProxyConnections: Boolean
        get() = getPreventProxyConnectionsHandle.invoke(handle) as Boolean

    val playerIdleTimeout: Int
        get() = getPlayerIdleTimeoutHandle.invoke(handle) as Int

    fun isSingleplayerOwner(arg0: Any): Boolean {
        return isSingleplayerOwnerHandle.invoke(handle, arg0) as Boolean
    }

    fun fillServerSystemReport(arg0: WrapperSystemReport): WrapperSystemReport {
        return WrapperSystemReport(fillServerSystemReportHandle.invoke(handle, arg0.handle))
    }

    val timeProfilerRunning: Boolean
        get() = isTimeProfilerRunningHandle.invoke(handle) as Boolean

    val singleplayerProfile: Any
        get() = getSingleplayerProfileHandle.invoke(handle) as Any

    val currentSmoothedTickTime: Float
        get() = getCurrentSmoothedTickTimeHandle.invoke(handle) as Float

    val scheduleExecutables: Boolean
        get() = scheduleExecutablesHandle.invoke(handle) as Boolean

    val profileRepository: Any
        get() = getProfileRepositoryHandle.invoke(handle) as Any

    val serverResourcePack: Any
        get() = getServerResourcePackHandle.invoke(handle) as Any

    fun setStorageSource(value: Any) {
        storageSourceSetterHandle.invoke(handle, value)
    }

    fun setMetricsRecorder(value: Any) {
        metricsRecorderSetterHandle.invoke(handle, value)
    }

    fun setProfiler(value: Any) {
        profilerSetterHandle.invoke(handle, value)
    }

    fun setOnMetricsRecordingStopped(value: Any) {
        onMetricsRecordingStoppedSetterHandle.invoke(handle, value)
    }

    fun setOnMetricsRecordingFinished(value: Any) {
        onMetricsRecordingFinishedSetterHandle.invoke(handle, value)
    }

    fun setWillStartRecordingMetrics(value: Boolean) {
        willStartRecordingMetricsSetterHandle.invoke(handle, value)
    }

    fun setDebugCommandProfiler(value: Any) {
        debugCommandProfilerSetterHandle.invoke(handle, value)
    }

    fun setDebugCommandProfilerDelayStart(value: Boolean) {
        debugCommandProfilerDelayStartSetterHandle.invoke(handle, value)
    }

    fun setConnection(value: WrapperServerConnectionListener) {
        connectionSetterHandle.invoke(handle, value.handle)
    }

    fun setStatus(value: WrapperServerStatus) {
        statusSetterHandle.invoke(handle, value.handle)
    }

    fun setStatusIcon(value: Any) {
        statusIconSetterHandle.invoke(handle, value)
    }

    fun setLocalIp(value: String) {
        localIpSetterHandle.invoke(handle, value)
    }

    fun setPort(value: Int) {
        portSetterHandle.invoke(handle, value)
    }

    fun setLevels(value: Any) {
        levelsSetterHandle.invoke(handle, value)
    }

    fun setPlayerList(value: WrapperPlayerList) {
        playerListSetterHandle.invoke(handle, value.handle)
    }

    fun setRunning(value: Boolean) {
        runningSetterHandle.invoke(handle, value)
    }

    fun setIsRestarting(value: Boolean) {
        isRestartingSetterHandle.invoke(handle, value)
    }

    fun setStopped(value: Boolean) {
        stoppedSetterHandle.invoke(handle, value)
    }

    fun setTickCount(value: Int) {
        tickCountSetterHandle.invoke(handle, value)
    }

    fun setTicksUntilAutosave(value: Int) {
        ticksUntilAutosaveSetterHandle.invoke(handle, value)
    }

    fun setOnlineMode(value: Boolean) {
        onlineModeSetterHandle.invoke(handle, value)
    }

    fun setPreventProxyConnections(value: Boolean) {
        preventProxyConnectionsSetterHandle.invoke(handle, value)
    }

    fun setPvp(value: Boolean) {
        pvpSetterHandle.invoke(handle, value)
    }

    fun setAllowFlight(value: Boolean) {
        allowFlightSetterHandle.invoke(handle, value)
    }

    fun setMotd(value: Any) {
        motdSetterHandle.invoke(handle, value)
    }

    fun setPlayerIdleTimeout(value: Int) {
        playerIdleTimeoutSetterHandle.invoke(handle, value)
    }

    fun setAggregatedTickTimesNanos(value: Long) {
        aggregatedTickTimesNanosSetterHandle.invoke(handle, value)
    }

    fun setKeyPair(value: Any) {
        keyPairSetterHandle.invoke(handle, value)
    }

    fun setSingleplayerProfile(value: Any) {
        singleplayerProfileSetterHandle.invoke(handle, value)
    }

    fun setIsDemo(value: Boolean) {
        isDemoSetterHandle.invoke(handle, value)
    }

    fun setIsReady(value: Boolean) {
        isReadySetterHandle.invoke(handle, value)
    }

    fun setLastOverloadWarningNanos(value: Long) {
        lastOverloadWarningNanosSetterHandle.invoke(handle, value)
    }

    fun setLastServerStatus(value: Long) {
        lastServerStatusSetterHandle.invoke(handle, value)
    }

    fun setLastTickNanos(value: Long) {
        lastTickNanosSetterHandle.invoke(handle, value)
    }

    fun setTaskExecutionStartNanos(value: Long) {
        taskExecutionStartNanosSetterHandle.invoke(handle, value)
    }

    fun setIdleTimeNanos(value: Long) {
        idleTimeNanosSetterHandle.invoke(handle, value)
    }

    fun setNextTickTimeNanos(value: Long) {
        nextTickTimeNanosSetterHandle.invoke(handle, value)
    }

    fun setDelayedTasksMaxNextTickTimeNanos(value: Long) {
        delayedTasksMaxNextTickTimeNanosSetterHandle.invoke(handle, value)
    }

    fun setMayHaveDelayedTasks(value: Boolean) {
        mayHaveDelayedTasksSetterHandle.invoke(handle, value)
    }

    fun setCommandStorage(value: WrapperCommandStorage) {
        commandStorageSetterHandle.invoke(handle, value.handle)
    }

    fun setEnforceWhitelist(value: Boolean) {
        enforceWhitelistSetterHandle.invoke(handle, value)
    }

    fun setSmoothedTickTimeMillis(value: Float) {
        smoothedTickTimeMillisSetterHandle.invoke(handle, value)
    }

    fun setServerId(value: String) {
        serverIdSetterHandle.invoke(handle, value)
    }

    fun setResources(value: Any) {
        resourcesSetterHandle.invoke(handle, value)
    }

    fun setWorldData(value: WrapperWorldData) {
        worldDataSetterHandle.invoke(handle, value.handle)
    }

    fun setPotionBrewing(value: WrapperPotionBrewing) {
        potionBrewingSetterHandle.invoke(handle, value.handle)
    }

    fun setIsSaving(value: Boolean) {
        isSavingSetterHandle.invoke(handle, value)
    }

    fun setServer(value: Any) {
        serverSetterHandle.invoke(handle, value)
    }

    fun setOptions(value: Any) {
        optionsSetterHandle.invoke(handle, value)
    }

    fun setConsole(value: Any) {
        consoleSetterHandle.invoke(handle, value)
    }

    fun setProcessQueue(value: Any) {
        processQueueSetterHandle.invoke(handle, value)
    }

    fun setAutosavePeriod(value: Int) {
        autosavePeriodSetterHandle.invoke(handle, value)
    }

    fun setForceTicks(value: Boolean) {
        forceTicksSetterHandle.invoke(handle, value)
    }

    fun setIsIteratingOverLevels(value: Boolean) {
        isIteratingOverLevelsSetterHandle.invoke(handle, value)
    }

    fun setShutdownThread(value: Any) {
        shutdownThreadSetterHandle.invoke(handle, value)
    }

    fun setAbnormalExit(value: Boolean) {
        abnormalExitSetterHandle.invoke(handle, value)
    }

    fun setChunkSystemCrash(value: Any) {
        chunkSystemCrashSetterHandle.invoke(handle, value)
    }

    fun setLastMidTickExecute(value: Long) {
        lastMidTickExecuteSetterHandle.invoke(handle, value)
    }

    fun setLastMidTickExecuteFailure(value: Long) {
        lastMidTickExecuteFailureSetterHandle.invoke(handle, value)
    }

    fun setHasStopped(value: Boolean) {
        hasStoppedSetterHandle.invoke(handle, value)
    }

    fun setHasLoggedStop(value: Boolean) {
        hasLoggedStopSetterHandle.invoke(handle, value)
    }

    fun setHasFullyShutdown(value: Boolean) {
        hasFullyShutdownSetterHandle.invoke(handle, value)
    }

    fun setLastTick(value: Long) {
        lastTickSetterHandle.invoke(handle, value)
    }

    fun setCatchupTime(value: Long) {
        catchupTimeSetterHandle.invoke(handle, value)
    }

    fun setIsOversleep(value: Boolean) {
        isOversleepSetterHandle.invoke(handle, value)
    }

}
