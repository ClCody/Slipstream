package net.apogee.slipstream.api.compat

import net.apogee.slipstream.SlipstreamPlugin
import org.bukkit.Bukkit

/**
 * Главная точка входа для ProtocolLib-совместимого API.
 */
object ProtocolLibrary {
    
    /**
     * Возвращает менеджер протокола.
     */
    @JvmStatic
    fun getProtocolManager(): ProtocolManager {
        val plugin = Bukkit.getPluginManager().getPlugin("Slipstream") as? SlipstreamPlugin
            ?: error("Slipstream plugin is not loaded!")
        return ProtocolManager(plugin.manager)
    }
}
