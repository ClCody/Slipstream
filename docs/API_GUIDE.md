# 📖 API Guide (v2.0.0)

🇷🇺 [Русская версия](ru/API_GUIDE_RU.md)

## 🚀 Getting the Manager
To start using Slipstream, you need to get the `SlipstreamManager` instance. You can do this via the singleton:

```kotlin
val manager = SlipstreamPlugin.instance.manager
```

## 📡 Listening for Packets

### The `wrapAs<T>()` Extension
In Slipstream 2.0.0, we introduced a completely type-safe and zero-overhead way to identify and cast packets using inline reified functions. You don't need to pollute your global namespace with `isPacket` methods anymore.

Simply use `packet.wrapAs<WrapperClass>()`. It will return `null` if the packet is not of the specified type.

### Synchronous Listener
Best for lightweight checks and anti-cheat triggers.
```kotlin
import net.apogee.slipstream.packet.wrapper.generated.wrapAs

manager.registerListener(object : PacketListener {
    override fun onPacketIn(player: Player, packet: Any): Boolean {
        packet.wrapAs<WrapperServerboundMovePlayerPacket>()?.let { move ->
            println("Player moved to ${move.pos.x}") // WrapperBlockPos is zero-allocation!
        }
        return true 
    }
}, PacketPriority.HIGH)
```

### Suspendable Listener
Perfect for I/O bound operations. Packet order for the player is strictly preserved.
```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    // Only suspend if it's a chat packet
    override fun interestsInbound(packet: Any): Boolean = packet.wrapAs<WrapperServerboundChatPacket>() != null

    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        return database.checkStatus(player.uniqueId) // Safe suspend!
    }
})
```

## 🪄 Packet Mutation (Setters & Copy)
Modifying packets is now type-safe and fully integrated into the wrappers.

### Mutable Packets (Setters)
If the NMS packet has mutable fields, Slipstream generates zero-allocation setters for them via `MethodHandles`.
```kotlin
packet.wrapAs<WrapperClientboundSetEntityDataPacket>()?.let { dataPacket ->
    dataPacket.id = 1234 // Fast write via unreflectSetter
}
```

### Immutable Packets (Java Records)
For modern packets implemented as Java Records (1.20+), Slipstream generates a `copy()` method, identical to Kotlin data classes.
```kotlin
packet.wrapAs<WrapperServerboundSwingPacket>()?.let { swing ->
    val newPacket = swing.copy(hand = InteractionHand.OFF_HAND)
    // You must return or send newPacket since the original is immutable
}
```

## 🚉 ProtocolLib Compatibility Layer
If you are migrating a plugin from ProtocolLib, you can use our full compatibility layer. It provides a familiar API with **zero overhead**, as all components are implemented using Kotlin value classes and MethodHandles.

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
*Note: This API is located in `net.apogee.slipstream.api.compat`. However, for maximum performance and type safety, we highly recommend migrating to the native `wrapAs<T>()` API.*

## ⏳ Packet Awaiter
Linear, non-blocking packet awaiting.
```kotlin
val response = manager.awaitPacket<WrapperServerboundPongPacket>(player, consume = true) { pong ->
    pong.packet.id == 1337 
}
```

## ⚖️ Event Priorities
Slipstream follows the standard Bukkit priority model:
`LOWEST` -> `LOW` -> `NORMAL` -> `HIGH` -> `HIGHEST` -> `MONITOR`.

Listeners are executed in priority order. `MONITOR` listeners should not modify the packet.