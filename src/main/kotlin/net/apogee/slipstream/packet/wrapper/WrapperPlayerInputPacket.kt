package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ServerboundPlayerInputPacket.
 */
@JvmInline
value class WrapperPlayerInputPacket(val handle: Any) {
    
    val modifier: PacketModifier
        get() = handle.modifier()

    // В зависимости от маппингов (Mojang/Obfuscated) порядок может отличаться.
    // Для точного доступа рекомендуется использовать PacketMappers + MethodHandles для специфичных полей,
    // либо использовать индексы напрямую через modifier:
    // val xxa: Float get() = modifier.readFloat(0)
    // val zza: Float get() = modifier.readFloat(1)
    // val isJumping: Boolean get() = modifier.readBoolean(0)
    // val isShiftKeyDown: Boolean get() = modifier.readBoolean(1)
}

fun Any.isPlayerInputPacket(): Boolean = PacketMappers.serverboundPlayerInputPacketClass.isInstance(this)

fun Any.asPlayerInputPacket(): WrapperPlayerInputPacket = WrapperPlayerInputPacket(this)
