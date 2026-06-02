# 🏗️ Slipstream Architecture

Slipstream is designed for maximum performance in high-frequency packet processing environments.

## 🛠️ Core Principles

### 1. Zero-Reflection (Runtime)
We avoid using `java.lang.reflect` during the packet processing hot-path. Instead, we use `MethodHandles`, which are constant-folded by the JVM's C2 compiler to the level of direct method calls.

### 2. Zero-Allocation
By using Kotlin **value classes** (`@JvmInline value class`), we provide high-level wrappers for NMS packets without creating objects on the heap.

### 3. Coroutine-First & Lazy Suspend
Slipstream preserves packet ordering while allowing asynchronous processing.
To minimize overhead, we use a **Lazy Suspend** strategy:
- Slipstream only launches a coroutine if a `SuspendablePacketListener` explicitly interests in the packet.
- If no listeners are interested, the packet continues synchronously, avoiding context switching.

### 4. Zero-Allocation Outbound Queue
When the pipeline is suspended (e.g., waiting for a database), Slipstream stores packets and their `ChannelPromise` objects in parallel primitive-friendly queues. This ensures **zero garbage** even during network stalls.

### 5. Multi-Layer Mapping Resolver
Our `PacketMappers` uses a robust resolution strategy:
1. **Paper MappingResolver:** (via Bootstrap) Uses official Paper mappings for 1:1 accuracy.
2. **Recursive Lookup:** Scans the entire class hierarchy (including private methods) to find the correct handle.
3. **Primitive Mapping:** Automatically handles the mismatch between Kotlin types and Java primitives (e.g., `Double` vs `double`).

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
