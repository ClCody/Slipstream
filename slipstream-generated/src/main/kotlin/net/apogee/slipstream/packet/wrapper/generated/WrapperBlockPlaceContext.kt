package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperBlockPlaceContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.item.context.BlockPlaceContext") }
        private val lookup = MethodHandles.lookup()

        val getClickedPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getClickedPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getNearestLookingDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNearestLookingDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val replacingClickedOnBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "replacingClickedOnBlock", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val canPlaceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "canPlace", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getNearestLookingVerticalDirectionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNearestLookingVerticalDirection", MethodType.methodType(Class.forName("net.minecraft.core.Direction")))
        }
        val getNearestLookingDirectionsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getNearestLookingDirections", MethodType.methodType(Class.forName("[Lnet.minecraft.core.Direction;")))
        }
        val replaceClickedSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("replaceClicked")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    val clickedPos: WrapperBlockPos
        get() = WrapperBlockPos(getClickedPosHandle.invoke(handle))

    val nearestLookingDirection: Any
        get() = getNearestLookingDirectionHandle.invoke(handle) as Any

    val replacingClickedOnBlock: Boolean
        get() = replacingClickedOnBlockHandle.invoke(handle) as Boolean

    val canPlace: Boolean
        get() = canPlaceHandle.invoke(handle) as Boolean

    val nearestLookingVerticalDirection: Any
        get() = getNearestLookingVerticalDirectionHandle.invoke(handle) as Any

    val nearestLookingDirections: Any
        get() = getNearestLookingDirectionsHandle.invoke(handle) as Any

    fun setReplaceClicked(value: Boolean) {
        replaceClickedSetterHandle.invoke(handle, value)
    }

}
