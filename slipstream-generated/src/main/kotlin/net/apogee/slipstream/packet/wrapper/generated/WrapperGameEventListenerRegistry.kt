package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperGameEventListenerRegistry(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.gameevent.GameEventListenerRegistry") }
        private val lookup = MethodHandles.lookup()

        val isEmptyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isEmpty", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val visitInRangeListenersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "visitInRangeListeners", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.core.Holder"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.level.gameevent.GameEvent\$Context"), Class.forName("net.minecraft.world.level.gameevent.GameEventListenerRegistry\$ListenerVisitor")))
        }
    }

    val empty: Boolean
        get() = isEmptyHandle.invoke(handle) as Boolean

    fun visitInRangeListeners(arg0: WrapperHolder, arg1: WrapperVec3, arg2: WrapperContext, arg3: Any): Boolean {
        return visitInRangeListenersHandle.invoke(handle, arg0.handle, arg1.handle, arg2.handle, arg3) as Boolean
    }

}
