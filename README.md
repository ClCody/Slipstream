# ⚡ Slipstream Engine (v2.0.0)

![Kotlin](https://img.shields.io/badge/Kotlin-2.0+-blue.svg)
![PaperMC](https://img.shields.io/badge/Paper-1.21+-black.svg)
![Performance](https://img.shields.io/badge/Performance-Zero_Overhead-success.svg)
![JitPack](https://jitpack.io/v/ClCody/Slipstream.svg)

**Slipstream** is a Next-Gen framework for packet interception and physics simulation in Minecraft (Paper).
Built as an ultra-fast, modern alternative to heavy libraries (like ProtocolLib), designed specifically for Kotlin developers with an absolute focus on maximum performance and production stability.

Starting with **v2.0.0**, Slipstream utilizes a **Multi-Module Architecture** with automatic generation of `@JvmInline value class` wrappers directly from NMS, providing **100% type safety**, **Java Records support**, and **Zero-Allocation** access without polluting the global namespace.

## 🔥 Why Slipstream?

* 🚀 **Zero-Reflection Bytecode Bridge:** Uses `MethodHandles` and Kotlin `value classes`. Packets are processed at the speed of compiled JIT bytecode.
* 🛡️ **Type-Safe & Clean API:** Forget `packet.isMovePacket()`. Use our beautifully crafted `packet.wrapAs<WrapperMovePacket>()` which uses `inline reified` magic to guarantee zero runtime overhead and a clean autocomplete scope.
* 📦 **Zero-Allocation Nested Structures:** Automatically generated wrappers for internal NMS types like `BlockPos`, `Vec3`, `ItemStack` ensure no objects are unnecessarily instantiated in the heap.
* 🧵 **Coroutine-First & Lazy Suspend:** Asynchronous packet processing directly in the Netty thread. Slipstream only launches coroutines when a listener is interested, otherwise, it stays 100% synchronous.
* 🪄 **Full Packet Mutation:** Mutate packets easily via generated setters for mutable fields, or via `.copy()` for immutable Java Records.
* 🗺️ **Native Mojang Mappings:** Deeply integrated with Paper's native Mojang-mapped environment (1.21+).

## 📖 Documentation & Wiki

* [🏗️ Architecture](docs/ARCHITECTURE.md) — Multi-module design, Code Generation, and Pipeline internals.
* [📖 API Guide](docs/API_GUIDE.md) — Listeners, Awaiters, `wrapAs`, and Modifiers.
* [⏱️ Performance](docs/PERFORMANCE.md) — JMH Benchmarks, Inline Reified optimizations, and MethodHandles.

## 🚉 Quick Start

**Gradle (JitPack)**
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    // You only need to depend on the core module, the generated wrappers are pulled automatically!
    implementation("com.github.ClCody.Slipstream:slipstream-core:2.0.0")
}
```

## 💻 Usage Examples (API)

### 1. Type-Safe Casts (wrapAs) & Synchronous Listeners
The core of Slipstream's DX. Check and cast a packet in one single zero-overhead line:

```kotlin
val manager = SlipstreamPlugin.instance.manager

manager.registerListener(object : PacketListener {
    override fun onPacketIn(player: Player, packet: Any): Boolean {
        // wrapAs<T>() returns null if it's the wrong packet. 
        // Powered by inline reified, so 0 overhead!
        packet.wrapAs<WrapperServerboundMovePlayerPacket>()?.let { movePacket ->
            val pos = movePacket.pos // Returns a WrapperBlockPos (zero-allocation)
            println("Player moved to X: ${pos.x}, Y: ${pos.y}")
        }
        return true
    }
})
```

### 2. Asynchronous Listeners (Suspend Listeners)
Don't block the server and Netty! Make database queries right during packet processing:

```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    override fun interestsInbound(packet: Any): Boolean = packet.wrapAs<WrapperServerboundChatPacket>() != null

    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        // The coroutine can suspend, the order of following packets is strictly preserved!
        val isMuted = database.checkPlayerMute(player.uniqueId)
        return !isMuted // false = cancel packet
    }
})
```

### 3. Packet Awaiter
Linear, non-blocking packet awaiting (e.g., waiting for client transactions):

```kotlin
// Send a transaction to the client
player.sendPacket(TransactionPacket(id = 1337))

// The coroutine suspends until the client sends a response with the target ID
val response = manager.awaitPacket<WrapperServerboundPongPacket>(player) { 
    it.packet.id == 1337 
}
```

### 4. Modifying Packets (Setters & Records)
```kotlin
packet.wrapAs<WrapperClientboundSetEntityDataPacket>()?.let { dataPacket ->
    // Modifying a mutable packet using generated MethodHandle setters
    dataPacket.id = 999 
}

packet.wrapAs<WrapperServerboundSwingPacket>()?.let { swingPacket ->
    // For immutable Java Records, a copy() method is generated (just like Kotlin data classes)
    val modified = swingPacket.copy(hand = InteractionHand.OFF_HAND)
}
```

## 📄 License
MIT License.