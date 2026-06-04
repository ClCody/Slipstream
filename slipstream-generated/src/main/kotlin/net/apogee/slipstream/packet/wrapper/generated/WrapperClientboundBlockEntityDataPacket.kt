package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperClientboundBlockEntityDataPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket") }
        private val lookup = MethodHandles.lookup()

        val getTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getType", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.BlockEntityType")))
        }
        val getTagHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTag", MethodType.methodType(Class.forName("net.minecraft.nbt.CompoundTag")))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
    }

    val type: Any
        get() = getTypeHandle.invoke(handle) as Any

    val tag: Any
        get() = getTagHandle.invoke(handle) as Any

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

}

fun Any.isClientboundBlockEntityDataPacket(): Boolean = WrapperClientboundBlockEntityDataPacket.packetClass.isInstance(this)
fun Any.asClientboundBlockEntityDataPacket(): WrapperClientboundBlockEntityDataPacket = WrapperClientboundBlockEntityDataPacket(this)
