package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerboundSetJigsawBlockPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSetJigsawBlockPacket") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val typeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "type", MethodType.methodType(Class.forName("net.minecraft.network.protocol.PacketType")))
        }
        val getPoolHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPool", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getTargetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTarget", MethodType.methodType(Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getJointHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getJoint", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.JigsawBlockEntity\$JointType")))
        }
        val getFinalStateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getFinalState", MethodType.methodType(String::class.java))
        }
        val getPlacementPriorityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlacementPriority", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
        val getSelectionPriorityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSelectionPriority", MethodType.methodType(Int::class.javaPrimitiveType!!))
        }
    }

    val name: WrapperResourceLocation
        get() = WrapperResourceLocation(getNameHandle.invoke(handle))

    val type: WrapperPacketType
        get() = WrapperPacketType(typeHandle.invoke(handle))

    val pool: WrapperResourceLocation
        get() = WrapperResourceLocation(getPoolHandle.invoke(handle))

    val target: WrapperResourceLocation
        get() = WrapperResourceLocation(getTargetHandle.invoke(handle))

    val pos: WrapperBlockPos
        get() = WrapperBlockPos(getPosHandle.invoke(handle))

    val joint: Any
        get() = getJointHandle.invoke(handle) as Any

    val finalState: String
        get() = getFinalStateHandle.invoke(handle) as String

    val placementPriority: Int
        get() = getPlacementPriorityHandle.invoke(handle) as Int

    val selectionPriority: Int
        get() = getSelectionPriorityHandle.invoke(handle) as Int

}
