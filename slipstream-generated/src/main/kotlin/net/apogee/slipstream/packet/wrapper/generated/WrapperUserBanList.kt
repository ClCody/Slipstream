package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperUserBanList(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.players.UserBanList") }
        private val lookup = MethodHandles.lookup()

        val isBannedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isBanned", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
        val getUserListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUserList", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
    }

    fun isBanned(arg0: Any): Boolean {
        return isBannedHandle.invoke(handle, arg0) as Boolean
    }

    val userList: Any
        get() = getUserListHandle.invoke(handle) as Any

}
