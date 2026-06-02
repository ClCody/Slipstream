# ⚡ Slipstream v1.0.0 — Production Ready

We are proud to announce the first stable release of **Slipstream**, a next-gen, ultra-fast alternative to ProtocolLib for PaperMC (1.21+). Built with Kotlin 2.0 and Coroutines at its core.

### 🚀 Key Features

* **Zero-Reflection & Zero-Allocation:** Uses `MethodHandles` and `@JvmInline` value classes to eliminate runtime overhead and GC pressure.
* **Lazy Suspend:** Coroutines are only launched when needed. If no async listeners are interested in a packet, it processes with the speed of raw NMS.
* **Full Packet Mutation:** Read and write any packet field by index (alphabetically sorted for stability) using the new `PacketModifier` API.
* **Smart Mapping Resolver:** Integrated with Paper's `MappingResolver` via a reflective bootstrap proxy. Works across different 1.21.x versions and mappings out-of-the-box.
* **Event Priorities:** Full control over packet execution order (from `LOWEST` to `MONITOR`), just like Bukkit events.
* **Linear Packet Awaiting:** Forget complex state machines; use `manager.awaitPacket<T>(player)` to wait for client responses in a single coroutine.

### ⏱️ Performance (JMH)

| Operation | ProtocolLib | Slipstream | Improvement |
|-----------|-------------|------------|-------------|
| Field Read| ~18.5 ns/op | **~1.1 ns/op** | **~16x faster** |
| Field Write| ~21.2 ns/op | **~1.4 ns/op** | **~15x faster** |

### 📦 Dependency (JitPack)

```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.ClCody:Slipstream:v1.0.0")
}
```

### 🛠 Attachments
Please find the pre-built plugin JAR in the assets section of the GitHub Release.
