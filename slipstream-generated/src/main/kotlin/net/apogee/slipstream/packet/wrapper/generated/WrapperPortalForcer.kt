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

        val findClosestPortalPositionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "findClosestPortalPosition", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.world.level.border.WorldBorder"), Int::class.javaPrimitiveType!!))
        }
        val createPortalHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createPortal", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.core.BlockPos"), Class.forName("net.minecraft.core.Direction\$Axis")))
        }
    }

    fun findClosestPortalPosition(arg0: WrapperBlockPos, arg1: WrapperWorldBorder, arg2: Int): Any {
        return findClosestPortalPositionHandle.invoke(handle, arg0.handle, arg1.handle, arg2) as Any
    }

    fun createPortal(arg0: WrapperBlockPos, arg1: Any): Any {
        return createPortalHandle.invoke(handle, arg0.handle, arg1) as Any
    }

}
