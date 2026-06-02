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
If you are migrating a plugin from ProtocolLib, you can use our full compatibility layer. It provides a familiar API with **zero overhead**, as all components are implemented using Kotlin value classes and MethodHandles.

### Direct Access (PacketContainer)
```kotlin
val container = packet.asContainer()
val x = container.getDoubles().read(0)
container.getDoubles().write(0, x + 5.0)
```

### Full ProtocolLib Mimicry
You can even use the `ProtocolLibrary` entry point and `PacketAdapter`:

```kotlin
val protocolManager = ProtocolLibrary.getProtocolManager()

protocolManager.addPacketListener(object : PacketAdapter() {
    override fun onPacketReceiving(event: PacketEvent) {
        val container = event.packet
        val x = container.getDoubles().read(0)
        
        println("Intercepted packet from ${event.player.name} at X: $x")
        
        // Cancel packet just like in ProtocolLib
        event.isCancelled = true
    }
})
```
*Note: This API is located in `net.apogee.slipstream.api.compat`.*

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
