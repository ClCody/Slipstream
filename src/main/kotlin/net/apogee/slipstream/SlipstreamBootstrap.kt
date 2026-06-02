package net.apogee.slipstream

import io.papermc.paper.plugin.bootstrap.BootstrapContext
import io.papermc.paper.plugin.bootstrap.PluginBootstrap
import io.papermc.paper.plugin.bootstrap.PluginProviderContext
import net.apogee.slipstream.packet.PacketMappers
import org.bukkit.plugin.java.JavaPlugin

class SlipstreamBootstrap : PluginBootstrap {

    override fun bootstrap(context: BootstrapContext) {
        // Используем рефлексию для получения MappingResolver, чтобы избежать проблем с импортом
        try {
            val getMappingResolver = context.javaClass.getMethod("getMappingResolver")
            PacketMappers.mappingResolver = getMappingResolver.invoke(context)
            context.logger.info("Slipstream MappingResolver initialized via Reflection in Bootstrap.")
        } catch (e: Exception) {
            context.logger.warn("Failed to initialize MappingResolver via reflection: ${e.message}. Falling back to default names.")
        }
    }

    override fun createPlugin(context: PluginProviderContext): JavaPlugin {
        return SlipstreamPlugin()
    }
}
