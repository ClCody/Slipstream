package net.apogee.slipstream.debug.chronicle

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class ChronicleCommand(private val gui: ChronicleGUI) : Command("ss") {

    init {
        description = "Slipstream main debug command"
        permission = "slipstream.admin.debug"
        aliases = listOf("slipstream")
    }

    override fun execute(sender: CommandSender, commandLabel: String, args: Array<out String>): Boolean {
        if (!sender.hasPermission("slipstream.admin.debug")) {
            sender.sendMessage(Component.text("No permission.", NamedTextColor.RED))
            return true
        }

        if (args.isEmpty()) {
            sender.sendMessage(Component.text("Usage: /ss chronicle <start|stop|gui> [player]", NamedTextColor.RED))
            return true
        }

        val action = args[0].lowercase()
        val target = if (args.size > 1) Bukkit.getPlayer(args[1]) else sender as? Player

        if (target == null) {
            sender.sendMessage(Component.text("Player not found.", NamedTextColor.RED))
            return true
        }

        when (action) {
            "start" -> {
                ChronicleService.startDebugging(target)
                sender.sendMessage(Component.text("Chronicle STARTED for ${target.name}", NamedTextColor.GREEN))
            }
            "stop" -> {
                ChronicleService.stopDebugging(target)
                sender.sendMessage(Component.text("Chronicle STOPPED for ${target.name}", NamedTextColor.YELLOW))
            }
            "gui" -> {
                if (sender is Player) {
                    gui.openHistory(sender)
                } else {
                    sender.sendMessage("GUI only available for players.")
                }
            }
            else -> sender.sendMessage(Component.text("Unknown action: $action", NamedTextColor.RED))
        }

        return true
    }

    override fun tabComplete(sender: CommandSender, alias: String, args: Array<out String>): List<String> {
        if (args.size == 1) {
            return listOf("start", "stop", "gui").filter { it.startsWith(args[0].lowercase()) }
        }
        if (args.size == 2) {
            return Bukkit.getOnlinePlayers().map { it.name }.filter { it.startsWith(args[1], ignoreCase = true) }
        }
        return emptyList()
    }
}
