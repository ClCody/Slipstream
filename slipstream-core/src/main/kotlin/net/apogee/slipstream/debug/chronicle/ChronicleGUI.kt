package net.apogee.slipstream.debug.chronicle

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack
import java.text.SimpleDateFormat
import java.util.*

import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryHolder

class ChronicleGUI : Listener {

    private val timeFormat = SimpleDateFormat("HH:mm:ss.SSS")

    class ChronicleHolder(
        val type: ChronicleType, 
        val snapshots: List<PacketSnapshot>? = null,
        val currentDetail: PacketSnapshot? = null
    ) : InventoryHolder {
        private lateinit var inv: Inventory
        fun setInventory(inventory: Inventory) { inv = inventory }
        override fun getInventory(): Inventory = inv
    }

    enum class ChronicleType { HISTORY, DETAILS }

    fun openHistory(player: Player) {
        val history = ChronicleService.getHistory(player)
        val holder = ChronicleHolder(ChronicleType.HISTORY, history)
        val inv = Bukkit.createInventory(holder, 54, Component.text("Packet Chronicle (Last 50)"))
        holder.setInventory(inv)

        history.take(54).forEachIndexed { index, snapshot ->
            val item = ItemStack(if (snapshot.isInbound) Material.LIME_STAINED_GLASS_PANE else Material.LIGHT_BLUE_STAINED_GLASS_PANE)
            val meta = item.itemMeta
            meta.displayName(Component.text(snapshot.className, if (snapshot.isInbound) NamedTextColor.GREEN else NamedTextColor.BLUE))
            
            val lore = mutableListOf<Component>()
            lore.add(Component.text("Time: ${timeFormat.format(Date(snapshot.timestamp))}", NamedTextColor.GRAY))
            lore.add(Component.text("Direction: ${if (snapshot.isInbound) "Inbound" else "Outbound"}", NamedTextColor.GRAY))
            lore.add(Component.text(""))
            lore.add(Component.text("Click to inspect fields", NamedTextColor.YELLOW))
            
            meta.lore(lore)
            item.itemMeta = meta
            inv.setItem(index, item)
        }

        player.openInventory(inv)
    }

    fun openDetails(player: Player, snapshot: PacketSnapshot, backHistory: List<PacketSnapshot>?) {
        val holder = ChronicleHolder(ChronicleType.DETAILS, snapshots = backHistory, currentDetail = snapshot)
        val inv = Bukkit.createInventory(holder, 54, Component.text("Inspect: ${snapshot.className}"))
        holder.setInventory(inv)
        
        val items = mutableListOf<ItemStack>()

        fun addFields(name: String, values: List<Any?>, material: Material, color: NamedTextColor) {
            values.forEachIndexed { index, value ->
                val item = ItemStack(material)
                val meta = item.itemMeta
                meta.displayName(Component.text("$name Index $index", color))
                meta.lore(listOf(Component.text("Value: $value", NamedTextColor.WHITE)))
                item.itemMeta = meta
                items.add(item)
            }
        }

        addFields("Int", snapshot.ints, Material.IRON_INGOT, NamedTextColor.GOLD)
        addFields("Double", snapshot.doubles, Material.DIAMOND, NamedTextColor.AQUA)
        addFields("Float", snapshot.floats, Material.GOLD_INGOT, NamedTextColor.YELLOW)
        addFields("Long", snapshot.longs, Material.CLOCK, NamedTextColor.LIGHT_PURPLE)
        addFields("Boolean", snapshot.booleans, Material.LEVER, NamedTextColor.RED)
        addFields("String", snapshot.strings, Material.PAPER, NamedTextColor.WHITE)
        addFields("Object", snapshot.objects, Material.BOOK, NamedTextColor.GRAY)

        items.take(53).forEachIndexed { index, itemStack -> 
            inv.setItem(index, itemStack)
        }
        
        // Back button
        val back = ItemStack(Material.BARRIER)
        val backMeta = back.itemMeta
        backMeta.displayName(Component.text("Back to History", NamedTextColor.RED))
        back.itemMeta = backMeta
        inv.setItem(53, back)

        player.openInventory(inv)
    }

    @EventHandler
    fun onClick(event: InventoryClickEvent) {
        val holder = event.inventory.holder as? ChronicleHolder ?: return
        event.isCancelled = true
        
        val player = event.whoClicked as Player
        val slot = event.slot
        
        if (holder.type == ChronicleType.HISTORY) {
            val snapshot = holder.snapshots?.getOrNull(slot) ?: return
            openDetails(player, snapshot, holder.snapshots)
        } else if (holder.type == ChronicleType.DETAILS) {
            if (slot == 53) {
                // Если мы вернулись назад, используем старые снимки
                val oldHistory = holder.snapshots
                if (oldHistory != null) {
                    val backHolder = ChronicleHolder(ChronicleType.HISTORY, oldHistory)
                    val inv = Bukkit.createInventory(backHolder, 54, Component.text("Packet Chronicle (Last 50)"))
                    backHolder.setInventory(inv)
                    
                    oldHistory.take(54).forEachIndexed { index, snapshot ->
                        val item = ItemStack(if (snapshot.isInbound) Material.LIME_STAINED_GLASS_PANE else Material.LIGHT_BLUE_STAINED_GLASS_PANE)
                        val meta = item.itemMeta
                        meta.displayName(Component.text(snapshot.className, if (snapshot.isInbound) NamedTextColor.GREEN else NamedTextColor.BLUE))
                        val lore = mutableListOf<Component>()
                        lore.add(Component.text("Time: ${timeFormat.format(Date(snapshot.timestamp))}", NamedTextColor.GRAY))
                        lore.add(Component.text("Direction: ${if (snapshot.isInbound) "Inbound" else "Outbound"}", NamedTextColor.GRAY))
                        lore.add(Component.text(""))
                        lore.add(Component.text("Click to inspect fields", NamedTextColor.YELLOW))
                        meta.lore(lore)
                        item.itemMeta = meta
                        inv.setItem(index, item)
                    }
                    player.openInventory(inv)
                } else {
                    openHistory(player)
                }
            }
        }
    }
}
