package net.apogee.slipstream.api

/**
 * Wrapper for a packet within an awaiter invocation.
 *
 * ## Hybrid Observe/Consume Model
 *
 * By default, all awaiters observe the packet (observe-model): the packet continues
 * through the pipeline even after awaiters process it. If an awaiter needs to stop
 * the packet from proceeding, it calls [consume].
 *
 * Example:
 * ```kotlin
 * // Simply observe a packet (default behavior) — packet continues to other handlers
 * manager.awaitPacket<Position>(player) { event ->
 *     if (event.packet.isSuspicious) {
 *         flagForReview(event.packet)
 *     }
 * }
 *
 * // Explicitly consume a packet — packet stops here for subsequent handlers
 * manager.awaitPacket<Position>(player, consume = true) { event ->
 *     if (event.packet.isCheating) {
 *         blockMovement(event.packet)
 *         event.consume()  // stops the packet from propagating
 *     }
 * }
 * ```
 *
 * @property packet The raw packet object received from Netty
 */
class AwaitEvent(val packet: Any) {
    /**
     * When true, the packet will not be forwarded to subsequent pipeline handlers.
     */
    var isConsumed: Boolean = false
        private set

    /**
     * Marks this packet as consumed. The packet will not continue through the
     * Slipstream pipeline after this point.
     *
     * This is a one-way operation — once consumed, the packet cannot be "un-consumed".
     */
    fun consume() {
        isConsumed = true
    }
}