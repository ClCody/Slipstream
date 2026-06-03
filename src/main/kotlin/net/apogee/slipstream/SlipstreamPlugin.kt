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

import net.apogee.slipstream.debug.chronicle.ChronicleCommand
import net.apogee.slipstream.debug.chronicle.ChronicleGUI
import net.apogee.slipstream.debug.chronicle.ChronicleService

class SlipstreamPlugin : JavaPlugin() {
    companion object {
        lateinit var instance: SlipstreamPlugin
            private set
    }

    private val pluginScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    lateinit var manager: SlipstreamManager
        private set
        
    private lateinit var injector: Injector
    
    lateinit var stateTracker: ClientStateTracker
        private set

    override fun onLoad() {
        instance = this
        manager = SlipstreamManager(pluginScope)
        stateTracker = ClientStateTracker()
    }

    override fun onEnable() {
        logger.info("Enabling Slipstream Framework...")

        // Принудительно загружаем классы корутин
        try {
            Class.forName("kotlinx.coroutines.JobCancellationException")
            Class.forName("kotlinx.coroutines.CoroutineScopeKt")
        } catch (ignored: Exception) {}
        
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
        
        // Регистрация событий трекера
        manager.registerListener(stateTracker)
        server.pluginManager.registerEvents(stateTracker, this)
        
        injector = Injector(this, manager)
        server.pluginManager.registerEvents(injector, this)

        // Инициализация дебаг-инструментов
        setupDebugTools()
        
        logger.info("Slipstream initialized with Zero-Reflection, Zero-Allocation and Coroutine-First principles.")
    }

    private fun setupDebugTools() {
        // Packet Chronicle
        val chronicleGUI = ChronicleGUI()
        server.pluginManager.registerEvents(chronicleGUI, this)
        manager.registerListener(ChronicleService)
        
        val chronicleCommand = ChronicleCommand(chronicleGUI)
        server.commandMap.register("slipstream", chronicleCommand)
    }

    override fun onDisable() {
        logger.info("Disabling Slipstream Framework...")
        if (::injector.isInitialized) {
            injector.ejectAll()
        }
        if (::stateTracker.isInitialized) {
            stateTracker.cleanup()
        }
        pluginScope.cancel()
    }
}