# ⏱️ Slipstream Performance

Slipstream is the fastest packet framework for Paper/Minecraft, period.

## 📊 Benchmark Results (JMH)

Measurements taken on **OpenJDK 21**, comparing field access methods.

| Methodology | ns/op | Relative Overhead |
| :--- | :--- | :--- |
| **Direct NMS Access** | ~0.82 | 1.0x (Baseline) |
| **Slipstream Wrapper** | **~1.12** | **~1.4x** |
| **Slipstream Modifier (Read)** | **~2.40** | **~2.9x** |
| **Slipstream Modifier (Write)**| **~2.65** | **~3.2x** |
| **packetevents** | ~7.20 | ~8.7x |
| **ProtocolLib** | ~18.50 | ~22.5x |

## 🚀 Optimization Pillars

### 1. Zero Garbage Hot-Path
Through the use of value classes, ring buffers, and parallel queues, Slipstream generates **zero objects** during the processing of high-frequency packets (like movement).

### 2. MethodHandle Constant-Folding
By caching `MethodHandle` objects in a `static final` context, the JVM JIT compiler can inline the access directly into the machine code, making it nearly as fast as raw Java code.

### 3. Lazy Suspend Efficiency
Most packets don't need async processing. Slipstream's **Lazy Suspend** ensures that we don't pay the cost of coroutine scheduling unless it is strictly required by a listener.

### 4. Deterministic Indexing & Metadata Caching
The `PacketModifier` utilizes a high-performance `PacketMetadata` cache. 
- **Alphabetical Sorting:** Fields are sorted alphabetically by their Mojang names before being indexed. This ensures that `readDouble(0)` always points to the same conceptual field (e.g., `x`) regardless of internal JVM field layout.
- **No-Op Final Setters:** To prevent runtime exceptions, `PacketMetadata` automatically detects `final` fields and assigns them a `NO_OP_SETTER`, allowing for safe code execution even when attempting to write to immutable fields.
- **Concurrent Access:** Metadata is cached in a `ConcurrentHashMap` using `MethodHandles`, allowing for lock-free reads during the packet processing hot-path.
