package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPortalForcer(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.portal.PortalForcer") }
        private val lookup = MethodHandles.lookup()

        val createPortalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createPortal", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Direction\$Axis"), Class.forName("net.minecraft.world.entity.Entity"), Int::class.javaPrimitiveType!!))
        }
        val findClosestPortalPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findClosestPortalPosition", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.border.WorldBorder")))
        }
    }

    fun createPortal(arg0: WrapperBlockPos, arg1: Any, arg2: WrapperEntity, arg3: Int): Any {
        return createPortalHandle.invoke(handle, arg0.handle, arg1, arg2.handle, arg3) as Any
    }

    fun findClosestPortalPosition(arg0: WrapperBlockPos, arg1: Boolean, arg2: WrapperWorldBorder): Any {
        return findClosestPortalPositionHandle.invoke(handle, arg0.handle, arg1, arg2.handle) as Any
    }

}
