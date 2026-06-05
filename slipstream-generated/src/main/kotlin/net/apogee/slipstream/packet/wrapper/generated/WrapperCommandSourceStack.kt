package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCommandSourceStack(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.commands.CommandSourceStack") }
        private val lookup = MethodHandles.lookup()

        val getHandleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHandle", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val getDisplayNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val levelsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "levels", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getBukkitSenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitSender", MethodType.methodType(Class.forName("org.bukkit.command.CommandSender")))
        }
        val hasPermissionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hasPermission", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Int::class.javaPrimitiveType!!))
        }
        val enabledFeaturesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "enabledFeatures", MethodType.methodType(Class.forName("net.minecraft.world.flag.FeatureFlagSet")))
        }
        val getRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotation", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec2")))
        }
        val isSilentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSilent", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val facingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "facing", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getEntityOrExceptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntityOrException", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val getPlayerOrExceptionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerOrException", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getChatMessageChainerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getChatMessageChainer", MethodType.methodType(Class.forName("net.minecraft.util.TaskChainer")))
        }
        val getOnlinePlayerNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOnlinePlayerNames", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val suggestRegistryElementsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "suggestRegistryElements", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("net.minecraft.resources.ResourceKey"), Class.forName("net.minecraft.commands.SharedSuggestionProvider\$ElementSuggestionType"), Class.forName("com.mojang.brigadier.suggestion.SuggestionsBuilder"), Class.forName("com.mojang.brigadier.context.CommandContext")))
        }
        val withSuppressedOutputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withSuppressedOutput", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val withMaximumPermissionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withMaximumPermission", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Int::class.javaPrimitiveType!!))
        }
        val getSelectedEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelectedEntities", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val shouldFilterMessageToHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldFilterMessageTo", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val getRecipeNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRecipeNames", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getAvailableSoundsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAvailableSounds", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val withSigningContextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withSigningContext", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.commands.CommandSigningContext"), Class.forName("net.minecraft.util.TaskChainer")))
        }
        val customSuggestionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "customSuggestion", MethodType.methodType(Class.forName("java.util.concurrent.CompletableFuture"), Class.forName("com.mojang.brigadier.context.CommandContext")))
        }
        val withRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withRotation", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.world.phys.Vec2")))
        }
        val getTextNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTextName", MethodType.methodType(String::class.java))
        }
        val withPermissionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPermission", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Int::class.javaPrimitiveType!!))
        }
        val getSigningContextHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSigningContext", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSigningContext")))
        }
        val getAllTeamsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAllTeams", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val withEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withEntity", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val withSourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withSource", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.commands.CommandSource")))
        }
        val isPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isPlayer", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val dispatcherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dispatcher", MethodType.methodType(Class.forName("com.mojang.brigadier.CommandDispatcher")))
        }
        val withAnchorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withAnchor", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.commands.arguments.EntityAnchorArgument\$Anchor")))
        }
        val withLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withLevel", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getAnchorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getAnchor", MethodType.methodType(Class.forName("net.minecraft.commands.arguments.EntityAnchorArgument\$Anchor")))
        }
        val getPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getEntityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getEntity", MethodType.methodType(Class.forName("net.minecraft.world.entity.Entity")))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val getServerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getServer", MethodType.methodType(Class.forName("net.minecraft.server.MinecraftServer")))
        }
        val callbackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "callback", MethodType.methodType(Class.forName("net.minecraft.commands.CommandResultCallback")))
        }
        val getPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayer", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerPlayer")))
        }
        val withCallbackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withCallback", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.commands.CommandResultCallback"), Class.forName("java.util.function.BinaryOperator")))
        }
        val withPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "withPosition", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack"), Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val currentCommandSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("currentCommand")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val bypassSelectorPermissionsSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("bypassSelectorPermissions")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val getHandle: WrapperCommandSourceStack
        get() = WrapperCommandSourceStack(getHandleHandle.invoke(handle))

    val displayName: WrapperComponent
        get() = WrapperComponent(getDisplayNameHandle.invoke(handle))

    val levels: Any
        get() = levelsHandle.invoke(handle) as Any

    val level: WrapperServerLevel
        get() = WrapperServerLevel(getLevelHandle.invoke(handle))

    val bukkitSender: Any
        get() = getBukkitSenderHandle.invoke(handle) as Any

    fun hasPermission(arg0: Int): Boolean {
        return hasPermissionHandle.invoke(handle, arg0) as Boolean
    }

    val enabledFeatures: WrapperFeatureFlagSet
        get() = WrapperFeatureFlagSet(enabledFeaturesHandle.invoke(handle))

    val rotation: WrapperVec2
        get() = WrapperVec2(getRotationHandle.invoke(handle))

    val silent: Boolean
        get() = isSilentHandle.invoke(handle) as Boolean

    fun facing(arg0: WrapperVec3): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(facingHandle.invoke(handle, arg0.handle))
    }

    val entityOrException: WrapperEntity
        get() = WrapperEntity(getEntityOrExceptionHandle.invoke(handle))

    val playerOrException: WrapperServerPlayer
        get() = WrapperServerPlayer(getPlayerOrExceptionHandle.invoke(handle))

    val chatMessageChainer: Any
        get() = getChatMessageChainerHandle.invoke(handle) as Any

    val onlinePlayerNames: Any
        get() = getOnlinePlayerNamesHandle.invoke(handle) as Any

    fun suggestRegistryElements(arg0: WrapperResourceKey, arg1: Any, arg2: Any, arg3: Any): Any {
        return suggestRegistryElementsHandle.invoke(handle, arg0.handle, arg1, arg2, arg3) as Any
    }

    val withSuppressedOutput: WrapperCommandSourceStack
        get() = WrapperCommandSourceStack(withSuppressedOutputHandle.invoke(handle))

    fun withMaximumPermission(arg0: Int): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withMaximumPermissionHandle.invoke(handle, arg0))
    }

    val selectedEntities: Any
        get() = getSelectedEntitiesHandle.invoke(handle) as Any

    fun shouldFilterMessageTo(arg0: WrapperServerPlayer): Boolean {
        return shouldFilterMessageToHandle.invoke(handle, arg0.handle) as Boolean
    }

    val recipeNames: Any
        get() = getRecipeNamesHandle.invoke(handle) as Any

    val availableSounds: Any
        get() = getAvailableSoundsHandle.invoke(handle) as Any

    fun withSigningContext(arg0: WrapperCommandSigningContext, arg1: Any): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withSigningContextHandle.invoke(handle, arg0.handle, arg1))
    }

    fun customSuggestion(arg0: Any): Any {
        return customSuggestionHandle.invoke(handle, arg0) as Any
    }

    fun withRotation(arg0: WrapperVec2): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withRotationHandle.invoke(handle, arg0.handle))
    }

    val textName: String
        get() = getTextNameHandle.invoke(handle) as String

    fun withPermission(arg0: Int): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withPermissionHandle.invoke(handle, arg0))
    }

    val signingContext: WrapperCommandSigningContext
        get() = WrapperCommandSigningContext(getSigningContextHandle.invoke(handle))

    val allTeams: Any
        get() = getAllTeamsHandle.invoke(handle) as Any

    fun withEntity(arg0: WrapperEntity): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withEntityHandle.invoke(handle, arg0.handle))
    }

    fun withSource(arg0: WrapperCommandSource): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withSourceHandle.invoke(handle, arg0.handle))
    }

    val player: Boolean
        get() = isPlayerHandle.invoke(handle) as Boolean

    val dispatcher: Any
        get() = dispatcherHandle.invoke(handle) as Any

    fun withAnchor(arg0: Any): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withAnchorHandle.invoke(handle, arg0))
    }

    fun withLevel(arg0: WrapperServerLevel): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withLevelHandle.invoke(handle, arg0.handle))
    }

    val anchor: Any
        get() = getAnchorHandle.invoke(handle) as Any

    val position: WrapperVec3
        get() = WrapperVec3(getPositionHandle.invoke(handle))

    val entity: WrapperEntity
        get() = WrapperEntity(getEntityHandle.invoke(handle))

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    val server: WrapperMinecraftServer
        get() = WrapperMinecraftServer(getServerHandle.invoke(handle))

    val callback: Any
        get() = callbackHandle.invoke(handle) as Any

    val getPlayer: WrapperServerPlayer
        get() = WrapperServerPlayer(getPlayerHandle.invoke(handle))

    fun withCallback(arg0: Any, arg1: Any): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withCallbackHandle.invoke(handle, arg0, arg1))
    }

    fun withPosition(arg0: WrapperVec3): WrapperCommandSourceStack {
        return WrapperCommandSourceStack(withPositionHandle.invoke(handle, arg0.handle))
    }

    fun setCurrentCommand(value: Any) {
        currentCommandSetterHandle.invoke(handle, value)
    }

    fun setBypassSelectorPermissions(value: Boolean) {
        bypassSelectorPermissionsSetterHandle.invoke(handle, value)
    }

}
