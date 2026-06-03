package net.apogee.slipstream

import io.papermc.paper.plugin.bootstrap.BootstrapContext
import io.papermc.paper.plugin.bootstrap.PluginBootstrap
import io.papermc.paper.plugin.bootstrap.PluginProviderContext
import net.apogee.slipstream.packet.PacketMappers
import org.bukkit.plugin.java.JavaPlugin

class SlipstreamBootstrap : PluginBootstrap {

    override fun bootstrap(context: BootstrapContext) {
        context.logger.info("Slipstream initialized on Mojang-mapped environment.")
    }

    override fun createPlugin(context: PluginProviderContext): JavaPlugin {
        return SlipstreamPlugin()
    }
}
