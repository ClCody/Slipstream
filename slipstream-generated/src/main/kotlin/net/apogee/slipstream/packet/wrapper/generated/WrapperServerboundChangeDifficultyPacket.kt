package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundChangeDifficultyPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundChangeDifficultyPacket") }
        private val lookup = MethodHandles.lookup()

        val getDifficultyHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDifficulty", MethodType.methodType(Class.forName("net.minecraft.world.Difficulty")))
        }
    }

    val difficulty: Any
        get() = getDifficultyHandle.invoke(handle) as Any

}

fun Any.isServerboundChangeDifficultyPacket(): Boolean = WrapperServerboundChangeDifficultyPacket.packetClass.isInstance(this)
fun Any.asServerboundChangeDifficultyPacket(): WrapperServerboundChangeDifficultyPacket = WrapperServerboundChangeDifficultyPacket(this)
