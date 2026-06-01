package net.apogee.slipstream.api

import kotlinx.coroutines.suspendCancellableCoroutine
import org.bukkit.entity.Player
import kotlin.coroutines.resume

/**
 * Ожидает следующий входящий пакет от игрока, который удовлетворяет [filter].
 * Использует локальную очередь Netty-обработчика игрока, избавляясь от CopyOnWriteArrayList и лишних аллокаций.
 */
suspend inline fun <reified T : Any> SlipstreamManager.awaitPacket(
    player: Player,
    crossinline filter: (T) -> Boolean = { true }
): T = suspendCancellableCoroutine { continuation ->
    val handler = getHandler(player) 
        ?: throw IllegalStateException("Packet handler not found for \${player.name}")
    
    val awaiter: (Any) -> Boolean = { packet ->
        if (packet is T && filter(packet)) {
            continuation.resume(packet)
            true // Возвращаем true -> хэндлер автоматически удалит нас из очереди (O(1))
        } else {
            false
        }
    }
    
    // Безопасное добавление через EventLoop
    handler.addAwaiter(awaiter)

    // Отписка при отмене корутины (например, если игрок ливнул или истек таймаут)
    continuation.invokeOnCancellation {
        handler.removeAwaiter(awaiter)
    }
}