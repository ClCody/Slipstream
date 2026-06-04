package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperUseOnContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.context.UseOnContext") }
        private val lookup = MethodHandles.lookup()

        val getLevelHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getLevel", MethodType.methodType(Class.forName("net.minecraft.world.level.Level")))
        }
        val getRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotation", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isInsideHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isInside", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getItemInHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getItemInHand", MethodType.methodType(Class.forName("net.minecraft.world.item.ItemStack")))
        }
        val getClickedPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClickedPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getClickedFaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClickedFace", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getPlayerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayer", MethodType.methodType(Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val getClickLocationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClickLocation", MethodType.methodType(Class.forName("net.minecraft.world.phys.Vec3")))
        }
        val getHorizontalDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHorizontalDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val isSecondaryUseActiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isSecondaryUseActive", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getHandHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getHand", MethodType.methodType(Class.forName("net.minecraft.world.InteractionHand")))
        }
    }

    val level: WrapperLevel
        get() = WrapperLevel(getLevelHandle.invoke(handle))

    val rotation: Float
        get() = getRotationHandle.invoke(handle) as Float

    val inside: Boolean
        get() = isInsideHandle.invoke(handle) as Boolean

    val itemInHand: WrapperItemStack
        get() = WrapperItemStack(getItemInHandHandle.invoke(handle))

    val clickedPos: WrapperBlockPos
        get() = WrapperBlockPos(getClickedPosHandle.invoke(handle))

    val clickedFace: Any
        get() = getClickedFaceHandle.invoke(handle) as Any

    val player: WrapperPlayer
        get() = WrapperPlayer(getPlayerHandle.invoke(handle))

    val clickLocation: WrapperVec3
        get() = WrapperVec3(getClickLocationHandle.invoke(handle))

    val horizontalDirection: Any
        get() = getHorizontalDirectionHandle.invoke(handle) as Any

    val secondaryUseActive: Boolean
        get() = isSecondaryUseActiveHandle.invoke(handle) as Boolean

    val hand: Any
        get() = getHandHandle.invoke(handle) as Any

}
