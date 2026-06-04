package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerOpList(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.players.ServerOpList") }
        private val lookup = MethodHandles.lookup()

        val getUserListHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUserList", MethodType.methodType(Class.forName("[Ljava.lang.String;")))
        }
        val canBypassPlayerLimitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canBypassPlayerLimit", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("com.mojang.authlib.GameProfile")))
        }
    }

    val userList: Any
        get() = getUserListHandle.invoke(handle) as Any

    fun canBypassPlayerLimit(arg0: Any): Boolean {
        return canBypassPlayerLimitHandle.invoke(handle, arg0) as Boolean
    }

}
