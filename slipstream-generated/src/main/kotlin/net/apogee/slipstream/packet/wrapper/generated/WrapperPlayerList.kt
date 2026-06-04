package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPlayerList(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.players.PlayerList") }
        private val lookup = MethodHandles.lookup()

        val removeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "remove", MethodType.methodType(Class.forName("net.kyori.adventure.text.Component"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val loadHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "load", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getOpsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOps", MethodType.methodType(Class.forName("net.minecraft.server.players.ServerOpList")))
        }
        val respawnHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "respawn", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.server.level.ServerPlayer"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.entity.Entity\$RemovalReason"), Class.forName("org.bukkit.event.player.PlayerRespawnEvent\$RespawnReason"), Class.forName("org.bukkit.Location")))
        }
        val getPlayerAdvancementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerAdvancements", MethodType.methodType(Class.forName("net.minecraft.server.PlayerAdvancements"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val isUsingWhitelistHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isUsingWhitelist", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getPlayerForLoginHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerForLogin", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("com.mojang.authlib.GameProfile"), Class.forName("net.minecraft.server.level.ClientInformation"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val verifyChatTrustedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "verifyChatTrusted", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.PlayerChatMessage")))
        }
        val canPlayerLoginHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canPlayerLogin", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("net.minecraft.server.network.ServerLoginPacketListenerImpl"), Class.forName("com.mojang.authlib.GameProfile")))
        }
        val getWhiteListNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWhiteListNames", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
        val getMaxPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMaxPlayers", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val isWhiteListedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isWhiteListed", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
        val getWhiteListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getWhiteList", MethodType.methodType(Class.forName("net.minecraft.server.players.UserWhiteList")))
        }
        val isOpHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isOp", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val getPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayer", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer"), Class.forName("java.util.UUID")))
        }
        val getPlayerCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPlayerNamesArrayHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerNamesArray", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
        val getSimulationDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSimulationDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getViewDistanceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getViewDistance", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getPlayerStatsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerStats", MethodType.methodType(Class.forName("net.minecraft.stats.ServerStatsCounter"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayers", MethodType.methodType(Class.forName("java.util.List")))
        }
        val getSingleplayerDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSingleplayerData", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getOpNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOpNames", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
        val getBansHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBans", MethodType.methodType(Class.forName("net.minecraft.server.players.UserBanList")))
        }
        val getIpBansHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIpBans", MethodType.methodType(Class.forName("net.minecraft.server.players.IpBanList")))
        }
        val canBypassPlayerLimitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBypassPlayerLimit", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
        val getPlayersWithAddressHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayersWithAddress", MethodType.methodType(Class.forName("java.util.List"), String::class.java))
        }
        val getPlayerByNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerByName", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer"), String::class.java))
        }
        val isAllowCommandsForAllPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isAllowCommandsForAllPlayers", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val disconnectAllPlayersWithProfileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "disconnectAllPlayersWithProfile", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile"), Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val doWhiteListSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("doWhiteList")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val maxPlayersSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("maxPlayers")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val viewDistanceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("viewDistance")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val simulationDistanceSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("simulationDistance")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val allowCommandsForAllPlayersSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("allowCommandsForAllPlayers")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val sendAllPlayerInfoInSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("sendAllPlayerInfoIn")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val cserverSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("cserver")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val collideRuleTeamNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("collideRuleTeamName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun remove(arg0: WrapperServerPlayer): Any {
        return removeHandle.invoke(handle, arg0.handle) as Any
    }

    fun load(arg0: WrapperServerPlayer): Any {
        return loadHandle.invoke(handle, arg0.handle) as Any
    }

    val ops: WrapperServerOpList
        get() = WrapperServerOpList(getOpsHandle.invoke(handle))

    fun respawn(arg0: WrapperServerPlayer, arg1: Boolean, arg2: Any, arg3: Any, arg4: Any): WrapperServerPlayer {
        return WrapperServerPlayer(respawnHandle.invoke(handle, arg0.handle, arg1, arg2, arg3, arg4))
    }

    fun getPlayerAdvancements(arg0: WrapperServerPlayer): WrapperPlayerAdvancements {
        return WrapperPlayerAdvancements(getPlayerAdvancementsHandle.invoke(handle, arg0.handle))
    }

    val usingWhitelist: Boolean
        get() = isUsingWhitelistHandle.invoke(handle) as Boolean

    fun getPlayerForLogin(arg0: Any, arg1: WrapperClientInformation, arg2: WrapperServerPlayer): WrapperServerPlayer {
        return WrapperServerPlayer(getPlayerForLoginHandle.invoke(handle, arg0, arg1.handle, arg2.handle))
    }

    fun verifyChatTrusted(arg0: WrapperPlayerChatMessage): Boolean {
        return verifyChatTrustedHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun canPlayerLogin(arg0: WrapperServerLoginPacketListenerImpl, arg1: Any): WrapperServerPlayer {
        return WrapperServerPlayer(canPlayerLoginHandle.invoke(handle, arg0.handle, arg1))
    }

    val whiteListNames: Any
        get() = getWhiteListNamesHandle.invoke(handle) as Any

    val maxPlayers: Int
        get() = getMaxPlayersHandle.invoke(handle) as Int

    fun isWhiteListed(arg0: Any): Boolean {
        return isWhiteListedHandle.invoke(handle, arg0) as Boolean
    }

    val whiteList: WrapperUserWhiteList
        get() = WrapperUserWhiteList(getWhiteListHandle.invoke(handle))

    fun isOp(arg0: Any): Boolean {
        return isOpHandle.invoke(handle, arg0) as Boolean
    }

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    fun getPlayer(arg0: Any): WrapperServerPlayer {
        return WrapperServerPlayer(getPlayerHandle.invoke(handle, arg0))
    }

    val playerCount: Int
        get() = getPlayerCountHandle.invoke(handle) as Int

    val playerNamesArray: Any
        get() = getPlayerNamesArrayHandle.invoke(handle) as Any

    val simulationDistance: Int
        get() = getSimulationDistanceHandle.invoke(handle) as Int

    val viewDistance: Int
        get() = getViewDistanceHandle.invoke(handle) as Int

    fun getPlayerStats(arg0: WrapperServerPlayer): WrapperServerStatsCounter {
        return WrapperServerStatsCounter(getPlayerStatsHandle.invoke(handle, arg0.handle))
    }

    val players: Any
        get() = getPlayersHandle.invoke(handle) as Any

    val singleplayerData: WrapperCompoundTag
        get() = WrapperCompoundTag(getSingleplayerDataHandle.invoke(handle))

    val opNames: Any
        get() = getOpNamesHandle.invoke(handle) as Any

    val bans: WrapperUserBanList
        get() = WrapperUserBanList(getBansHandle.invoke(handle))

    val ipBans: WrapperIpBanList
        get() = WrapperIpBanList(getIpBansHandle.invoke(handle))

    fun canBypassPlayerLimit(arg0: Any): Boolean {
        return canBypassPlayerLimitHandle.invoke(handle, arg0) as Boolean
    }

    fun getPlayersWithAddress(arg0: String): Any {
        return getPlayersWithAddressHandle.invoke(handle, arg0) as Any
    }

    fun getPlayerByName(arg0: String): WrapperServerPlayer {
        return WrapperServerPlayer(getPlayerByNameHandle.invoke(handle, arg0))
    }

    val allowCommandsForAllPlayers: Boolean
        get() = isAllowCommandsForAllPlayersHandle.invoke(handle) as Boolean

    fun disconnectAllPlayersWithProfile(arg0: Any, arg1: WrapperServerPlayer): Boolean {
        return disconnectAllPlayersWithProfileHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun setDoWhiteList(value: Boolean) {
        doWhiteListSetterHandle.invoke(handle, value)
    }

    fun setMaxPlayers(value: Int) {
        maxPlayersSetterHandle.invoke(handle, value)
    }

    fun setViewDistance(value: Int) {
        viewDistanceSetterHandle.invoke(handle, value)
    }

    fun setSimulationDistance(value: Int) {
        simulationDistanceSetterHandle.invoke(handle, value)
    }

    fun setAllowCommandsForAllPlayers(value: Boolean) {
        allowCommandsForAllPlayersSetterHandle.invoke(handle, value)
    }

    fun setSendAllPlayerInfoIn(value: Int) {
        sendAllPlayerInfoInSetterHandle.invoke(handle, value)
    }

    fun setCserver(value: Any) {
        cserverSetterHandle.invoke(handle, value)
    }

    fun setCollideRuleTeamName(value: String) {
        collideRuleTeamNameSetterHandle.invoke(handle, value)
    }

}
