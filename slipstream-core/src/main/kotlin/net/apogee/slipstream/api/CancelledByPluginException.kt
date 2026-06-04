package net.apogee.slipstream.api

/**
 * Thrown when a packet is rejected by a Slipstream plugin.
 * 
 * Unlike [java.util.concurrent.CancellationException], this exception indicates
 * that the packet was intentionally blocked by plugin logic (e.g., anti-cheat,
 * rate limiting), not cancelled by the user.
 *
 * @param message Reason for blocking the packet
 * @param plugin Name of the plugin that blocked the packet (optional)
 */
class CancelledByPluginException(
    message: String,
    val plugin: String? = null
) : Exception(message)