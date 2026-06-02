package net.apogee.slipstream.api

import kotlinx.coroutines.suspendCancellableCoroutine
import org.bukkit.entity.Player
import kotlin.coroutines.resume

/**
 * Awaits the next inbound packet from a player that satisfies [filter].
 *
 * ## Hybrid Observe/Consume Model
 *
 * - When [consume] is `false` (default): observe-mode. The awaiter receives the packet
 *   but it continues through the pipeline to other handlers. Multiple awaiters can all
 *   observe the same packet.
 * - When [consume] is `true`: consume-mode. The awaiter claims the packet exclusively.
 *   After it runs, the packet is stopped from further processing (no other handlers see it).
 *
 * @param player   The player whose packets to listen for
 * @param consume  If true, the packet will be consumed (removed from the pipeline) after the awaiter processes it
 * @param filter   Predicate to filter which packets to match (default: match all)
 * @return The matching packet
 */
suspend inline fun <reified T : Any> SlipstreamManager.awaitPacket(
    player: Player,
    consume: Boolean = false,
    crossinline filter: (AwaitEvent) -> Boolean = { true }
): T = suspendCancellableCoroutine { continuation ->
    val handler = getHandler(player) 
        ?: throw IllegalStateException("Packet handler not found for \${player.name}")
    
    val awaiter: (AwaitEvent) -> Boolean = { event ->
        if (event.packet is T && filter(event)) {
            continuation.resume(event.packet)
            if (consume) {
                event.consume()
            }
            true // Remove ourselves from the awaiter queue (O(1))
        } else {
            false
        }
    }
    
    // Safe addition through EventLoop
    handler.addAwaiter(awaiter)

    // Unsubscribe on coroutine cancellation (e.g., player left or timeout)
    continuation.invokeOnCancellation {
        handler.removeAwaiter(awaiter)
    }
}
