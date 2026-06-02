# ⚡ Slipstream Engine

![Kotlin](https://img.shields.io/badge/Kotlin-2.0+-blue.svg)
![PaperMC](https://img.shields.io/badge/Paper-1.21+-black.svg)
![Performance](https://img.shields.io/badge/Performance-Zero_Overhead-success.svg)

**Slipstream** is a Next-Gen framework for packet interception and physics simulation in Minecraft (Paper).
Built as an ultra-fast, modern alternative to heavy libraries (like ProtocolLib), designed specifically for Kotlin developers with an absolute focus on maximum performance and production stability.

No runtime reflection overhead. Zero Garbage Collector pressure. Native Coroutines support.

## 🔥 Why Slipstream?

* 🚀 **Zero-Reflection Bytecode Bridge:** Uses `MethodHandles` and Kotlin `value classes`. Packets are processed at the speed of compiled JIT bytecode.
* 🧵 **Coroutine-First & Lazy Suspend:** Asynchronous packet processing directly in the Netty thread. Slipstream only launches coroutines when a listener is interested, otherwise, it stays 100% synchronous.
* 📐 **High-Performance Physics:** Independent built-in math (`MutableAABB`, `MutableVec3d`) and ultra-fast RayTracing. Utilizes a **Ring Buffer** for 0-byte allocations during physics updates.
* 🪄 **Full Packet Mutation:** Read and write any packet field by index (ProtocolLib-style) or via specialized zero-allocation wrappers.
* 🗺️ **Cross-Version Mapping Resolver:** Built-in support for Mojang/Paper mappings, ensuring your plugin works across multiple versions (1.21+) without changes.

## 📖 Documentation & Wiki

* [🏗️ Architecture](docs/ARCHITECTURE.md) — Lazy Suspend, Zero-Allocation Queues, and Pipeline internals.
* [📖 API Guide](docs/API_GUIDE.md) — Listeners, Priorities, Awaiters, and Modifiers.
* [⏱️ Performance](docs/PERFORMANCE.md) — JMH Benchmarks and why we are the fastest.

## 🚉 Migration from ProtocolLib

| Feature | ProtocolLib | Slipstream |
| :--- | :--- | :--- |
| **Access** | `StructureModifier` (Reflective) | `PacketModifier` (MethodHandles) |
| **Mutation** | `setField()` (Slow) | `writeField()` (Fast) |
| **Allocation** | `PacketContainer` (Heap) | `@JvmInline value class` (Stack/Zero) |
| **Async** | `AsyncMarker` / Task Chain | Native Coroutines (`Suspendable`) |
| **Ordering** | Complex to manage | Guaranteed (Pipeline Buffering) |

## 🛠️ Status & Version Support

* **Current Status:** 🟢 Production Ready
* **Supported Versions:** 1.21, 1.21.1, 1.21.3, 1.21.4 (Paper/Mojang Mappings)
* **Kotlin Version:** 2.0.0+
* **JDK Version:** 21+

## ⏱️ Benchmarks

Slipstream is built for speed. 

| Operation | ProtocolLib (ns/op) | Slipstream (ns/op) | Improvement |
|-----------|-------------------|--------------------|-------------|
| Field Read | ~18.5             | **~1.1**           | **~16x**     |
| Field Write| ~21.2             | **~1.4**           | **~15x**     |

*Benchmarked using JMH on OpenJDK 21. See [docs/PERFORMANCE.md](docs/PERFORMANCE.md) for details.*

## 💻 Usage Examples (API)

### 1. Asynchronous Listeners (Suspend Listeners)
Don't block the server and Netty! Make database queries right during packet processing. The packet order won't be disrupted:

```kotlin
val manager = SlipstreamPlugin.instance.manager

manager.registerSuspendListener(object : SuspendablePacketListener {
    override fun interestsInbound(packet: Any): Boolean = packet.isMovePacket()

    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        // The coroutine can suspend, the order of following packets is preserved!
        val isBanned = database.checkPlayerSuspend(player.uniqueId)
        return !isBanned // false = cancel packet
    }
})
```

### 2. Linear Packet Awaiting (Packet Awaiter)
Forget about state machines for checks; wait for client responses in a single coroutine:

```kotlin
val manager = SlipstreamPlugin.instance.manager

// Send a transaction to the client
player.sendPacket(TransactionPacket(id = 1337))

// The coroutine suspends until the client sends a response with the target ID
val response = manager.awaitPacket<ServerboundTransactionPacket>(player) { it.id == 1337 }

player.sendMessage("Your ping has been verified!")
```

### 3. Flexible Packet Access (ProtocolLib-style)
Access any field by index with zero overhead:

```kotlin
val manager = SlipstreamPlugin.instance.manager

manager.registerListener(object : PacketListener {
    override fun onPacketIn(player: Player, packet: Any): Boolean {
        val modifier = packet.modifier()
        val x = modifier.readDouble(0) // Alphabetical sorting ensures index stability
        
        println("Player X coordinate: $x")
        return true
    }
})
```

## 📄 License
MIT License.
