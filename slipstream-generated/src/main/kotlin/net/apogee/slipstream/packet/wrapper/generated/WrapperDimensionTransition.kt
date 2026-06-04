package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDimensionTransition(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.portal.DimensionTransition") }
        private val lookup = MethodHandles.lookup()

        val newLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "newLevel", MethodType.methodType(Class.forName("net.minecraft.server.level.ServerLevel")))
        }
        val posHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "pos", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val speedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "speed", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val yRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "yRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val xRotHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "xRot", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val missingRespawnBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "missingRespawnBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val postDimensionTransitionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "postDimensionTransition", MethodType.methodType(Class.forName("net.minecraft.world.level.portal.DimensionTransition\$PostDimensionTransition")))
        }
        val causeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cause", MethodType.methodType(Class.forName("org.bukkit.event.player.PlayerTeleportEvent\$TeleportCause")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.server.level.ServerLevel"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("net.minecraft.world.phys.Vec3"), Float::class.javaPrimitiveType!!, Float::class.javaPrimitiveType!!, Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.level.portal.DimensionTransition\$PostDimensionTransition"), Class.forName("org.bukkit.event.player.PlayerTeleportEvent\$TeleportCause")))
        }
    }

    val newLevel: WrapperServerLevel
        get() = WrapperServerLevel(newLevelHandle.invoke(handle))

    val pos: WrapperVec3
        get() = WrapperVec3(posHandle.invoke(handle))

    val speed: WrapperVec3
        get() = WrapperVec3(speedHandle.invoke(handle))

    val yRot: Float
        get() = yRotHandle.invoke(handle) as Float

    val xRot: Float
        get() = xRotHandle.invoke(handle) as Float

    val missingRespawnBlock: Boolean
        get() = missingRespawnBlockHandle.invoke(handle) as Boolean

    val postDimensionTransition: WrapperPostDimensionTransition
        get() = WrapperPostDimensionTransition(postDimensionTransitionHandle.invoke(handle))

    val cause: Any
        get() = causeHandle.invoke(handle) as Any

    fun copy(newLevel: WrapperServerLevel = this.newLevel, pos: WrapperVec3 = this.pos, speed: WrapperVec3 = this.speed, yRot: Float = this.yRot, xRot: Float = this.xRot, missingRespawnBlock: Boolean = this.missingRespawnBlock, postDimensionTransition: WrapperPostDimensionTransition = this.postDimensionTransition, cause: Any = this.cause): WrapperDimensionTransition {
        return WrapperDimensionTransition(constructorHandle.invoke(newLevel.handle, pos.handle, speed.handle, yRot, xRot, missingRespawnBlock, postDimensionTransition.handle, cause))
    }

}
