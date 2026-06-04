package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerLevelAccessor(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.ServerLevelAccessor") }
        private val lookup = MethodHandles.lookup()

        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val getMinecraftWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMinecraftWorld", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
    }

    val level: WrapperServerLevel
        get() = WrapperServerLevel(getLevelHandle.invoke(handle))

    val minecraftWorld: WrapperServerLevel
        get() = WrapperServerLevel(getMinecraftWorldHandle.invoke(handle))

}
