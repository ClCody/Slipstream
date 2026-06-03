package net.apogee.slipstream.packet.wrapper

import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.packet.PacketModifier
import net.apogee.slipstream.packet.modifier

/**
 * Zero-Allocation обертка для ClientboundSystemChatPacket (системный чат/ActionBar/и т.д.).
 */
@JvmInline
value class WrapperSystemChatPacket(val handle: Any) {
    
    val modifier: PacketModifier
        get() = handle.modifier()

    // В 1.20+ контент чата передается как Component.
    // Из-за отсутствия прямого доступа к Component без API, здесь можно получить Any? (Object)
    // и конвертировать его через Paper Adventure API.
    val content: Any?
        get() = modifier.readObject(0)
        
    val overlay: Boolean
        get() = modifier.readBoolean(0)
}

fun Any.isSystemChatPacket(): Boolean = PacketMappers.clientboundSystemChatPacketClass.isInstance(this)

fun Any.asSystemChatPacket(): WrapperSystemChatPacket = WrapperSystemChatPacket(this)
