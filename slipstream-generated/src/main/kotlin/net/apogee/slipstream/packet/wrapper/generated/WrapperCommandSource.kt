package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperCommandSource(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.commands.CommandSource") }
        private val lookup = MethodHandles.lookup()

        val alwaysAcceptsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "alwaysAccepts", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
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
        val getBukkitSenderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getBukkitSender", MethodType.methodType(Class.forName("org.bukkit.command.CommandSender"), Class.forName("net.minecraft.commands.CommandSourceStack")))
        }
    }

    val alwaysAccepts: Boolean
        get() = alwaysAcceptsHandle.invoke(handle) as Boolean

    val acceptsSuccess: Boolean
        get() = acceptsSuccessHandle.invoke(handle) as Boolean

    val shouldInformAdmins: Boolean
        get() = shouldInformAdminsHandle.invoke(handle) as Boolean

    val acceptsFailure: Boolean
        get() = acceptsFailureHandle.invoke(handle) as Boolean

    fun getBukkitSender(arg0: WrapperCommandSourceStack): Any {
        return getBukkitSenderHandle.invoke(handle, arg0.handle) as Any
    }

}
