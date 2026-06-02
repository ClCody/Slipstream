# 📖 API Guide

## 🚀 Getting the Manager
To start using Slipstream, you need to get the `SlipstreamManager` instance. You can do this via the singleton:

```kotlin
val manager = SlipstreamPlugin.instance.manager
```

## 📡 Listening for Packets

### Synchronous Listener
Best for lightweight checks and anti-cheat triggers.
```kotlin
manager.registerListener(object : PacketListener {
    override fun onPacketIn(player: Player, packet: Any): Boolean {
        if (packet.isMovePacket()) {
            val wrapper = packet.asMovePacket()
            println("Player moved to ${wrapper.x}")
        }
        return true 
    }
}, PacketPriority.HIGH)
```

### Suspendable Listener
Perfect for I/O bound operations. Packet order for the player is strictly preserved.
```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    override fun interestsInbound(packet: Any): Boolean = packet.isMovePacket()

    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        return database.checkStatus(player.uniqueId) // Safe suspend!
    }
})
```

## 🪄 Packet Mutation (PacketModifier)
Modify any packet field by index without specialized wrappers.
```kotlin
val modifier = packet.modifier()
val x = modifier.readDouble(0)
modifier.writeDouble(0, x + 10.0) // On-the-fly mutation
```

## 🚉 ProtocolLib Compatibility Layer
If you are coming from ProtocolLib, you can use a familiar syntax. This layer has **zero overhead** as it uses Kotlin value classes and MethodHandles under the hood.

```kotlin
val container = packet.asContainer()
val x = container.getDoubles().read(0)
container.getDoubles().write(0, x + 5.0)

val message = container.getStrings().read(0)
```
*Note: Fields are sorted alphabetically by their Mojang names to ensure stable indexing.*

## ⏳ Packet Awaiter
Linear, non-blocking packet awaiting.
```kotlin
val response = manager.awaitPacket<ServerboundTransactionPacket>(player, consume = true) { 
    it.packet.id == 1337 
}
```

## ⚖️ Event Priorities
Slipstream follows the standard Bukkit priority model:
`LOWEST` -> `LOW` -> `NORMAL` -> `HIGH` -> `HIGHEST` -> `MONITOR`.

Listeners are executed in priority order. `MONITOR` listeners should not modify the packet.
