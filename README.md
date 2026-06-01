# ⚡ Slipstream Engine

![Kotlin](https://img.shields.io/badge/Kotlin-2.0+-blue.svg)
![PaperMC](https://img.shields.io/badge/Paper-1.21.4+-black.svg)
![Zero Reflection](https://img.shields.io/badge/Performance-Zero_Reflection-success.svg)
![Zero Allocation](https://img.shields.io/badge/Performance-Zero_Allocation-success.svg)

**Slipstream** is a Next-Gen framework for packet interception and physics simulation in Minecraft (Paper).
Built as an ultra-fast, modern alternative to heavy libraries (like ProtocolLib), designed specifically for Kotlin developers with an absolute focus on maximum performance.

No runtime reflection. No Garbage Collector overhead. Native Coroutines support.

## 🔥 Why Slipstream?

* 🚀 **Zero-Reflection Bytecode Bridge:** Uses `MethodHandles` and Kotlin `value classes` magic. Packets are processed at the speed of compiled C2 JIT bytecode. Zero wrapper allocations in the heap.
* 🧵 **Coroutine-First & Packet Ordering:** Asynchronous packet processing directly in the Netty thread (`ctx.executor().asCoroutineDispatcher()`). Strict packet ordering is preserved via built-in hardcore buffering.
* 📐 **High-Performance Physics:** Independent built-in math (`MutableAABB`, `MutableVec3d`) and ultra-fast RayTracing (Slab method). Utilizes a GameDev-style **Ring Buffer** for 0-byte allocations during physics updates.
* ⏱️ **Time-Travel Ready:** The built-in `ClientStateTracker` automatically saves player position history (20 ticks) for perfect lag compensation in your anti-cheats or combat systems.

## 💻 Usage Examples (API)

### 1. Asynchronous Listeners (Suspend Listeners)
Don't block the server and Netty! Make database queries right during packet processing. The packet order won't be disrupted:

```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        if (packet.isMovePacket()) {
            val wrapper = packet.asMovePacket() // Zero-Allocation wrapper
            
            // The coroutine can suspend, the order of following packets is preserved in the buffer!
            val isBanned = database.checkPlayerSuspend(player.uniqueId)
            return !isBanned // false = cancel packet
        }
        return true
    }
})
```

### 2. Linear Packet Awaiting (Packet Awaiter)
Forget about state machines for checks (e.g., ping spoofing or transactions). Send a packet — wait for the response in the same coroutine with $O(1)$ internal Netty queuing:

```kotlin
// Send a transaction to the client
player.sendPacket(TransactionPacket(id = 1337))

// The coroutine suspends until the client sends a response with the target ID
val response = manager.awaitPacket<ServerboundTransactionPacket>(player) { it.id == 1337 }

player.sendMessage("Your ping has been verified!")
```

### 3. Physics and RayTracing
Perfect for anti-cheats and custom entities:

```kotlin
// Get the player's movement history
val state = SlipstreamPlugin.instance.stateTracker.getState(player)
val currentHitbox = state.boundingBox

// Fast RayTracing (ray and hitbox intersection)
val eyePos = MutableVec3d(player.eyeLocation.x, player.eyeLocation.y, player.eyeLocation.z)
val lookDir = MutableVec3d(player.location.direction.x, player.location.direction.y, player.location.direction.z)

val hitPoint = RayTrace.intersect(eyePos, lookDir, currentHitbox)
if (hitPoint != null) {
    println("Hit point: $hitPoint")
}
```

## 🛠️ Build

The project uses **Gradle Kotlin DSL** and **Paperweight Userdev**.

```bash
git clone https://github.com/YourName/Slipstream.git
cd Slipstream
./gradlew build
```

## 📄 License
MIT License.