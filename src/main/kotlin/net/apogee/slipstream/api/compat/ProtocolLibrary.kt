package net.apogee.slipstream.api.compat

import net.apogee.slipstream.SlipstreamPlugin

/**
 * Главная точка входа для ProtocolLib-совместимого API.
 */
object ProtocolLibrary {
    
    /**
     * Возвращает менеджер протокола.
     */
    @JvmStatic
    fun getProtocolManager(): ProtocolManager {
        return ProtocolManager(SlipstreamPlugin.instance.manager)
    }
}
