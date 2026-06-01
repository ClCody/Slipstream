package net.apogee.slipstream.api

import kotlinx.coroutines.suspendCancellableCoroutine
import org.bukkit.entity.Player
import kotlin.coroutines.resume

/**
 * Ожидает следующий входящий пакет от игрока, который удовлетворяет [filter].
 * Идеально для анти-читов: отправить транзакцию и заморозить выполнение корутины проверки до ответа (awaitResponse).
 */
suspend inline fun <reified T : Any> SlipstreamManager.awaitPacket(
    player: Player,
    crossinline filter: (T) -> Boolean = { true }
): T = suspendCancellableCoroutine { continuation ->
    val listener = object : PacketListener {
        override fun onPacketIn(p: Player, packet: Any): Boolean {
            if (p == player && packet is T && filter(packet)) {
                // Нашли нужный пакет — возобновляем корутину
                continuation.resume(packet)
                // Отписываем слушателя, он одноразовый
                unregisterListener(this)
            }
            return true
        }
    }
    
    // Если корутина отменяется, отписываем слушателя для избежания утечек памяти
    continuation.invokeOnCancellation {
        unregisterListener(listener)
    }

    registerListener(listener)
}