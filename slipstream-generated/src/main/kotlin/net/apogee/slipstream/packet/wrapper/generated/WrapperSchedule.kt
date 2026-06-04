package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSchedule(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.entity.schedule.Schedule") }
        private val lookup = MethodHandles.lookup()

        val getActivityAtHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getActivityAt", MethodType.methodType(Class.forName("net.minecraft.world.entity.schedule.Activity"), Int::class.javaPrimitiveType!!))
        }
    }

    fun getActivityAt(arg0: Int): WrapperActivity {
        return WrapperActivity(getActivityAtHandle.invoke(handle, arg0))
    }

}
