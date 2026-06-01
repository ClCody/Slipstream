package net.apogee.slipstream

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import net.apogee.slipstream.api.SlipstreamManager
import net.apogee.slipstream.network.Injector
import net.apogee.slipstream.packet.PacketMappers
import net.apogee.slipstream.physics.ClientStateTracker
import org.bukkit.plugin.java.JavaPlugin

class SlipstreamPlugin : JavaPlugin() {
    private val pluginScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    lateinit var manager: SlipstreamManager
        private set
        
    private lateinit var injector: Injector
    
    lateinit var stateTracker: ClientStateTracker
        private set

    override fun onEnable() {
        logger.info("Enabling Slipstream Framework...")
        
        // Инициализируем кросс-версионные маппинги (MethodHandles)
        try {
            PacketMappers.init()
            logger.info("PacketMappers initialized successfully.")
        } catch (e: Exception) {
            logger.severe("Failed to initialize PacketMappers!")
            e.printStackTrace()
            server.pluginManager.disablePlugin(this)
            return
        }

        manager = SlipstreamManager(pluginScope)
        
        // Инициализация физики и трекера
        stateTracker = ClientStateTracker()
        manager.registerListener(stateTracker)
        server.pluginManager.registerEvents(stateTracker, this)
        
        injector = Injector(this, manager)
        server.pluginManager.registerEvents(injector, this)
        
        logger.info("Slipstream initialized with Zero-Reflection, Zero-Allocation and Coroutine-First principles.")
    }

    override fun onDisable() {
        logger.info("Disabling Slipstream Framework...")
        if (::injector.isInitialized) {
            injector.ejectAll()
        }
        pluginScope.cancel()
    }
}