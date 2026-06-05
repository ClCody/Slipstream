package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBaseCommandBlock(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.BaseCommandBlock") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.nbt.CompoundTag"), Class.forName("net.minecraft.core.HolderLookup\$Provider")))
        }
        val isValidHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isValid", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getBukkitSenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitSender", MethodType.methodType(Class.forName("org.bukkit.command.CommandSender"), Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val isTrackOutputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isTrackOutput", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getCustomNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCustomName", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val acceptsFailureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsFailure", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val shouldInformAdminsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "shouldInformAdmins", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val acceptsSuccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "acceptsSuccess", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val performCommandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "performCommand", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.Level")))
        }
        val createCommandSourceStackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createCommandSourceStack", MethodType.methodType(Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
        val usedByHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "usedBy", MethodType.methodType(Class.forName("net.minecraft.world.InteractionResult"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPosition", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getCommandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getCommand", MethodType.methodType(String::class.java))
        }
        val getLastOutputHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLastOutput", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val getSuccessCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSuccessCount", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val lastExecutionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastExecution")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val updateLastExecutionSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("updateLastExecution")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val successCountSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("successCount")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val trackOutputSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("trackOutput")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val lastOutputSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("lastOutput")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val commandSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("command")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
        val customNameSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("customName")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val name: WrapperComponent
        get() = WrapperComponent(getNameHandle.invoke(handle))

    fun save(arg0: WrapperCompoundTag, arg1: WrapperProvider): WrapperCompoundTag {
        return WrapperCompoundTag(saveHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val valid: Boolean
        get() = isValidHandle.invoke(handle) as Boolean

    val level: WrapperServerLevel
        get() = WrapperServerLevel(getLevelHandle.invoke(handle))

    fun getBukkitSender(arg0: WrapperCommandSourceStack): Any {
        return getBukkitSenderHandle.invoke(handle, arg0.handle) as Any
    }

    val trackOutput: Boolean
        get() = isTrackOutputHandle.invoke(handle) as Boolean

    val customName: WrapperComponent
        get() = WrapperComponent(getCustomNameHandle.invoke(handle))

    val acceptsFailure: Boolean
        get() = acceptsFailureHandle.invoke(handle) as Boolean

    val shouldInformAdmins: Boolean
        get() = shouldInformAdminsHandle.invoke(handle) as Boolean

    val acceptsSuccess: Boolean
        get() = acceptsSuccessHandle.invoke(handle) as Boolean

    fun performCommand(arg0: WrapperLevel): Boolean {
        return performCommandHandle.invoke(handle, arg0.handle) as Boolean
    }

    val createCommandSourceStack: WrapperCommandSourceStack
        get() = WrapperCommandSourceStack(createCommandSourceStackHandle.invoke(handle))

    fun usedBy(arg0: WrapperPlayer): Any {
        return usedByHandle.invoke(handle, arg0.handle) as Any
    }

    val position: WrapperVec3
        get() = WrapperVec3(getPositionHandle.invoke(handle))

    val command: String
        get() = getCommandHandle.invoke(handle) as String

    val lastOutput: WrapperComponent
        get() = WrapperComponent(getLastOutputHandle.invoke(handle))

    val successCount: Int
        get() = getSuccessCountHandle.invoke(handle) as Int

    fun setLastExecution(value: Long) {
        lastExecutionSetterHandle.invoke(handle, value)
    }

    fun setUpdateLastExecution(value: Boolean) {
        updateLastExecutionSetterHandle.invoke(handle, value)
    }

    fun setSuccessCount(value: Int) {
        successCountSetterHandle.invoke(handle, value)
    }

    fun setTrackOutput(value: Boolean) {
        trackOutputSetterHandle.invoke(handle, value)
    }

    fun setLastOutput(value: WrapperComponent) {
        lastOutputSetterHandle.invoke(handle, value.handle)
    }

    fun setCommand(value: String) {
        commandSetterHandle.invoke(handle, value)
    }

    fun setCustomName(value: WrapperComponent) {
        customNameSetterHandle.invoke(handle, value.handle)
    }

}
