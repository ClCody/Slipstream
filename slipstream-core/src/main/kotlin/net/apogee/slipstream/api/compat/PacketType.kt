package net.apogee.slipstream.api.compat

import net.apogee.slipstream.packet.PacketMappers

/**
 * Имитация PacketType из ProtocolLib.
 * Позволяет фильтровать пакеты по их классам.
 */
class PacketType(val packetClass: Class<*>) {

    object Play {
        object Client {
            @JvmStatic val FLYING = PacketType(PacketMappers.serverboundMovePlayerPacketClass)
            @JvmStatic val POSITION = PacketType(PacketMappers.serverboundMovePlayerPacketClass)
            @JvmStatic val POSITION_LOOK = PacketType(PacketMappers.serverboundMovePlayerPacketClass)
            @JvmStatic val LOOK = PacketType(PacketMappers.serverboundMovePlayerPacketClass)
            
            // Можно будет добавить больше типов по мере расширения PacketMappers
        }
        
        object Server {
            // Заглушки для исходящих пакетов
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PacketType) return false
        return packetClass == other.packetClass
    }

    override fun hashCode(): Int = packetClass.hashCode()
}
