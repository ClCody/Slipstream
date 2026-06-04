# 🏗️ Slipstream Architecture (v2.0.0)

Slipstream is designed for maximum performance in high-frequency packet processing environments. With version 2.0.0, the framework has been split into a **Multi-Module** architecture to provide unmatched compile-time type safety while preserving runtime performance.

## 📦 Multi-Module Structure

1. **`slipstream-generator`**: A standalone build-time utility. It uses `ClassGraph` to scan NMS classes during compilation and dynamically generates Kotlin wrappers for every available packet and nested structure.
2. **`slipstream-generated`**: The output module containing over 500+ generated `value class` wrappers. This isolation prevents NMS leakage into the core API.
3. **`slipstream-core`**: The main framework logic, containing the pipeline handlers, lazy suspend queue, and priority systems.

## 🛠️ Core Principles

### 1. Zero-Reflection (Runtime)
We avoid using `java.lang.reflect` during the packet processing hot-path. Instead, we use `MethodHandles`, which are constant-folded by the JVM's C2 compiler to the level of direct method calls.

### 2. Zero-Allocation (Value Classes)
Slipstream wraps NMS packets inside Kotlin **value classes** (`@JvmInline value class`). These wrappers are "erased" at compile time. 
*New in 2.0.0:* This zero-allocation guarantee now extends to nested NMS structures (like `BlockPos`, `Vec3`, `ItemStack`).

### 3. Clean Namespace via Inline Reified
Instead of polluting the global `Any` namespace with hundreds of `isPacket()` methods, Slipstream 2.0.0 uses a single inline extension:
```kotlin
inline fun <reified T : Any> Any.wrapAs(): T?
```
Because it is `inline reified`, the Kotlin compiler performs Dead Code Elimination (DCE). At runtime, it's just a raw `instanceof` check — zero overhead, no wrapper instantiation until the cast succeeds.

### 4. Coroutine-First & Lazy Suspend
Slipstream preserves packet ordering while allowing asynchronous processing.
To minimize overhead, we use a **Lazy Suspend** strategy:
- Slipstream only launches a coroutine if a `SuspendablePacketListener` explicitly interests in the packet.
- If no listeners are interested, the packet continues synchronously, avoiding context switching.

### 5. Java Records Support
Modern Minecraft (1.20+) heavily utilizes Java Records. Slipstream's generator automatically detects `isRecord()` and correctly binds to record components, bypassing standard `get/set` rules. To modify Records, the generator creates a `.copy()` method powered by a cached `MethodHandle` to the constructor.

### 6. Native Mapping Integration
In 1.21+ environments, Paper utilizes official Mojang mappings at runtime. Slipstream leverages this by resolving methods and fields directly by their Mojang names, meaning no remapping overhead is ever incurred.

## 📡 Pipeline Visualization
```text
[ Network Interface ]
        |
        v
[ Netty Default Handlers ]
        |
        v
[ slipstream_handler ]  <-- WE ARE HERE
        |                   - Awaiters (O(1))
        |                   - Sync Listeners (Priority Order)
        |                   - Lazy Suspend (if needed)
        v
[ packet_handler ]      <-- Minecraft's Internal Handler
        |
        v
[ Server Game Logic ]
```