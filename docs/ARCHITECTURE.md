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

### 5. Hybrid Access Model
Slipstream uses a dual-layered approach to balance extreme performance with developer flexibility:
- **Fast Path (Wrappers):** Pre-compiled `value class` wrappers for high-frequency packets (e.g., `WrapperMovePacket`). These use cached `MethodHandle` pointers to bypass reflection entirely, operating at near-native speeds.
- **Generic Path (PacketModifier):** A ProtocolLib-style API that allows access to *any* packet by index. It uses `PacketMetadata` to scan and sort fields alphabetically by their Mojang names, ensuring index stability across versions.

### 6. Native Mapping Integration
In 1.21+ environments, Paper utilizes official Mojang mappings at runtime. Slipstream leverages this by:
- **Direct Handle Resolution:** Resolving methods and fields directly by their Mojang names.
- **Deterministic Indexing:** Field indices in `PacketModifier` are based on the alphabetical order of Mojang names, providing a consistent API even when field orders change in NMS.
- **Zero Overhead:** No mapping remapping layer is required at runtime, reducing startup time and memory footprint.

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
