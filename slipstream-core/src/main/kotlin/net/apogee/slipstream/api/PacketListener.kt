package net.apogee.slipstream.api

import org.bukkit.entity.Player

/**
 * Интерфейс для прослушивания пакетов.
 * По умолчанию методы возвращают true (разрешить пакет).
 * Возвращение false отменяет дальнейшую отправку или обработку пакета.
 */
interface PacketListener {
    
    /**
     * Вызывается при получении пакета от клиента к серверу (Serverbound).
     * @param player Игрок, от которого пришел пакет
     * @param packet Объект пакета (NMS)
     * @return true - пропустить пакет дальше, false - отменить обработку
     */
    fun onPacketIn(player: Player, packet: Any): Boolean = true

    /**
     * Вызывается перед отправкой пакета от сервера к клиенту (Clientbound).
     * @param player Игрок, которому предназначен пакет
     * @param packet Объект пакета (NMS)
     * @return true - отправить пакет, false - отменить отправку
     */
    fun onPacketOut(player: Player, packet: Any): Boolean = true
}
