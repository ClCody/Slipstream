package net.apogee.slipstream.api

import org.bukkit.entity.Player

/**
 * Интерфейс для асинхронного прослушивания пакетов.
 * Позволяет использовать suspend функции (например, запросы к БД) внутри чеков.
 * ВНИМАНИЕ: Запуск suspend метода приостанавливает обработку следующих пакетов для этого игрока,
 * помещая их в очередь (Netty Buffer), чтобы сохранить строгий порядок (Packet Ordering).
 */
interface SuspendablePacketListener {

    /**
     * Вызывается асинхронно при получении пакета от клиента.
     */
    suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean = true

    /**
     * Вызывается асинхронно перед отправкой пакета клиенту.
     */
    suspend fun onPacketOutSuspend(player: Player, packet: Any): Boolean = true
}